package java.awt.image

import java.lang.{Cloneable, Object}
import scala.scalanative.annotation.stub

/** The BufferedImageFilter class subclasses an
 *  ImageFilter to provide a simple means of
 *  using a single-source/single-destination image operator
 *  (BufferedImageOp) to filter a BufferedImage
 *  in the Image Producer/Consumer/Observer
 *  paradigm. Examples of these image operators are: ConvolveOp,
 *  AffineTransformOp and LookupOp.
 */
class BufferedImageFilter extends ImageFilter with Cloneable {

    /** Constructs a BufferedImageFilter with the
     *  specified single-source/single-destination operator.
     */
    @stub
    def this(op: BufferedImageOp) = ???

    /** Returns the BufferedImageOp. */
    @stub
    def getBufferedImageOp(): BufferedImageOp = ???

    /** Filters the information provided in the imageComplete
     *  method of the ImageConsumer interface.
     */
    @stub
    def imageComplete(status: Int): Unit = ???

    /** Filters the information provided in the
     *  setColorModel method
     *  of the ImageConsumer interface.
     */
    @stub
    def setColorModel(model: ColorModel): Unit = ???

    /** Filters the information provided in the
     *  setDimensions  method
     *  of the ImageConsumer interface.
     */
    @stub
    def setDimensions(width: Int, height: Int): Unit = ???

    /** Filters the information provided in the setPixels
     *  method of the ImageConsumer interface which takes
     *  an array of bytes.
     */
    @stub
    def setPixels(x: Int, y: Int, w: Int, h: Int, model: ColorModel, pixels: Array[Byte], off: Int, scansize: Int): Unit = ???

    /** Filters the information provided in the setPixels
     *  method of the ImageConsumer interface which takes
     *  an array of integers.
     */
    @stub
    def setPixels(x: Int, y: Int, w: Int, h: Int, model: ColorModel, pixels: Array[Int], off: Int, scansize: Int): Unit = ???
}
