package java.io

import java.lang.{Object, String}

/** A data input stream lets an application read primitive Java data
 *  types from an underlying input stream in a machine-independent
 *  way. An application uses a data output stream to write data that
 *  can later be read by a data input stream.
 *  
 *  DataInputStream is not necessarily safe for multithreaded access.
 *  Thread safety is optional and is the responsibility of users of
 *  methods in this class.
 */
class DataInputStream extends FilterInputStream with DataInput {

    /** Reads some number of bytes from the contained input stream and
     *  stores them into the buffer array b.
     */
    @stub
    def read(b: Array[Byte]): Int = ???

    /** Reads up to len bytes of data from the contained
     *  input stream into an array of bytes.
     */
    @stub
    def read(b: Array[Byte], off: Int, len: Int): Int = ???

    /** See the general contract of the readBoolean
     *  method of DataInput.
     */
    @stub
    def readBoolean(): Boolean = ???

    /** See the general contract of the readByte
     *  method of DataInput.
     */
    @stub
    def readByte(): Byte = ???

    /** See the general contract of the readChar
     *  method of DataInput.
     */
    @stub
    def readChar(): Char = ???

    /** See the general contract of the readDouble
     *  method of DataInput.
     */
    @stub
    def readDouble(): Double = ???

    /** See the general contract of the readFloat
     *  method of DataInput.
     */
    @stub
    def readFloat(): Float = ???

    /** See the general contract of the readFully
     *  method of DataInput.
     */
    @stub
    def readFully(b: Array[Byte]): Unit = ???

    /** See the general contract of the readFully
     *  method of DataInput.
     */
    @stub
    def readFully(b: Array[Byte], off: Int, len: Int): Unit = ???

    /** See the general contract of the readInt
     *  method of DataInput.
     */
    @stub
    def readInt(): Int = ???

    /** Deprecated. 
     * This method does not properly convert bytes to characters.
     *  As of JDK 1.1, the preferred way to read lines of text is via the
     *  BufferedReader.readLine() method.  Programs that use the
     *  DataInputStream class to read lines can be converted to use
     *  the BufferedReader class by replacing code of the form:
     *  
     *      DataInputStream d = new DataInputStream(in);
     *  
     *  with:
     *  
     *      BufferedReader d
     *           = new BufferedReader(new InputStreamReader(in));
     *  
     * 
     */
    @stub
    def readLine(): String = ???

    /** See the general contract of the readLong
     *  method of DataInput.
     */
    @stub
    def readLong(): Long = ???

    /** See the general contract of the readShort
     *  method of DataInput.
     */
    @stub
    def readShort(): Short = ???

    /** See the general contract of the readUnsignedByte
     *  method of DataInput.
     */
    @stub
    def readUnsignedByte(): Int = ???

    /** See the general contract of the readUnsignedShort
     *  method of DataInput.
     */
    @stub
    def readUnsignedShort(): Int = ???

    /** See the general contract of the readUTF
     *  method of DataInput.
     */
    @stub
    def readUTF(): String = ???
}

object DataInputStream {
    /** Reads from the
     *  stream in a representation
     *  of a Unicode  character string encoded in
     *  modified UTF-8 format;
     *  this string of characters is then returned as a String.
     */
    @stub
    def readUTF(in: DataInput): String = ???
}
