package java.net

import java.lang.{Object, String}
import java.util.{List, Map}

// A CookieHandler object provides a callback mechanism to hook up a
// HTTP state management policy implementation into the HTTP protocol
// handler. The HTTP state management mechanism specifies a way to
// create a stateful session with HTTP requests and responses.
//
// A system-wide CookieHandler that to used by the HTTP protocol
// handler can be registered by doing a
// CookieHandler.setDefault(CookieHandler). The currently registered
// CookieHandler can be retrieved by calling
// CookieHandler.getDefault().
//
// For more information on HTTP state management, see RFC 2965: HTTP
// State Management Mechanism
abstract class CookieHandler extends Object {

    // Gets all the applicable cookies from a cookie cache for the
    // specified uri in the request header.
    def get(uri: URI, requestHeaders: Map[String, List[String]]): Map[String, List[String]]

    // Sets all the applicable cookies, examples are response header
    // fields that are named Set-Cookie2, present in the response
    // headers into a cookie cache.
    def put(uri: URI, responseHeaders: Map[String, List[String]]): Unit
}

object CookieHandler {
    @stub
    // Gets the system-wide cookie handler.
    def getDefault(): CookieHandler = ???
}
