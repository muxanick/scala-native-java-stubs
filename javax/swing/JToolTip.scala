package javax.swing

import java.awt.{Component, Container}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.plaf.ToolTipUI

// Used to display a "Tip" for a Component. Typically components provide api
// to automate the process of using ToolTips.
// For example, any Swing component can use the JComponent
// setToolTipText method to specify the text
// for a standard tooltip. A component that wants to create a custom
// ToolTip
// display can override JComponent's createToolTip
// method and use a subclass of this class.
// 
// See How to Use Tool Tips
// in The Java Tutorial
// for further documentation.
// 
// Warning: Swing is not thread safe. For more
// information see Swing's Threading
// Policy.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class JToolTip extends JComponent with Accessible {

    @stub
    // Gets the AccessibleContext associated with this JToolTip.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns the component the tooltip applies to.
    def getComponent(): JComponent = ???

    @stub
    // Returns the text that is shown when the tool tip is displayed.
    def getTipText(): String = ???

    @stub
    // Returns the L&F object that renders this component.
    def getUI(): ToolTipUI = ???

    @stub
    // Returns the name of the L&F class that renders this component.
    def getUIClassID(): String = ???

    @stub
    // Returns a string representation of this JToolTip.
    protected def paramString(): String = ???

    @stub
    // Specifies the component that the tooltip describes.
    def setComponent(c: JComponent): Unit = ???

    @stub
    // Sets the text to show when the tool tip is displayed.
    def setTipText(tipText: String): Unit = ???
}
