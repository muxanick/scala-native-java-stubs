package javax.naming.event

import java.lang.Object
import java.util.EventObject

/** This class represents an event fired when the procedures/processes
 *  used to collect information for notifying listeners of
 *  NamingEvents threw a NamingException.
 *  This can happen, for example, if the server which the listener is using
 *  aborts subsequent to the addNamingListener() call.
 */
class NamingExceptionEvent extends EventObject {

    /** Invokes the namingExceptionThrown() method on
     *  a listener using this event.
     */
    @stub
    def dispatch(listener: NamingListener): Unit = ???

    /** Retrieves the EventContext that fired this event. */
    @stub
    def getEventContext(): EventContext = ???
}
