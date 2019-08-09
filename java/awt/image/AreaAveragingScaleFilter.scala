package java.awt.image

import java.lang.Object

/** An ImageFilter class for scaling images using a simple area averaging
 *  algorithm that produces smoother results than the nearest neighbor
 *  algorithm.
 *  This class extends the basic ImageFilter Class to scale an existing
 *  image and provide a source for a new image containing the resampled
 *  image.  The pixels in the source image are blended to produce pixels
 *  for an image of the specified size.  The blending process is analogous
 *  to scaling up the source image to a multiple of the destination size
 *  using pixel replication and then scaling it back down to the destination
 *  size by simply averaging all the pixels in the supersized image that
 *  fall within a given pixel of the destination image.  If the data from
 *  the source is not delivered in TopDownLeftRight order then the filter
 *  will back off to a simple pixel replication behavior and utilize the
 *  requestTopDownLeftRightResend() method to refilter the pixels in a
 *  better way at the end.
 *  It is meant to be used in conjunction with a FilteredImageSource
 *  object to produce scaled versions of existing images.  Due to
 *  implementation dependencies, there may be differences in pixel values
 *  of an image filtered on different platforms.
 */
class AreaAveragingScaleFilter extends ReplicateScaleFilter {

    /** Detect if the data is being delivered with the necessary hints
     *  to allow the averaging algorithm to do its work.
     */
    @stub
    def setHints(hints: Int): Unit = ???

    /** Combine the components for the delivered byte pixels into the
     *  accumulation arrays and send on any averaged data for rows of
     *  pixels that are complete.
     */
    @stub
    def setPixels(x: Int, y: Int, w: Int, h: Int, model: ColorModel, pixels: Array[Byte], off: Int, scansize: Int): Unit = ???
}
