package swg.gui.resources;

import java.io.Serializable;

import swg.model.SWGCharacter;

/**
 * This type represents an owner of one or more harvesters, see
 * {@link SWGHarvester}. Currently a player defines a "owner", which is kind of
 * an assignee, with a name and the harvesting specific statistics. An instance
 * is final in the sense the owner-name is immutable, however, the statistics
 * for the owner are editable.
 * <P>
 * <I>It is planned for making all of the following the proper type definition,
 * however not there yet: Usually an instance of this type is "an interface" to
 * an in-game character from which harvesting statistics are queried. However,
 * the original design is still in place and it is possible for players to
 * define phony assignees. If {@link #character} is set all other fields are not
 * set but the getters query the character for the statistics.</I>
 * <P>
 * Serialization info: <I>For simplicity all fields are serialized, even those
 * that are not used. </I><BR/>
 * 
 * @author John Thomas aka Chilastra.Oarun
 * @author <a href="mailto:simongronlun@gmail.com">Simon Gronlund</a> aka
 *         Chimaera.Zimoon
 */
final class SWGHarvesterOwner implements Serializable,
    Comparable<SWGHarvesterOwner> {

    /**
     * Serialization version info. Don't meddle with this or break the
     * deserialization.
     */
    private static final long serialVersionUID = -1400654706952532102L;

    /**
     * The character who has the harvesting statistics conveyed by this type, or
     * {@code null} if this instance if a phony harvester owner.
     */
    private SWGCharacter character;
    
    /**
     * This represents whether the owner has Efficiency IV, which gives a 
     * reduction in maintenance fees of 20%.
     */
    private boolean reducedMaintenanceFees; 

    /**
     * Name of the character associated with this owner object
     */
    private final String name;

    /**
     * Creates a phony harvester owner with the given name, expertise modifiers
     * and harvest fair buff. All values are validated by their setters
     * respectively.
     * <P>
     * <B>Note: </B>(<U>Not yet implemented</U>--This is a player created
     * assignee, a phony, which represents an in-game harvester owner rather
     * than an instance of {@link SWGCharacter}.)
     * 
     * @param phony
     *            a description/name for a phony owner, later immutable; a valid
     *            string is not {@code null} and longer than 2 characters
     * @param reducedMaint
     *            Whether the owner has Efficiency IV in Merchant, which gives 
     *            reduced maintenance fees
     * @throws IllegalArgumentException
     *             if there is an argument is invalid
     * @throws NullPointerException
     *             if {@code phony} is {@code null}
     */
    SWGHarvesterOwner(String phony, boolean reducedMaint) {
        if (phony.trim().length() < 3)
            throw new IllegalArgumentException("Illegal value: " + phony);

        this.name = phony;
        setReducedMaintFees(reducedMaint);
    }

    /**
     * Creates a wrapper of this type for the given character. The created
     * instance will query the statistics from the specified character. Thus, if
     * the expertise is changed it is instantly transparent via this instance.
     * 
     * @param character
     *            the in-game character
     * @throws NullPointerException
     *             if {@code character} is {@code null}
     */
    @SuppressWarnings("unused")
    private SWGHarvesterOwner(SWGCharacter character) {
        // XXX fix when characters are amended to
        if (character == null)
            throw new NullPointerException("Argument is null");
        name = null;
        this.character = character;
    }

    public int compareTo(SWGHarvesterOwner o) {
        return name.compareToIgnoreCase(o.name);
    }

    /**
     * Returns the character wrapped by this instance. If this instance rather
     * is a player created phony harvester owner {@code null} is returned.
     * 
     * @return the character
     */
    @SuppressWarnings("unused")
    private SWGCharacter getCharacter() {
        return character;
    }
    
    /**
     * Returns whether the owner has the skill Effiency IV
     * 
     * @return the reducedMaintenanceFees
     */
    boolean hasReducedMaintFees() {
       return reducedMaintenanceFees;
    }

    /**
     * Returns the name of the character, or the description of the phony owner
     * if no character is set.
     * 
     * @return the name
     */
    String getName() {
        if (character != null)
            character.getName();
        return name;
    }

    /**
     * Sets whether the owner has <I>Efficiency IV</I>
     * 
     * @param reducedMaintenanceFees
     *            true if owner has Efficiency IV, false otherwise
     * @throws IllegalStateException
     *             if this method is invoked and the character is set and this
     *             method
     */
    void setReducedMaintFees(boolean reducedMaintenanceFees) {
        if (character != null)
            throw new IllegalStateException("Unsupported when character is set");
        this.reducedMaintenanceFees = reducedMaintenanceFees;
    }

    @Override
    public String toString() {
        return name;
    }
}
