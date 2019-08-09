package javax.swing.tree

import java.awt.{Color, Component, Container, Dimension, Font, Graphics, Rectangle}
import java.lang.{Object, String}
import javax.swing.{Icon, JComponent, JLabel, JTree}

// Displays an entry in a tree.
// DefaultTreeCellRenderer is not opaque and
// unless you subclass paint you should not change this.
// See How to Use Trees
// in The Java Tutorial
// for examples of customizing node display using this class.
// 
// The set of icons and colors used by DefaultTreeCellRenderer
// can be configured using the various setter methods. The value for
// each property is initialized from the defaults table. When the
// look and feel changes (updateUI is invoked), any properties
// that have a value of type UIResource are refreshed from the
// defaults table. The following table lists the mapping between
// DefaultTreeCellRenderer property and defaults table key:
// 
//   
//     Property:
//     Key:
//   "leafIcon""Tree.leafIcon"
//   "closedIcon""Tree.closedIcon"
//   "openIcon""Tree.openIcon"
//   "textSelectionColor""Tree.selectionForeground"
//   "textNonSelectionColor""Tree.textForeground"
//   "backgroundSelectionColor""Tree.selectionBackground"
//   "backgroundNonSelectionColor""Tree.textBackground"
//   "borderSelectionColor""Tree.selectionBorderColor"
// 
// 
// Implementation Note:
// This class overrides
// invalidate,
// validate,
// revalidate,
// repaint,
// and
// firePropertyChange
// solely to improve performance.
// If not overridden, these frequently called methods would execute code paths
// that are unnecessary for the default tree cell renderer.
// If you write your own renderer,
// take care to weigh the benefits and
// drawbacks of overriding these methods.
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
class DefaultTreeCellRenderer extends JLabel with TreeCellRenderer {

    @stub
    // Color to use for the background when the node isn't selected.
    protected def backgroundNonSelectionColor: Color = ???

    @stub
    // Color to use for the background when a node is selected.
    protected def backgroundSelectionColor: Color = ???

    @stub
    // Color to use for the focus indicator when the node has focus.
    protected def borderSelectionColor: Color = ???

    @stub
    // Icon used to show non-leaf nodes that aren't expanded.
    protected def closedIcon: Icon = ???

    @stub
    // True if has focus.
    protected def hasFocus: Boolean = ???

    @stub
    // Icon used to show leaf nodes.
    protected def leafIcon: Icon = ???

    @stub
    // Icon used to show non-leaf nodes that are expanded.
    protected def openIcon: Icon = ???

    @stub
    // Is the value currently selected.
    protected def selected: Boolean = ???

    @stub
    // Color to use for the foreground for non-selected nodes.
    protected def textNonSelectionColor: Color = ???

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
    // Returns the background color to be used for non selected nodes.
    def getBackgroundNonSelectionColor(): Color = ???

    @stub
    // Returns the color to use for the background if node is selected.
    def getBackgroundSelectionColor(): Color = ???

    @stub
    // Returns the color the border is drawn.
    def getBorderSelectionColor(): Color = ???

    @stub
    // Returns the icon used to represent non-leaf nodes that are not
    // expanded.
    def getClosedIcon(): Icon = ???

    @stub
    // Returns the default icon, for the current laf, that is used to
    // represent non-leaf nodes that are not expanded.
    def getDefaultClosedIcon(): Icon = ???

    @stub
    // Returns the default icon, for the current laf, that is used to
    // represent leaf nodes.
    def getDefaultLeafIcon(): Icon = ???

    @stub
    // Returns the default icon, for the current laf, that is used to
    // represent non-leaf nodes that are expanded.
    def getDefaultOpenIcon(): Icon = ???

    @stub
    // Gets the font of this component.
    def getFont(): Font = ???

    @stub
    // Returns the icon used to represent leaf nodes.
    def getLeafIcon(): Icon = ???

    @stub
    // Returns the icon used to represent non-leaf nodes that are expanded.
    def getOpenIcon(): Icon = ???

    @stub
    // Overrides JComponent.getPreferredSize to
    // return slightly wider preferred size value.
    def getPreferredSize(): Dimension = ???

    @stub
    // Returns the color the text is drawn with when the node isn't selected.
    def getTextNonSelectionColor(): Color = ???

    @stub
    // Returns the color the text is drawn with when the node is selected.
    def getTextSelectionColor(): Color = ???

    @stub
    // Configures the renderer based on the passed in components.
    def getTreeCellRendererComponent(tree: JTree, value: Object, sel: Boolean, expanded: Boolean, leaf: Boolean, row: Int, hasFocus: Boolean): Component = ???

    @stub
    // Overridden for performance reasons.
    def invalidate(): Unit = ???

    @stub
    // Paints the value.
    def paint(g: Graphics): Unit = ???

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

    @stub
    // Subclassed to map ColorUIResources to null.
    def setBackground(color: Color): Unit = ???

    @stub
    // Sets the background color to be used for non selected nodes.
    def setBackgroundNonSelectionColor(newColor: Color): Unit = ???

    @stub
    // Sets the color to use for the background if node is selected.
    def setBackgroundSelectionColor(newColor: Color): Unit = ???

    @stub
    // Sets the color to use for the border.
    def setBorderSelectionColor(newColor: Color): Unit = ???

    @stub
    // Sets the icon used to represent non-leaf nodes that are not expanded.
    def setClosedIcon(newIcon: Icon): Unit = ???

    @stub
    // Subclassed to map FontUIResources to null.
    def setFont(font: Font): Unit = ???

    @stub
    // Sets the icon used to represent leaf nodes.
    def setLeafIcon(newIcon: Icon): Unit = ???

    @stub
    // Sets the icon used to represent non-leaf nodes that are expanded.
    def setOpenIcon(newIcon: Icon): Unit = ???

    @stub
    // Sets the color the text is drawn with when the node isn't selected.
    def setTextNonSelectionColor(newColor: Color): Unit = ???

    @stub
    // Sets the color the text is drawn with when the node is selected.
    def setTextSelectionColor(newColor: Color): Unit = ???

    @stub
    // Resets the UI property to a value from the current look and feel.
    def updateUI(): Unit = ???
}
