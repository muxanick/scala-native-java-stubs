package javax.swing

import scala.scalanative.annotation.stub

/** The interface that defines a KeySelectionManager.
 *  To qualify as a KeySelectionManager,
 *  the class needs to implement the method
 *  that identifies the list index given a character and the
 *  combo box data model.
 */
trait JComboBox_KeySelectionManager {

    /** Given aKey and the model, returns the row
     *   that should become selected.
     */
    @stub
    def selectionForKey(aKey: Char, aModel: ComboBoxModel): Int = ???
}
