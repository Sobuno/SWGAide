package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGKnownRadioactive;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Class 3 Radioactive"
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
public final class SWGClass3Radioactive extends SWGKnownRadioactive {

  private static final long serialVersionUID = 5060492L;

  private static final int[] minStats = {0, 0, 497, 0, 0, 0, 0, 1, 621, 0, 0};
  private static final int[] maxStats = {0, 0, 589, 0, 0, 0, 0, 1000, 736, 0, 0};

  private static final SWGClass3Radioactive INSTANCE = new SWGClass3Radioactive();

  SWGClass3Radioactive() { super(); }

  public static SWGClass3Radioactive getInstance() { return INSTANCE; }

  public int expectedStats() { return 3; }
  public int sortIndex() { return 632; }
  public int rcID() { return 639; }
  public String rcName() { return "Class 3 Radioactive";}
  public String rcToken() { return "c3krd";}
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
