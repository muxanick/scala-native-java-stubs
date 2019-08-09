package javax.swing.plaf.metal

import java.lang.Object
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, TextUI}
import javax.swing.plaf.basic.{BasicTextFieldUI, BasicTextUI}

// Basis of a look and feel for a JTextField.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class MetalTextFieldUI extends BasicTextFieldUI {
}

object MetalTextFieldUI {
    @stub
    // 
    def createUI(c: JComponent): ComponentUI = ???
}
