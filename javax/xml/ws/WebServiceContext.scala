package javax.xml.ws

import java.lang.Class
import java.security.Principal
import javax.xml.ws.handler.MessageContext
import org.w3c.dom.Element

// A WebServiceContext makes it possible for
//  a web service endpoint implementation class to access
//  message context and security information relative to
//  a request being served.
//
//  Typically a WebServiceContext is injected
//  into an endpoint implementation class using the
//  Resource annotation.
trait WebServiceContext {

    @stub
    // Returns the EndpointReference associated with
    // this endpoint.
    def T: [T <: EndpointReference] = ???

    @stub
    // Returns the EndpointReference for this
    // endpoint.
    def getEndpointReference(referenceParameters: Element*): EndpointReference = ???

    @stub
    // Returns the MessageContext for the request being served
    // at the time this method is called.
    def getMessageContext(): MessageContext = ???

    @stub
    // Returns the Principal that identifies the sender
    // of the request currently being serviced.
    def getUserPrincipal(): Principal = ???
}
