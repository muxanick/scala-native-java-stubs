package javax.imageio.spi

import java.lang.{Class, Object, String}
import javax.imageio.ImageReader
import scala.scalanative.annotation.stub

/** The service provider interface (SPI) for ImageReaders.
 *  For more information on service provider classes, see the class comment
 *  for the IIORegistry class.
 * 
 *   Each ImageReaderSpi provides several types of information
 *  about the ImageReader class with which it is associated.
 * 
 *   The name of the vendor who defined the SPI class and a
 *  brief description of the class are available via the
 *  getVendorName, getDescription,
 *  and getVersion methods.
 *  These methods may be internationalized to provide locale-specific
 *  output.  These methods are intended mainly to provide short,
 *  human-readable information that might be used to organize a pop-up
 *  menu or other list.
 * 
 *   Lists of format names, file suffixes, and MIME types associated
 *  with the service may be obtained by means of the
 *  getFormatNames, getFileSuffixes, and
 *  getMIMETypes methods.  These methods may be used to
 *  identify candidate ImageReaders for decoding a
 *  particular file or stream based on manual format selection, file
 *  naming, or MIME associations (for example, when accessing a file
 *  over HTTP or as an email attachment).
 * 
 *   A more reliable way to determine which ImageReaders
 *  are likely to be able to parse a particular data stream is provided
 *  by the canDecodeInput method.  This methods allows the
 *  service provider to inspect the actual stream contents.
 * 
 *   Finally, an instance of the ImageReader class
 *  associated with this service provider may be obtained by calling
 *  the createReaderInstance method.  Any heavyweight
 *  initialization, such as the loading of native libraries or creation
 *  of large tables, should be deferred at least until the first
 *  invocation of this method.
 */
abstract class ImageReaderSpi extends ImageReaderWriterSpi {

    /** Constructs a blank ImageReaderSpi. */
    @stub
    protected def this() = ???

    /** Constructs an ImageReaderSpi with a given
     *  set of values.
     */
    @stub
    def this(vendorName: String, version: String, names: Array[String], suffixes: Array[String], MIMETypes: Array[String], readerClassName: String, inputTypes: Array[Class], writerSpiNames: Array[String], supportsStandardStreamMetadataFormat: Boolean, nativeStreamMetadataFormatName: String, nativeStreamMetadataFormatClassName: String, extraStreamMetadataFormatNames: Array[String], extraStreamMetadataFormatClassNames: Array[String], supportsStandardImageMetadataFormat: Boolean, nativeImageMetadataFormatName: String, nativeImageMetadataFormatClassName: String, extraImageMetadataFormatNames: Array[String], extraImageMetadataFormatClassNames: Array[String]) = ???

    /** An array of Class objects to be returned from
     *  getInputTypes, initially null.
     */
    protected val inputTypes: Array[Class]

    /** An array of strings to be returned from
     *  getImageWriterSpiNames, initially
     *  null.
     */
    protected val writerSpiNames: Array[String]

    /** Returns true if the supplied source object appears
     *  to be of the format supported by this reader.
     */
    def canDecodeInput(source: Any): Boolean

    /** Returns an instance of the ImageReader
     *  implementation associated with this service provider.
     */
    def createReaderInstance(): ImageReader

    /** Returns an instance of the ImageReader
     *  implementation associated with this service provider.
     */
    def createReaderInstance(extension: Any): ImageReader

    /** Returns an array of Strings containing the fully
     *  qualified names of all the ImageWriterSpi classes
     *  that can understand the internal metadata representation used
     *  by the ImageReader associated with this service
     *  provider, or null if there are no such
     *  ImageWriters specified.
     */
    def getImageWriterSpiNames(): Array[String]

    /** Returns an array of Class objects indicating what
     *  types of objects may be used as arguments to the reader's
     *  setInput method.
     */
    def getInputTypes(): Array[Class]

    /** Returns true if the ImageReader object
     *  passed in is an instance of the ImageReader
     *  associated with this service provider.
     */
    def isOwnReader(reader: ImageReader): Boolean
}

object ImageReaderSpi {
    /** Deprecated. 
     * Instead of using this field, directly create
     *  the equivalent array { ImageInputStream.class }.
     * 
     */
    @stub
    val STANDARD_INPUT_TYPE: Array[Class] = ???
}
