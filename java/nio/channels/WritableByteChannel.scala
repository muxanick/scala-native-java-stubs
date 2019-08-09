package java.nio.channels

/** A channel that can write bytes.
 * 
 *   Only one write operation upon a writable channel may be in progress at
 *  any given time.  If one thread initiates a write operation upon a channel
 *  then any other thread that attempts to initiate another write operation will
 *  block until the first operation is complete.  Whether or not other kinds of
 *  I/O operations may proceed concurrently with a write operation depends upon
 *  the type of the channel. 
 */
trait WritableByteChannel extends Channel {
}
