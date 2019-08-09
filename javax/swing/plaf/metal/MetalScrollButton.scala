package javax.swing.plaf.metal

import java.awt.{Component, Container, Dimension, Graphics}
import java.lang.Object
import javax.swing.{AbstractButton, JButton, JComponent}
import javax.swing.plaf.basic.BasicArrowButton

/** JButton object for Metal scrollbar arrows.
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
class MetalScrollButton extends BasicArrowButton {

    /**  */
    @stub
    def getButtonWidth(): Int = ???

    /** Returns the maximum size of the BasicArrowButton. */
    @stub
    def getMaximumSize(): Dimension = ???

    /** Returns the minimum size of the BasicArrowButton. */
    @stub
    def getMinimumSize(): Dimension = ???

    /** Returns the preferred size of the BasicArrowButton. */
    @stub
    def getPreferredSize(): Dimension = ???

    /** Invoked by Swing to draw components. */
    @stub
    def paint(g: Graphics): Unit = ???
}
