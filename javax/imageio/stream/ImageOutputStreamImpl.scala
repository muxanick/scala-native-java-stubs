package javax.imageio.stream

import java.lang.{Object, String}

// An abstract class implementing the ImageOutputStream interface.
// This class is designed to reduce the number of methods that must
// be implemented by subclasses.
abstract class ImageOutputStreamImpl extends ImageInputStreamImpl with ImageOutputStream {

    // If the bit offset is non-zero, forces the remaining bits
    // in the current byte to 0 and advances the stream position
    // by one.
    protected def flushBits(): Unit

    // Writes a sequence of bytes to the stream at the current
    // position.
    def write(b: Array[Byte]): Unit

    // Writes a sequence of bytes to the stream at the current
    // position.
    def write(b: Array[Byte], off: Int, len: Int): Unit

    // Writes a single byte to the stream at the current position.
    def write(b: Int): Unit

    // Writes a single bit, given by the least significant bit of the
    // argument, to the stream at the current bit offset within the
    // current byte position.
    def writeBit(bit: Int): Unit

    // Writes a sequence of bits, given by the numBits
    // least significant bits of the bits argument in
    // left-to-right order, to the stream at the current bit offset
    // within the current byte position.
    def writeBits(bits: Long, numBits: Int): Unit

    // Writes a boolean value to the stream.
    def writeBoolean(v: Boolean): Unit

    // Writes the 8 low-order bits of v to the
    // stream.
    def writeByte(v: Int): Unit

    // Writes a string to the output stream.
    def writeBytes(s: String): Unit

    // This method is a synonym for writeShort.
    def writeChar(v: Int): Unit

    // Writes a sequence of chars to the stream at the current
    // position.
    def writeChars(c: Array[Char], off: Int, len: Int): Unit

    // Writes a string to the output stream.
    def writeChars(s: String): Unit

    // Writes a double value, which is comprised of four
    // bytes, to the output stream.
    def writeDouble(v: double): Unit

    // Writes a sequence of doubles to the stream at the current
    // position.
    def writeDoubles(d: Array[double], off: Int, len: Int): Unit

    // Writes a float value, which is comprised of four
    // bytes, to the output stream.
    def writeFloat(v: float): Unit

    // Writes a sequence of floats to the stream at the current
    // position.
    def writeFloats(f: Array[float], off: Int, len: Int): Unit

    // Writes the 32 bits of v to the stream.
    def writeInt(v: Int): Unit

    // Writes a sequence of ints to the stream at the current
    // position.
    def writeInts(i: Array[Int], off: Int, len: Int): Unit

    // Writes the 64 bits of v to the stream.
    def writeLong(v: Long): Unit

    // Writes a sequence of longs to the stream at the current
    // position.
    def writeLongs(l: Array[Long], off: Int, len: Int): Unit

    // Writes the 16 low-order bits of v to the
    // stream.
    def writeShort(v: Int): Unit

    // Writes a sequence of shorts to the stream at the current
    // position.
    def writeShorts(s: Array[Short], off: Int, len: Int): Unit
}
