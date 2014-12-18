package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGCopper;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Platinite Copper"
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
public final class SWGPlatiniteCopper extends SWGCopper {

  private static final long serialVersionUID = 2403740L;

  private static final int[] minStats = {872, 596, 521, 0, 0, 535, 872, 1, 0, 672, 672};
  private static final int[] maxStats = {961, 738, 646, 0, 0, 615, 961, 1000, 0, 761, 761};

  private static final SWGPlatiniteCopper INSTANCE = new SWGPlatiniteCopper();

  SWGPlatiniteCopper() { super(); }

  public static SWGPlatiniteCopper getInstance() { return INSTANCE; }

  public int expectedStats() { return 8; }
  public int sortIndex() { return 691; }
  public int rcID() { return 303; }
  public String rcName() { return "Platinite Copper";}
  public String rcToken() { return "plcpr";}
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
