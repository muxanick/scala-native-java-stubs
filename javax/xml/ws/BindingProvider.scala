package javax.xml.ws

import java.lang.{Class, Object, String}
import java.util.Map

// The BindingProvider interface provides access to the
// protocol binding and associated context objects for request and
// response message processing.
trait BindingProvider {

    @stub
    // Get the Binding for this binding provider.
    def getBinding(): Binding = ???

    @stub
    // Returns the EndpointReference associated with
    // this BindingProvider instance.
    def getEndpointReference(): EndpointReference = ???

    @stub
    // Returns the EndpointReference associated with
    // this BindingProvider instance.
    def T: [T <: EndpointReference] = ???

    @stub
    // Get the context that is used to initialize the message context
    // for request messages.
    def getRequestContext(): Map[String, Object] = ???
}

object BindingProvider {
    @stub
    // Standard property: Target service endpoint address.
    def ENDPOINT_ADDRESS_PROPERTY: String = ???

    @stub
    // Standard property: Password for authentication.
    def PASSWORD_PROPERTY: String = ???

    @stub
    // Standard property: This boolean property is used by a service
    // client to indicate whether or not it wants to participate in
    // a session with a service endpoint.
    def SESSION_MAINTAIN_PROPERTY: String = ???

    @stub
    // Standard property for SOAPAction.
    def SOAPACTION_URI_PROPERTY: String = ???

    @stub
    // Standard property for SOAPAction.
    def SOAPACTION_USE_PROPERTY: String = ???
}
