package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGKnownInertGas;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Hydron-3 Inert Gas"
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
public final class SWGHydron3InertGas extends SWGKnownInertGas {

  private static final long serialVersionUID = 1004201L;

  private static final int[] minStats = {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0};
  private static final int[] maxStats = {0, 0, 81, 0, 0, 0, 0, 1000, 0, 0, 0};

  private static final SWGHydron3InertGas INSTANCE = new SWGHydron3InertGas();

  SWGHydron3InertGas() { super(); }

  public static SWGHydron3InertGas getInstance() { return INSTANCE; }

  public int expectedStats() { return 2; }
  public int sortIndex() { return 786; }
  public int rcID() { return 126; }
  public String rcName() { return "Hydron-3 Inert Gas";}
  public String rcToken() { return "h3krt";}
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
