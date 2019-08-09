package javax.imageio

import java.awt.image.{BufferedImage, RenderedImage}
import java.io.{File, InputStream}
import java.lang.{Object, String}
import java.net.URL
import java.util.Iterator
import javax.imageio.stream.{ImageInputStream, ImageOutputStream}

// A class containing static convenience methods for locating
// ImageReaders and ImageWriters, and
// performing simple encoding and decoding.
final class ImageIO extends Object {
}

object ImageIO {
    @stub
    // Returns an ImageInputStream that will take its
    // input from the given Object.
    def createImageInputStream(input: Object): ImageInputStream = ???

    @stub
    // Returns an ImageOutputStream that will send its
    // output to the given Object.
    def createImageOutputStream(output: Object): ImageOutputStream = ???

    @stub
    // Returns the current value set by
    // setCacheDirectory, or null if no
    // explicit setting has been made.
    def getCacheDirectory(): File = ???

    @stub
    // Returns an ImageReadercorresponding to the given
    // ImageWriter, if there is one, or null
    // if the plug-in for this ImageWriter does not
    // specify a corresponding ImageReader, or if the
    // given ImageWriter is not registered.
    def getImageReader(writer: ImageWriter): ImageReader = ???

    @stub
    // Returns an Iterator containing all currently
    // registered ImageReaders that claim to be able to
    // decode the supplied Object, typically an
    // ImageInputStream.
    def getImageReaders(input: Object): Iterator[ImageReader] = ???

    @stub
    // Returns an Iterator containing all currently
    // registered ImageReaders that claim to be able to
    // decode the named format.
    def getImageReadersByFormatName(formatName: String): Iterator[ImageReader] = ???

    @stub
    // Returns an Iterator containing all currently
    // registered ImageReaders that claim to be able to
    // decode files with the given MIME type.
    def getImageReadersByMIMEType(MIMEType: String): Iterator[ImageReader] = ???

    @stub
    // Returns an Iterator containing all currently
    // registered ImageReaders that claim to be able to
    // decode files with the given suffix.
    def getImageReadersBySuffix(fileSuffix: String): Iterator[ImageReader] = ???

    @stub
    // Returns an Iterator containing all currently
    // registered ImageTranscoders that claim to be
    // able to transcode between the metadata of the given
    // ImageReader and ImageWriter.
    def getImageTranscoders(reader: ImageReader, writer: ImageWriter): Iterator[ImageTranscoder] = ???

    @stub
    // Returns an ImageWritercorresponding to the given
    // ImageReader, if there is one, or null
    // if the plug-in for this ImageReader does not
    // specify a corresponding ImageWriter, or if the
    // given ImageReader is not registered.
    def getImageWriter(reader: ImageReader): ImageWriter = ???

    @stub
    // Returns an Iterator containing all currently
    // registered ImageWriters that claim to be able to
    // encode images of the given layout (specified using an
    // ImageTypeSpecifier) in the given format.
    def getImageWriters(type: ImageTypeSpecifier, formatName: String): Iterator[ImageWriter] = ???

    @stub
    // Returns an Iterator containing all currently
    // registered ImageWriters that claim to be able to
    // encode the named format.
    def getImageWritersByFormatName(formatName: String): Iterator[ImageWriter] = ???

    @stub
    // Returns an Iterator containing all currently
    // registered ImageWriters that claim to be able to
    // encode files with the given MIME type.
    def getImageWritersByMIMEType(MIMEType: String): Iterator[ImageWriter] = ???

    @stub
    // Returns an Iterator containing all currently
    // registered ImageWriters that claim to be able to
    // encode files with the given suffix.
    def getImageWritersBySuffix(fileSuffix: String): Iterator[ImageWriter] = ???

    @stub
    // Returns an array of Strings listing all of the
    // file suffixes associated with the formats understood
    // by the current set of registered readers.
    def getReaderFileSuffixes(): Array[String] = ???

    @stub
    // Returns an array of Strings listing all of the
    // informal format names understood by the current set of registered
    // readers.
    def getReaderFormatNames(): Array[String] = ???

    @stub
    // Returns an array of Strings listing all of the
    // MIME types understood by the current set of registered
    // readers.
    def getReaderMIMETypes(): Array[String] = ???

    @stub
    // Returns the current value set by setUseCache, or
    // true if no explicit setting has been made.
    def getUseCache(): Boolean = ???

    @stub
    // Returns an array of Strings listing all of the
    // file suffixes associated with the formats understood
    // by the current set of registered writers.
    def getWriterFileSuffixes(): Array[String] = ???

    @stub
    // Returns an array of Strings listing all of the
    // informal format names understood by the current set of registered
    // writers.
    def getWriterFormatNames(): Array[String] = ???

    @stub
    // Returns an array of Strings listing all of the
    // MIME types understood by the current set of registered
    // writers.
    def getWriterMIMETypes(): Array[String] = ???

    @stub
    // Returns a BufferedImage as the result of decoding
    // a supplied File with an ImageReader
    // chosen automatically from among those currently registered.
    def read(input: File): BufferedImage = ???

    @stub
    // Returns a BufferedImage as the result of decoding
    // a supplied ImageInputStream with an
    // ImageReader chosen automatically from among those
    // currently registered.
    def read(stream: ImageInputStream): BufferedImage = ???

    @stub
    // Returns a BufferedImage as the result of decoding
    // a supplied InputStream with an ImageReader
    // chosen automatically from among those currently registered.
    def read(input: InputStream): BufferedImage = ???

    @stub
    // Returns a BufferedImage as the result of decoding
    // a supplied URL with an ImageReader
    // chosen automatically from among those currently registered.
    def read(input: URL): BufferedImage = ???

    @stub
    // Scans for plug-ins on the application class path,
    // loads their service provider classes, and registers a service
    // provider instance for each one found with the
    // IIORegistry.
    def scanForPlugins(): Unit = ???

    @stub
    // Sets the directory where cache files are to be created.
    def setCacheDirectory(cacheDirectory: File): Unit = ???

    @stub
    // Sets a flag indicating whether a disk-based cache file should
    // be used when creating ImageInputStreams and
    // ImageOutputStreams.
    def setUseCache(useCache: Boolean): Unit = ???

    @stub
    // Writes an image using an arbitrary ImageWriter
    // that supports the given format to a File.
    def write(im: RenderedImage, formatName: String, output: File): Boolean = ???

    @stub
    // Writes an image using the an arbitrary ImageWriter
    // that supports the given format to an
    // ImageOutputStream.
    def write(im: RenderedImage, formatName: String, output: ImageOutputStream): Boolean = ???
}
