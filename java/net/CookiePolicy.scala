package java.net

import scala.scalanative.annotation.stub

/** CookiePolicy implementations decide which cookies should be accepted
 *  and which should be rejected. Three pre-defined policy implementations
 *  are provided, namely ACCEPT_ALL, ACCEPT_NONE and ACCEPT_ORIGINAL_SERVER.
 * 
 *  See RFC 2965 sec. 3.3 and 7 for more detail.
 */
trait CookiePolicy {

    /** Will be called to see whether or not this cookie should be accepted. */
    @stub
    def shouldAccept(uri: URI, cookie: HttpCookie): Boolean = ???
}

object CookiePolicy {
    /** One pre-defined policy which accepts all cookies. */
    @stub
    val ACCEPT_ALL: CookiePolicy = ???

    /** One pre-defined policy which accepts no cookies. */
    @stub
    val ACCEPT_NONE: CookiePolicy = ???

    /** One pre-defined policy which only accepts cookies from original server. */
    @stub
    val ACCEPT_ORIGINAL_SERVER: CookiePolicy = ???
}
