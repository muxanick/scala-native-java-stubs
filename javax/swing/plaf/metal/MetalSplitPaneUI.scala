package javax.swing.plaf.metal

import java.lang.Object
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, SplitPaneUI}
import javax.swing.plaf.basic.{BasicSplitPaneDivider, BasicSplitPaneUI}
import scala.scalanative.annotation.stub

/** Metal split pane.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class MetalSplitPaneUI extends BasicSplitPaneUI {

    /**  */
    @stub
    def this() = ???

    /** Creates the default divider. */
    @stub
    def createDefaultDivider(): BasicSplitPaneDivider = ???
}

object MetalSplitPaneUI {
    /** Creates a new MetalSplitPaneUI instance */
    @stub
    def createUI(x: JComponent): ComponentUI = ???
}
