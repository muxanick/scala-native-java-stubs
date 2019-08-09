package java.nio.charset

import java.lang.{Exception, IllegalArgumentException, Object, RuntimeException, Throwable}

/** Unchecked exception thrown when no support is available
 *  for a requested charset.
 */
class UnsupportedCharsetException extends IllegalArgumentException {
}
