package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGFerrousMetal;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Unknown Ferrous Metal"
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
public final class SWGUnknownFerrousMetal extends SWGFerrousMetal {

  private static final long serialVersionUID = 1288853L;

  private static final int[] minStats = {1, 1, 300, 0, 0, 300, 1, 1, 0, 400, 400};
  private static final int[] maxStats = {650, 800, 1000, 0, 0, 1000, 600, 1000, 0, 1000, 1000};

  private static final SWGUnknownFerrousMetal INSTANCE = new SWGUnknownFerrousMetal();

  SWGUnknownFerrousMetal() { super(); }

  public static SWGUnknownFerrousMetal getInstance() { return INSTANCE; }

  public int expectedStats() { return 8; }
  public int sortIndex() { return 642; }
  public int rcID() { return 162; }
  public String rcName() { return "Unknown Ferrous Metal";}
  public String rcToken() { return "unfer";}
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
