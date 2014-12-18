package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGGeothermalEnergy;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Dathomirian Geothermal Renewable Energy"
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
public final class SWGDathomirianGeothermalRenewableEnergy extends SWGGeothermalEnergy {

  private static final long serialVersionUID = 6151658L;

  private static final int[] minStats = {0, 0, 0, 0, 0, 0, 0, 500, 200, 0, 0};
  private static final int[] maxStats = {0, 0, 0, 0, 0, 0, 0, 1000, 1000, 0, 0};

  private static final SWGDathomirianGeothermalRenewableEnergy INSTANCE = new SWGDathomirianGeothermalRenewableEnergy();

  SWGDathomirianGeothermalRenewableEnergy() { super(); }

  public static SWGDathomirianGeothermalRenewableEnergy getInstance() { return INSTANCE; }

  public int expectedStats() { return 2; }
  public int sortIndex() { return 35; }
  public int rcID() { return 777; }
  public String rcName() { return "Dathomirian Geothermal Renewable Energy";}
  public String rcToken() { return "dageg";}
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
