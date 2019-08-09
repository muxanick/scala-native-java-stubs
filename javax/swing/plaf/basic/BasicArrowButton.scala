package javax.swing.plaf.basic

import java.awt.{Component, Container, Dimension, Graphics}
import java.lang.Object
import javax.swing.{AbstractButton, JButton, JComponent, SwingConstants}

// JButton object that draws a scaled Arrow in one of the cardinal directions.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class BasicArrowButton extends JButton with SwingConstants {

    @stub
    // Creates a BasicArrowButton whose arrow
    // is drawn in the specified direction.
    def this(direction: Int) = ???

    @stub
    // Returns the direction of the arrow.
    def getDirection(): Int = ???

    @stub
    // Returns the maximum size of the BasicArrowButton.
    def getMaximumSize(): Dimension = ???

    @stub
    // Returns the minimum size of the BasicArrowButton.
    def getMinimumSize(): Dimension = ???

    @stub
    // Returns the preferred size of the BasicArrowButton.
    def getPreferredSize(): Dimension = ???

    @stub
    // Returns whether the arrow button should get the focus.
    def isFocusTraversable(): Boolean = ???

    @stub
    // Invoked by Swing to draw components.
    def paint(g: Graphics): Unit = ???

    @stub
    // Paints a triangle.
    def paintTriangle(g: Graphics, x: Int, y: Int, size: Int, direction: Int, isEnabled: Boolean): Unit = ???
}
