package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGAsteroidalMineral;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Carbonaceous Asteroid"
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
public final class SWGCarbonaceousAsteroid extends SWGAsteroidalMineral {

  private static final long serialVersionUID = 6025146L;

  private static final int[] minStats = {0, 0, 0, 0, 0, 0, 0, 1000, 0, 0, 0};
  private static final int[] maxStats = {0, 0, 0, 0, 0, 0, 0, 1000, 0, 0, 0};

  private static final SWGCarbonaceousAsteroid INSTANCE = new SWGCarbonaceousAsteroid();

  SWGCarbonaceousAsteroid() { super(); }

  public static SWGCarbonaceousAsteroid getInstance() { return INSTANCE; }

  public int expectedStats() { return 1; }
  public int sortIndex() { return 812; }
  public int rcID() { return 761; }
  public String rcName() { return "Carbonaceous Asteroid";}
  public String rcToken() { return "acar";}
  public boolean isSpaceOrRecycled()  { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
