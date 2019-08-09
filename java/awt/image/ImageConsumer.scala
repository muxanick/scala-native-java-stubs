package java.awt.image

import java.util.Hashtable
import scala.scalanative.annotation.stub

/** The interface for objects expressing interest in image data through
 *  the ImageProducer interfaces.  When a consumer is added to an image
 *  producer, the producer delivers all of the data about the image
 *  using the method calls defined in this interface.
 */
trait ImageConsumer {

    /** The imageComplete method is called when the ImageProducer is
     *  finished delivering all of the pixels that the source image
     *  contains, or when a single frame of a multi-frame animation has
     *  been completed, or when an error in loading or producing the
     *  image has occurred.
     */
    @stub
    def imageComplete(status: Int): Unit = ???

    /** Sets the ColorModel object used for the majority of
     *  the pixels reported using the setPixels method
     *  calls.
     */
    @stub
    def setColorModel(model: ColorModel): Unit = ???

    /** The dimensions of the source image are reported using the
     *  setDimensions method call.
     */
    @stub
    def setDimensions(width: Int, height: Int): Unit = ???

    /** Sets the hints that the ImageConsumer uses to process the
     *  pixels delivered by the ImageProducer.
     */
    @stub
    def setHints(hintflags: Int): Unit = ???

    /** Delivers the pixels of the image with one or more calls
     *  to this method.
     */
    @stub
    def setPixels(x: Int, y: Int, w: Int, h: Int, model: ColorModel, pixels: Array[Byte], off: Int, scansize: Int): Unit = ???

    /** The pixels of the image are delivered using one or more calls
     *  to the setPixels method.
     */
    @stub
    def setPixels(x: Int, y: Int, w: Int, h: Int, model: ColorModel, pixels: Array[Int], off: Int, scansize: Int): Unit = ???

    /** Sets the extensible list of properties associated with this image. */
    @stub
    def setProperties(props: Hashtable[_, _]): Unit = ???
}

object ImageConsumer {
    /** The pixels will be delivered in (multiples of) complete scanlines
     *  at a time.
     */
    @stub
    val COMPLETESCANLINES: Int = ???

    /** The image creation process was deliberately aborted. */
    @stub
    val IMAGEABORTED: Int = ???

    /** An error was encountered while producing the image. */
    @stub
    val IMAGEERROR: Int = ???

    /** The pixels will be delivered in a random order. */
    @stub
    val RANDOMPIXELORDER: Int = ???

    /** The image contain a single static image. */
    @stub
    val SINGLEFRAME: Int = ???

    /** One frame of the image is complete but there are more frames
     *  to be delivered.
     */
    @stub
    val SINGLEFRAMEDONE: Int = ???

    /** The pixels will be delivered in a single pass. */
    @stub
    val SINGLEPASS: Int = ???

    /** The image is complete and there are no more pixels or frames
     *  to be delivered.
     */
    @stub
    val STATICIMAGEDONE: Int = ???

    /** The pixels will be delivered in top-down, left-to-right order. */
    @stub
    val TOPDOWNLEFTRIGHT: Int = ???
}
