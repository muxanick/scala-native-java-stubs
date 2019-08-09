package javax.net.ssl

import java.io.InputStream
import java.lang.{Object, String}
import java.net.Socket
import javax.net.SocketFactory
import scala.scalanative.annotation.stub

/** SSLSocketFactorys create SSLSockets. */
abstract class SSLSocketFactory extends SocketFactory {

    /** Constructor is used only by subclasses. */
    @stub
    def this() = ???

    /** Creates a server mode Socket layered over an
     *  existing connected socket, and is able to read data which has
     *  already been consumed/removed from the Socket's
     *  underlying InputStream.
     */
    def createSocket(s: Socket, consumed: InputStream, autoClose: Boolean): Socket

    /** Returns a socket layered over an existing socket connected to the named
     *  host, at the given port.
     */
    def createSocket(s: Socket, host: String, port: Int, autoClose: Boolean): Socket

    /** Returns the list of cipher suites which are enabled by default. */
    def getDefaultCipherSuites(): Array[String]

    /** Returns the names of the cipher suites which could be enabled for use
     *  on an SSL connection.
     */
    def getSupportedCipherSuites(): Array[String]
}

object SSLSocketFactory {
    /** Returns the default SSL socket factory. */
    @stub
    def getDefault(): SocketFactory = ???
}
