package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGAluminum;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Phrik Aluminum"
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
public final class SWGPhrikAluminum extends SWGAluminum {

  private static final long serialVersionUID = 2332577L;

  private static final int[] minStats = {692, 627, 627, 0, 0, 670, 848, 1, 0, 770, 770};
  private static final int[] maxStats = {800, 800, 800, 0, 0, 800, 1000, 1000, 0, 900, 900};

  private static final SWGPhrikAluminum INSTANCE = new SWGPhrikAluminum();

  SWGPhrikAluminum() { super(); }

  public static SWGPhrikAluminum getInstance() { return INSTANCE; }

  public int expectedStats() { return 8; }
  public int sortIndex() { return 680; }
  public int rcID() { return 294; }
  public String rcName() { return "Phrik Aluminum";}
  public String rcToken() { return "phalu";}
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
