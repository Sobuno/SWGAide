package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGSteel;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Cubirian Steel"
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
public final class SWGCubirianSteel extends SWGSteel {

  private static final long serialVersionUID = 2221879L;

  private static final int[] minStats = {111, 137, 585, 0, 0, 668, 69, 1, 0, 585, 502};
  private static final int[] maxStats = {215, 265, 665, 0, 0, 732, 133, 1000, 0, 665, 598};

  private static final SWGCubirianSteel INSTANCE = new SWGCubirianSteel();

  SWGCubirianSteel() { super(); }

  public static SWGCubirianSteel getInstance() { return INSTANCE; }

  public int expectedStats() { return 8; }
  public int sortIndex() { return 647; }
  public int rcID() { return 280; }
  public String rcName() { return "Cubirian Steel";}
  public String rcToken() { return "custl";}
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
