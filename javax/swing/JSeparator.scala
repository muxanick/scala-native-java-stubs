package javax.swing

import java.awt.{Component, Container}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.plaf.SeparatorUI

// JSeparator provides a general purpose component for
// implementing divider lines - most commonly used as a divider
// between menu items that breaks them up into logical groupings.
// Instead of using JSeparator directly,
// you can use the JMenu or JPopupMenu
// addSeparator method to create and add a separator.
// JSeparators may also be used elsewhere in a GUI
// wherever a visual divider is useful.
//
// 
//
// For more information and examples see
// How to Use Menus,
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
class JSeparator extends JComponent with SwingConstants, with Accessible {

    @stub
    // Creates a new horizontal separator.
    def this() = ???

    @stub
    // Gets the AccessibleContext associated with this JSeparator.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns the orientation of this separator.
    def getOrientation(): Int = ???

    @stub
    // Returns the L&F object that renders this component.
    def getUI(): SeparatorUI = ???

    @stub
    // Returns the name of the L&F class that renders this component.
    def getUIClassID(): String = ???

    @stub
    // Returns a string representation of this JSeparator.
    protected def paramString(): String = ???

    @stub
    // Sets the orientation of the separator.
    def setOrientation(orientation: Int): Unit = ???

    @stub
    // Sets the L&F object that renders this component.
    def setUI(ui: SeparatorUI): Unit = ???
}
