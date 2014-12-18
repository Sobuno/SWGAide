package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGWindEnergy;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Kashyyykian Wind Renewable Energy"
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
public final class SWGKashyyykianWindRenewableEnergy extends SWGWindEnergy {

  private static final long serialVersionUID = 5930262L;

  private static final int[] minStats = {0, 0, 0, 0, 0, 0, 0, 500, 1, 0, 0};
  private static final int[] maxStats = {0, 0, 0, 0, 0, 0, 0, 500, 400, 0, 0};

  private static final SWGKashyyykianWindRenewableEnergy INSTANCE = new SWGKashyyykianWindRenewableEnergy();

  SWGKashyyykianWindRenewableEnergy() { super(); }

  public static SWGKashyyykianWindRenewableEnergy getInstance() { return INSTANCE; }

  public int expectedStats() { return 2; }
  public int sortIndex() { return 29; }
  public int rcID() { return 749; }
  public String rcName() { return "Kashyyykian Wind Renewable Energy";}
  public String rcToken() { return "kaweg";}
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
