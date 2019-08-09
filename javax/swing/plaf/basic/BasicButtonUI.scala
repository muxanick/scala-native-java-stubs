package javax.swing.plaf.basic

import java.awt.{Component.BaselineResizeBehavior, Dimension, Graphics, Rectangle}
import java.lang.{Object, String}
import javax.swing.{AbstractButton, JComponent}
import javax.swing.plaf.{ButtonUI, ComponentUI}
import scala.scalanative.annotation.stub

/** BasicButton implementation */
class BasicButtonUI extends ButtonUI {

    /**  */
    @stub
    def this() = ???

    /**  */
    @stub
    protected val defaultTextIconGap: Int = ???

    /**  */
    @stub
    protected val defaultTextShiftOffset: Int = ???

    /**  */
    @stub
    protected def clearTextShiftOffset(): Unit = ???

    /**  */
    @stub
    protected def createButtonListener(b: AbstractButton): BasicButtonListener = ???

    /** Returns the baseline. */
    @stub
    def getBaseline(c: JComponent, width: Int, height: Int): Int = ???

    /** Returns an enum indicating how the baseline of the component
     *  changes as the size changes.
     */
    @stub
    def getBaselineResizeBehavior(c: JComponent): Component.BaselineResizeBehavior = ???

    /**  */
    @stub
    def getDefaultTextIconGap(b: AbstractButton): Int = ???

    /** Returns the specified component's maximum size appropriate for
     *  the look and feel.
     */
    @stub
    def getMaximumSize(c: JComponent): Dimension = ???

    /** Returns the specified component's minimum size appropriate for
     *  the look and feel.
     */
    @stub
    def getMinimumSize(c: JComponent): Dimension = ???

    /** Returns the specified component's preferred size appropriate for
     *  the look and feel.
     */
    @stub
    def getPreferredSize(c: JComponent): Dimension = ???

    /**  */
    @stub
    protected def getPropertyPrefix(): String = ???

    /**  */
    @stub
    protected def getTextShiftOffset(): Int = ???

    /**  */
    @stub
    protected def installDefaults(b: AbstractButton): Unit = ???

    /**  */
    @stub
    protected def installKeyboardActions(b: AbstractButton): Unit = ???

    /**  */
    @stub
    protected def installListeners(b: AbstractButton): Unit = ???

    /** Configures the specified component appropriately for the look and feel. */
    @stub
    def installUI(c: JComponent): Unit = ???

    /** Paints the specified component appropriately for the look and feel. */
    @stub
    def paint(g: Graphics, c: JComponent): Unit = ???

    /**  */
    @stub
    protected def paintButtonPressed(g: Graphics, b: AbstractButton): Unit = ???

    /**  */
    @stub
    protected def paintFocus(g: Graphics, b: AbstractButton, viewRect: Rectangle, textRect: Rectangle, iconRect: Rectangle): Unit = ???

    /**  */
    @stub
    protected def paintIcon(g: Graphics, c: JComponent, iconRect: Rectangle): Unit = ???

    /** Method which renders the text of the current button. */
    @stub
    protected def paintText(g: Graphics, b: AbstractButton, textRect: Rectangle, text: String): Unit = ???

    /** As of Java 2 platform v 1.4 this method should not be used or overriden. */
    @stub
    protected def paintText(g: Graphics, c: JComponent, textRect: Rectangle, text: String): Unit = ???

    /**  */
    @stub
    protected def setTextShiftOffset(): Unit = ???

    /**  */
    @stub
    protected def uninstallDefaults(b: AbstractButton): Unit = ???

    /**  */
    @stub
    protected def uninstallKeyboardActions(b: AbstractButton): Unit = ???

    /**  */
    @stub
    protected def uninstallListeners(b: AbstractButton): Unit = ???

    /** Reverses configuration which was done on the specified component during
     *  installUI.
     */
    @stub
    def uninstallUI(c: JComponent): Unit = ???
}

object BasicButtonUI {
    /**  */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
