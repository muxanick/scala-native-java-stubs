package javax.xml.ws.handler

import java.lang.String
import javax.xml.namespace.QName

// The PortInfo interface is used by a
//  HandlerResolver to query information about
//  the port it is being asked to create a handler chain for.
//  
//  This interface is never implemented by an application,
//  only by a JAX-WS implementation.
trait PortInfo {

    @stub
    // Gets the URI identifying the binding used by the port being accessed.
    def getBindingID(): String = ???

    @stub
    // Gets the qualified name of the WSDL port being accessed.
    def getPortName(): QName = ???
}