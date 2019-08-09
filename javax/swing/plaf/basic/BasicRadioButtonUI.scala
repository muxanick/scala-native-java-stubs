package javax.swing.plaf.basic

import java.awt.{Dimension, Graphics, Rectangle}
import java.lang.{Object, String}
import javax.swing.{AbstractButton, Icon, JComponent}
import javax.swing.plaf.{ButtonUI, ComponentUI}
import scala.scalanative.annotation.stub

/** RadioButtonUI implementation for BasicRadioButtonUI */
class BasicRadioButtonUI extends BasicToggleButtonUI {

    /**  */
    @stub
    def this() = ???

    /** The icon. */
    @stub
    protected val icon: Icon = ???

    /** Returns the default icon. */
    @stub
    def getDefaultIcon(): Icon = ???

    /** The preferred size of the radio button */
    @stub
    def getPreferredSize(c: JComponent): Dimension = ???

    /**  */
    @stub
    protected def getPropertyPrefix(): String = ???

    /**  */
    @stub
    protected def installDefaults(b: AbstractButton): Unit = ???

    /**  */
    @stub
    protected def installListeners(button: AbstractButton): Unit = ???

    /** paint the radio button */
    @stub
    def paint(g: Graphics, c: JComponent): Unit = ???

    /** Paints focused radio button. */
    @stub
    protected def paintFocus(g: Graphics, textRect: Rectangle, size: Dimension): Unit = ???

    /**  */
    @stub
    protected def uninstallDefaults(b: AbstractButton): Unit = ???

    /**  */
    @stub
    protected def uninstallListeners(button: AbstractButton): Unit = ???
}

object BasicRadioButtonUI {
    /** Returns an instance of BasicRadioButtonUI. */
    @stub
    def createUI(b: JComponent): ComponentUI = ???
}
