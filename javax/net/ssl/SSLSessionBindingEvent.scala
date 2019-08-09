package javax.net.ssl

import java.lang.{Object, String}
import java.util.EventObject

// This event is propagated to a SSLSessionBindingListener.
// When a listener object is bound or unbound to an SSLSession by
// SSLSession.putValue(String, Object)
// or SSLSession.removeValue(String), objects which
// implement the SSLSessionBindingListener will be receive an
// event of this type.  The event's name field is the
// key in which the listener is being bound or unbound.
class SSLSessionBindingEvent extends EventObject {

    @stub
    // Returns the name to which the object is being bound, or the name
    // from which the object is being unbound.
    def getName(): String = ???
}
