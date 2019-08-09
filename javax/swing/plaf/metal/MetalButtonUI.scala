package javax.swing.plaf.metal

import java.awt.{Color, Graphics, Rectangle}
import java.lang.{Object, String}
import javax.swing.{AbstractButton, JComponent}
import javax.swing.plaf.{ButtonUI, ComponentUI}
import javax.swing.plaf.basic.{BasicButtonListener, BasicButtonUI}

/** MetalButtonUI implementation
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
class MetalButtonUI extends BasicButtonUI {

    /**  */
    @stub
    protected val disabledTextColor: Color = ???

    /**  */
    @stub
    protected val focusColor: Color = ???

    /**  */
    @stub
    protected def createButtonListener(b: AbstractButton): BasicButtonListener = ???

    /**  */
    @stub
    protected def getDisabledTextColor(): Color = ???

    /**  */
    @stub
    protected def getFocusColor(): Color = ???

    /**  */
    @stub
    protected def getSelectColor(): Color = ???

    /**  */
    @stub
    def installDefaults(b: AbstractButton): Unit = ???

    /**  */
    @stub
    protected def paintButtonPressed(g: Graphics, b: AbstractButton): Unit = ???

    /**  */
    @stub
    protected def paintFocus(g: Graphics, b: AbstractButton, viewRect: Rectangle, textRect: Rectangle, iconRect: Rectangle): Unit = ???

    /** As of Java 2 platform v 1.4 this method should not be used or overriden. */
    @stub
    protected def paintText(g: Graphics, c: JComponent, textRect: Rectangle, text: String): Unit = ???

    /**  */
    @stub
    def uninstallDefaults(b: AbstractButton): Unit = ???
}

object MetalButtonUI {
    /**  */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
