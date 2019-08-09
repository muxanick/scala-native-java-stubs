package javax.swing.plaf.basic

import java.awt.Component.BaselineResizeBehavior
import java.lang.Object
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, TextUI}
import javax.swing.text.{Element, View}

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
class BasicTextFieldUI extends BasicTextUI {

    @stub
    // Creates a view (FieldView) based on an element.
    def create(elem: Element): View = ???

    @stub
    // Returns the baseline.
    def getBaseline(c: JComponent, width: Int, height: Int): Int = ???

    @stub
    // Returns an enum indicating how the baseline of the component
    // changes as the size changes.
    def getBaselineResizeBehavior(c: JComponent): Component.BaselineResizeBehavior = ???
}

object BasicTextFieldUI {
    @stub
    // Creates a UI for a JTextField.
    def createUI(c: JComponent): ComponentUI = ???
}
