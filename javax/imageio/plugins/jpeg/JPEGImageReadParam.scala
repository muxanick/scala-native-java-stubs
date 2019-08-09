package javax.imageio.plugins.jpeg

import java.lang.Object
import javax.imageio.{IIOParam, ImageReadParam}

/** This class adds the ability to set JPEG quantization and Huffman
 *  tables when using the built-in JPEG reader plug-in.  An instance of
 *  this class will be returned from the
 *  getDefaultImageReadParam methods of the built-in JPEG
 *  ImageReader.
 * 
 *   The sole purpose of these additions is to allow the
 *  specification of tables for use in decoding abbreviated streams.
 *  The built-in JPEG reader will also accept an ordinary
 *  ImageReadParam, which is sufficient for decoding
 *  non-abbreviated streams.
 * 
 *   While tables for abbreviated streams are often obtained by
 *  first reading another abbreviated stream containing only the
 *  tables, in some applications the tables are fixed ahead of time.
 *  This class allows the tables to be specified directly from client
 *  code.  If no tables are specified either in the stream or in a
 *  JPEGImageReadParam, then the stream is presumed to use
 *  the "standard" visually lossless tables.  See JPEGQTable
 *  and JPEGHuffmanTable for more information
 *   on the default tables.
 * 
 *   The default JPEGImageReadParam returned by the
 *  getDefaultReadParam method of the builtin JPEG reader
 *  contains no tables.  Default tables may be obtained from the table
 *  classes JPEGQTable and
 *  JPEGHuffmanTable.
 * 
 *   If a stream does contain tables, the tables given in a
 *  JPEGImageReadParam are ignored.  Furthermore, if the
 *  first image in a stream does contain tables and subsequent ones do
 *  not, then the tables given in the first image are used for all the
 *  abbreviated images.  Once tables have been read from a stream, they
 *  can be overridden only by tables subsequently read from the same
 *  stream.  In order to specify new tables, the setInput method of
 *  the reader must be called to change the stream.
 * 
 *   Note that this class does not provide a means for obtaining the
 *  tables found in a stream.  These may be extracted from a stream by
 *  consulting the IIOMetadata object returned by the reader.
 * 
 *  
 *  For more information about the operation of the built-in JPEG plug-ins,
 *  see the JPEG
 *  metadata format specification and usage notes.
 */
class JPEGImageReadParam extends ImageReadParam {

    /** Returns true if tables are currently set. */
    @stub
    def areTablesSet(): Boolean = ???

    /** Returns a copy of the array of AC Huffman tables set on the
     *  most recent call to setDecodeTables, or
     *  null if tables are not currently set.
     */
    @stub
    def getACHuffmanTables(): Array[JPEGHuffmanTable] = ???

    /** Returns a copy of the array of DC Huffman tables set on the
     *  most recent call to setDecodeTables, or
     *  null if tables are not currently set.
     */
    @stub
    def getDCHuffmanTables(): Array[JPEGHuffmanTable] = ???

    /** Returns a copy of the array of quantization tables set on the
     *  most recent call to setDecodeTables, or
     *  null if tables are not currently set.
     */
    @stub
    def getQTables(): Array[JPEGQTable] = ???

    /** Sets the quantization and Huffman tables to use in decoding
     *  abbreviated streams.
     */
    @stub
    def setDecodeTables(qTables: Array[JPEGQTable], DCHuffmanTables: Array[JPEGHuffmanTable], ACHuffmanTables: Array[JPEGHuffmanTable]): Unit = ???
}
