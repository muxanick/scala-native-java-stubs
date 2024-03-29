package javax.management.remote

import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** The address of a JMX API connector server.  Instances of this class
 *  are immutable.
 * 
 *  The address is an Abstract Service URL for SLP, as
 *  defined in RFC 2609 and amended by RFC 3111.  It must look like
 *  this:
 * 
 *  
 * 
 *  service:jmx:protocol:sap
 * 
 *  
 * 
 *  Here, protocol is the transport
 *  protocol to be used to connect to the connector server.  It is
 *  a string of one or more ASCII characters, each of which is a
 *  letter, a digit, or one of the characters + or
 *  -.  The first character must be a letter.
 *  Uppercase letters are converted into lowercase ones.
 * 
 *  sap is the address at which the connector
 *  server is found.  This address uses a subset of the syntax defined
 *  by RFC 2609 for IP-based protocols.  It is a subset because the
 *  user@host syntax is not supported.
 * 
 *  The other syntaxes defined by RFC 2609 are not currently
 *  supported by this class.
 * 
 *  The supported syntax is:
 * 
 *  
 * 
 *  //[host[:port]][url-path]
 * 
 *  
 * 
 *  Square brackets [] indicate optional parts of
 *  the address.  Not all protocols will recognize all optional
 *  parts.
 * 
 *  The host is a host name, an IPv4 numeric
 *  host address, or an IPv6 numeric address enclosed in square
 *  brackets.
 * 
 *  The port is a decimal port number.  0
 *  means a default or anonymous port, depending on the protocol.
 * 
 *  The host and port
 *  can be omitted.  The port cannot be supplied
 *  without a host.
 * 
 *  The url-path, if any, begins with a slash
 *  (/) or a semicolon (;) and continues to
 *  the end of the address.  It can contain attributes using the
 *  semicolon syntax specified in RFC 2609.  Those attributes are not
 *  parsed by this class and incorrect attribute syntax is not
 *  detected.
 * 
 *  Although it is legal according to RFC 2609 to have a
 *  url-path that begins with a semicolon, not
 *  all implementations of SLP allow it, so it is recommended to avoid
 *  that syntax.
 * 
 *  Case is not significant in the initial
 *  service:jmx:protocol string or in the host
 *  part of the address.  Depending on the protocol, case can be
 *  significant in the url-path.
 */
class JMXServiceURL extends Object with Serializable {

    /** Constructs a JMXServiceURL by parsing a Service URL
     *  string.
     */
    @stub
    def this(serviceURL: String) = ???

    /** Constructs a JMXServiceURL with the given protocol,
     *  host, and port.
     */
    @stub
    def this(protocol: String, host: String, port: Int) = ???

    /** Constructs a JMXServiceURL with the given parts. */
    @stub
    def this(protocol: String, host: String, port: Int, urlPath: String) = ???

    /** Indicates whether some other object is equal to this one. */
    @stub
    def equals(obj: Any): Boolean = ???

    /** The host part of the Service URL. */
    @stub
    def getHost(): String = ???

    /** The port of the Service URL. */
    @stub
    def getPort(): Int = ???

    /** The protocol part of the Service URL. */
    @stub
    def getProtocol(): String = ???

    /** The URL Path part of the Service URL. */
    @stub
    def getURLPath(): String = ???

    /** Returns a hash code value for the object. */
    @stub
    def hashCode(): Int = ???

    /** The string representation of this Service URL. */
    @stub
    def toString(): String = ???
}
