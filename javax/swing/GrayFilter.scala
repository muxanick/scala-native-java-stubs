package javax.swing

import java.awt.Image
import java.awt.image.{ImageFilter, RGBImageFilter}
import java.lang.Object

/** An image filter that "disables" an image by turning
 *  it into a grayscale image, and brightening the pixels
 *  in the image. Used by buttons to create an image for
 *  a disabled button.
 */
class GrayFilter extends RGBImageFilter {
}

object GrayFilter {
    /** Creates a disabled image */
    @stub
    def createDisabledImage(i: Image): Image = ???
}
