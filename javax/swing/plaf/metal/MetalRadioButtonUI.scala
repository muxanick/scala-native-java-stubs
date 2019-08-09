package javax.swing.plaf.metal

import java.awt.{Color, Dimension, Graphics, Rectangle}
import java.lang.Object
import javax.swing.{AbstractButton, JComponent}
import javax.swing.plaf.{ButtonUI, ComponentUI}
import javax.swing.plaf.basic.{BasicButtonUI, BasicRadioButtonUI, BasicToggleButtonUI}

// RadioButtonUI implementation for MetalRadioButtonUI
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class MetalRadioButtonUI extends BasicRadioButtonUI {

    @stub
    // 
    protected def disabledTextColor: Color = ???

    @stub
    // 
    protected def focusColor: Color = ???

    @stub
    // 
    protected def getDisabledTextColor(): Color = ???

    @stub
    // 
    protected def getFocusColor(): Color = ???

    @stub
    // 
    protected def getSelectColor(): Color = ???

    @stub
    // 
    def installDefaults(b: AbstractButton): Unit = ???

    @stub
    // paint the radio button
    def paint(g: Graphics, c: JComponent): Unit = ???

    @stub
    // Paints focused radio button.
    protected def paintFocus(g: Graphics, t: Rectangle, d: Dimension): Unit = ???
}

object MetalRadioButtonUI {
    @stub
    // 
    def createUI(c: JComponent): ComponentUI = ???
}
