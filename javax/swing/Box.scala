package javax.swing

import java.awt.{Component, Container, Dimension, Graphics}
import java.lang.Object
import javax.accessibility.{Accessible, AccessibleContext}

// A lightweight container
// that uses a BoxLayout object as its layout manager.
// Box provides several class methods
// that are useful for containers using BoxLayout --
// even non-Box containers.
//
// 
// The Box class can create several kinds
// of invisible components
// that affect layout:
// glue, struts, and rigid areas.
// If all the components your Box contains
// have a fixed size,
// you might want to use a glue component
// (returned by createGlue)
// to control the components' positions.
// If you need a fixed amount of space between two components,
// try using a strut
// (createHorizontalStrut or createVerticalStrut).
// If you need an invisible component
// that always takes up the same amount of space,
// get it by invoking createRigidArea.
// 
// If you are implementing a BoxLayout you
// can find further information and examples in
// How to Use BoxLayout,
// a section in The Java Tutorial.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class Box extends JComponent with Accessible {

    @stub
    // This class implements accessibility support for the
    // Box class.
    protected def Box.AccessibleBox: class = ???

    @stub
    // Gets the AccessibleContext associated with this Box.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Paints this Box.
    protected def paintComponent(g: Graphics): Unit = ???
}

object Box {
    @stub
    // Creates an invisible "glue" component
    // that can be useful in a Box
    // whose visible components have a maximum width
    // (for a horizontal box)
    // or height (for a vertical box).
    def createGlue(): Component = ???

    @stub
    // Creates a Box that displays its components
    // from left to right.
    def createHorizontalBox(): Box = ???

    @stub
    // Creates a horizontal glue component.
    def createHorizontalGlue(): Component = ???

    @stub
    // Creates an invisible, fixed-width component.
    def createHorizontalStrut(width: Int): Component = ???

    @stub
    // Creates an invisible component that's always the specified size.
    def createRigidArea(d: Dimension): Component = ???

    @stub
    // Creates a Box that displays its components
    // from top to bottom.
    def createVerticalBox(): Box = ???

    @stub
    // Creates a vertical glue component.
    def createVerticalGlue(): Component = ???

    @stub
    // Creates an invisible, fixed-height component.
    def createVerticalStrut(height: Int): Component = ???
}
