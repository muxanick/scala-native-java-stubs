package javax.print

import java.awt.GraphicsConfiguration
import java.lang.Object
import javax.print.attribute.PrintRequestAttributeSet
import scala.scalanative.annotation.stub

/** This class is a collection of UI convenience methods which provide a
 *  graphical user dialog for browsing print services looked up through the Java
 *  Print Service API.
 *  
 *  The dialogs follow a standard pattern of acting as a continue/cancel option
 * for a user as well as allowing the user to select the print service to use
 * and specify choices such as paper size and number of copies.
 *  
 *  
 *  The dialogs are designed to work with pluggable print services though the
 *  public APIs of those print services.
 *  
 *  If a print service provides any vendor extensions these may be made
 *  accessible to the user through a vendor supplied tab panel Component.
 *  Such a vendor extension is encouraged to use Swing! and to support its
 *  accessibility APIs.
 *  The vendor extensions should return the settings as part of the
 *  AttributeSet.
 *  Applications which want to preserve the user settings should use those
 *  settings to specify the print job.
 *  Note that this class is not referenced by any other part of the Java
 *  Print Service and may not be included in profiles which cannot depend
 *  on the presence of the AWT packages.
 */
class ServiceUI extends Object {

    /**  */
    @stub
    def this() = ???
}

object ServiceUI {
    /** Presents a dialog to the user for selecting a print service (printer). */
    @stub
    def printDialog(gc: GraphicsConfiguration, x: Int, y: Int, services: Array[PrintService], defaultService: PrintService, flavor: DocFlavor, attributes: PrintRequestAttributeSet): PrintService = ???
}
