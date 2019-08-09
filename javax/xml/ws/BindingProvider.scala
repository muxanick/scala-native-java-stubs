package javax.xml.ws

import java.lang.{Class, Object, String}
import java.util.Map
import scala.scalanative.annotation.stub

/** The BindingProvider interface provides access to the
 *  protocol binding and associated context objects for request and
 *  response message processing.
 */
trait BindingProvider {

    /** Get the Binding for this binding provider. */
    @stub
    def getBinding(): Binding = ???

    /** Returns the EndpointReference associated with
     *  this BindingProvider instance.
     */
    @stub
    def getEndpointReference(): EndpointReference = ???

    /** Returns the EndpointReference associated with
     *  this BindingProvider instance.
     */
    @stub
    def getEndpointReference[T <: EndpointReference](clazz: Class[T]): T = ???

    /** Get the context that is used to initialize the message context
     *  for request messages.
     */
    @stub
    def getRequestContext(): Map[String, Object] = ???

    /** Get the context that resulted from processing a response message. */
    @stub
    def getResponseContext(): Map[String, Object] = ???
}

object BindingProvider {
    /** Standard property: Target service endpoint address. */
    @stub
    val ENDPOINT_ADDRESS_PROPERTY: String = ???

    /** Standard property: Password for authentication. */
    @stub
    val PASSWORD_PROPERTY: String = ???

    /** Standard property: This boolean property is used by a service
     *  client to indicate whether or not it wants to participate in
     *  a session with a service endpoint.
     */
    @stub
    val SESSION_MAINTAIN_PROPERTY: String = ???

    /** Standard property for SOAPAction. */
    @stub
    val SOAPACTION_URI_PROPERTY: String = ???

    /** Standard property for SOAPAction. */
    @stub
    val SOAPACTION_USE_PROPERTY: String = ???

    /** Standard property: User name for authentication. */
    @stub
    val USERNAME_PROPERTY: String = ???
}
