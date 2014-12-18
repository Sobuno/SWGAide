package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGFlowers;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Kashyyykian Flower Fruit"
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
public final class SWGKashyyykianFlowerFruit extends SWGFlowers {

  private static final long serialVersionUID = 5780029L;

  private static final int[] minStats = {0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0};
  private static final int[] maxStats = {0, 0, 1000, 0, 1000, 0, 0, 1000, 700, 0, 0};

  private static final SWGKashyyykianFlowerFruit INSTANCE = new SWGKashyyykianFlowerFruit();

  SWGKashyyykianFlowerFruit() { super(); }

  public static SWGKashyyykianFlowerFruit getInstance() { return INSTANCE; }

  public int expectedStats() { return 4; }
  public int sortIndex() { return 524; }
  public int rcID() { return 730; }
  public String rcName() { return "Kashyyykian Flower Fruit";}
  public String rcToken() { return "kaflr";}
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
