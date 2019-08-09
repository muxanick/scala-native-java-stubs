package java.nio.channels

import scala.scalanative.annotation.stub

/** A channel that can read and write bytes.  This interface simply unifies
 *  ReadableByteChannel and WritableByteChannel; it does not
 *  specify any new operations.
 */
trait ByteChannel extends ReadableByteChannel with WritableByteChannel {
}
