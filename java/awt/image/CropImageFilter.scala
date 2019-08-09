package java.awt.image

import java.lang.Object

/** An ImageFilter class for cropping images.
 *  This class extends the basic ImageFilter Class to extract a given
 *  rectangular region of an existing Image and provide a source for a
 *  new image containing just the extracted region.  It is meant to
 *  be used in conjunction with a FilteredImageSource object to produce
 *  cropped versions of existing images.
 */
class CropImageFilter extends ImageFilter {

    /** Override the source image's dimensions and pass the dimensions
     *  of the rectangular cropped region to the ImageConsumer.
     */
    @stub
    def setDimensions(w: Int, h: Int): Unit = ???

    /** Determine whether the delivered byte pixels intersect the region to
     *  be extracted and passes through only that subset of pixels that
     *  appear in the output region.
     */
    @stub
    def setPixels(x: Int, y: Int, w: Int, h: Int, model: ColorModel, pixels: Array[Byte], off: Int, scansize: Int): Unit = ???

    /** Determine if the delivered int pixels intersect the region to
     *  be extracted and pass through only that subset of pixels that
     *  appear in the output region.
     */
    @stub
    def setPixels(x: Int, y: Int, w: Int, h: Int, model: ColorModel, pixels: Array[Int], off: Int, scansize: Int): Unit = ???
}
