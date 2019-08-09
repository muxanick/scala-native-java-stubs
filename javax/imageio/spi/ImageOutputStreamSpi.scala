package javax.imageio.spi

import java.io.File
import java.lang.{Class, Object}
import javax.imageio.stream.ImageOutputStream

// The service provider interface (SPI) for
// ImageOutputStreams.  For more information on service
// provider interfaces, see the class comment for the
// IIORegistry class.
//
//  This interface allows arbitrary objects to be "wrapped" by
// instances of ImageOutputStream.  For example, a
// particular ImageOutputStreamSpi might allow a generic
// OutputStream to be used as a destination; another
// might output to a File or to a device such as a serial
// port.
//
//  By treating the creation of ImageOutputStreams as
// a pluggable service, it becomes possible to handle future output
// destinations without changing the API.  Also, high-performance
// implementations of ImageOutputStream (for example,
// native implementations for a particular platform) can be installed
// and used transparently by applications.
abstract class ImageOutputStreamSpi extends IIOServiceProvider {

    @stub
    // Constructs a blank ImageOutputStreamSpi.
    protected def this() = ???

    // Returns true if the ImageOutputStream
    // implementation associated with this service provider can
    // optionally make use of a cache File for improved
    // performance and/or memory footrprint.
    def canUseCacheFile(): Boolean

    // Returns an instance of the ImageOutputStream
    // implementation associated with this service provider.
    def createOutputStreamInstance(output: Object): ImageOutputStream

    // Returns an instance of the ImageOutputStream
    // implementation associated with this service provider.
    def createOutputStreamInstance(output: Object, useCache: Boolean, cacheDir: File): ImageOutputStream

    // Returns a Class object representing the class or
    // interface type that must be implemented by an output
    // destination in order to be "wrapped" in an
    // ImageOutputStream via the
    // createOutputStreamInstance method.
    def getOutputClass(): Class[_]
}
