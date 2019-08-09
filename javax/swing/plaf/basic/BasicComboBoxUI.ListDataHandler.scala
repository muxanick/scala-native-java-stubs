package javax.swing.plaf.basic

import java.lang.Object
import javax.swing.event.{ListDataEvent, ListDataListener}

// This listener watches for changes in the
// ComboBoxModel.
// 
// This public inner class should be treated as protected.
// Instantiate it only within subclasses of
// BasicComboBoxUI.
class BasicComboBoxUI.ListDataHandler extends Object with ListDataListener {

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
