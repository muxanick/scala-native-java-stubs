package javax.swing.plaf.metal

import java.lang.Object
import javax.swing.{AbstractListModel, ComboBoxModel}

// Data model for a type-face selection combo-box.
protected class MetalFileChooserUI.DirectoryComboBoxModel extends AbstractListModel[Object] with ComboBoxModel[Object] {

    @stub
    // 
    def getDepth(i: Int): Int = ???

    @stub
    // Returns the value at the specified index.
    def getElementAt(index: Int): Object = ???

    @stub
    // Returns the selected item
    def getSelectedItem(): Object = ???

    @stub
    // Returns the length of the list.
    def getSize(): Int = ???
}
