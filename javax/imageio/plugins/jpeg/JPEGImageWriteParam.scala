package javax.imageio.plugins.jpeg

import java.lang.{Object, String}
import javax.imageio.{IIOParam, ImageWriteParam}

/** This class adds the ability to set JPEG quantization and Huffman
 *  tables when using the built-in JPEG writer plug-in, and to request that
 *  optimized Huffman tables be computed for an image.  An instance of
 *  this class will be returned from the
 *  getDefaultImageWriteParam methods of the built-in JPEG
 *  ImageWriter.
 * 
 *   The principal purpose of these additions is to allow the
 *  specification of tables to use in encoding abbreviated streams.
 *  The built-in JPEG writer will also accept an ordinary
 *  ImageWriteParam, in which case the writer will
 *  construct the necessary tables internally.
 * 
 *   In either case, the quality setting in an ImageWriteParam
 *  has the same meaning as for the underlying library: 1.00 means a
 *  quantization table of all 1's, 0.75 means the "standard", visually
 *  lossless quantization table, and 0.00 means aquantization table of
 *  all 255's.
 * 
 *   While tables for abbreviated streams are often specified by
 *  first writing an abbreviated stream containing only the tables, in
 *  some applications the tables are fixed ahead of time.  This class
 *  allows the tables to be specified directly from client code.
 * 
 *   Normally, the tables are specified in the
 *  IIOMetadata objects passed in to the writer, and any
 *  tables included in these objects are written to the stream.
 *  If no tables are specified in the metadata, then an abbreviated
 *  stream is written.  If no tables are included in the metadata and
 *  no tables are specified in a JPEGImageWriteParam, then
 *  an abbreviated stream is encoded using the "standard" visually
 *  lossless tables.  This class is necessary for specifying tables
 *  when an abbreviated stream must be written without writing any tables
 *  to a stream first.  In order to use this class, the metadata object
 *  passed into the writer must contain no tables, and no stream metadata
 *  must be provided.  See JPEGQTable and
 *  JPEGHuffmanTable for more
 *  information on the default tables.
 * 
 *   The default JPEGImageWriteParam returned by the
 *  getDefaultWriteParam method of the writer contains no
 *  tables.  Default tables are included in the default
 *  IIOMetadata objects returned by the writer.
 * 
 *   If the metadata does contain tables, the tables given in a
 *  JPEGImageWriteParam are ignored.  Furthermore, once a
 *  set of tables has been written, only tables in the metadata can
 *  override them for subsequent writes, whether to the same stream or
 *  a different one.  In order to specify new tables using this class,
 *  the reset
 *  method of the writer must be called.
 * 
 *  
 *  For more information about the operation of the built-in JPEG plug-ins,
 *  see the JPEG
 *  metadata format specification and usage notes.
 */
class JPEGImageWriteParam extends ImageWriteParam {

    /** Returns true if tables are currently set. */
    @stub
    def areTablesSet(): Boolean = ???

    /** Returns a copy of the array of AC Huffman tables set on the
     *  most recent call to setEncodeTables, or
     *  null if tables are not currently set.
     */
    @stub
    def getACHuffmanTables(): Array[JPEGHuffmanTable] = ???

    /** Returns an array of Strings that may be used along
     *  with getCompressionQualityValues as part of a user
     *  interface for setting or displaying the compression quality
     *  level.
     */
    @stub
    def getCompressionQualityDescriptions(): Array[String] = ???

    /** Returns an array of floats that may be used along
     *  with getCompressionQualityDescriptions as part of a user
     *  interface for setting or displaying the compression quality
     *  level.
     */
    @stub
    def getCompressionQualityValues(): Array[Float] = ???

    /** Returns a copy of the array of DC Huffman tables set on the
     *  most recent call to setEncodeTables, or
     *  null if tables are not currently set.
     */
    @stub
    def getDCHuffmanTables(): Array[JPEGHuffmanTable] = ???

    /** Returns the value passed into the most recent call
     *  to setOptimizeHuffmanTables, or
     *  false if setOptimizeHuffmanTables
     *  has never been called.
     */
    @stub
    def getOptimizeHuffmanTables(): Boolean = ???

    /** Returns a copy of the array of quantization tables set on the
     *  most recent call to setEncodeTables, or
     *  null if tables are not currently set.
     */
    @stub
    def getQTables(): Array[JPEGQTable] = ???

    /** Returns false since the JPEG plug-in only supports
     *  lossy compression.
     */
    @stub
    def isCompressionLossless(): Boolean = ???

    /** Sets the quantization and Huffman tables to use in encoding
     *  abbreviated streams.
     */
    @stub
    def setEncodeTables(qTables: Array[JPEGQTable], DCHuffmanTables: Array[JPEGHuffmanTable], ACHuffmanTables: Array[JPEGHuffmanTable]): Unit = ???

    /** Tells the writer to generate optimized Huffman tables
     *  for the image as part of the writing process.
     */
    @stub
    def setOptimizeHuffmanTables(optimize: Boolean): Unit = ???

    /** Removes any previous compression quality setting. */
    @stub
    def unsetCompression(): Unit = ???
}
