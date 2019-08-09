package javax.swing.plaf.metal

import java.lang.Object
import javax.swing.{AbstractListModel, ComboBoxModel}

/** Data model for a type-face selection combo-box. */
protected class MetalFileChooserUI.DirectoryComboBoxModel extends AbstractListModel[Object] with ComboBoxModel[Object] {

    /**  */
    @stub
    def getDepth(i: Int): Int = ???

    /** Returns the value at the specified index. */
    @stub
    def getElementAt(index: Int): Object = ???

    /** Returns the selected item */
    @stub
    def getSelectedItem(): Object = ???

    /** Returns the length of the list. */
    @stub
    def getSize(): Int = ???
}
