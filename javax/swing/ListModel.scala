package javax.swing

import javax.swing.event.ListDataListener
import scala.scalanative.annotation.stub

/** This interface defines the methods components like JList use
 *  to get the value of each cell in a list and the length of the list.
 *  Logically the model is a vector, indices vary from 0 to
 *  ListDataModel.getSize() - 1.  Any change to the contents or
 *  length of the data model must be reported to all of the
 *  ListDataListeners.
 */
trait ListModel[E] {

    /** Adds a listener to the list that's notified each time a change
     *  to the data model occurs.
     */
    @stub
    def addListDataListener(l: ListDataListener): Unit = ???

    /** Returns the value at the specified index. */
    @stub
    def getElementAt(index: Int): E = ???

    /** Returns the length of the list. */
    @stub
    def getSize(): Int = ???

    /** Removes a listener from the list that's notified each time a
     *  change to the data model occurs.
     */
    @stub
    def removeListDataListener(l: ListDataListener): Unit = ???
}
