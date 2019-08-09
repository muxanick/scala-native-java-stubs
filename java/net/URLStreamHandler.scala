package java.net

import java.lang.{Object, String}

/** The abstract class URLStreamHandler is the common
 *  superclass for all stream protocol handlers. A stream protocol
 *  handler knows how to make a connection for a particular protocol
 *  type, such as http or https.
 *  
 *  In most cases, an instance of a URLStreamHandler
 *  subclass is not created directly by an application. Rather, the
 *  first time a protocol name is encountered when constructing a
 *  URL, the appropriate stream protocol handler is
 *  automatically loaded.
 */
abstract class URLStreamHandler extends Object {

    /** Provides the default equals calculation. */
    protected def equals(u1: URL, u2: URL): Boolean

    /** Returns the default port for a URL parsed by this handler. */
    protected def getDefaultPort(): Int

    /** Get the IP address of our host. */
    protected def getHostAddress(u: URL): InetAddress

    /** Provides the default hash calculation. */
    protected def hashCode(u: URL): Int

    /** Compares the host components of two URLs. */
    protected def hostsEqual(u1: URL, u2: URL): Boolean

    /** Opens a connection to the object referenced by the
     *  URL argument.
     */
    protected def openConnection(u: URL): URLConnection

    /** Same as openConnection(URL), except that the connection will be
     *  made through the specified proxy; Protocol handlers that do not
     *  support proxying will ignore the proxy parameter and make a
     *  normal connection.
     */
    protected def openConnection(u: URL, p: Proxy): URLConnection

    /** Parses the string representation of a URL into a
     *  URL object.
     */
    protected def parseURL(u: URL, spec: String, start: Int, limit: Int): Unit

    /** Compare two urls to see whether they refer to the same file,
     *  i.e., having the same protocol, host, port, and path.
     */
    protected def sameFile(u1: URL, u2: URL): Boolean

    /** Deprecated. 
     * Use setURL(URL, String, String, int, String, String, String,
     *              String);
     * 
     */
    protected def setURL(u: URL, protocol: String, host: String, port: Int, file: String, ref: String): Unit

    /** Sets the fields of the URL argument to the indicated values. */
    protected def setURL(u: URL, protocol: String, host: String, port: Int, authority: String, userInfo: String, path: String, query: String, ref: String): Unit
}
