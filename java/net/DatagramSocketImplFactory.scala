package java.net

import scala.scalanative.annotation.stub

/** This interface defines a factory for datagram socket implementations. It
 *  is used by the classes DatagramSocket to create actual socket
 *  implementations.
 */
trait DatagramSocketImplFactory {

    /** Creates a new DatagramSocketImpl instance. */
    @stub
    def createDatagramSocketImpl(): DatagramSocketImpl = ???
}
