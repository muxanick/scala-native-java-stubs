package java.nio.charset

import java.lang.{Error, Object, Throwable}

/** Error thrown when the decodeLoop method of
 *  a CharsetDecoder, or the encodeLoop method of a CharsetEncoder, throws an unexpected
 *  exception.
 */
class CoderMalfunctionError extends Error {
}
