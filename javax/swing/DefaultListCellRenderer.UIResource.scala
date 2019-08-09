package javax.swing

import java.awt.{Component, Container}
import java.lang.Object
import javax.swing.plaf.UIResource

/** A subclass of DefaultListCellRenderer that implements UIResource.
 *  DefaultListCellRenderer doesn't implement UIResource
 *  directly so that applications can safely override the
 *  cellRenderer property with DefaultListCellRenderer subclasses.
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
object DefaultListCellRenderer.UIResource extends DefaultListCellRenderer with UIResource {
