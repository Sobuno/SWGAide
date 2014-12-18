package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGBristleyHide;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Lokian Bristley Hide"
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
public final class SWGLokianBristleyHide extends SWGBristleyHide {

  private static final long serialVersionUID = 1494435L;

  private static final int[] minStats = {0, 0, 1, 0, 0, 0, 1, 1, 0, 1, 1};
  private static final int[] maxStats = {0, 0, 1000, 0, 0, 0, 1000, 1000, 0, 1000, 1000};

  private static final SWGLokianBristleyHide INSTANCE = new SWGLokianBristleyHide();

  SWGLokianBristleyHide() { super(); }

  public static SWGLokianBristleyHide getInstance() { return INSTANCE; }

  public int expectedStats() { return 5; }
  public int sortIndex() { return 284; }
  public int rcID() { return 188; }
  public String rcName() { return "Lokian Bristley Hide";}
  public String rcToken() { return "lobhd";}
  public boolean isHarvested() { return true; }
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
