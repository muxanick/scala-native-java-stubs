package javax.swing.plaf.basic

import java.awt.{Dimension, Graphics, Rectangle}
import java.lang.{Object, String}
import javax.swing.{AbstractButton, Icon, JComponent}
import javax.swing.plaf.{ButtonUI, ComponentUI}

// RadioButtonUI implementation for BasicRadioButtonUI
class BasicRadioButtonUI extends BasicToggleButtonUI {

    @stub
    // Returns the default icon.
    def getDefaultIcon(): Icon = ???

    @stub
    // The preferred size of the radio button
    def getPreferredSize(c: JComponent): Dimension = ???

    @stub
    // 
    protected def getPropertyPrefix(): String = ???

    @stub
    // 
    protected def installDefaults(b: AbstractButton): Unit = ???

    @stub
    // 
    protected def installListeners(button: AbstractButton): Unit = ???

    @stub
    // paint the radio button
    def paint(g: Graphics, c: JComponent): Unit = ???

    @stub
    // Paints focused radio button.
    protected def paintFocus(g: Graphics, textRect: Rectangle, size: Dimension): Unit = ???

    @stub
    // 
    protected def uninstallDefaults(b: AbstractButton): Unit = ???
}

object BasicRadioButtonUI {
    @stub
    // Returns an instance of BasicRadioButtonUI.
    def createUI(b: JComponent): ComponentUI = ???
}
