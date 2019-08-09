package javax.sound.sampled

import java.io.InputStream
import java.lang.Object

// An audio input stream is an input stream with a specified audio format and
// length.  The length is expressed in sample frames, not bytes.
// Several methods are provided for reading a certain number of bytes from
// the stream, or an unspecified number of bytes.
// The audio input stream keeps track  of the last byte that was read.
// You can skip over an arbitrary number of bytes to get to a later position
// for reading. An audio input stream may support marks.  When you set a mark,
// the current position is remembered so that you can return to it later.
// 
// The AudioSystem class includes many methods that manipulate
// AudioInputStream objects.
// For example, the methods let you:
// 
//  obtain an
// audio input stream from an external audio file, stream, or URL
//  write an external file from an audio input stream
//  convert an audio input stream to a different audio format
// 
class AudioInputStream extends InputStream {

    @stub
    // Constructs an audio input stream that has the requested format and length in sample frames,
    // using audio data from the specified input stream.
    def this(stream: InputStream, format: AudioFormat, length: Long) = ???

    @stub
    // The format of the audio data contained in the stream.
    protected def format: AudioFormat = ???

    @stub
    // This stream's length, in sample frames.
    protected def frameLength: Long = ???

    @stub
    // The current position in this stream, in sample frames (zero-based).
    protected def framePos: Long = ???

    @stub
    // Returns the maximum number of bytes that can be read (or skipped over) from this
    // audio input stream without blocking.
    def available(): Int = ???

    @stub
    // Closes this audio input stream and releases any system resources associated
    // with the stream.
    def close(): Unit = ???

    @stub
    // Obtains the audio format of the sound data in this audio input stream.
    def getFormat(): AudioFormat = ???

    @stub
    // Obtains the length of the stream, expressed in sample frames rather than bytes.
    def getFrameLength(): Long = ???

    @stub
    // Marks the current position in this audio input stream.
    def mark(readlimit: Int): Unit = ???

    @stub
    // Tests whether this audio input stream supports the mark and
    // reset methods.
    def markSupported(): Boolean = ???

    @stub
    // Reads the next byte of data from the audio input stream.
    def read(): Int = ???

    @stub
    // Reads some number of bytes from the audio input stream and stores them into
    // the buffer array b.
    def read(b: Array[Byte]): Int = ???

    @stub
    // Reads up to a specified maximum number of bytes of data from the audio
    // stream, putting them into the given byte array.
    def read(b: Array[Byte], off: Int, len: Int): Int = ???

    @stub
    // Repositions this audio input stream to the position it had at the time its
    // mark method was last invoked.
    def reset(): Unit = ???
}
