package java.net

import scala.scalanative.annotation.stub

/** This interface defines a factory for socket implementations. It
 *  is used by the classes Socket and
 *  ServerSocket to create actual socket
 *  implementations.
 */
trait SocketImplFactory {

    /** Creates a new SocketImpl instance. */
    @stub
    def createSocketImpl(): SocketImpl = ???
}
