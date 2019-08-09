package java.net

import java.io.InputStream
import java.lang.{Object, String}
import java.security.Permission
import scala.scalanative.annotation.stub

/** A URLConnection with support for HTTP-specific features. See
 *   the spec  for
 *  details.
 *  
 * 
 *  Each HttpURLConnection instance is used to make a single request
 *  but the underlying network connection to the HTTP server may be
 *  transparently shared by other instances. Calling the close() methods
 *  on the InputStream or OutputStream of an HttpURLConnection
 *  after a request may free network resources associated with this
 *  instance but has no effect on any shared persistent connection.
 *  Calling the disconnect() method may close the underlying socket
 *  if a persistent connection is otherwise idle at that time.
 * 
 *  The HTTP protocol handler has a few settings that can be accessed through
 *  System Properties. This covers
 *  Proxy settings as well as
 *   various other settings.
 *  
 *  
 *  Security permissions
 *  
 *  If a security manager is installed, and if a method is called which results in an
 *  attempt to open a connection, the caller must possess either:-
 *  a "connect" SocketPermission to the host/port combination of the
 *  destination URL or
 *  a URLPermission that permits this request.
 *  
 *  If automatic redirection is enabled, and this request is redirected to another
 *  destination, then the caller must also have permission to connect to the
 *  redirected host/URL.
 */
abstract class HttpURLConnection extends URLConnection {

    /** Constructor for the HttpURLConnection. */
    @stub
    protected def this(u: URL) = ???

    /** The chunk-length when using chunked encoding streaming mode for output. */
    protected val chunkLength: Int

    /** The fixed content-length when using fixed-length streaming mode. */
    protected val fixedContentLength: Int

    /** The fixed content-length when using fixed-length streaming mode. */
    protected val fixedContentLengthLong: Long

    /** If true, the protocol will automatically follow redirects. */
    protected val instanceFollowRedirects: Boolean

    /** The HTTP method (GET,POST,PUT,etc.). */
    protected val method: String

    /** An int representing the three digit HTTP Status-Code. */
    protected val responseCode: Int

    /** The HTTP response message. */
    protected val responseMessage: String

    /** Indicates that other requests to the server
     *  are unlikely in the near future.
     */
    def disconnect(): Unit

    /** Returns the error stream if the connection failed
     *  but the server sent useful data nonetheless.
     */
    def getErrorStream(): InputStream

    /** Returns the value for the nth header field. */
    def getHeaderField(n: Int): String

    /** Returns the value of the named field parsed as date. */
    def getHeaderFieldDate(name: String, Default: Long): Long

    /** Returns the key for the nth header field. */
    def getHeaderFieldKey(n: Int): String

    /** Returns the value of this HttpURLConnection's
     *  instanceFollowRedirects field.
     */
    def getInstanceFollowRedirects(): Boolean

    /** Returns a SocketPermission object representing the
     *  permission necessary to connect to the destination host and port.
     */
    def getPermission(): Permission

    /** Get the request method. */
    def getRequestMethod(): String

    /** Gets the status code from an HTTP response message. */
    def getResponseCode(): Int

    /** Gets the HTTP response message, if any, returned along with the
     *  response code from a server.
     */
    def getResponseMessage(): String

    /** This method is used to enable streaming of a HTTP request body
     *  without internal buffering, when the content length is not
     *  known in advance.
     */
    def setChunkedStreamingMode(chunklen: Int): Unit

    /** This method is used to enable streaming of a HTTP request body
     *  without internal buffering, when the content length is known in
     *  advance.
     */
    def setFixedLengthStreamingMode(contentLength: Int): Unit

    /** This method is used to enable streaming of a HTTP request body
     *  without internal buffering, when the content length is known in
     *  advance.
     */
    def setFixedLengthStreamingMode(contentLength: Long): Unit

    /** Sets whether HTTP redirects (requests with response code 3xx) should
     *  be automatically followed by this HttpURLConnection
     *  instance.
     */
    def setInstanceFollowRedirects(followRedirects: Boolean): Unit

    /** Set the method for the URL request, one of:
     *  
     *   GET
     *   POST
     *   HEAD
     *   OPTIONS
     *   PUT
     *   DELETE
     *   TRACE
     *   are legal, subject to protocol restrictions.
     */
    def setRequestMethod(method: String): Unit

    /** Indicates if the connection is going through a proxy. */
    def usingProxy(): Boolean
}

object HttpURLConnection {
    /** HTTP Status-Code 202: Accepted. */
    @stub
    val HTTP_ACCEPTED: Int = ???

    /** HTTP Status-Code 502: Bad Gateway. */
    @stub
    val HTTP_BAD_GATEWAY: Int = ???

    /** HTTP Status-Code 405: Method Not Allowed. */
    @stub
    val HTTP_BAD_METHOD: Int = ???

