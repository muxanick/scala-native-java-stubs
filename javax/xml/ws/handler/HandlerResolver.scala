package javax.xml.ws.handler

import java.util.List
import scala.scalanative.annotation.stub

/** HandlerResolver is an interface implemented
 *   by an application to get control over the handler chain
 *   set on proxy/dispatch objects at the time of their creation.
 *   
 *   A HandlerResolver may be set on a Service
 *   using the setHandlerResolver method.
 *  
 *   When the runtime invokes a HandlerResolver, it will
 *   pass it a PortInfo object containing information
 *   about the port that the proxy/dispatch object will be accessing.
 */
trait HandlerResolver {

    /** Gets the handler chain for the specified port. */
    @stub
    def getHandlerChain(portInfo: PortInfo): List[Handler] = ???
}
