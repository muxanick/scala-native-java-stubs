package javax.swing.event

import java.util.EventListener

// ListDataListener
trait ListDataListener extends EventListener {

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
