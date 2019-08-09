package javax.swing.plaf.basic

import java.awt.{Component, Container}
import java.io.Serializable
import java.lang.Object
import javax.swing.{JComponent, JLabel, JList, ListCellRenderer}

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

    /** Return a component that has been configured to display the specified
     *  value.
     */
    @stub
    def getListCellRendererComponent(list: JList, value: Object, index: Int, isSelected: Boolean, cellHasFocus: Boolean): Component = ???
}
