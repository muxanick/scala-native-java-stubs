package javax.net

import java.lang.{Object, String}
import java.net.{InetAddress, Socket}
import scala.scalanative.annotation.stub

/** This class creates sockets.  It may be subclassed by other factories,
 *  which create particular subclasses of sockets and thus provide a general
 *  framework for the addition of public socket-level functionality.
 * 
 *   Socket factories are a simple way to capture a variety of policies
 *  related to the sockets being constructed, producing such sockets in
 *  a way which does not require special configuration of the code which
 *  asks for the sockets:  
 * 
 *        Due to polymorphism of both factories and sockets, different
 *       kinds of sockets can be used by the same application code just
 *       by passing it different kinds of factories.
 * 
 *        Factories can themselves be customized with parameters used
 *       in socket construction.  So for example, factories could be
 *       customized to return sockets with different networking timeouts
 *       or security parameters already configured.
 * 
 *        The sockets returned to the application can be subclasses
 *       of java.net.Socket, so that they can directly expose new APIs
 *       for features such as compression, security, record marking,
 *       statistics collection, or firewall tunneling.
 * 
 *       
 * 
 *   Factory classes are specified by environment-specific configuration
 *  mechanisms.  For example, the getDefault method could return
 *  a factory that was appropriate for a particular user or applet, and a
 *  framework could use a factory customized to its own purposes.
 */
abstract class SocketFactory extends Object {

    /** Creates a SocketFactory. */
    @stub
    protected def this() = ???

    /** Creates an unconnected socket. */
    def createSocket(): Socket

    /** Creates a socket and connects it to the specified port number
     *  at the specified address.
     */
    def createSocket(host: InetAddress, port: Int): Socket

    /** Creates a socket and connect it to the specified remote address
     *  on the specified remote port.
     */
    def createSocket(address: InetAddress, port: Int, localAddress: InetAddress, localPort: Int): Socket

    /** Creates a socket and connects it to the specified remote host
     *  at the specified remote port.
     */
    def createSocket(host: String, port: Int): Socket

    /** Creates a socket and connects it to the specified remote host
     *  on the specified remote port.
     */
    def createSocket(host: String, port: Int, localHost: InetAddress, localPort: Int): Socket
}

object SocketFactory {
    /** Returns a copy of the environment's default socket factory. */
    @stub
    def getDefault(): SocketFactory = ???
}
