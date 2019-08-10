package javax.xml.ws.handler

import java.lang.{Enum, Object, String}
import java.util.Map
import scala.scalanative.annotation.stub

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

    /** Sets the scope of a property. */
    @stub
    def setScope(name: String, scope: MessageContext.Scope): Unit = ???
}

object MessageContext {
    /** Property scope. Properties scoped as APPLICATION are
     *  visible to handlers,
     *  client applications and service endpoints; properties scoped as
     *  HANDLER
     *  are only normally visible to handlers.
     */
    class Scope private (name: String, ordinal: Int) extends Enum[Scope](name, ordinal) {
    }

    object Scope {
        /**  */
        final val APPLICATION: Scope = new Scope("APPLICATION", 0)

        /**  */
        final val HANDLER: Scope = new Scope("HANDLER", 1)

        /** Returns the enum constant of this type with the specified name. */
        @stub
        def valueOf(name: String): Scope = ???

        /** Returns an array containing the constants of this enum type, in
         * the order they are declared.
         */
        @stub
        def values(): Array[Scope] = ???
    }


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

    /** Standard property: name of WSDL service. */
    @stub
    val WSDL_SERVICE: String = ???
}
