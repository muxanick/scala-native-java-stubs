package java.net

import java.io.{InputStream, Serializable}
import java.lang.{Class, Object, String}
import scala.scalanative.annotation.stub

/** Class URL represents a Uniform Resource
 *  Locator, a pointer to a "resource" on the World
 *  Wide Web. A resource can be something as simple as a file or a
 *  directory, or it can be a reference to a more complicated object,
 *  such as a query to a database or to a search engine. More
 *  information on the types of URLs and their formats can be found at:
 *  
 *  Types of URL
 *  
 *  In general, a URL can be broken into several parts. Consider the
 *  following example:
 *  
 *      http://www.example.com/docs/resource1.html
 *  
 *  
 *  The URL above indicates that the protocol to use is
 *  http (HyperText Transfer Protocol) and that the
 *  information resides on a host machine named
 *  www.example.com. The information on that host
 *  machine is named /docs/resource1.html. The exact
 *  meaning of this name on the host machine is both protocol
 *  dependent and host dependent. The information normally resides in
 *  a file, but it could be generated on the fly. This component of
 *  the URL is called the path component.
 *  
 *  A URL can optionally specify a "port", which is the
 *  port number to which the TCP connection is made on the remote host
 *  machine. If the port is not specified, the default port for
 *  the protocol is used instead. For example, the default port for
 *  http is 80. An alternative port could be
 *  specified as:
 *  
 *      http://www.example.com:1080/docs/resource1.html
 *  
 *  
 *  The syntax of URL is defined by  RFC 2396: Uniform
 *  Resource Identifiers (URI): Generic Syntax, amended by RFC 2732: Format for
 *  Literal IPv6 Addresses in URLs. The Literal IPv6 address format
 *  also supports scope_ids. The syntax and usage of scope_ids is described
 *  here.
 *  
 *  A URL may have appended to it a "fragment", also known
 *  as a "ref" or a "reference". The fragment is indicated by the sharp
 *  sign character "#" followed by more characters. For example,
 *  
 *      http://java.sun.com/index.html#chapter1
 *  
 *  
 *  This fragment is not technically part of the URL. Rather, it
 *  indicates that after the specified resource is retrieved, the
 *  application is specifically interested in that part of the
 *  document that has the tag chapter1 attached to it. The
 *  meaning of a tag is resource specific.
 *  
 *  An application can also specify a "relative URL",
 *  which contains only enough information to reach the resource
 *  relative to another URL. Relative URLs are frequently used within
 *  HTML pages. For example, if the contents of the URL:
 *  
 *      http://java.sun.com/index.html
 *  
 *  contained within it the relative URL:
 *  
 *      FAQ.html
 *  
 *  it would be a shorthand for:
 *  
 *      http://java.sun.com/FAQ.html
 *  
 *  
 *  The relative URL need not specify all the components of a URL. If
 *  the protocol, host name, or port number is missing, the value is
 *  inherited from the fully specified URL. The file component must be
 *  specified. The optional fragment is not inherited.
 *  
 *  The URL class does not itself encode or decode any URL components
 *  according to the escaping mechanism defined in RFC2396. It is the
 *  responsibility of the caller to encode any fields, which need to be
 *  escaped prior to calling URL, and also to decode any escaped fields,
 *  that are returned from URL. Furthermore, because URL has no knowledge
 *  of URL escaping, it does not recognise equivalence between the encoded
 *  or decoded form of the same URL. For example, the two URLs:
 *      http://foo.com/hello world/ and http://foo.com/hello%20world
 *  would be considered not equal to each other.
 *  
 *  Note, the URI class does perform escaping of its
 *  component fields in certain circumstances. The recommended way
 *  to manage the encoding and decoding of URLs is to use URI,
 *  and to convert between these two classes using toURI() and
 *  URI.toURL().
 *  
 *  The URLEncoder and URLDecoder classes can also be
 *  used, but only for HTML form encoding, which is not the same
 *  as the encoding scheme defined in RFC2396.
 */
final class URL extends Object with Serializable {

    /** Creates a URL object from the String
     *  representation.
     */
    @stub
    def this(spec: String) = ???

    /** Creates a URL object from the specified
     *  protocol, host, port
     *  number, and file.
     */
    @stub
    def this(protocol: String, host: String, port: Int, file: String) = ???

    /** Creates a URL object from the specified
     *  protocol, host, port
     *  number, file, and handler.
     */
    @stub
    def this(protocol: String, host: String, port: Int, file: String, handler: URLStreamHandler) = ???

    /** Creates a URL from the specified protocol
     *  name, host name, and file name.
     */
    @stub
    def this(protocol: String, host: String, file: String) = ???

    /** Creates a URL by parsing the given spec within a specified context. */
    @stub
    def this(context: URL, spec: String) = ???

    /** Creates a URL by parsing the given spec with the specified handler
     *  within a specified context.
     */
    @stub
    def this(context: URL, spec: String, handler: URLStreamHandler) = ???

    /** Compares this URL for equality with another object. */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Gets the authority part of this URL. */
    @stub
    def getAuthority(): String = ???

    /** Gets the contents of this URL. */
    @stub
    def getContent(): Any = ???

    /** Gets the contents of this URL. */
    @stub
    def getContent(classes: Array[Class]): Any = ???

    /** Gets the default port number of the protocol associated
     *  with this URL.
     */
    @stub
    def getDefaultPort(): Int = ???

    /** Gets the file name of this URL. */
    @stub
    def getFile(): String = ???

    /** Gets the host name of this URL, if applicable. */
    @stub
    def getHost(): String = ???

    /** Gets the path part of this URL. */
    @stub
    def getPath(): String = ???

    /** Gets the port number of this URL. */
    @stub
    def getPort(): Int = ???

    /** Gets the protocol name of this URL. */
    @stub
    def getProtocol(): String = ???

    /** Gets the query part of this URL. */
    @stub
    def getQuery(): String = ???

    /** Gets the anchor (also known as the "reference") of this
     *  URL.
     */
    @stub
    def getRef(): String = ???

    /** Gets the userInfo part of this URL. */
    @stub
    def getUserInfo(): String = ???

    /** Creates an integer suitable for hash table indexing. */
    @stub
    def hashCode(): Int = ???

    /** Returns a URLConnection instance that
     *  represents a connection to the remote object referred to by the
     *  URL.
     */
    @stub
    def openConnection(): URLConnection = ???

    /** Same as openConnection(), except that the connection will be
     *  made through the specified proxy; Protocol handlers that do not
     *  support proxing will ignore the proxy parameter and make a
     *  normal connection.
     */
    @stub
    def openConnection(proxy: Proxy): URLConnection = ???

    /** Opens a connection to this URL and returns an
     *  InputStream for reading from that connection.
     */
    @stub
    def openStream(): InputStream = ???

    /** Compares two URLs, excluding the fragment component. */
    @stub
    def sameFile(other: URL): Boolean = ???

    /** Constructs a string representation of this URL. */
    @stub
    def toExternalForm(): String = ???

    /** Constructs a string representation of this URL. */
    @stub
    def toString(): String = ???

    /** Returns a URI equivalent to this URL. */
    @stub
    def toURI(): URI = ???
}

object URL {
    /** Sets an application's URLStreamHandlerFactory. */
    @stub
    def setURLStreamHandlerFactory(fac: URLStreamHandlerFactory): Unit = ???
}
