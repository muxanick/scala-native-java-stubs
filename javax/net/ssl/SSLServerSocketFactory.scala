package javax.net.ssl

import java.lang.{Object, String}
import javax.net.ServerSocketFactory

// SSLServerSocketFactorys create
// SSLServerSockets.
abstract class SSLServerSocketFactory extends ServerSocketFactory {

    // Returns the list of cipher suites which are enabled by default.
    def getDefaultCipherSuites(): Array[String]
}

object SSLServerSocketFactory {
    @stub
    // Returns the default SSL server socket factory.
    def getDefault(): ServerSocketFactory = ???
}
