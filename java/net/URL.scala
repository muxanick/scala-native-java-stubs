package java.net

import java.io.{InputStream, Serializable}
import java.lang.{Class, Object, String}

// Class URL represents a Uniform Resource
// Locator, a pointer to a "resource" on the World
// Wide Web. A resource can be something as simple as a file or a
// directory, or it can be a reference to a more complicated object,
// such as a query to a database or to a search engine. More
// information on the types of URLs and their formats can be found at:
// 
// Types of URL
// 
// In general, a URL can be broken into several parts. Consider the
// following example:
// 
//     http://www.example.com/docs/resource1.html
// 
// 
// The URL above indicates that the protocol to use is
// http (HyperText Transfer Protocol) and that the
// information resides on a host machine named
// www.example.com. The information on that host
// machine is named /docs/resource1.html. The exact
// meaning of this name on the host machine is both protocol
// dependent and host dependent. The information normally resides in
// a file, but it could be generated on the fly. This component of
// the URL is called the path component.
// 
// A URL can optionally specify a "port", which is the
// port number to which the TCP connection is made on the remote host
// machine. If the port is not specified, the default port for
// the protocol is used instead. For example, the default port for
// http is 80. An alternative port could be
// specified as:
// 
//     http://www.example.com:1080/docs/resource1.html
// 
// 
// The syntax of URL is defined by  RFC 2396: Uniform
// Resource Identifiers (URI): Generic Syntax, amended by RFC 2732: Format for
// Literal IPv6 Addresses in URLs. The Literal IPv6 address format
// also supports scope_ids. The syntax and usage of scope_ids is described
// here.
// 
// A URL may have appended to it a "fragment", also known
// as a "ref" or a "reference". The fragment is indicated by the sharp
// sign character "#" followed by more characters. For example,
// 
//     http://java.sun.com/index.html#chapter1
// 
// 
// This fragment is not technically part of the URL. Rather, it
// indicates that after the specified resource is retrieved, the
// application is specifically interested in that part of the
// document that has the tag chapter1 attached to it. The
// meaning of a tag is resource specific.
// 
// An application can also specify a "relative URL",
// which contains only enough information to reach the resource
// relative to another URL. Relative URLs are frequently used within
// HTML pages. For example, if the contents of the URL:
// 
//     http://java.sun.com/index.html
// 
// contained within it the relative URL:
// 
//     FAQ.html
// 
// it would be a shorthand for:
// 
//     http://java.sun.com/FAQ.html
// 
// 
// The relative URL need not specify all the components of a URL. If
// the protocol, host name, or port number is missing, the value is
// inherited from the fully specified URL. The file component must be
// specified. The optional fragment is not inherited.
// 
// The URL class does not itself encode or decode any URL components
// according to the escaping mechanism defined in RFC2396. It is the
// responsibility of the caller to encode any fields, which need to be
// escaped prior to calling URL, and also to decode any escaped fields,
// that are returned from URL. Furthermore, because URL has no knowledge
// of URL escaping, it does not recognise equivalence between the encoded
// or decoded form of the same URL. For example, the two URLs:
//     http://foo.com/hello world/ and http://foo.com/hello%20world
// would be considered not equal to each other.
// 
// Note, the URI class does perform escaping of its
// component fields in certain circumstances. The recommended way
// to manage the encoding and decoding of URLs is to use URI,
// and to convert between these two classes using toURI() and
// URI.toURL().
// 
// The URLEncoder and URLDecoder classes can also be
// used, but only for HTML form encoding, which is not the same
// as the encoding scheme defined in RFC2396.
final class URL extends Object with Serializable {

    @stub
    // Creates a URL object from the String
    // representation.
    def this(spec: String) = ???

    @stub
    // Creates a URL object from the specified
    // protocol, host, port
    // number, and file.
    def this(protocol: String, host: String, port: Int, file: String) = ???

    @stub
    // Creates a URL object from the specified
    // protocol, host, port
    // number, file, and handler.
    def this(protocol: String, host: String, port: Int, file: String, handler: URLStreamHandler) = ???

    @stub
    // Creates a URL from the specified protocol
    // name, host name, and file name.
    def this(protocol: String, host: String, file: String) = ???

    @stub
    // Creates a URL by parsing the given spec within a specified context.
    def this(context: URL, spec: String) = ???

    @stub
    // Compares this URL for equality with another object.
    def equals(obj: Object): Boolean = ???

    @stub
    // Gets the authority part of this URL.
    def getAuthority(): String = ???

    @stub
    // Gets the contents of this URL.
    def getContent(): Object = ???

    @stub
    // Gets the contents of this URL.
    def getContent(classes: Array[Class]): Object = ???

    @stub
    // Gets the default port number of the protocol associated
    // with this URL.
    def getDefaultPort(): Int = ???

    @stub
    // Gets the file name of this URL.
    def getFile(): String = ???

    @stub
    // Gets the host name of this URL, if applicable.
    def getHost(): String = ???

    @stub
    // Gets the path part of this URL.
    def getPath(): String = ???

    @stub
    // Gets the port number of this URL.
    def getPort(): Int = ???

    @stub
    // Gets the protocol name of this URL.
    def getProtocol(): String = ???

    @stub
    // Gets the query part of this URL.
    def getQuery(): String = ???

    @stub
    // Gets the anchor (also known as the "reference") of this
    // URL.
    def getRef(): String = ???

    @stub
    // Gets the userInfo part of this URL.
    def getUserInfo(): String = ???

    @stub
    // Creates an integer suitable for hash table indexing.
    def hashCode(): Int = ???

    @stub
    // Returns a URLConnection instance that
    // represents a connection to the remote object referred to by the
    // URL.
    def openConnection(): URLConnection = ???

    @stub
    // Same as openConnection(), except that the connection will be
    // made through the specified proxy; Protocol handlers that do not
    // support proxing will ignore the proxy parameter and make a
    // normal connection.
    def openConnection(proxy: Proxy): URLConnection = ???

    @stub
    // Opens a connection to this URL and returns an
    // InputStream for reading from that connection.
    def openStream(): InputStream = ???

    @stub
    // Compares two URLs, excluding the fragment component.
    def sameFile(other: URL): Boolean = ???

    @stub
    // Constructs a string representation of this URL.
    def toExternalForm(): String = ???

    @stub
    // Constructs a string representation of this URL.
    def toString(): String = ???
}

object URL {
    @stub
    // Sets an application's URLStreamHandlerFactory.
    def setURLStreamHandlerFactory(fac: URLStreamHandlerFactory): Unit = ???
}
