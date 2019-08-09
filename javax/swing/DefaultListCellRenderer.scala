package javax.swing

import java.awt.{Component, Container, Rectangle}
import java.io.Serializable
import java.lang.{Object, String}

// Renders an item in a list.
// 
// Implementation Note:
// This class overrides
// invalidate,
// validate,
// revalidate,
// repaint,
// isOpaque,
// and
// firePropertyChange
// solely to improve performance.
// If not overridden, these frequently called methods would execute code paths
// that are unnecessary for the default list cell renderer.
// If you write your own renderer,
// take care to weigh the benefits and
// drawbacks of overriding these methods.
//
// 
//
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class DefaultListCellRenderer extends JLabel with ListCellRenderer[Object], with Serializable {

    @stub
    // Overridden for performance reasons.
    def firePropertyChange(propertyName: String, oldValue: Boolean, newValue: Boolean): Unit = ???

    @stub
    // Overridden for performance reasons.
    def firePropertyChange(propertyName: String, oldValue: Byte, newValue: Byte): Unit = ???

    @stub
    // Overridden for performance reasons.
    def firePropertyChange(propertyName: String, oldValue: Char, newValue: Char): Unit = ???

    @stub
    // Overridden for performance reasons.
    def firePropertyChange(propertyName: String, oldValue: double, newValue: double): Unit = ???

    @stub
    // Overridden for performance reasons.
    def firePropertyChange(propertyName: String, oldValue: float, newValue: float): Unit = ???

    @stub
    // Overridden for performance reasons.
    def firePropertyChange(propertyName: String, oldValue: Int, newValue: Int): Unit = ???

    @stub
    // Overridden for performance reasons.
    def firePropertyChange(propertyName: String, oldValue: Long, newValue: Long): Unit = ???

    @stub
    // Overridden for performance reasons.
    protected def firePropertyChange(propertyName: String, oldValue: Object, newValue: Object): Unit = ???

    @stub
    // Overridden for performance reasons.
    def firePropertyChange(propertyName: String, oldValue: Short, newValue: Short): Unit = ???

    @stub
    // Return a component that has been configured to display the specified
    // value.
    def getListCellRendererComponent(list: JList[_], value: Object, index: Int, isSelected: Boolean, cellHasFocus: Boolean): Component = ???

    @stub
    // Overridden for performance reasons.
    def invalidate(): Unit = ???

    @stub
    // Overridden for performance reasons.
    def isOpaque(): Boolean = ???

    @stub
    // Overridden for performance reasons.
    def repaint(): Unit = ???

    @stub
    // Overridden for performance reasons.
    def repaint(tm: Long, x: Int, y: Int, width: Int, height: Int): Unit = ???

    @stub
    // Overridden for performance reasons.
    def repaint(r: Rectangle): Unit = ???

    @stub
    // Overridden for performance reasons.
    def revalidate(): Unit = ???
}
