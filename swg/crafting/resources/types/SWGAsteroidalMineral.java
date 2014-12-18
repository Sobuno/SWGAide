package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGSpaceResource;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Asteroidal Mineral"
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
public class SWGAsteroidalMineral extends SWGSpaceResource {

  private static final long serialVersionUID = 6017239L;

  private static final int[] minStats = {0, 0, 0, 0, 0, 0, 0, 500, 0, 0, 0};
  private static final int[] maxStats = {0, 0, 0, 0, 0, 0, 0, 1000, 0, 0, 0};

  private static final SWGAsteroidalMineral INSTANCE = new SWGAsteroidalMineral();

  SWGAsteroidalMineral() { super(); }

  public static SWGAsteroidalMineral getInstance() { return INSTANCE; }

  public int expectedStats() { return 1; }
  public int sortIndex() { return 811; }
  public int rcID() { return 760; }
  public String rcName() { return "Asteroidal Mineral";}
  public String rcToken() { return "amin";}
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
