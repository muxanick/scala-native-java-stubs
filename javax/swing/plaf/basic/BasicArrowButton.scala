package javax.swing.plaf.basic

import java.awt.{Component, Container, Dimension, Graphics}
import java.lang.Object
import javax.swing.{AbstractButton, JButton, JComponent, SwingConstants}

/** JButton object that draws a scaled Arrow in one of the cardinal directions.
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
class BasicArrowButton extends JButton with SwingConstants {

    /** Creates a BasicArrowButton whose arrow
     *  is drawn in the specified direction.
     */
    @stub
    def this(direction: Int) = ???

    /** Returns the direction of the arrow. */
    @stub
    def getDirection(): Int = ???

    /** Returns the maximum size of the BasicArrowButton. */
    @stub
    def getMaximumSize(): Dimension = ???

    /** Returns the minimum size of the BasicArrowButton. */
    @stub
    def getMinimumSize(): Dimension = ???

    /** Returns the preferred size of the BasicArrowButton. */
    @stub
    def getPreferredSize(): Dimension = ???

    /** Returns whether the arrow button should get the focus. */
    @stub
    def isFocusTraversable(): Boolean = ???

    /** Invoked by Swing to draw components. */
    @stub
    def paint(g: Graphics): Unit = ???

    /** Paints a triangle. */
    @stub
    def paintTriangle(g: Graphics, x: Int, y: Int, size: Int, direction: Int, isEnabled: Boolean): Unit = ???
}
