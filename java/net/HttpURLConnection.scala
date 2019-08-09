package java.net

import java.io.InputStream
import java.lang.{Object, String}
import java.security.Permission

// A URLConnection with support for HTTP-specific features. See
//  the spec  for
// details.
// 
//
// Each HttpURLConnection instance is used to make a single request
// but the underlying network connection to the HTTP server may be
// transparently shared by other instances. Calling the close() methods
// on the InputStream or OutputStream of an HttpURLConnection
// after a request may free network resources associated with this
// instance but has no effect on any shared persistent connection.
// Calling the disconnect() method may close the underlying socket
// if a persistent connection is otherwise idle at that time.
//
// The HTTP protocol handler has a few settings that can be accessed through
// System Properties. This covers
// Proxy settings as well as
//  various other settings.
// 
// 
// Security permissions
// 
// If a security manager is installed, and if a method is called which results in an
// attempt to open a connection, the caller must possess either:-
// a "connect" SocketPermission to the host/port combination of the
// destination URL or
// a URLPermission that permits this request.
// 
// If automatic redirection is enabled, and this request is redirected to another
// destination, then the caller must also have permission to connect to the
// redirected host/URL.
abstract class HttpURLConnection extends URLConnection {

    // The chunk-length when using chunked encoding streaming mode for output.
    protected def chunkLength: Int

    // The fixed content-length when using fixed-length streaming mode.
    protected def fixedContentLength: Int

    // The fixed content-length when using fixed-length streaming mode.
    protected def fixedContentLengthLong: Long

    // If true, the protocol will automatically follow redirects.
    protected def instanceFollowRedirects: Boolean

    // The HTTP method (GET,POST,PUT,etc.).
    protected def method: String

    // An int representing the three digit HTTP Status-Code.
    protected def responseCode: Int

    // Indicates that other requests to the server
    // are unlikely in the near future.
    def disconnect(): Unit

    // Returns the error stream if the connection failed
    // but the server sent useful data nonetheless.
    def getErrorStream(): InputStream

    // Returns the value for the nth header field.
    def getHeaderField(n: Int): String

    // Returns the value of the named field parsed as date.
    def getHeaderFieldDate(name: String, Default: Long): Long

    // Returns the key for the nth header field.
    def getHeaderFieldKey(n: Int): String

    // Returns the value of this HttpURLConnection's
    // instanceFollowRedirects field.
    def getInstanceFollowRedirects(): Boolean

    // Returns a SocketPermission object representing the
    // permission necessary to connect to the destination host and port.
    def getPermission(): Permission

    // Get the request method.
    def getRequestMethod(): String

    // Gets the status code from an HTTP response message.
    def getResponseCode(): Int

    // Gets the HTTP response message, if any, returned along with the
    // response code from a server.
    def getResponseMessage(): String

    // This method is used to enable streaming of a HTTP request body
    // without internal buffering, when the content length is not
    // known in advance.
    def setChunkedStreamingMode(chunklen: Int): Unit

    // This method is used to enable streaming of a HTTP request body
    // without internal buffering, when the content length is known in
    // advance.
    def setFixedLengthStreamingMode(contentLength: Int): Unit

    // This method is used to enable streaming of a HTTP request body
    // without internal buffering, when the content length is known in
    // advance.
    def setFixedLengthStreamingMode(contentLength: Long): Unit

    // Sets whether HTTP redirects (requests with response code 3xx) should
    // be automatically followed by this HttpURLConnection
    // instance.
    def setInstanceFollowRedirects(followRedirects: Boolean): Unit

    // Set the method for the URL request, one of:
    // 
    //  GET
    //  POST
    //  HEAD
    //  OPTIONS
    //  PUT
    //  DELETE
    //  TRACE
    //  are legal, subject to protocol restrictions.
    def setRequestMethod(method: String): Unit
}

object HttpURLConnection {
    @stub
    // HTTP Status-Code 202: Accepted.
    def HTTP_ACCEPTED: Int = ???

    @stub
    // HTTP Status-Code 502: Bad Gateway.
    def HTTP_BAD_GATEWAY: Int = ???

    @stub
    // HTTP Status-Code 405: Method Not Allowed.
    def HTTP_BAD_METHOD: Int = ???

    @stub
    // HTTP Status-Code 400: Bad Request.
    def HTTP_BAD_REQUEST: Int = ???

