package java.nio.channels

import java.lang.{Exception, IllegalStateException, Object, RuntimeException, Throwable}

/** Unchecked exception thrown when an attempt is made to connect a SocketChannel that is already connected. */
class AlreadyConnectedException extends IllegalStateException {
}
