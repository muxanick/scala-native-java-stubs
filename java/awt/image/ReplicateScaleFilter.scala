package java.awt.image

import java.lang.Object

/** An ImageFilter class for scaling images using the simplest algorithm.
 *  This class extends the basic ImageFilter Class to scale an existing
 *  image and provide a source for a new image containing the resampled
 *  image.  The pixels in the source image are sampled to produce pixels
 *  for an image of the specified size by replicating rows and columns of
 *  pixels to scale up or omitting rows and columns of pixels to scale
 *  down.
 *  It is meant to be used in conjunction with a FilteredImageSource
 *  object to produce scaled versions of existing images.  Due to
 *  implementation dependencies, there may be differences in pixel values
 *  of an image filtered on different platforms.
 */
class ReplicateScaleFilter extends ImageFilter {

    /** The target height to scale the image. */
    @stub
    protected val destHeight: Int = ???

    /** The target width to scale the image. */
    @stub
    protected val destWidth: Int = ???

    /** A byte array initialized with a size of
     *  destWidth and used to deliver a row of pixel
     *  data to the ImageConsumer.
     */
    @stub
    protected val outpixbuf: Object = ???

    /** An int array containing information about a
     *  column of pixels.
     */
    @stub
    protected val srccols: Array[Int] = ???

    /** The height of the source image. */
    @stub
    protected val srcHeight: Int = ???

    /** An int array containing information about a
     *  row of pixels.
     */
    @stub
    protected val srcrows: Array[Int] = ???

    /** Override the dimensions of the source image and pass the dimensions
     *  of the new scaled size to the ImageConsumer.
     */
    @stub
    def setDimensions(w: Int, h: Int): Unit = ???

    /** Choose which rows and columns of the delivered byte pixels are
     *  needed for the destination scaled image and pass through just
     *  those rows and columns that are needed, replicated as necessary.
     */
    @stub
    def setPixels(x: Int, y: Int, w: Int, h: Int, model: ColorModel, pixels: Array[Byte], off: Int, scansize: Int): Unit = ???

    /** Choose which rows and columns of the delivered int pixels are
     *  needed for the destination scaled image and pass through just
     *  those rows and columns that are needed, replicated as necessary.
     */
    @stub
    def setPixels(x: Int, y: Int, w: Int, h: Int, model: ColorModel, pixels: Array[Int], off: Int, scansize: Int): Unit = ???
}
