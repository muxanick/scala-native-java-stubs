package javax.swing

import java.awt.{Component, Container, LayoutManager}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.plaf.PanelUI

// JPanel is a generic lightweight container.
// For examples and task-oriented documentation for JPanel, see
// How to Use Panels,
// a section in The Java Tutorial.
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
class JPanel extends JComponent with Accessible {

    @stub
    // Creates a new JPanel with a double buffer
    // and a flow layout.
    def this() = ???

    @stub
    // Creates a new JPanel with FlowLayout
    // and the specified buffering strategy.
    def this(isDoubleBuffered: Boolean) = ???

    @stub
    // Create a new buffered JPanel with the specified layout manager
    def this(layout: LayoutManager) = ???

    @stub
    // Gets the AccessibleContext associated with this JPanel.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns the look and feel (L&amp;F) object that renders this component.
    def getUI(): PanelUI = ???

    @stub
    // Returns a string that specifies the name of the L&F class
    // that renders this component.
    def getUIClassID(): String = ???

    @stub
    // Returns a string representation of this JPanel.
    protected def paramString(): String = ???

    @stub
    // Sets the look and feel (L&F) object that renders this component.
    def setUI(ui: PanelUI): Unit = ???
}
