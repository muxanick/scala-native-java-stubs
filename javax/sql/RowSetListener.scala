package javax.sql

import java.util.EventListener

// An interface that must be implemented by a
// component that wants to be notified when a significant
// event happens in the life of a RowSet object.
// A component becomes a listener by being registered with a
// RowSet object via the method RowSet.addRowSetListener.
// How a registered component implements this interface determines what it does
// when it is notified of an event.
trait RowSetListener extends EventListener {

    @stub
    // Notifies registered listeners that a RowSet object's
    // cursor has moved.
    def cursorMoved(event: RowSetEvent): Unit = ???

    @stub
    // Notifies registered listeners that a RowSet object
    // has had a change in one of its rows.
    def rowChanged(event: RowSetEvent): Unit = ???
}
