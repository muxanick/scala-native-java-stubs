package javax.xml.ws.handler

import java.lang.{Object, String}
import java.util.Map

/** The interface MessageContext abstracts the message
 *  context that is processed by a handler in the handle
 *  method.
 * 
 *  The MessageContext interface provides methods to
 *  manage a property set. MessageContext properties
 *  enable handlers in a handler chain to share processing related
 *  state.
 */
trait MessageContext extends Map[String, Object] {

    /** Gets the scope of a property. */
    @stub
    def getScope(name: String): MessageContext.Scope = ???
}

object MessageContext {
    /** Standard property: HTTP request headers. */
    @stub
    val HTTP_REQUEST_HEADERS: String = ???

    /** Standard property: HTTP request method. */
    @stub
    val HTTP_REQUEST_METHOD: String = ???

    /** Standard property: HTTP response status code. */
    @stub
    val HTTP_RESPONSE_CODE: String = ???

    /** Standard property: HTTP response headers. */
    @stub
    val HTTP_RESPONSE_HEADERS: String = ???

    /** Standard property: Map of attachments to a message for the inbound
     *  message, key is  the MIME Content-ID, value is a DataHandler.
     */
    @stub
    val INBOUND_MESSAGE_ATTACHMENTS: String = ???

    /** Standard property: message direction, true for
     *  outbound messages, false for inbound.
     */
    @stub
    val MESSAGE_OUTBOUND_PROPERTY: String = ???

    /** Standard property: Map of attachments to a message for the outbound
     *  message, key is the MIME Content-ID, value is a DataHandler.
     */
    @stub
    val OUTBOUND_MESSAGE_ATTACHMENTS: String = ???

    /** Standard property: Request Path Info */
    @stub
    val PATH_INFO: String = ???

    /** Standard property: Query string for request. */
    @stub
    val QUERY_STRING: String = ???

    /** Standard property: WS Addressing Reference Parameters. */
    @stub
    val REFERENCE_PARAMETERS: String = ???

    /** Standard property: servlet context object. */
    @stub
    val SERVLET_CONTEXT: String = ???

    /** Standard property: servlet request object. */
    @stub
    val SERVLET_REQUEST: String = ???

    /** Standard property: servlet response object. */
    @stub
    val SERVLET_RESPONSE: String = ???

    /** Standard property: input source for WSDL document. */
    @stub
    val WSDL_DESCRIPTION: String = ???

    /** Standard property: name of wsdl interface (2.0) or port type (1.1). */
    @stub
    val WSDL_INTERFACE: String = ???

    /** Standard property: name of WSDL operation. */
    @stub
    val WSDL_OPERATION: String = ???

    /** Standard property: name of WSDL port. */
    @stub
    val WSDL_PORT: String = ???
}
