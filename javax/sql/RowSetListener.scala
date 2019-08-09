package javax.sql

import java.util.EventListener
import scala.scalanative.annotation.stub

/** An interface that must be implemented by a
 *  component that wants to be notified when a significant
 *  event happens in the life of a RowSet object.
 *  A component becomes a listener by being registered with a
 *  RowSet object via the method RowSet.addRowSetListener.
 *  How a registered component implements this interface determines what it does
 *  when it is notified of an event.
 */
trait RowSetListener extends EventListener {

    /** Notifies registered listeners that a RowSet object's
     *  cursor has moved.
     */
    @stub
    def cursorMoved(event: RowSetEvent): Unit = ???

    /** Notifies registered listeners that a RowSet object
     *  has had a change in one of its rows.
     */
    @stub
    def rowChanged(event: RowSetEvent): Unit = ???

    /** Notifies registered listeners that a RowSet object
     *  in the given RowSetEvent object has changed its entire contents.
     */
    @stub
    def rowSetChanged(event: RowSetEvent): Unit = ???
}
