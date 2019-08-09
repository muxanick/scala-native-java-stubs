package javax.swing

import java.lang.Object

/** A mutable version of ComboBoxModel. */
trait MutableComboBoxModel[E] extends ComboBoxModel[E] {

    /** Adds an item at the end of the model. */
    @stub
    def addElement(item: E): Unit = ???

    /** Adds an item at a specific index. */
    @stub
    def insertElementAt(item: E, index: Int): Unit = ???

    /** Removes an item from the model. */
    @stub
    def removeElement(obj: Object): Unit = ???
}
