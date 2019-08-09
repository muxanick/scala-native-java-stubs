package javax.net.ssl

import java.lang.{Object, String}
import javax.net.ServerSocketFactory
import scala.scalanative.annotation.stub

/** SSLServerSocketFactorys create
 *  SSLServerSockets.
 */
abstract class SSLServerSocketFactory extends ServerSocketFactory {

    /** Constructor is used only by subclasses. */
    @stub
    protected def this() = ???

    /** Returns the list of cipher suites which are enabled by default. */
    def getDefaultCipherSuites(): Array[String]

    /** Returns the names of the cipher suites which could be enabled for use
     *  on an SSL connection created by this factory.
     */
    def getSupportedCipherSuites(): Array[String]
}

object SSLServerSocketFactory {
    /** Returns the default SSL server socket factory. */
    @stub
    def getDefault(): ServerSocketFactory = ???
}
