package javax.swing

import java.io.Serializable
import java.lang.Object
import java.util.Vector
import scala.scalanative.annotation.stub

/** The default model for combo boxes. */
class DefaultComboBoxModel[E] extends AbstractListModel[E] with MutableComboBoxModel[E] with Serializable {

    /** Constructs an empty DefaultComboBoxModel object. */
    @stub
    def this() = ???

    /** Constructs a DefaultComboBoxModel object initialized with
     *  an array of objects.
     */
    @stub
    def this(items: Array[E]) = ???

    /** Constructs a DefaultComboBoxModel object initialized with
     *  a vector.
     */
    @stub
    def this(v: Vector[E]) = ???

    /** Adds an item at the end of the model. */
    @stub
    def addElement(anObject: E): Unit = ???

    /** Returns the value at the specified index. */
    @stub
    def getElementAt(index: Int): E = ???

    /** Returns the index-position of the specified object in the list. */
    @stub
    def getIndexOf(anObject: Object): Int = ???

    /** Returns the selected item */
    @stub
    def getSelectedItem(): Object = ???

    /** Returns the length of the list. */
    @stub
    def getSize(): Int = ???

    /** Adds an item at a specific index. */
    @stub
    def insertElementAt(anObject: E, index: Int): Unit = ???

    /** Empties the list. */
    @stub
    def removeAllElements(): Unit = ???

    /** Removes an item from the model. */
    @stub
    def removeElement(anObject: Object): Unit = ???

    /** Removes an item at a specific index. */
    @stub
    def removeElementAt(index: Int): Unit = ???

    /** Set the value of the selected item. */
    @stub
    def setSelectedItem(anObject: Object): Unit = ???
}
