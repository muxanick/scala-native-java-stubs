package java.io

import java.lang.String
import scala.scalanative.annotation.stub

/** The DataInput interface provides
 *  for reading bytes from a binary stream and
 *  reconstructing from them data in any of
 *  the Java primitive types. There is also
 *  a
 *  facility for reconstructing a String
 *  from data in
 *  modified UTF-8
 *  format.
 *  
 *  It is generally true of all the reading
 *  routines in this interface that if end of
 *  file is reached before the desired number
 *  of bytes has been read, an EOFException
 *  (which is a kind of IOException)
 *  is thrown. If any byte cannot be read for
 *  any reason other than end of file, an IOException
 *  other than EOFException is
 *  thrown. In particular, an IOException
 *  may be thrown if the input stream has been
 *  closed.
 * 
 *  Modified UTF-8
 *  
 *  Implementations of the DataInput and DataOutput interfaces represent
 *  Unicode strings in a format that is a slight modification of UTF-8.
 *  (For information regarding the standard UTF-8 format, see section
 *  3.9 Unicode Encoding Forms of The Unicode Standard, Version
 *  4.0).
 *  Note that in the following table, the most significant bit appears in the
 *  far left-hand column.
 * 
 *  
 *    
 *      
 *        
 *          All characters in the range '\u0001' to
 *          '\u007F' are represented by a single byte:
 *      
 *      
 *        
 *        Bit Values
 *      
 *      
 *        Byte 1
 *        0
 *        bits 6-0
 *      
 *      
 *        
 *          The null character '\u0000' and characters
 *          in the range '\u0080' to '\u07FF' are
 *          represented by a pair of bytes:
 *      
 *      
 *        
 *        Bit Values
 *      
 *      
 *        Byte 1
 *        1
 *        1
 *        0
 *        bits 10-6
 *      
 *      
 *        Byte 2
 *        1
 *        0
 *        bits 5-0
 *      
 *      
 *        
 *          char values in the range '\u0800'
 *          to '\uFFFF' are represented by three bytes:
 *      
 *      
 *        
 *        Bit Values
 *      
 *      
 *        Byte 1
 *        1
 *        1
 *        1
 *        0
 *        bits 15-12
 *      
 *      
 *        Byte 2
 *        1
 *        0
 *        bits 11-6
 *      
 *      
 *        Byte 3
 *        1
 *        0
 *        bits 5-0
 *      
 *    
 *  
 *  
 *  The differences between this format and the
 *  standard UTF-8 format are the following:
 *  
 *  The null byte '\u0000' is encoded in 2-byte format
 *      rather than 1-byte, so that the encoded strings never have
 *      embedded nulls.
 *  Only the 1-byte, 2-byte, and 3-byte formats are used.
 *  Supplementary characters
 *      are represented in the form of surrogate pairs.
 *  
 */
trait DataInput {

    /** Reads one input byte and returns
     *  true if that byte is nonzero,
     *  false if that byte is zero.
     */
    @stub
    def readBoolean(): Boolean = ???

    /** Reads and returns one input byte. */
    @stub
    def readByte(): Byte = ???

    /** Reads two input bytes and returns a char value. */
    @stub
    def readChar(): Char = ???

    /** Reads eight input bytes and returns
     *  a double value.
     */
    @stub
    def readDouble(): Double = ???

    /** Reads four input bytes and returns
     *  a float value.
     */
    @stub
    def readFloat(): Float = ???

    /** Reads some bytes from an input
     *  stream and stores them into the buffer
     *  array b.
     */
    @stub
    def readFully(b: Array[Byte]): Unit = ???

    /** Reads len
     *  bytes from
     *  an input stream.
     */
    @stub
    def readFully(b: Array[Byte], off: Int, len: Int): Unit = ???

    /** Reads four input bytes and returns an
     *  int value.
     */
    @stub
    def readInt(): Int = ???

    /** Reads the next line of text from the input stream. */
    @stub
    def readLine(): String = ???

    /** Reads eight input bytes and returns
     *  a long value.
     */
    @stub
    def readLong(): Long = ???

    /** Reads two input bytes and returns
     *  a short value.
     */
    @stub
    def readShort(): Short = ???

    /** Reads one input byte, zero-extends
     *  it to type int, and returns
     *  the result, which is therefore in the range
     *  0
     *  through 255.
     */
    @stub
    def readUnsignedByte(): Int = ???

    /** Reads two input bytes and returns
     *  an int value in the range 0
     *  through 65535.
     */
    @stub
    def readUnsignedShort(): Int = ???

    /** Reads in a string that has been encoded using a
     *  modified UTF-8
     *  format.
     */
    @stub
    def readUTF(): String = ???

    /** Makes an attempt to skip over
     *  n bytes
     *  of data from the input
     *  stream, discarding the skipped bytes.
     */
    @stub
    def skipBytes(n: Int): Int = ???
}
