package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGTubers;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Endorian Vegetable Tubers"
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
public final class SWGEndorianVegetableTubers extends SWGTubers {

  private static final long serialVersionUID = 4427932L;

  private static final int[] minStats = {0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0};
  private static final int[] maxStats = {0, 0, 1000, 0, 1000, 0, 0, 1000, 1000, 0, 0};

  private static final SWGEndorianVegetableTubers INSTANCE = new SWGEndorianVegetableTubers();

  SWGEndorianVegetableTubers() { super(); }

  public static SWGEndorianVegetableTubers getInstance() { return INSTANCE; }

  public int expectedStats() { return 4; }
  public int sortIndex() { return 463; }
  public int rcID() { return 559; }
  public String rcName() { return "Endorian Vegetable Tubers";}
  public String rcToken() { return "entub";}
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