    /** HTTP Status-Code 400: Bad Request. */
    @stub
    val HTTP_BAD_REQUEST: Int = ???

    /** HTTP Status-Code 408: Request Time-Out. */
    @stub
    val HTTP_CLIENT_TIMEOUT: Int = ???

    /** HTTP Status-Code 409: Conflict. */
    @stub
    val HTTP_CONFLICT: Int = ???

    /** HTTP Status-Code 201: Created. */
    @stub
    val HTTP_CREATED: Int = ???

    /** HTTP Status-Code 413: Request Entity Too Large. */
    @stub
    val HTTP_ENTITY_TOO_LARGE: Int = ???

    /** HTTP Status-Code 403: Forbidden. */
    @stub
    val HTTP_FORBIDDEN: Int = ???

    /** HTTP Status-Code 504: Gateway Timeout. */
    @stub
    val HTTP_GATEWAY_TIMEOUT: Int = ???

    /** HTTP Status-Code 410: Gone. */
    @stub
    val HTTP_GONE: Int = ???

    /** HTTP Status-Code 500: Internal Server Error. */
    @stub
    val HTTP_INTERNAL_ERROR: Int = ???

    /** HTTP Status-Code 411: Length Required. */
    @stub
    val HTTP_LENGTH_REQUIRED: Int = ???

    /** HTTP Status-Code 301: Moved Permanently. */
    @stub
    val HTTP_MOVED_PERM: Int = ???

    /** HTTP Status-Code 302: Temporary Redirect. */
    @stub
    val HTTP_MOVED_TEMP: Int = ???

    /** HTTP Status-Code 300: Multiple Choices. */
    @stub
    val HTTP_MULT_CHOICE: Int = ???

    /** HTTP Status-Code 204: No Content. */
    @stub
    val HTTP_NO_CONTENT: Int = ???

    /** HTTP Status-Code 406: Not Acceptable. */
    @stub
    val HTTP_NOT_ACCEPTABLE: Int = ???

    /** HTTP Status-Code 203: Non-Authoritative Information. */
    @stub
    val HTTP_NOT_AUTHORITATIVE: Int = ???

    /** HTTP Status-Code 404: Not Found. */
    @stub
    val HTTP_NOT_FOUND: Int = ???

    /** HTTP Status-Code 501: Not Implemented. */
    @stub
    val HTTP_NOT_IMPLEMENTED: Int = ???

    /** HTTP Status-Code 304: Not Modified. */
    @stub
    val HTTP_NOT_MODIFIED: Int = ???

    /** HTTP Status-Code 200: OK. */
    @stub
    val HTTP_OK: Int = ???

    /** HTTP Status-Code 206: Partial Content. */
    @stub
    val HTTP_PARTIAL: Int = ???

    /** HTTP Status-Code 402: Payment Required. */
    @stub
    val HTTP_PAYMENT_REQUIRED: Int = ???

    /** HTTP Status-Code 412: Precondition Failed. */
    @stub
    val HTTP_PRECON_FAILED: Int = ???

    /** HTTP Status-Code 407: Proxy Authentication Required. */
    @stub
    val HTTP_PROXY_AUTH: Int = ???

    /** HTTP Status-Code 414: Request-URI Too Large. */
    @stub
    val HTTP_REQ_TOO_LONG: Int = ???

    /** HTTP Status-Code 205: Reset Content. */
    @stub
    val HTTP_RESET: Int = ???

    /** HTTP Status-Code 303: See Other. */
    @stub
    val HTTP_SEE_OTHER: Int = ???

    /** Deprecated. 
     * it is misplaced and shouldn't have existed.
     * 
     */
    @stub
    val HTTP_SERVER_ERROR: Int = ???

    /** HTTP Status-Code 401: Unauthorized. */
    @stub
    val HTTP_UNAUTHORIZED: Int = ???

    /** HTTP Status-Code 503: Service Unavailable. */
    @stub
    val HTTP_UNAVAILABLE: Int = ???

    /** HTTP Status-Code 415: Unsupported Media Type. */
    @stub
    val HTTP_UNSUPPORTED_TYPE: Int = ???

    /** HTTP Status-Code 305: Use Proxy. */
    @stub
    val HTTP_USE_PROXY: Int = ???

    /** HTTP Status-Code 505: HTTP Version Not Supported. */
    @stub
    val HTTP_VERSION: Int = ???

    /** Returns a boolean indicating
     *  whether or not HTTP redirects (3xx) should
     *  be automatically followed.
     */
    @stub
    def getFollowRedirects(): Boolean = ???

    /** Sets whether HTTP redirects  (requests with response code 3xx) should
     *  be automatically followed by this class.
     */
    @stub
    def setFollowRedirects(set: Boolean): Unit = ???
}
