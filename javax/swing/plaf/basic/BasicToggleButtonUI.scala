package javax.swing.plaf.basic

import java.awt.{Graphics, Rectangle}
import java.lang.{Object, String}
import javax.swing.{AbstractButton, JComponent}
import javax.swing.plaf.{ButtonUI, ComponentUI}
import scala.scalanative.annotation.stub

/** BasicToggleButton implementation
 *  
 */
class BasicToggleButtonUI extends BasicButtonUI {

    /**  */
    @stub
    def this() = ???

    /**  */
    @stub
    protected def getPropertyPrefix(): String = ???

    /** Overriden so that the text will not be rendered as shifted for
     *  Toggle buttons and subclasses.
     */
    @stub
    protected def getTextShiftOffset(): Int = ???

    /** Paints the specified component appropriately for the look and feel. */
    @stub
    def paint(g: Graphics, c: JComponent): Unit = ???

    /**  */
    @stub
    protected def paintIcon(g: Graphics, b: AbstractButton, iconRect: Rectangle): Unit = ???
}

object BasicToggleButtonUI {
    /**  */
    @stub
    def createUI(b: JComponent): ComponentUI = ???
}
