package javax.swing.plaf.basic

import java.awt.{Component, Container, Dimension}
import java.io.Serializable
import java.lang.Object
import javax.swing.{JComponent, JLabel, JList, ListCellRenderer}
import javax.swing.border.Border
import javax.swing.plaf.UIResource
import scala.scalanative.annotation.stub

/** ComboBox renderer
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
class BasicComboBoxRenderer extends JLabel with ListCellRenderer with Serializable {

    /**  */
    @stub
    def this() = ???

    /** Return a component that has been configured to display the specified
     *  value.
     */
    @stub
    def getListCellRendererComponent(list: JList, value: Any, index: Int, isSelected: Boolean, cellHasFocus: Boolean): Component = ???

    /** If the preferredSize has been set to a
     *  non-null value just returns it.
     */
    @stub
    def getPreferredSize(): Dimension = ???
}

object BasicComboBoxRenderer {
    /** A subclass of BasicComboBoxRenderer that implements UIResource.
     *  BasicComboBoxRenderer doesn't implement UIResource
     *  directly so that applications can safely override the
     *  cellRenderer property with BasicListCellRenderer subclasses.
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
    object UIResource extends BasicComboBoxRenderer with UIResource {

        /**  */
        @stub
        def apply() = ???


    /** An empty Border. */
    @stub
    protected val noFocusBorder: Border = ???
}
