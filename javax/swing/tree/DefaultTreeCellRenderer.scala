package javax.swing.tree

import java.awt.{Color, Component, Container, Dimension, Font, Graphics, Rectangle}
import java.lang.{Object, String}
import javax.swing.{Icon, JComponent, JLabel, JTree}
import scala.scalanative.annotation.stub

/** Displays an entry in a tree.
 *  DefaultTreeCellRenderer is not opaque and
 *  unless you subclass paint you should not change this.
 *  See How to Use Trees
 *  in The Java Tutorial
 *  for examples of customizing node display using this class.
 *  
 *  The set of icons and colors used by DefaultTreeCellRenderer
 *  can be configured using the various setter methods. The value for
 *  each property is initialized from the defaults table. When the
 *  look and feel changes (updateUI is invoked), any properties
 *  that have a value of type UIResource are refreshed from the
 *  defaults table. The following table lists the mapping between
 *  DefaultTreeCellRenderer property and defaults table key:
 *  
 *    
 *      Property:
 *      Key:
 *    "leafIcon""Tree.leafIcon"
 *    "closedIcon""Tree.closedIcon"
 *    "openIcon""Tree.openIcon"
 *    "textSelectionColor""Tree.selectionForeground"
 *    "textNonSelectionColor""Tree.textForeground"
 *    "backgroundSelectionColor""Tree.selectionBackground"
 *    "backgroundNonSelectionColor""Tree.textBackground"
 *    "borderSelectionColor""Tree.selectionBorderColor"
 *  
 *  
 *  Implementation Note:
 *  This class overrides
 *  invalidate,
 *  validate,
 *  revalidate,
 *  repaint,
 *  and
 *  firePropertyChange
 *  solely to improve performance.
 *  If not overridden, these frequently called methods would execute code paths
 *  that are unnecessary for the default tree cell renderer.
 *  If you write your own renderer,
 *  take care to weigh the benefits and
 *  drawbacks of overriding these methods.
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
class DefaultTreeCellRenderer extends JLabel with TreeCellRenderer {

    /** Creates a DefaultTreeCellRenderer. */
    @stub
    def this() = ???

    /** Color to use for the background when the node isn't selected. */
    @stub
    protected val backgroundNonSelectionColor: Color = ???

    /** Color to use for the background when a node is selected. */
    @stub
    protected val backgroundSelectionColor: Color = ???

    /** Color to use for the focus indicator when the node has focus. */
    @stub
    protected val borderSelectionColor: Color = ???

    /** Icon used to show non-leaf nodes that aren't expanded. */
    @stub
    protected val closedIcon: Icon = ???

    /** True if has focus. */
    @stub
    protected val hasFocus: Boolean = ???

    /** Icon used to show leaf nodes. */
    @stub
    protected val leafIcon: Icon = ???

    /** Icon used to show non-leaf nodes that are expanded. */
    @stub
    protected val openIcon: Icon = ???

    /** Is the value currently selected. */
    @stub
    protected val selected: Boolean = ???

    /** Color to use for the foreground for non-selected nodes. */
    @stub
    protected val textNonSelectionColor: Color = ???

    /** Color to use for the foreground for selected nodes. */
    @stub
    protected val textSelectionColor: Color = ???

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

    /** Returns the background color to be used for non selected nodes. */
    @stub
    def getBackgroundNonSelectionColor(): Color = ???

    /** Returns the color to use for the background if node is selected. */
    @stub
    def getBackgroundSelectionColor(): Color = ???

    /** Returns the color the border is drawn. */
    @stub
    def getBorderSelectionColor(): Color = ???

    /** Returns the icon used to represent non-leaf nodes that are not
     *  expanded.
     */
    @stub
    def getClosedIcon(): Icon = ???

    /** Returns the default icon, for the current laf, that is used to
     *  represent non-leaf nodes that are not expanded.
     */
    @stub
    def getDefaultClosedIcon(): Icon = ???

    /** Returns the default icon, for the current laf, that is used to
     *  represent leaf nodes.
     */
    @stub
    def getDefaultLeafIcon(): Icon = ???

    /** Returns the default icon, for the current laf, that is used to
     *  represent non-leaf nodes that are expanded.
     */
    @stub
    def getDefaultOpenIcon(): Icon = ???

    /** Gets the font of this component. */
    @stub
    def getFont(): Font = ???

    /** Returns the icon used to represent leaf nodes. */
    @stub
    def getLeafIcon(): Icon = ???

    /** Returns the icon used to represent non-leaf nodes that are expanded. */
    @stub
    def getOpenIcon(): Icon = ???

    /** Overrides JComponent.getPreferredSize to
     *  return slightly wider preferred size value.
     */
    @stub
    def getPreferredSize(): Dimension = ???

    /** Returns the color the text is drawn with when the node isn't selected. */
    @stub
    def getTextNonSelectionColor(): Color = ???

    /** Returns the color the text is drawn with when the node is selected. */
    @stub
    def getTextSelectionColor(): Color = ???

    /** Configures the renderer based on the passed in components. */
    @stub
    def getTreeCellRendererComponent(tree: JTree, value: Object, sel: Boolean, expanded: Boolean, leaf: Boolean, row: Int, hasFocus: Boolean): Component = ???

    /** Overridden for performance reasons. */
    @stub
    def invalidate(): Unit = ???

    /** Paints the value. */
    @stub
    def paint(g: Graphics): Unit = ???

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

    /** Subclassed to map ColorUIResources to null. */
    @stub
    def setBackground(color: Color): Unit = ???

    /** Sets the background color to be used for non selected nodes. */
    @stub
    def setBackgroundNonSelectionColor(newColor: Color): Unit = ???

    /** Sets the color to use for the background if node is selected. */
    @stub
    def setBackgroundSelectionColor(newColor: Color): Unit = ???

    /** Sets the color to use for the border. */
    @stub
    def setBorderSelectionColor(newColor: Color): Unit = ???

    /** Sets the icon used to represent non-leaf nodes that are not expanded. */
    @stub
    def setClosedIcon(newIcon: Icon): Unit = ???

    /** Subclassed to map FontUIResources to null. */
    @stub
    def setFont(font: Font): Unit = ???

    /** Sets the icon used to represent leaf nodes. */
    @stub
    def setLeafIcon(newIcon: Icon): Unit = ???

    /** Sets the icon used to represent non-leaf nodes that are expanded. */
    @stub
    def setOpenIcon(newIcon: Icon): Unit = ???

    /** Sets the color the text is drawn with when the node isn't selected. */
    @stub
    def setTextNonSelectionColor(newColor: Color): Unit = ???

    /** Sets the color the text is drawn with when the node is selected. */
    @stub
    def setTextSelectionColor(newColor: Color): Unit = ???

    /** Resets the UI property to a value from the current look and feel. */
    @stub
    def updateUI(): Unit = ???

    /** Overridden for performance reasons. */
    @stub
    def validate(): Unit = ???
}
