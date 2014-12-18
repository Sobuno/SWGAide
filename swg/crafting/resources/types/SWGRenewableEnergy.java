package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGEnergy;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Renewable Energy"
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
public class SWGRenewableEnergy extends SWGEnergy {

  private static final long serialVersionUID = 6436310L;

  private static final int[] minStats = {0, 0, 0, 0, 0, 0, 0, 200, 1, 0, 0};
  private static final int[] maxStats = {0, 0, 0, 0, 0, 0, 0, 1000, 1000, 0, 0};

  private static final SWGRenewableEnergy INSTANCE = new SWGRenewableEnergy();

  SWGRenewableEnergy() { super(); }

  public static SWGRenewableEnergy getInstance() { return INSTANCE; }

  public int expectedStats() { return 2; }
  public int sortIndex() { return 2; }
  public int rcID() { return 813; }
  public String rcName() { return "Renewable Energy";}
  public String rcToken() { return "regy";}
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
