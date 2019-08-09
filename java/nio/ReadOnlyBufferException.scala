package java.nio

import java.lang.{Exception, Object, RuntimeException, Throwable, UnsupportedOperationException}

/** Unchecked exception thrown when a content-mutation method such as
 *  put or compact is invoked upon a read-only buffer.
 */
class ReadOnlyBufferException extends UnsupportedOperationException {
}
