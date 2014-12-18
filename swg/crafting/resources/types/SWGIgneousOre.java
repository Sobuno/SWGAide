package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGLowGradeOre;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Igneous Ore"
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
public class SWGIgneousOre extends SWGLowGradeOre {

  private static final long serialVersionUID = 600944L;

  private static final int[] minStats = {0, 200, 200, 0, 0, 200, 1, 1, 0, 200, 200};
  private static final int[] maxStats = {0, 1000, 1000, 0, 0, 1000, 800, 1000, 0, 1000, 1000};

  private static final SWGIgneousOre INSTANCE = new SWGIgneousOre();

  SWGIgneousOre() { super(); }

  public static SWGIgneousOre getInstance() { return INSTANCE; }

  public int expectedStats() { return 7; }
  public int sortIndex() { return 696; }
  public int rcID() { return 75; }
  public String rcName() { return "Igneous Ore";}
  public String rcToken() { return "ign";}
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
