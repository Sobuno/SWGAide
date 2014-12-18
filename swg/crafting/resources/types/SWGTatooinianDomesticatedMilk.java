package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGDomesticatedMilk;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Tatooinian Domesticated Milk"
 *
 * <b>WARNING:</b>
 * This class is generated by SWGResourceClassGenerator.
 * Do not manually modify this class as your changes are
 * erased when the classes are re-generated.
 *
 * @author Steven M. Doyle <shadow@triwizard.net>
 * @author <a href="mailto:simongronlund@gmail.com">Simon Gronlund</a>
 * aka Chimaera.Zimoon
 */
@SuppressWarnings("all")
public final class SWGTatooinianDomesticatedMilk extends SWGDomesticatedMilk {

  private static final long serialVersionUID = 3067928L;

  private static final int[] minStats = {0, 0, 1, 0, 1, 0, 0, 1, 300, 0, 0};
  private static final int[] maxStats = {0, 0, 1000, 0, 700, 0, 0, 1000, 1000, 0, 0};

  private static final SWGTatooinianDomesticatedMilk INSTANCE = new SWGTatooinianDomesticatedMilk();

  SWGTatooinianDomesticatedMilk() { super(); }

  public static SWGTatooinianDomesticatedMilk getInstance() { return INSTANCE; }

  public int expectedStats() { return 4; }
  public int sortIndex() { return 58; }
  public int rcID() { return 387; }
  public String rcName() { return "Tatooinian Domesticated Milk";}
  public String rcToken() { return "tadmk";}
  public boolean isHarvested() { return true; }
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
