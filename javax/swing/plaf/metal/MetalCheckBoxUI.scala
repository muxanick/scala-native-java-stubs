package javax.swing.plaf.metal

import java.lang.{Object, String}
import javax.swing.{AbstractButton, JComponent}
import javax.swing.plaf.{ButtonUI, ComponentUI}
import javax.swing.plaf.basic.{BasicButtonUI, BasicRadioButtonUI, BasicToggleButtonUI}

/** CheckboxUI implementation for MetalCheckboxUI
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
class MetalCheckBoxUI extends MetalRadioButtonUI {

    /**  */
    @stub
    def getPropertyPrefix(): String = ???

    /**  */
    @stub
    def installDefaults(b: AbstractButton): Unit = ???
}

object MetalCheckBoxUI {
    /**  */
    @stub
    def createUI(b: JComponent): ComponentUI = ???
}