    @stub
    // HTTP Status-Code 408: Request Time-Out.
    def HTTP_CLIENT_TIMEOUT: Int = ???

    @stub
    // HTTP Status-Code 409: Conflict.
    def HTTP_CONFLICT: Int = ???

    @stub
    // HTTP Status-Code 201: Created.
    def HTTP_CREATED: Int = ???

    @stub
    // HTTP Status-Code 413: Request Entity Too Large.
    def HTTP_ENTITY_TOO_LARGE: Int = ???

    @stub
    // HTTP Status-Code 403: Forbidden.
    def HTTP_FORBIDDEN: Int = ???

    @stub
    // HTTP Status-Code 504: Gateway Timeout.
    def HTTP_GATEWAY_TIMEOUT: Int = ???

    @stub
    // HTTP Status-Code 410: Gone.
    def HTTP_GONE: Int = ???

    @stub
    // HTTP Status-Code 500: Internal Server Error.
    def HTTP_INTERNAL_ERROR: Int = ???

    @stub
    // HTTP Status-Code 411: Length Required.
    def HTTP_LENGTH_REQUIRED: Int = ???

    @stub
    // HTTP Status-Code 301: Moved Permanently.
    def HTTP_MOVED_PERM: Int = ???

    @stub
    // HTTP Status-Code 302: Temporary Redirect.
    def HTTP_MOVED_TEMP: Int = ???

    @stub
    // HTTP Status-Code 300: Multiple Choices.
    def HTTP_MULT_CHOICE: Int = ???

    @stub
    // HTTP Status-Code 204: No Content.
    def HTTP_NO_CONTENT: Int = ???

    @stub
    // HTTP Status-Code 406: Not Acceptable.
    def HTTP_NOT_ACCEPTABLE: Int = ???

    @stub
    // HTTP Status-Code 203: Non-Authoritative Information.
    def HTTP_NOT_AUTHORITATIVE: Int = ???

    @stub
    // HTTP Status-Code 404: Not Found.
    def HTTP_NOT_FOUND: Int = ???

    @stub
    // HTTP Status-Code 501: Not Implemented.
    def HTTP_NOT_IMPLEMENTED: Int = ???

    @stub
    // HTTP Status-Code 304: Not Modified.
    def HTTP_NOT_MODIFIED: Int = ???

    @stub
    // HTTP Status-Code 200: OK.
    def HTTP_OK: Int = ???

    @stub
    // HTTP Status-Code 206: Partial Content.
    def HTTP_PARTIAL: Int = ???

    @stub
    // HTTP Status-Code 402: Payment Required.
    def HTTP_PAYMENT_REQUIRED: Int = ???

    @stub
    // HTTP Status-Code 412: Precondition Failed.
    def HTTP_PRECON_FAILED: Int = ???

    @stub
    // HTTP Status-Code 407: Proxy Authentication Required.
    def HTTP_PROXY_AUTH: Int = ???

    @stub
    // HTTP Status-Code 414: Request-URI Too Large.
    def HTTP_REQ_TOO_LONG: Int = ???

    @stub
    // HTTP Status-Code 205: Reset Content.
    def HTTP_RESET: Int = ???

    @stub
    // HTTP Status-Code 303: See Other.
    def HTTP_SEE_OTHER: Int = ???

    @stub
    // Deprecated. 
    //it is misplaced and shouldn't have existed.
    //
    def HTTP_SERVER_ERROR: Int = ???

    @stub
    // HTTP Status-Code 401: Unauthorized.
    def HTTP_UNAUTHORIZED: Int = ???

    @stub
    // HTTP Status-Code 503: Service Unavailable.
    def HTTP_UNAVAILABLE: Int = ???

    @stub
    // HTTP Status-Code 415: Unsupported Media Type.
    def HTTP_UNSUPPORTED_TYPE: Int = ???

    @stub
    // HTTP Status-Code 305: Use Proxy.
    def HTTP_USE_PROXY: Int = ???

    @stub
    // HTTP Status-Code 505: HTTP Version Not Supported.
    def HTTP_VERSION: Int = ???

    @stub
    // Returns a boolean indicating
    // whether or not HTTP redirects (3xx) should
    // be automatically followed.
    def getFollowRedirects(): Boolean = ???

    @stub
    // Sets whether HTTP redirects  (requests with response code 3xx) should
    // be automatically followed by this class.
    def setFollowRedirects(set: Boolean): Unit = ???
}
