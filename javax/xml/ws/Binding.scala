package javax.xml.ws

import java.lang.String
import java.util.List
import javax.xml.ws.handler.Handler
import scala.scalanative.annotation.stub

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

    /** Sets the handler chain for the protocol binding instance. */
    @stub
    def setHandlerChain(chain: List[Handler]): Unit = ???
}
