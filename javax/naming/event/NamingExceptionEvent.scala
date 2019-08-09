package javax.naming.event

import java.lang.Object
import java.util.EventObject
import javax.naming.NamingException
import scala.scalanative.annotation.stub

/** This class represents an event fired when the procedures/processes
 *  used to collect information for notifying listeners of
 *  NamingEvents threw a NamingException.
 *  This can happen, for example, if the server which the listener is using
 *  aborts subsequent to the addNamingListener() call.
 */
class NamingExceptionEvent extends EventObject {

    /** Constructs an instance of NamingExceptionEvent using
     *  the context in which the NamingException was thrown and the exception
     *  that was thrown.
     */
    @stub
    def this(source: EventContext, exc: NamingException) = ???

    /** Invokes the namingExceptionThrown() method on
     *  a listener using this event.
     */
    @stub
    def dispatch(listener: NamingListener): Unit = ???

    /** Retrieves the EventContext that fired this event. */
    @stub
    def getEventContext(): EventContext = ???

    /** Retrieves the exception that was thrown. */
    @stub
    def getException(): NamingException = ???
}
