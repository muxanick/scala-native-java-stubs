package javax.xml.ws

import java.lang.{Class, String}
import java.security.Principal
import javax.xml.ws.handler.MessageContext
import scala.scalanative.annotation.stub

/** A WebServiceContext makes it possible for
 *   a web service endpoint implementation class to access
 *   message context and security information relative to
 *   a request being served.
 * 
 *   Typically a WebServiceContext is injected
 *   into an endpoint implementation class using the
 *   Resource annotation.
 */
trait WebServiceContext {

    /** Returns the EndpointReference associated with
     *  this endpoint.
     */
    @stub
    def getEndpointReference[T <: EndpointReference](clazz: Class[T], referenceParameters: Element*): T = ???

    /** Returns the EndpointReference for this
     *  endpoint.
     */
    @stub
    def getEndpointReference(referenceParameters: Element*): EndpointReference = ???

    /** Returns the MessageContext for the request being served
     *  at the time this method is called.
     */
    @stub
    def getMessageContext(): MessageContext = ???

    /** Returns the Principal that identifies the sender
     *  of the request currently being serviced.
     */
    @stub
    def getUserPrincipal(): Principal = ???

    /** Returns a boolean indicating whether the
     *  authenticated user is included in the specified
     *  logical role.
     */
    @stub
    def isUserInRole(role: String): Boolean = ???
}
