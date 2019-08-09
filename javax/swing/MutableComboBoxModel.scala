package javax.swing

import java.lang.Object

// A mutable version of ComboBoxModel.
trait MutableComboBoxModel[E] extends ComboBoxModel[E] {

    @stub
    // Adds an item at the end of the model.
    def addElement(item: E): Unit = ???

    @stub
    // Adds an item at a specific index.
    def insertElementAt(item: E, index: Int): Unit = ???

    @stub
    // Removes an item from the model.
    def removeElement(obj: Object): Unit = ???
}
