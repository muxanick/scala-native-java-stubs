package java.nio.channels

import java.lang.{Exception, IllegalStateException, Object, RuntimeException, Throwable}

/** Unchecked exception thrown when an attempt is made to connect a SocketChannel for which a non-blocking connection operation is already in
 *  progress.
 */
class ConnectionPendingException extends IllegalStateException {
}
