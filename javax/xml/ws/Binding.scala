package javax.xml.ws

import java.lang.String
import java.util.List
import javax.xml.ws.handler.Handler

/** The Binding interface is the base interface
 *   for JAX-WS protocol bindings.
 */
trait Binding {

    /** Get the URI for this binding instance. */
    @stub
    def getBindingID(): String = ???

    /** Gets a copy of the handler chain for a protocol binding instance. */
    @stub
    def getHandlerChain(): List[Handler] = ???
}
