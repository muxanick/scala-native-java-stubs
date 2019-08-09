package javax.swing

import java.awt.{Component, Container, Rectangle}
import java.io.Serializable
import java.lang.{Object, String}
import javax.swing.border.Border
import scala.scalanative.annotation.stub

/** Renders an item in a list.
 *  
 *  Implementation Note:
 *  This class overrides
 *  invalidate,
 *  validate,
 *  revalidate,
 *  repaint,
 *  isOpaque,
 *  and
 *  firePropertyChange
 *  solely to improve performance.
 *  If not overridden, these frequently called methods would execute code paths
 *  that are unnecessary for the default list cell renderer.
 *  If you write your own renderer,
 *  take care to weigh the benefits and
 *  drawbacks of overriding these methods.
 * 
 *  
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
class DefaultListCellRenderer extends JLabel with ListCellRenderer[Object] with Serializable {

    /** Constructs a default renderer object for an item
     *  in a list.
     */
    @stub
    def this() = ???

    /** Overridden for performance reasons. */
    @stub
    def firePropertyChange(propertyName: String, oldValue: Boolean, newValue: Boolean): Unit = ???

    /** Overridden for performance reasons. */
    @stub
    def firePropertyChange(propertyName: String, oldValue: Byte, newValue: Byte): Unit = ???

    /** Overridden for performance reasons. */
    @stub
    def firePropertyChange(propertyName: String, oldValue: Char, newValue: Char): Unit = ???

    /** Overridden for performance reasons. */
    @stub
    def firePropertyChange(propertyName: String, oldValue: Double, newValue: Double): Unit = ???

    /** Overridden for performance reasons. */
    @stub
    def firePropertyChange(propertyName: String, oldValue: Float, newValue: Float): Unit = ???

    /** Overridden for performance reasons. */
    @stub
    def firePropertyChange(propertyName: String, oldValue: Int, newValue: Int): Unit = ???

    /** Overridden for performance reasons. */
    @stub
    def firePropertyChange(propertyName: String, oldValue: Long, newValue: Long): Unit = ???

    /** Overridden for performance reasons. */
    @stub
    protected def firePropertyChange(propertyName: String, oldValue: Object, newValue: Object): Unit = ???

    /** Overridden for performance reasons. */
    @stub
    def firePropertyChange(propertyName: String, oldValue: Short, newValue: Short): Unit = ???

    /** Return a component that has been configured to display the specified
     *  value.
     */
    @stub
    def getListCellRendererComponent(list: JList[_], value: Object, index: Int, isSelected: Boolean, cellHasFocus: Boolean): Component = ???

    /** Overridden for performance reasons. */
    @stub
    def invalidate(): Unit = ???

    /** Overridden for performance reasons. */
    @stub
    def isOpaque(): Boolean = ???

    /** Overridden for performance reasons. */
    @stub
    def repaint(): Unit = ???

    /** Overridden for performance reasons. */
    @stub
    def repaint(tm: Long, x: Int, y: Int, width: Int, height: Int): Unit = ???

    /** Overridden for performance reasons. */
    @stub
    def repaint(r: Rectangle): Unit = ???

    /** Overridden for performance reasons. */
    @stub
    def revalidate(): Unit = ???

    /** Overridden for performance reasons. */
    @stub
    def validate(): Unit = ???
}

object DefaultListCellRenderer {
    /** A subclass of DefaultListCellRenderer that implements UIResource. */
    @stub
    object UIResource extends DefaultListCellRenderer.UIResource

    /**  */
    @stub
    protected val noFocusBorder: Border = ???
}
