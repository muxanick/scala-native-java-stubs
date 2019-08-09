package java.awt.image

import java.lang.{Cloneable, Object}
import java.util.Hashtable
import scala.scalanative.annotation.stub

/** This class implements a filter for the set of interface methods that
 *  are used to deliver data from an ImageProducer to an ImageConsumer.
 *  It is meant to be used in conjunction with a FilteredImageSource
 *  object to produce filtered versions of existing images.  It is a
 *  base class that provides the calls needed to implement a "Null filter"
 *  which has no effect on the data being passed through.  Filters should
 *  subclass this class and override the methods which deal with the
 *  data that needs to be filtered and modify it as necessary.
 */
class ImageFilter extends Object with ImageConsumer with Cloneable {

    /**  */
    @stub
    def this() = ???

    /** The consumer of the particular image data stream for which this
     *  instance of the ImageFilter is filtering data.
     */
    @stub
    protected val consumer: ImageConsumer = ???

    /** Clones this object. */
    @stub
    def clone(): Object = ???

    /** Returns a unique instance of an ImageFilter object which will
     *  actually perform the filtering for the specified ImageConsumer.
     */
    @stub
    def getFilterInstance(ic: ImageConsumer): ImageFilter = ???

    /** Filters the information provided in the imageComplete method of
     *  the ImageConsumer interface.
     */
    @stub
    def imageComplete(status: Int): Unit = ???

    /** Responds to a request for a TopDownLeftRight (TDLR) ordered resend
     *  of the pixel data from an ImageConsumer.
     */
    @stub
    def resendTopDownLeftRight(ip: ImageProducer): Unit = ???

    /** Filter the information provided in the setColorModel method
     *  of the ImageConsumer interface.
     */
    @stub
    def setColorModel(model: ColorModel): Unit = ???

    /** Filters the information provided in the setDimensions method
     *  of the ImageConsumer interface.
     */
    @stub
    def setDimensions(width: Int, height: Int): Unit = ???

    /** Filters the information provided in the setHints method
     *  of the ImageConsumer interface.
     */
    @stub
    def setHints(hints: Int): Unit = ???

    /** Filters the information provided in the setPixels method of the
     *  ImageConsumer interface which takes an array of bytes.
     */
    @stub
    def setPixels(x: Int, y: Int, w: Int, h: Int, model: ColorModel, pixels: Array[Byte], off: Int, scansize: Int): Unit = ???

    /** Filters the information provided in the setPixels method of the
     *  ImageConsumer interface which takes an array of integers.
     */
    @stub
    def setPixels(x: Int, y: Int, w: Int, h: Int, model: ColorModel, pixels: Array[Int], off: Int, scansize: Int): Unit = ???

    /** Passes the properties from the source object along after adding a
     *  property indicating the stream of filters it has been run through.
     */
    @stub
    def setProperties(props: Hashtable[_, _]): Unit = ???
}
