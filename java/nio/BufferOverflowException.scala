package java.nio

import java.lang.{Exception, Object, RuntimeException, Throwable}

/** Unchecked exception thrown when a relative put operation reaches
 *  the target buffer's limit.
 */
class BufferOverflowException extends RuntimeException {
}
