package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGIntrusiveOre;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Derillium Intrusive Ore"
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
public final class SWGDerilliumIntrusiveOre extends SWGIntrusiveOre {

  private static final long serialVersionUID = 5534912L;

  private static final int[] minStats = {0, 440, 510, 0, 0, 790, 181, 1, 0, 650, 580};
  private static final int[] maxStats = {0, 582, 634, 0, 0, 843, 287, 1000, 0, 739, 687};

  private static final SWGDerilliumIntrusiveOre INSTANCE = new SWGDerilliumIntrusiveOre();

  SWGDerilliumIntrusiveOre() { super(); }

  public static SWGDerilliumIntrusiveOre getInstance() { return INSTANCE; }

  public int expectedStats() { return 7; }
  public int sortIndex() { return 715; }
  public int rcID() { return 699; }
  public String rcName() { return "Derillium Intrusive Ore";}
  public String rcToken() { return "deint";}
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
