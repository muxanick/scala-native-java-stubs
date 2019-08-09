package javax.swing.event

import java.util.EventListener

/** ListDataListener */
trait ListDataListener extends EventListener {

    /** Sent when the contents of the list has changed in a way
     *  that's too complex to characterize with the previous
     *  methods.
     */
    @stub
    def contentsChanged(e: ListDataEvent): Unit = ???

    /** Sent after the indices in the index0,index1
     *  interval have been inserted in the data model.
     */
    @stub
    def intervalAdded(e: ListDataEvent): Unit = ???
}
