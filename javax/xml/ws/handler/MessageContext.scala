package javax.xml.ws.handler

import java.lang.{Object, String}
import java.util.Map

// The interface MessageContext abstracts the message
// context that is processed by a handler in the handle
// method.
//
// The MessageContext interface provides methods to
// manage a property set. MessageContext properties
// enable handlers in a handler chain to share processing related
// state.
trait MessageContext extends Map[String, Object] {

    @stub
    // Gets the scope of a property.
    def getScope(name: String): MessageContext.Scope = ???
}

object MessageContext {
    @stub
    // Standard property: HTTP request headers.
    def HTTP_REQUEST_HEADERS: String = ???

    @stub
    // Standard property: HTTP request method.
    def HTTP_REQUEST_METHOD: String = ???

    @stub
    // Standard property: HTTP response status code.
    def HTTP_RESPONSE_CODE: String = ???

    @stub
    // Standard property: HTTP response headers.
    def HTTP_RESPONSE_HEADERS: String = ???

    @stub
    // Standard property: Map of attachments to a message for the inbound
    // message, key is  the MIME Content-ID, value is a DataHandler.
    def INBOUND_MESSAGE_ATTACHMENTS: String = ???

    @stub
    // Standard property: message direction, true for
    // outbound messages, false for inbound.
    def MESSAGE_OUTBOUND_PROPERTY: String = ???

    @stub
    // Standard property: Map of attachments to a message for the outbound
    // message, key is the MIME Content-ID, value is a DataHandler.
    def OUTBOUND_MESSAGE_ATTACHMENTS: String = ???

    @stub
    // Standard property: Request Path Info
    def PATH_INFO: String = ???

    @stub
    // Standard property: Query string for request.
    def QUERY_STRING: String = ???

    @stub
    // Standard property: WS Addressing Reference Parameters.
    def REFERENCE_PARAMETERS: String = ???

    @stub
    // Standard property: servlet context object.
    def SERVLET_CONTEXT: String = ???

    @stub
    // Standard property: servlet request object.
    def SERVLET_REQUEST: String = ???

    @stub
    // Standard property: servlet response object.
    def SERVLET_RESPONSE: String = ???

    @stub
    // Standard property: input source for WSDL document.
    def WSDL_DESCRIPTION: String = ???

    @stub
    // Standard property: name of wsdl interface (2.0) or port type (1.1).
    def WSDL_INTERFACE: String = ???

    @stub
    // Standard property: name of WSDL operation.
    def WSDL_OPERATION: String = ???

    @stub
    // Standard property: name of WSDL port.
    def WSDL_PORT: String = ???
}
