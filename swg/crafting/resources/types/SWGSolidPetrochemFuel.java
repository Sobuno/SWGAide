package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGMineral;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Solid Petrochem Fuel"
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
public class SWGSolidPetrochemFuel extends SWGMineral {

  private static final long serialVersionUID = 197687L;

  private static final int[] minStats = {0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0};
  private static final int[] maxStats = {0, 0, 1000, 0, 0, 0, 0, 1000, 1000, 0, 0};

  private static final SWGSolidPetrochemFuel INSTANCE = new SWGSolidPetrochemFuel();

  SWGSolidPetrochemFuel() { super(); }

  public static SWGSolidPetrochemFuel getInstance() { return INSTANCE; }

  public int expectedStats() { return 3; }
  public int sortIndex() { return 614; }
  public int rcID() { return 24; }
  public String rcName() { return "Solid Petrochem Fuel";}
  public String rcToken() { return "spc";}
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
