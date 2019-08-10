package javax.swing.table

import java.awt.{Color, Component, Container, Rectangle}
import java.io.Serializable
import java.lang.{Object, String}
import javax.swing.{JComponent, JLabel, JTable}
import javax.swing.border.Border
import javax.swing.plaf.UIResource
import scala.scalanative.annotation.stub

/** The standard class for rendering (displaying) individual cells
 *  in a JTable.
 *  
 * 
 *  Implementation Note:
 *  This class inherits from JLabel, a standard component class.
 *  However JTable employs a unique mechanism for rendering
 *  its cells and therefore requires some slightly modified behavior
 *  from its cell renderer.
 *  The table class defines a single cell renderer and uses it as a
 *  as a rubber-stamp for rendering all cells in the table;
 *  it renders the first cell,
 *  changes the contents of that cell renderer,
 *  shifts the origin to the new location, re-draws it, and so on.
 *  The standard JLabel component was not
 *  designed to be used this way and we want to avoid
 *  triggering a revalidate each time the
 *  cell is drawn. This would greatly decrease performance because the
 *  revalidate message would be
 *  passed up the hierarchy of the container to determine whether any other
 *  components would be affected.
 *  As the renderer is only parented for the lifetime of a painting operation
 *  we similarly want to avoid the overhead associated with walking the
 *  hierarchy for painting operations.
 *  So this class
 *  overrides the validate, invalidate,
 *  revalidate, repaint, and
 *  firePropertyChange methods to be
 *  no-ops and override the isOpaque method solely to improve
 *  performance.  If you write your own renderer,
 *  please keep this performance consideration in mind.
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
class DefaultTableCellRenderer extends JLabel with TableCellRenderer with Serializable {

    /** Creates a default table cell renderer. */
    @stub
    def this() = ???

    /** Overridden for performance reasons. */
    @stub
    def firePropertyChange(propertyName: String, oldValue: Boolean, newValue: Boolean): Unit = ???

    /** Overridden for performance reasons. */
    @stub
    protected def firePropertyChange(propertyName: String, oldValue: Any, newValue: Any): Unit = ???

    /** Returns the default table cell renderer. */
    @stub
    def getTableCellRendererComponent(table: JTable, value: Any, isSelected: Boolean, hasFocus: Boolean, row: Int, column: Int): Component = ???

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

    /** Overrides JComponent.setBackground to assign
     *  the unselected-background color to the specified color.
     */
    @stub
    def setBackground(c: Color): Unit = ???

    /** Overrides JComponent.setForeground to assign
     *  the unselected-foreground color to the specified color.
     */
    @stub
    def setForeground(c: Color): Unit = ???

    /** Sets the String object for the cell being rendered to
     *  value.
     */
    @stub
    protected def setValue(value: Any): Unit = ???

    /** Notification from the UIManager that the look and feel
     *  [L&F] has changed.
     */
    @stub
    def updateUI(): Unit = ???

    /** Overridden for performance reasons. */
    @stub
    def validate(): Unit = ???
}

object DefaultTableCellRenderer {
    /** A subclass of DefaultTableCellRenderer that
     *  implements UIResource.
     *  DefaultTableCellRenderer doesn't implement
     *  UIResource
     *  directly so that applications can safely override the
     *  cellRenderer property with
     *  DefaultTableCellRenderer subclasses.
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
    object UIResource extends DefaultTableCellRenderer with UIResource {

        /**  */
        @stub
        def apply() = ???


    /**  */
    @stub
    protected val noFocusBorder: Border = ???
}
