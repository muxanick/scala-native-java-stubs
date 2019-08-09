package javax.swing.plaf.metal

import java.lang.Object
import javax.swing.plaf.UIResource
import javax.swing.plaf.basic.BasicComboBoxEditor

// A subclass of BasicComboBoxEditor that implements UIResource.
// BasicComboBoxEditor doesn't implement UIResource
// directly so that applications can safely override the
// cellRenderer property with BasicListCellRenderer subclasses.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
object MetalComboBoxEditor.UIResource extends MetalComboBoxEditor with UIResource {
