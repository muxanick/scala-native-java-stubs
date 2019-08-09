package javax.imageio

import java.awt.image.{BufferedImage, RenderedImage}
import java.io.{File, InputStream}
import java.lang.{Object, String}
import java.net.URL
import java.util.Iterator
import javax.imageio.stream.{ImageInputStream, ImageOutputStream}

/** A class containing static convenience methods for locating
 *  ImageReaders and ImageWriters, and
 *  performing simple encoding and decoding.
 */
final class ImageIO extends Object {
}

object ImageIO {
    /** Returns an ImageInputStream that will take its
     *  input from the given Object.
     */
    @stub
    def createImageInputStream(input: Object): ImageInputStream = ???

    /** Returns an ImageOutputStream that will send its
     *  output to the given Object.
     */
    @stub
    def createImageOutputStream(output: Object): ImageOutputStream = ???

    /** Returns the current value set by
     *  setCacheDirectory, or null if no
     *  explicit setting has been made.
     */
    @stub
    def getCacheDirectory(): File = ???

    /** Returns an ImageReadercorresponding to the given
     *  ImageWriter, if there is one, or null
     *  if the plug-in for this ImageWriter does not
     *  specify a corresponding ImageReader, or if the
     *  given ImageWriter is not registered.
     */
    @stub
    def getImageReader(writer: ImageWriter): ImageReader = ???

    /** Returns an Iterator containing all currently
     *  registered ImageReaders that claim to be able to
     *  decode the supplied Object, typically an
     *  ImageInputStream.
     */
    @stub
    def getImageReaders(input: Object): Iterator[ImageReader] = ???

    /** Returns an Iterator containing all currently
     *  registered ImageReaders that claim to be able to
     *  decode the named format.
     */
    @stub
    def getImageReadersByFormatName(formatName: String): Iterator[ImageReader] = ???

    /** Returns an Iterator containing all currently
     *  registered ImageReaders that claim to be able to
     *  decode files with the given MIME type.
     */
    @stub
    def getImageReadersByMIMEType(MIMEType: String): Iterator[ImageReader] = ???

    /** Returns an Iterator containing all currently
     *  registered ImageReaders that claim to be able to
     *  decode files with the given suffix.
     */
    @stub
    def getImageReadersBySuffix(fileSuffix: String): Iterator[ImageReader] = ???

    /** Returns an Iterator containing all currently
     *  registered ImageTranscoders that claim to be
     *  able to transcode between the metadata of the given
     *  ImageReader and ImageWriter.
     */
    @stub
    def getImageTranscoders(reader: ImageReader, writer: ImageWriter): Iterator[ImageTranscoder] = ???

    /** Returns an ImageWritercorresponding to the given
     *  ImageReader, if there is one, or null
     *  if the plug-in for this ImageReader does not
     *  specify a corresponding ImageWriter, or if the
     *  given ImageReader is not registered.
     */
    @stub
    def getImageWriter(reader: ImageReader): ImageWriter = ???

    /** Returns an Iterator containing all currently
     *  registered ImageWriters that claim to be able to
     *  encode images of the given layout (specified using an
     *  ImageTypeSpecifier) in the given format.
     */
    @stub
    def getImageWriters(type: ImageTypeSpecifier, formatName: String): Iterator[ImageWriter] = ???

    /** Returns an Iterator containing all currently
     *  registered ImageWriters that claim to be able to
     *  encode the named format.
     */
    @stub
    def getImageWritersByFormatName(formatName: String): Iterator[ImageWriter] = ???

    /** Returns an Iterator containing all currently
     *  registered ImageWriters that claim to be able to
     *  encode files with the given MIME type.
     */
    @stub
    def getImageWritersByMIMEType(MIMEType: String): Iterator[ImageWriter] = ???

    /** Returns an Iterator containing all currently
     *  registered ImageWriters that claim to be able to
     *  encode files with the given suffix.
     */
    @stub
    def getImageWritersBySuffix(fileSuffix: String): Iterator[ImageWriter] = ???

    /** Returns an array of Strings listing all of the
     *  file suffixes associated with the formats understood
     *  by the current set of registered readers.
     */
    @stub
    def getReaderFileSuffixes(): Array[String] = ???

    /** Returns an array of Strings listing all of the
     *  informal format names understood by the current set of registered
     *  readers.
     */
    @stub
    def getReaderFormatNames(): Array[String] = ???

    /** Returns an array of Strings listing all of the
     *  MIME types understood by the current set of registered
     *  readers.
     */
    @stub
    def getReaderMIMETypes(): Array[String] = ???

    /** Returns the current value set by setUseCache, or
     *  true if no explicit setting has been made.
     */
    @stub
    def getUseCache(): Boolean = ???

    /** Returns an array of Strings listing all of the
     *  file suffixes associated with the formats understood
     *  by the current set of registered writers.
     */
    @stub
    def getWriterFileSuffixes(): Array[String] = ???

    /** Returns an array of Strings listing all of the
     *  informal format names understood by the current set of registered
     *  writers.
     */
    @stub
    def getWriterFormatNames(): Array[String] = ???

    /** Returns an array of Strings listing all of the
     *  MIME types understood by the current set of registered
     *  writers.
     */
    @stub
    def getWriterMIMETypes(): Array[String] = ???

    /** Returns a BufferedImage as the result of decoding
     *  a supplied File with an ImageReader
     *  chosen automatically from among those currently registered.
     */
    @stub
    def read(input: File): BufferedImage = ???

    /** Returns a BufferedImage as the result of decoding
     *  a supplied ImageInputStream with an
     *  ImageReader chosen automatically from among those
     *  currently registered.
     */
    @stub
    def read(stream: ImageInputStream): BufferedImage = ???

    /** Returns a BufferedImage as the result of decoding
     *  a supplied InputStream with an ImageReader
     *  chosen automatically from among those currently registered.
     */
    @stub
    def read(input: InputStream): BufferedImage = ???

    /** Returns a BufferedImage as the result of decoding
     *  a supplied URL with an ImageReader
     *  chosen automatically from among those currently registered.
     */
    @stub
    def read(input: URL): BufferedImage = ???

    /** Scans for plug-ins on the application class path,
     *  loads their service provider classes, and registers a service
     *  provider instance for each one found with the
     *  IIORegistry.
     */
    @stub
    def scanForPlugins(): Unit = ???

    /** Sets the directory where cache files are to be created. */
    @stub
    def setCacheDirectory(cacheDirectory: File): Unit = ???

    /** Sets a flag indicating whether a disk-based cache file should
     *  be used when creating ImageInputStreams and
     *  ImageOutputStreams.
     */
    @stub
    def setUseCache(useCache: Boolean): Unit = ???

    /** Writes an image using an arbitrary ImageWriter
     *  that supports the given format to a File.
     */
    @stub
    def write(im: RenderedImage, formatName: String, output: File): Boolean = ???

    /** Writes an image using the an arbitrary ImageWriter
     *  that supports the given format to an
     *  ImageOutputStream.
     */
    @stub
    def write(im: RenderedImage, formatName: String, output: ImageOutputStream): Boolean = ???
}
