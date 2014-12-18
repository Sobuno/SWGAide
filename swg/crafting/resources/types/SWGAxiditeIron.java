package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGIron;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Axidite Iron"
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
public final class SWGAxiditeIron extends SWGIron {

  private static final long serialVersionUID = 2134902L;

  private static final int[] minStats = {107, 171, 559, 0, 0, 606, 128, 1, 0, 528, 528};
  private static final int[] maxStats = {207, 331, 589, 0, 0, 706, 248, 1000, 0, 648, 648};

  private static final SWGAxiditeIron INSTANCE = new SWGAxiditeIron();

  SWGAxiditeIron() { super(); }

  public static SWGAxiditeIron getInstance() { return INSTANCE; }

  public int expectedStats() { return 8; }
  public int sortIndex() { return 662; }
  public int rcID() { return 269; }
  public String rcName() { return "Axidite Iron";}
  public String rcToken() { return "axirn";}
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
