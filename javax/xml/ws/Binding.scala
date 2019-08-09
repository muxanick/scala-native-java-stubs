package javax.xml.ws

import java.lang.String
import java.util.List
import javax.xml.ws.handler.Handler

// The Binding interface is the base interface
//  for JAX-WS protocol bindings.
trait Binding {

    @stub
    // Get the URI for this binding instance.
    def getBindingID(): String = ???

    @stub
    // Gets a copy of the handler chain for a protocol binding instance.
    def getHandlerChain(): List[Handler] = ???
}
