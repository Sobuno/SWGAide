package swg.gui.resources;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import swg.SWGAide;
import swg.gui.SWGFrame;
import swg.gui.common.SWGGuiUtils;
import swg.gui.common.SWGJDialog;
import swg.model.SWGCharacter;
import swg.tools.SpringUtilities;

/**
 * This type is a dialog for editing a harvester-owner.
 * 
 * @author John Thomas aka Chilastra.Oarun
 * @author <a href="mailto:simongronlun@gmail.com">Simon Gronlund</a> aka
 *         Chimaera.Zimoon
 */
@SuppressWarnings("serial")
final class SWGHarvesterOwnerDialog extends SWGJDialog implements ActionListener {

    /**
     * The cancel button
     */
    private JButton cancelButton;

    /**
     * The harvester currently being created/edited
     */
    private SWGHarvesterOwner currentOwner;


    /**
     * The OK button
     */
    private JButton okButton;

    /**
     * A drop down for the owner name
     */
    private JComboBox<String> ownerName;
    
    /**
     * A checkbox for Efficiency IV, reduced maintenance fees
     */
    private JCheckBox reducedMaintFeeValue;

 
    /**
     * Creates an instance of this dialog.
     * 
     * @param harvesterTab the parent for this instance
     */
    SWGHarvesterOwnerDialog(SWGHarvestingTab harvesterTab) {
        super("Harvester Owner", harvesterTab);

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());
        contentPane.setBorder(BorderFactory.createEmptyBorder(5, 7, 7, 7));

        contentPane.add(makeContent(), BorderLayout.NORTH);
        contentPane.add(makeButtons(), BorderLayout.EAST);

        setContentPane(contentPane);
        setMinimumSize(getSize());

        Point p = harvesterTab.getLocation();
        p.translate(100, 100);
        p = (Point) SWGFrame.getPrefsKeeper().get(
                "resourceHarvesterOwnerDialogLocation", p);
        p = SWGGuiUtils.ensureOnScreen(p, getSize());
        setLocation(p);

