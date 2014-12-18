package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGIntrusiveOre;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Dylinium Intrusive Ore"
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
public final class SWGDyliniumIntrusiveOre extends SWGIntrusiveOre {

  private static final long serialVersionUID = 2063739L;

  private static final int[] minStats = {0, 618, 666, 0, 0, 857, 314, 1, 0, 761, 713};
  private static final int[] maxStats = {0, 760, 790, 0, 0, 910, 420, 1000, 0, 850, 820};

  private static final SWGDyliniumIntrusiveOre INSTANCE = new SWGDyliniumIntrusiveOre();

  SWGDyliniumIntrusiveOre() { super(); }

  public static SWGDyliniumIntrusiveOre getInstance() { return INSTANCE; }

  public int expectedStats() { return 7; }
  public int sortIndex() { return 717; }
  public int rcID() { return 260; }
  public String rcName() { return "Dylinium Intrusive Ore";}
  public String rcToken() { return "dyint";}
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
