package javax.swing.plaf.metal

import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.{AbstractListModel, ComboBoxModel}

// Data model for a type-face selection combo-box.
protected class MetalFileChooserUI.FilterComboBoxModel extends AbstractListModel[Object] with ComboBoxModel[Object], with PropertyChangeListener {

    @stub
    // Returns the value at the specified index.
    def getElementAt(index: Int): Object = ???

    @stub
    // Returns the selected item
    def getSelectedItem(): Object = ???

    @stub
    // Returns the length of the list.
    def getSize(): Int = ???

    @stub
    // This method gets called when a bound property is changed.
    def propertyChange(e: PropertyChangeEvent): Unit = ???
}
