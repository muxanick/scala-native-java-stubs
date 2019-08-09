package java.nio.channels

import java.lang.{Exception, IllegalStateException, Object, RuntimeException, Throwable}

/** Unchecked exception thrown when the finishConnect method of a SocketChannel is invoked without first
 *  successfully invoking its connect method.
 */
class NoConnectionPendingException extends IllegalStateException {
}
