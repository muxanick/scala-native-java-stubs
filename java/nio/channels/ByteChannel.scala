package java.nio.channels

/** A channel that can read and write bytes.  This interface simply unifies
 *  ReadableByteChannel and WritableByteChannel; it does not
 *  specify any new operations.
 */
trait ByteChannel extends ReadableByteChannel with WritableByteChannel {
}
