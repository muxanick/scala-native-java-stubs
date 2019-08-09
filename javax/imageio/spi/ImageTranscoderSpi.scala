package javax.imageio.spi

import java.lang.{Object, String}
import javax.imageio.ImageTranscoder
import scala.scalanative.annotation.stub

/** The service provider interface (SPI) for ImageTranscoders.
 *  For more information on service provider classes, see the class comment
 *  for the IIORegistry class.
 */
abstract class ImageTranscoderSpi extends IIOServiceProvider {

    /** Constructs a blank ImageTranscoderSpi. */
    @stub
    protected def this() = ???

    /** Constructs an ImageTranscoderSpi with a given set
     *  of values.
     */
    @stub
    def this(vendorName: String, version: String) = ???

    /** Returns an instance of the ImageTranscoder
     *  implementation associated with this service provider.
     */
    def createTranscoderInstance(): ImageTranscoder

    /** Returns the fully qualified class name of an
     *  ImageReaderSpi class that generates
     *  IIOMetadata objects that may be used as input to
     *  this transcoder.
     */
    def getReaderServiceProviderName(): String

    /** Returns the fully qualified class name of an
     *  ImageWriterSpi class that generates
     *  IIOMetadata objects that may be used as input to
     *  this transcoder.
     */
    def getWriterServiceProviderName(): String
}
