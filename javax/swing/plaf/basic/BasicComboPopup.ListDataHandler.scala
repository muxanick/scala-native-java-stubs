package javax.swing.plaf.basic

import java.lang.Object
import javax.swing.event.{ListDataEvent, ListDataListener}

// As of 1.4, this class is now obsolete, doesn't do anything, and
// is only included for backwards API compatibility. Do not call or
// override.
// 
// The functionality has been migrated into ItemHandler.
class BasicComboPopup.ListDataHandler extends Object with ListDataListener {

    @stub
    // Sent when the contents of the list has changed in a way
    // that's too complex to characterize with the previous
    // methods.
    def contentsChanged(e: ListDataEvent): Unit = ???

    @stub
    // Sent after the indices in the index0,index1
    // interval have been inserted in the data model.
    def intervalAdded(e: ListDataEvent): Unit = ???
}
