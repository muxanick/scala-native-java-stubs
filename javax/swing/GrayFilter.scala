package javax.swing

import java.awt.Image
import java.awt.image.{ImageFilter, RGBImageFilter}
import java.lang.Object
import scala.scalanative.annotation.stub

/** An image filter that "disables" an image by turning
 *  it into a grayscale image, and brightening the pixels
 *  in the image. Used by buttons to create an image for
 *  a disabled button.
 */
class GrayFilter extends RGBImageFilter {

    /** Constructs a GrayFilter object that filters a color image to a
     *  grayscale image.
     */
    @stub
    def this(b: Boolean, p: Int) = ???

    /** Overrides RGBImageFilter.filterRGB. */
    @stub
    def filterRGB(x: Int, y: Int, rgb: Int): Int = ???
}

object GrayFilter {
    /** Creates a disabled image */
    @stub
    def createDisabledImage(i: Image): Image = ???
}
