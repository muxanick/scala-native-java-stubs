package javax.xml.ws.spi.http

import java.io.{InputStream, OutputStream}
import java.lang.{Object, String}
import java.net.InetSocketAddress
import java.security.Principal
import java.util.{List, Map, Set}

// This class encapsulates a HTTP request received and a
// response to be generated in one exchange. It provides methods
// for examining the request from the client, and for building and
// sending the response.
// 
// A HttpExchange must be closed to free or reuse
// underlying resources. The effect of failing to close an exchange
// is undefined.
abstract class HttpExchange extends Object {

    // Adds a response header with the given name and value.
    def addResponseHeader(name: String, value: String): Unit

    // This must be called to end an exchange.
    def close(): Unit

    // Returns an attribute that is associated with this
    // HttpExchange.
    def getAttribute(name: String): Object

    // Gives all the attribute names that are associated with
    // this HttpExchange.
    def getAttributeNames(): Set[String]

    // Returns the context path of all the endpoints in an application.
    def getContextPath(): String

    // Returns a HttpContext for this exchange.
    def getHttpContext(): HttpContext

    // Returns the unresolved local address on which the request was received.
    def getLocalAddress(): InetSocketAddress

    // Returns the extra path information that follows the web service
    // path but precedes the query string in the request URI and will start
    // with a "/" character.
    def getPathInfo(): String

    // Returns the protocol string from the request in the form
    // protocol/majorVersion.minorVersion.
    def getProtocol(): String

    // Returns the query string that is contained in the request URI
    // after the path.
    def getQueryString(): String

    // Returns the unresolved address of the remote entity invoking
    // this request.
    def getRemoteAddress(): InetSocketAddress

    // Returns a stream from which the request body can be read.
    def getRequestBody(): InputStream

    // Returns the value of the specified request header.
    def getRequestHeader(name: String): String

    // Returns an immutable Map containing the HTTP headers that were
    // included with this request.
    def getRequestHeaders(): Map[String, List[String]]

    // Get the HTTP request method
    def getRequestMethod(): String

    // Returns the part of the request's URI from the protocol
    // name up to the query string in the first line of the HTTP request.
    def getRequestURI(): String

    // Returns a stream to which the response body must be
    // written.
    def getResponseBody(): OutputStream

    // Returns a mutable Map into which the HTTP response headers can be stored
    // and which will be transmitted as part of this response.
    def getResponseHeaders(): Map[String, List[String]]

    // Returns the name of the scheme used to make this request,
    // for example: http, or https.
    def getScheme(): String

    // Returns the Principal that represents the authenticated
    // user for this HttpExchange.
    def getUserPrincipal(): Principal

    // Indicates whether an authenticated user is included in the specified
    // logical "role".
    def isUserInRole(role: String): Boolean
}

object HttpExchange {
    @stub
    // Standard property: cipher suite value when the request is received
    // over HTTPS
    def REQUEST_CIPHER_SUITE: String = ???

    @stub
    // Standard property: bit size of the algorithm when the request is
    // received over HTTPS
    def REQUEST_KEY_SIZE: String = ???
}
