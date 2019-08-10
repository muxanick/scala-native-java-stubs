package javax.imageio.spi

import java.io.File
import java.lang.{Class, Object, String}
import javax.imageio.stream.ImageInputStream
import scala.scalanative.annotation.stub

/** The service provider interface (SPI) for
 *  ImageInputStreams.  For more information on service
 *  provider interfaces, see the class comment for the
 *  IIORegistry class.
 * 
 *   This interface allows arbitrary objects to be "wrapped" by
 *  instances of ImageInputStream.  For example,
 *  a particular ImageInputStreamSpi might allow
 *  a generic InputStream to be used as an input source;
 *  another might take input from a URL.
 * 
 *   By treating the creation of ImageInputStreams as a
 *  pluggable service, it becomes possible to handle future input
 *  sources without changing the API.  Also, high-performance
 *  implementations of ImageInputStream (for example,
 *  native implementations for a particular platform) can be installed
 *  and used transparently by applications.
 */
abstract class ImageInputStreamSpi extends IIOServiceProvider {

    /** Constructs a blank ImageInputStreamSpi. */
    @stub
    protected def this() = ???

    /** Constructs an ImageInputStreamSpi with a given set
     *  of values.
     */
    @stub
    def this(vendorName: String, version: String, inputClass: Class[_]) = ???

    /** A Class object indicating the legal object type
     *  for use by the createInputStreamInstance method.
     */
    protected val inputClass: Class[_]

    /** Returns true if the ImageInputStream
     *  implementation associated with this service provider can
     *  optionally make use of a cache file for improved performance
     *  and/or memory footrprint.
     */
    def canUseCacheFile(): Boolean

    /** Returns an instance of the ImageInputStream
     *  implementation associated with this service provider.
     */
    def createInputStreamInstance(input: Any): ImageInputStream

    /** Returns an instance of the ImageInputStream
     *  implementation associated with this service provider.
     */
    def createInputStreamInstance(input: Any, useCache: Boolean, cacheDir: File): ImageInputStream

    /** Returns a Class object representing the class or
     *  interface type that must be implemented by an input source in
     *  order to be "wrapped" in an ImageInputStream via
     *  the createInputStreamInstance method.
     */
    def getInputClass(): Class[_]

    /** Returns true if the ImageInputStream
     *  implementation associated with this service provider requires
     *  the use of a cache File.
     */
    def needsCacheFile(): Boolean
}
