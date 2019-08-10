package javax.swing.plaf.metal

import java.awt.Insets
import java.lang.Object
import javax.swing.plaf.UIResource
import javax.swing.plaf.basic.BasicComboBoxEditor
import scala.scalanative.annotation.stub

/** The default editor for Metal editable combo boxes
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
class MetalComboBoxEditor extends BasicComboBoxEditor {

    /**  */
    @stub
    def this() = ???
}

object MetalComboBoxEditor {
    /** A subclass of BasicComboBoxEditor that implements UIResource.
     *  BasicComboBoxEditor doesn't implement UIResource
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
    object UIResource extends MetalComboBoxEditor with UIResource {

        /**  */
        @stub
        def apply() = ???


    /** The default editor border Insets. */
    @stub
    protected val editorBorderInsets: Insets = ???
}
