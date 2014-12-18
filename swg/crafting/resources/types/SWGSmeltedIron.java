package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGIron;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Smelted Iron"
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
public final class SWGSmeltedIron extends SWGIron {

  private static final long serialVersionUID = 2198158L;

  private static final int[] minStats = {200, 200, 200, 0, 0, 200, 200, 200, 0, 200, 200};
  private static final int[] maxStats = {200, 200, 200, 0, 0, 200, 200, 200, 0, 200, 200};

  private static final SWGSmeltedIron INSTANCE = new SWGSmeltedIron();

  SWGSmeltedIron() { super(); }

  public static SWGSmeltedIron getInstance() { return INSTANCE; }

  public int expectedStats() { return 8; }
  public int sortIndex() { return 659; }
  public int rcID() { return 277; }
  public String rcName() { return "Smelted Iron";}
  public String rcToken() { return "sirn";}
  public boolean isSpaceOrRecycled()  { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
