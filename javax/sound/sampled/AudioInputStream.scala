package javax.sound.sampled

import java.io.InputStream
import java.lang.Object

/** An audio input stream is an input stream with a specified audio format and
 *  length.  The length is expressed in sample frames, not bytes.
 *  Several methods are provided for reading a certain number of bytes from
 *  the stream, or an unspecified number of bytes.
 *  The audio input stream keeps track  of the last byte that was read.
 *  You can skip over an arbitrary number of bytes to get to a later position
 *  for reading. An audio input stream may support marks.  When you set a mark,
 *  the current position is remembered so that you can return to it later.
 *  
 *  The AudioSystem class includes many methods that manipulate
 *  AudioInputStream objects.
 *  For example, the methods let you:
 *  
 *   obtain an
 *  audio input stream from an external audio file, stream, or URL
 *   write an external file from an audio input stream
 *   convert an audio input stream to a different audio format
 *  
 */
class AudioInputStream extends InputStream {

    /** Constructs an audio input stream that has the requested format and length in sample frames,
     *  using audio data from the specified input stream.
     */
    @stub
    def this(stream: InputStream, format: AudioFormat, length: Long) = ???

    /** The format of the audio data contained in the stream. */
    @stub
    protected val format: AudioFormat = ???

    /** This stream's length, in sample frames. */
    @stub
    protected val frameLength: Long = ???

    /** The current position in this stream, in sample frames (zero-based). */
    @stub
    protected val framePos: Long = ???

    /** Returns the maximum number of bytes that can be read (or skipped over) from this
     *  audio input stream without blocking.
     */
    @stub
    def available(): Int = ???

    /** Closes this audio input stream and releases any system resources associated
     *  with the stream.
     */
    @stub
    def close(): Unit = ???

    /** Obtains the audio format of the sound data in this audio input stream. */
    @stub
    def getFormat(): AudioFormat = ???

    /** Obtains the length of the stream, expressed in sample frames rather than bytes. */
    @stub
    def getFrameLength(): Long = ???

    /** Marks the current position in this audio input stream. */
    @stub
    def mark(readlimit: Int): Unit = ???

    /** Tests whether this audio input stream supports the mark and
     *  reset methods.
     */
    @stub
    def markSupported(): Boolean = ???

    /** Reads the next byte of data from the audio input stream. */
    @stub
    def read(): Int = ???

    /** Reads some number of bytes from the audio input stream and stores them into
     *  the buffer array b.
     */
    @stub
    def read(b: Array[Byte]): Int = ???

    /** Reads up to a specified maximum number of bytes of data from the audio
     *  stream, putting them into the given byte array.
     */
    @stub
    def read(b: Array[Byte], off: Int, len: Int): Int = ???

    /** Repositions this audio input stream to the position it had at the time its
     *  mark method was last invoked.
     */
    @stub
    def reset(): Unit = ???
}
