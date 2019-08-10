package javax.swing.table

import java.awt.{Component, Container}
import java.lang.Object
import javax.swing.{JComponent, JLabel}
import javax.swing.plaf.UIResource
import scala.scalanative.annotation.stub

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
object DefaultTableCellRenderer_UIResource extends DefaultTableCellRenderer with UIResource {

    /**  */
    @stub
    def UIResource() = ???
