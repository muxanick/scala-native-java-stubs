package javax.swing

import java.io.Serializable
import java.lang.Object

// The default model for combo boxes.
class DefaultComboBoxModel[E] extends AbstractListModel[E] with MutableComboBoxModel[E], with Serializable {

    @stub
    // Constructs an empty DefaultComboBoxModel object.
    def this() = ???

    @stub
    // Constructs a DefaultComboBoxModel object initialized with
    // an array of objects.
    def this(items: Array[E]) = ???

    @stub
    // Adds an item at the end of the model.
    def addElement(anObject: E): Unit = ???

    @stub
    // Returns the value at the specified index.
    def getElementAt(index: Int): E = ???

    @stub
    // Returns the index-position of the specified object in the list.
    def getIndexOf(anObject: Object): Int = ???

    @stub
    // Returns the selected item
    def getSelectedItem(): Object = ???

    @stub
    // Returns the length of the list.
    def getSize(): Int = ???

    @stub
    // Adds an item at a specific index.
    def insertElementAt(anObject: E, index: Int): Unit = ???

    @stub
    // Empties the list.
    def removeAllElements(): Unit = ???

    @stub
    // Removes an item from the model.
    def removeElement(anObject: Object): Unit = ???

    @stub
    // Removes an item at a specific index.
    def removeElementAt(index: Int): Unit = ???
}
