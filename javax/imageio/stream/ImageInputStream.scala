package javax.imageio.stream

import java.io.{Closeable, DataInput}
import java.lang.String
import java.nio.ByteOrder

// A seekable input stream interface for use by
// ImageReaders.  Various input sources, such as
// InputStreams and Files,
// as well as future fast I/O sources may be "wrapped" by a suitable
// implementation of this interface for use by the Image I/O API.
trait ImageInputStream extends DataInput , Closeable {

    @stub
    // Closes the stream.
    def close(): Unit = ???

    @stub
    // Discards the initial position of the stream prior to the current
    // stream position.
    def flush(): Unit = ???

    @stub
    // Discards the initial portion of the stream prior to the
    // indicated position.
    def flushBefore(pos: Long): Unit = ???

    @stub
    // Returns the current bit offset, as an integer between 0 and 7,
    // inclusive.
    def getBitOffset(): Int = ???

    @stub
    // Returns the byte order with which data values will be read from
    // this stream as an instance of the
    // java.nio.ByteOrder enumeration.
    def getByteOrder(): ByteOrder = ???

    @stub
    // Returns the earliest position in the stream to which seeking
    // may be performed.
    def getFlushedPosition(): Long = ???

    @stub
    // Returns the current byte position of the stream.
    def getStreamPosition(): Long = ???

    @stub
    // Returns true if this ImageInputStream
    // caches data itself in order to allow seeking backwards.
    def isCached(): Boolean = ???

    @stub
    // Returns true if this ImageInputStream
    // caches data itself in order to allow seeking backwards, and
    // the cache is kept in a temporary file.
    def isCachedFile(): Boolean = ???

    @stub
    // Returns true if this ImageInputStream
    // caches data itself in order to allow seeking backwards, and
    // the cache is kept in main memory.
    def isCachedMemory(): Boolean = ???

    @stub
    // Returns the total length of the stream, if known.
    def length(): Long = ???

    @stub
    // Marks a position in the stream to be returned to by a
    // subsequent call to reset.
    def mark(): Unit = ???

    @stub
    // Reads a single byte from the stream and returns it as an
    // integer between 0 and 255.
    def read(): Int = ???

    @stub
    // Reads up to b.length bytes from the stream, and
    // stores them into b starting at index 0.
    def read(b: Array[Byte]): Int = ???

    @stub
    // Reads up to len bytes from the stream, and stores
    // them into b starting at index off.
    def read(b: Array[Byte], off: Int, len: Int): Int = ???

    @stub
    // Reads a single bit from the stream and returns it as an
    // int with the value 0 or
    // 1.
    def readBit(): Int = ???

    @stub
    // Reads a bitstring from the stream and returns it as a
    // long, with the first bit read becoming the most
    // significant bit of the output.
    def readBits(numBits: Int): Long = ???

    @stub
    // Reads a byte from the stream and returns a boolean
    // value of true if it is nonzero, false
    // if it is zero.
    def readBoolean(): Boolean = ???

    @stub
    // Reads a byte from the stream and returns it as a
    // byte value.
    def readByte(): Byte = ???

    @stub
    // Reads up to len bytes from the stream, and
    // modifies the supplied IIOByteBuffer to indicate
    // the byte array, offset, and length where the data may be found.
    def readBytes(buf: IIOByteBuffer, len: Int): Unit = ???

    @stub
    // Equivalent to readUnsignedShort, except that the
    // result is returned using the char datatype.
    def readChar(): Char = ???

    @stub
    // Reads 8 bytes from the stream, and (conceptually) concatenates
    // them according to the current byte order and returns the result
    // as a double.
    def readDouble(): double = ???

    @stub
    // Reads 4 bytes from the stream, and (conceptually) concatenates
    // them according to the current byte order and returns the result
    // as a float.
    def readFloat(): float = ???