        pack();
        setMinimumSize(getSize());
    }

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == cancelButton) {
            // pass
        } else if (src == okButton) {
            boolean[] ownerAttributes;
            if ((ownerAttributes = isDialogOK()) != null)
                saveOwner(ownerAttributes);
            else
                return;
        } else {
            SWGAide.printError("HarvesterOwnerDialog:actionPerformed: " + src,
                null);
        }
        close();
    }

    @Override
    protected void close() {
        SWGFrame.getPrefsKeeper().add(
                "resourceHarvesterOwnerDialogLocation", getLocation());
        setVisible(false);
    }

    /**
     * Initiates the GUI for creating a new owner.
     */
    private void initCreateNewOwner() {
        ownerName.removeAllItems();
        List<String> names = SWGGuiUtils.characterNames(SWGResourceTab.galaxy());
        for (String n : names)
            ownerName.addItem(n);
        SWGCharacter c = SWGFrame.getSelectedCharacter();
        ownerName.setSelectedItem(c != null
            ? c.getName()
            : null);
      
    }

    /**
     * Initiates the GUI dialog with the currently selected owner.
     */
    private void initEditOwner() {
        ownerName.removeAllItems();
        ownerName.addItem(currentOwner.getName());
        ownerName.setSelectedItem(currentOwner.getName());
    }

    /**
     * Determines of the dialog has valid content. This method returns an
     * integer array with the parsed <I>modifier values&nbsp;</I> if a owner
     * name is defined and the integer fields have valid values. If the content
     * is invalid this method raises a GUI message dialog on the matter and
     * returns {@code null}.
     * 
     * @return a boolean array for the parsed boolean value reducedMaint
     *         , or {@code null} if there is an error
     */
    private boolean[] isDialogOK() {
        String msg = null;
        String ttl = null;
        String owner = (String) ownerName.getSelectedItem();
        if (owner.length() <= 2) {
            msg = "Enter a owner name 3 letters or more";
            ttl = "Invalid owner name";
        } else if (currentOwner == null
                && SWGResController.harvesterOwnerExists(owner,
                        SWGResourceTab.galaxy())) {
            msg = "A owner exists with this name";
            ttl = "Owner name conflict";
        }
        
        boolean[] ownerAttributes = null;
	    if (msg == null) {
        	boolean m = reducedMaintFeeValue.isSelected();

        	ownerAttributes = new boolean[] { m };
        	return ownerAttributes;
        }


        JOptionPane.showMessageDialog(ownerName, msg, ttl,
                JOptionPane.ERROR_MESSAGE);
        return null;
    }

    /**
     * Returns a GUI component for the OK and Cancel button.
     * 
     * @return a GUI component
     */
    private Component makeButtons() {
        Box bottom = Box.createHorizontalBox();

        okButton = new JButton("OK");
        okButton.setToolTipText("Add to the list of owners");
        okButton.setMnemonic('O');
        okButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        okButton.addActionListener(this);
        bottom.add(okButton);

        cancelButton = new JButton("Cancel");
        cancelButton.setMnemonic('C');
        cancelButton.addActionListener(this);
        cancelButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        bottom.add(cancelButton);

        return bottom;
    }

    /**
     * Returns the GUI component for the owners expertise modifiers.
     * 
     * @return a GUI component
     */
    private Component makeContent() {
        JPanel content = new JPanel();
        content.setLayout(new SpringLayout());

        ownerName = new JComboBox<String>();
        ownerName.setPreferredSize(new Dimension(150, 24));
        ownerName.setAlignmentX(Component.LEFT_ALIGNMENT);
        ownerName.setToolTipText("Select a character");
        ownerName.setAutoscrolls(true);
        ownerName.setEditable(false);

        JLabel lc = new JLabel("Owner name");
        content.add(lc);
        content.add(ownerName);
        
        reducedMaintFeeValue = new JCheckBox("");
        reducedMaintFeeValue.setToolTipText("Select if the owner has "
        		+ "Efficiency IV of Merchant, which gives 20%"
        		+ " reducded maintenance fees ");

        JLabel lm = new JLabel("Reduced Maint. Fees");
        content.add(lm);
        content.add(reducedMaintFeeValue);


        SpringUtilities.makeCompactGrid(content, 2, 2, 0, 0, 5, 3);
        return content;
    }

    /**
     * Called when the user clicks "OK" and {@link #isDialogOK()} determined
     * that the content at the dialog is valid. This method saves the owner to
     * the list of owners for the current galaxy.
     * 
     * @param ownerAttributes a boolean array for the boolean value
     *        reducedMaint parsed from the GUI
     */
    private void saveOwner(boolean[] ownerAttributes) {
        String n = (String) ownerName.getSelectedItem();
        if (currentOwner == null) { // equals "create owner"
            SWGResController.harvesterOwnerAdd(
                    new SWGHarvesterOwner(
                            n, ownerAttributes[0]),
                    SWGResourceTab.galaxy());
        } else {
            currentOwner.setReducedMaintFees(ownerAttributes[0]);
        }
        ((SWGHarvestingTab) parent).resetOwners();
    }

    /**
     * Invoked when the user selects to create or edit specified owner. This
     * method initiates the GUI.
     * 
     * @param owner
     *            a owner to edit, or {@code null} for creating a new owner
     */
    void showAndBegin(SWGHarvesterOwner owner) {

        currentOwner = owner;

        if (owner == null)
            initCreateNewOwner();
        else
            initEditOwner();

        ownerName.setEditable(owner == null);
        ownerName.setEnabled(owner == null);

        setVisible(true);
    }

    /**
     * Helper method which returns the string integer as is, or "0" id the
     * argument is {@code null}.
     * 
     * @param integer
     *            a string to return
     * @return the string, or "0" id the argument is {@code null}
     */
    @SuppressWarnings("unused")
	private String toString(String integer) {
        return integer == null
            ? "0"
            : integer;

    }
}
