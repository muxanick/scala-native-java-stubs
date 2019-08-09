package java.nio

import java.lang.{Exception, Object, RuntimeException, Throwable}

/** Unchecked exception thrown when a relative get operation reaches
 *  the source buffer's limit.
 */
class BufferUnderflowException extends RuntimeException {
}
