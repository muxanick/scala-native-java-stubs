package java.net

import java.lang.{Cloneable, Object, String}
import java.util.List

// An HttpCookie object represents an HTTP cookie, which carries state
// information between server and user agent. Cookie is widely adopted
// to create stateful sessions.
//
//  There are 3 HTTP cookie specifications:
// 
//   Netscape draft
//   RFC 2109 - 
// http://www.ietf.org/rfc/rfc2109.txt
//   RFC 2965 - 
// http://www.ietf.org/rfc/rfc2965.txt
// 
//
//  HttpCookie class can accept all these 3 forms of syntax.
final class HttpCookie extends Object with Cloneable {

    @stub
    // Create and return a copy of this object.
    def clone(): Object = ???

    @stub
    // Test the equality of two HTTP cookies.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the comment describing the purpose of this cookie, or
    // null if the cookie has no comment.
    def getComment(): String = ???

    @stub
    // Returns the comment URL describing the purpose of this cookie, or
    // null if the cookie has no comment URL.
    def getCommentURL(): String = ???

    @stub
    // Returns the discard attribute of the cookie
    def getDiscard(): Boolean = ???

    @stub
    // Returns the domain name set for this cookie.
    def getDomain(): String = ???

    @stub
    // Returns the maximum age of the cookie, specified in seconds.
    def getMaxAge(): Long = ???

    @stub
    // Returns the name of the cookie.
    def getName(): String = ???

    @stub
    // Returns the path on the server to which the browser returns this cookie.
    def getPath(): String = ???

    @stub
    // Returns the port list attribute of the cookie
    def getPortlist(): String = ???

    @stub
    // Returns true if sending this cookie should be restricted to a
    // secure protocol, or false if the it can be sent using any
    // protocol.
    def getSecure(): Boolean = ???

    @stub
    // Returns the value of the cookie.
    def getValue(): String = ???

    @stub
    // Returns the version of the protocol this cookie complies with.
    def getVersion(): Int = ???

    @stub
    // Reports whether this HTTP cookie has expired or not.
    def hasExpired(): Boolean = ???

    @stub
    // Returns the hash code of this HTTP cookie.
    def hashCode(): Int = ???

    @stub
    // Returns true if this cookie contains the HttpOnly
    // attribute.
    def isHttpOnly(): Boolean = ???

    @stub
    // Specifies a comment that describes a cookie's purpose.
    def setComment(purpose: String): Unit = ???

    @stub
    // Specifies a comment URL that describes a cookie's purpose.
    def setCommentURL(purpose: String): Unit = ???

    @stub
    // Specify whether user agent should discard the cookie unconditionally.
    def setDiscard(discard: Boolean): Unit = ???

    @stub
    // Specifies the domain within which this cookie should be presented.
    def setDomain(pattern: String): Unit = ???

    @stub
    // Indicates whether the cookie should be considered HTTP Only.
    def setHttpOnly(httpOnly: Boolean): Unit = ???

    @stub
    // Sets the maximum age of the cookie in seconds.
    def setMaxAge(expiry: Long): Unit = ???

    @stub
    // Specifies a path for the cookie to which the client should return
    // the cookie.
    def setPath(uri: String): Unit = ???

    @stub
    // Specify the portlist of the cookie, which restricts the port(s)
    // to which a cookie may be sent back in a Cookie header.
    def setPortlist(ports: String): Unit = ???

    @stub
    // Indicates whether the cookie should only be sent using a secure protocol,
    // such as HTTPS or SSL.
    def setSecure(flag: Boolean): Unit = ???

    @stub
    // Assigns a new value to a cookie after the cookie is created.
    def setValue(newValue: String): Unit = ???

    @stub
    // Sets the version of the cookie protocol this cookie complies
    // with.
    def setVersion(v: Int): Unit = ???
}

object HttpCookie {
    @stub
    // The utility method to check whether a host name is in a domain or not.
    def domainMatches(domain: String, host: String): Boolean = ???

    @stub
    // Constructs cookies from set-cookie or set-cookie2 header string.
    def parse(header: String): List[HttpCookie] = ???
}
