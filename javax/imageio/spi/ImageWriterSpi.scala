package javax.imageio.spi

import java.awt.image.RenderedImage
import java.lang.{Class, Object, String}
import javax.imageio.{ImageTypeSpecifier, ImageWriter}

// The service provider interface (SPI) for ImageWriters.
// For more information on service provider classes, see the class comment
// for the IIORegistry class.
//
//  Each ImageWriterSpi provides several types of information
// about the ImageWriter class with which it is associated.
//
//  The name of the vendor who defined the SPI class and a
// brief description of the class are available via the
// getVendorName, getDescription,
// and getVersion methods.
// These methods may be internationalized to provide locale-specific
// output.  These methods are intended mainly to provide short,
// human-writable information that might be used to organize a pop-up
// menu or other list.
//
//  Lists of format names, file suffixes, and MIME types associated
// with the service may be obtained by means of the
// getFormatNames, getFileSuffixes, and
// getMIMEType methods.  These methods may be used to
// identify candidate ImageWriters for writing a
// particular file or stream based on manual format selection, file
// naming, or MIME associations.
//
//  A more reliable way to determine which ImageWriters
// are likely to be able to parse a particular data stream is provided
// by the canEncodeImage method.  This methods allows the
// service provider to inspect the actual image contents.
//
//  Finally, an instance of the ImageWriter class
// associated with this service provider may be obtained by calling
// the createWriterInstance method.  Any heavyweight
// initialization, such as the loading of native libraries or creation
// of large tables, should be deferred at least until the first
// invocation of this method.
abstract class ImageWriterSpi extends ImageReaderWriterSpi {

    @stub
    // Constructs a blank ImageWriterSpi.
    protected def this() = ???

    // An array of Class objects to be returned from
    // getOutputTypes, initially null.
    protected def outputTypes: Array[Class]

    // An array of strings to be returned from
    // getImageReaderSpiNames, initially
    // null.
    protected def readerSpiNames: Array[String]

    // Returns true if the ImageWriter
    // implementation associated with this service provider is able to
    // encode an image with the given layout.
    def canEncodeImage(type: ImageTypeSpecifier): Boolean

    // Returns true if the ImageWriter
    // implementation associated with this service provider is able to
    // encode the given RenderedImage instance.
    def canEncodeImage(im: RenderedImage): Boolean

    // Returns an instance of the ImageWriter
    // implementation associated with this service provider.
    def createWriterInstance(): ImageWriter

    // Returns an instance of the ImageWriter
    // implementation associated with this service provider.
    def createWriterInstance(extension: Object): ImageWriter

    // Returns an array of Strings containing all the
    // fully qualified names of all the ImageReaderSpi
    // classes that can understand the internal metadata
    // representation used by the ImageWriter associated
    // with this service provider, or null if there are
    // no such ImageReaders specified.
    def getImageReaderSpiNames(): Array[String]

    // Returns an array of Class objects indicating what
    // types of objects may be used as arguments to the writer's
    // setOutput method.
    def getOutputTypes(): Array[Class]

    // Returns true if the format that this writer
    // outputs preserves pixel data bit-accurately.
    def isFormatLossless(): Boolean
}
