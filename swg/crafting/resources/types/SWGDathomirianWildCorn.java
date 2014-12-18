package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGWildCorn;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Dathomirian Wild Corn"
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
public final class SWGDathomirianWildCorn extends SWGWildCorn {

  private static final long serialVersionUID = 3392115L;

  private static final int[] minStats = {0, 0, 1, 0, 300, 0, 0, 1, 1, 0, 0};
  private static final int[] maxStats = {0, 0, 1000, 0, 1000, 0, 0, 1000, 700, 0, 0};

  private static final SWGDathomirianWildCorn INSTANCE = new SWGDathomirianWildCorn();

  SWGDathomirianWildCorn() { super(); }

  public static SWGDathomirianWildCorn getInstance() { return INSTANCE; }

  public int expectedStats() { return 4; }
  public int sortIndex() { return 339; }
  public int rcID() { return 428; }
  public String rcName() { return "Dathomirian Wild Corn";}
  public String rcToken() { return "dawcn";}
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
