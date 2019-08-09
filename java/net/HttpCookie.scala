package java.net

import java.lang.{Cloneable, Object, String}
import java.util.List
import scala.scalanative.annotation.stub

/** An HttpCookie object represents an HTTP cookie, which carries state
 *  information between server and user agent. Cookie is widely adopted
 *  to create stateful sessions.
 * 
 *   There are 3 HTTP cookie specifications:
 *  
 *    Netscape draft
 *    RFC 2109 - 
 *  http://www.ietf.org/rfc/rfc2109.txt
 *    RFC 2965 - 
 *  http://www.ietf.org/rfc/rfc2965.txt
 *  
 * 
 *   HttpCookie class can accept all these 3 forms of syntax.
 */
final class HttpCookie extends Object with Cloneable {

    /** Constructs a cookie with a specified name and value. */
    @stub
    def this(name: String, value: String) = ???

    /** Create and return a copy of this object. */
    @stub
    def clone(): Object = ???

    /** Test the equality of two HTTP cookies. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns the comment describing the purpose of this cookie, or
     *  null if the cookie has no comment.
     */
    @stub
    def getComment(): String = ???

    /** Returns the comment URL describing the purpose of this cookie, or
     *  null if the cookie has no comment URL.
     */
    @stub
    def getCommentURL(): String = ???

    /** Returns the discard attribute of the cookie */
    @stub
    def getDiscard(): Boolean = ???

    /** Returns the domain name set for this cookie. */
    @stub
    def getDomain(): String = ???

    /** Returns the maximum age of the cookie, specified in seconds. */
    @stub
    def getMaxAge(): Long = ???

    /** Returns the name of the cookie. */
    @stub
    def getName(): String = ???

    /** Returns the path on the server to which the browser returns this cookie. */
    @stub
    def getPath(): String = ???

    /** Returns the port list attribute of the cookie */
    @stub
    def getPortlist(): String = ???

    /** Returns true if sending this cookie should be restricted to a
     *  secure protocol, or false if the it can be sent using any
     *  protocol.
     */
    @stub
    def getSecure(): Boolean = ???

    /** Returns the value of the cookie. */
    @stub
    def getValue(): String = ???

    /** Returns the version of the protocol this cookie complies with. */
    @stub
    def getVersion(): Int = ???

    /** Reports whether this HTTP cookie has expired or not. */
    @stub
    def hasExpired(): Boolean = ???

    /** Returns the hash code of this HTTP cookie. */
    @stub
    def hashCode(): Int = ???

    /** Returns true if this cookie contains the HttpOnly
     *  attribute.
     */
    @stub
    def isHttpOnly(): Boolean = ???

    /** Specifies a comment that describes a cookie's purpose. */
    @stub
    def setComment(purpose: String): Unit = ???

    /** Specifies a comment URL that describes a cookie's purpose. */
    @stub
    def setCommentURL(purpose: String): Unit = ???

    /** Specify whether user agent should discard the cookie unconditionally. */
    @stub
    def setDiscard(discard: Boolean): Unit = ???

    /** Specifies the domain within which this cookie should be presented. */
    @stub
    def setDomain(pattern: String): Unit = ???

    /** Indicates whether the cookie should be considered HTTP Only. */
    @stub
    def setHttpOnly(httpOnly: Boolean): Unit = ???

    /** Sets the maximum age of the cookie in seconds. */
    @stub
    def setMaxAge(expiry: Long): Unit = ???

    /** Specifies a path for the cookie to which the client should return
     *  the cookie.
     */
    @stub
    def setPath(uri: String): Unit = ???

    /** Specify the portlist of the cookie, which restricts the port(s)
     *  to which a cookie may be sent back in a Cookie header.
     */
    @stub
    def setPortlist(ports: String): Unit = ???

    /** Indicates whether the cookie should only be sent using a secure protocol,
     *  such as HTTPS or SSL.
     */
    @stub
    def setSecure(flag: Boolean): Unit = ???

    /** Assigns a new value to a cookie after the cookie is created. */
    @stub
    def setValue(newValue: String): Unit = ???

    /** Sets the version of the cookie protocol this cookie complies
     *  with.
     */
    @stub
    def setVersion(v: Int): Unit = ???

    /** Constructs a cookie header string representation of this cookie,
     *  which is in the format defined by corresponding cookie specification,
     *  but without the leading "Cookie:" token.
     */
    @stub
    def toString(): String = ???
}

object HttpCookie {
    /** The utility method to check whether a host name is in a domain or not. */
    @stub
    def domainMatches(domain: String, host: String): Boolean = ???

    /** Constructs cookies from set-cookie or set-cookie2 header string. */
    @stub
    def parse(header: String): List[HttpCookie] = ???
}
