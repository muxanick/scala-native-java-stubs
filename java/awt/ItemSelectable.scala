package java.awt

import java.awt.event.ItemListener
import java.lang.Object

/** The interface for objects which contain a set of items for
 *  which zero or more can be selected.
 */
trait ItemSelectable {

    /** Adds a listener to receive item events when the state of an item is
     *  changed by the user.
     */
    @stub
    def addItemListener(l: ItemListener): Unit = ???

    /** Returns the selected items or null if no
     *  items are selected.
     */
    @stub
    def getSelectedObjects(): Array[Object] = ???
}