    @stub
    // Reads b.length bytes from the stream, and stores them
    // into b starting at index 0.
    def readFully(b: Array[Byte]): Unit = ???

    @stub
    // Reads len bytes from the stream, and stores them
    // into b starting at index off.
    def readFully(b: Array[Byte], off: Int, len: Int): Unit = ???

    @stub
    // Reads len chars (unsigned 16-bit integers) from the
    // stream according to the current byte order, and
    // stores them into c starting at index
    // off.
    def readFully(c: Array[Char], off: Int, len: Int): Unit = ???

    @stub
    // Reads len doubles (64-bit IEEE double-precision
    // floats) from the stream according to the current byte order,
    // and stores them into d starting at
    // index off.
    def readFully(d: Array[double], off: Int, len: Int): Unit = ???

    @stub
    // Reads len floats (32-bit IEEE single-precision
    // floats) from the stream according to the current byte order,
    // and stores them into f starting at
    // index off.
    def readFully(f: Array[float], off: Int, len: Int): Unit = ???

    @stub
    // Reads len ints (signed 32-bit integers) from the
    // stream according to the current byte order, and
    // stores them into i starting at index
    // off.
    def readFully(i: Array[Int], off: Int, len: Int): Unit = ???

    @stub
    // Reads len longs (signed 64-bit integers) from the
    // stream according to the current byte order, and
    // stores them into l starting at index
    // off.
    def readFully(l: Array[Long], off: Int, len: Int): Unit = ???

    @stub
    // Reads len shorts (signed 16-bit integers) from the
    // stream according to the current byte order, and
    // stores them into s starting at index
    // off.
    def readFully(s: Array[Short], off: Int, len: Int): Unit = ???

    @stub
    // Reads 4 bytes from the stream, and (conceptually) concatenates
    // them according to the current byte order and returns the result
    // as an int.
    def readInt(): Int = ???

    @stub
    // Reads the next line of text from the input stream.
    def readLine(): String = ???

    @stub
    // Reads 8 bytes from the stream, and (conceptually) concatenates
    // them according to the current byte order and returns the result
    // as a long.
    def readLong(): Long = ???

    @stub
    // Reads two bytes from the stream, and (conceptually)
    // concatenates them according to the current byte order, and
    // returns the result as a short value.
    def readShort(): Short = ???

    @stub
    // Reads a byte from the stream, and (conceptually) converts it to
    // an int, masks it with 0xff in order to strip off
    // any sign-extension bits, and returns it as a byte
    // value.
    def readUnsignedByte(): Int = ???

    @stub
    // Reads 4 bytes from the stream, and (conceptually) concatenates
    // them according to the current byte order, converts the result
    // to a long, masks it with 0xffffffffL in order to
    // strip off any sign-extension bits, and returns the result as an
    // unsigned long value.
    def readUnsignedInt(): Long = ???

    @stub
    // Reads two bytes from the stream, and (conceptually)
    // concatenates them according to the current byte order, converts
    // the resulting value to an int, masks it with
    // 0xffff in order to strip off any sign-extension
    // buts, and returns the result as an unsigned int
    // value.
    def readUnsignedShort(): Int = ???

    @stub
    // Reads in a string that has been encoded using a
    // modified
    // UTF-8
    // format.
    def readUTF(): String = ???

    @stub
    // Returns the stream pointer to its previous position, including
    // the bit offset, at the time of the most recent unmatched call
    // to mark.
    def reset(): Unit = ???

    @stub
    // Sets the current stream position to the desired location.
    def seek(pos: Long): Unit = ???

    @stub
    // Sets the bit offset to an integer between 0 and 7, inclusive.
    def setBitOffset(bitOffset: Int): Unit = ???

    @stub
    // Sets the desired byte order for future reads of data values
    // from this stream.
    def setByteOrder(byteOrder: ByteOrder): Unit = ???

    @stub
    // Moves the stream position forward by a given number of bytes.
    def skipBytes(n: Int): Int = ???
}
