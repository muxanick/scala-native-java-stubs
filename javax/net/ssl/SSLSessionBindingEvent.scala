package javax.net.ssl

import java.lang.{Object, String}
import java.util.EventObject
import scala.scalanative.annotation.stub

/** This event is propagated to a SSLSessionBindingListener.
 *  When a listener object is bound or unbound to an SSLSession by
 *  SSLSession.putValue(String, Object)
 *  or SSLSession.removeValue(String), objects which
 *  implement the SSLSessionBindingListener will be receive an
 *  event of this type.  The event's name field is the
 *  key in which the listener is being bound or unbound.
 */
class SSLSessionBindingEvent extends EventObject {

    /** Constructs a new SSLSessionBindingEvent. */
    @stub
    def this(session: SSLSession, name: String) = ???

    /** Returns the name to which the object is being bound, or the name
     *  from which the object is being unbound.
     */
    @stub
    def getName(): String = ???

    /** Returns the SSLSession into which the listener is being bound or
     *  from which the listener is being unbound.
     */
    @stub
    def getSession(): SSLSession = ???
}
