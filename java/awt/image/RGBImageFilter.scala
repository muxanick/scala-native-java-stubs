package java.awt.image

import java.lang.Object
import scala.scalanative.annotation.stub

/** This class provides an easy way to create an ImageFilter which modifies
 *  the pixels of an image in the default RGB ColorModel.  It is meant to
 *  be used in conjunction with a FilteredImageSource object to produce
 *  filtered versions of existing images.  It is an abstract class that
 *  provides the calls needed to channel all of the pixel data through a
 *  single method which converts pixels one at a time in the default RGB
 *  ColorModel regardless of the ColorModel being used by the ImageProducer.
 *  The only method which needs to be defined to create a useable image
 *  filter is the filterRGB method.  Here is an example of a definition
 *  of a filter which swaps the red and blue components of an image:
 *  
 * 
 *       class RedBlueSwapFilter extends RGBImageFilter {
 *           public RedBlueSwapFilter() {
 *               // The filter's operation does not depend on the
 *               // pixel's location, so IndexColorModels can be
 *               // filtered directly.
 *               canFilterIndexColorModel = true;
 *           }
 * 
 *           public int filterRGB(int x, int y, int rgb) {
 *               return ((rgb & 0xff00ff00)
 *                       | ((rgb & 0xff0000) >> 16)
 *                       | ((rgb & 0xff) << 16));
 *           }
 *       }
 * 
 *  
 */
abstract class RGBImageFilter extends ImageFilter {

    /**  */
    @stub
    def this() = ???

    /** This boolean indicates whether or not it is acceptable to apply
     *  the color filtering of the filterRGB method to the color table
     *  entries of an IndexColorModel object in lieu of pixel by pixel
     *  filtering.
     */
    protected val canFilterIndexColorModel: Boolean

    /** The ColorModel with which to
     *  replace origmodel when the user calls
     *  substituteColorModel.
     */
    protected val newmodel: ColorModel

    /** The ColorModel to be replaced by
     *  newmodel when the user calls
     *  substituteColorModel.
     */
    protected val origmodel: ColorModel

    /** Filters an IndexColorModel object by running each entry in its
     *  color tables through the filterRGB function that RGBImageFilter
     *  subclasses must provide.
     */
    def filterIndexColorModel(icm: IndexColorModel): IndexColorModel

    /** Subclasses must specify a method to convert a single input pixel
     *  in the default RGB ColorModel to a single output pixel.
     */
    def filterRGB(x: Int, y: Int, rgb: Int): Int

    /** Filters a buffer of pixels in the default RGB ColorModel by passing
     *  them one by one through the filterRGB method.
     */
    def filterRGBPixels(x: Int, y: Int, w: Int, h: Int, pixels: Array[Int], off: Int, scansize: Int): Unit

    /** If the ColorModel is an IndexColorModel and the subclass has
     *  set the canFilterIndexColorModel flag to true, we substitute
     *  a filtered version of the color model here and wherever
     *  that original ColorModel object appears in the setPixels methods.
     */
    def setColorModel(model: ColorModel): Unit

    /** If the ColorModel object is the same one that has already
     *  been converted, then simply passes the pixels through with the
     *  converted ColorModel.
     */
    def setPixels(x: Int, y: Int, w: Int, h: Int, model: ColorModel, pixels: Array[Byte], off: Int, scansize: Int): Unit

    /** If the ColorModel object is the same one that has already
     *  been converted, then simply passes the pixels through with the
     *  converted ColorModel, otherwise converts the buffer of integer
     *  pixels to the default RGB ColorModel and passes the converted
     *  buffer to the filterRGBPixels method to be converted one by one.
     */
    def setPixels(x: Int, y: Int, w: Int, h: Int, model: ColorModel, pixels: Array[Int], off: Int, scansize: Int): Unit

    /** Registers two ColorModel objects for substitution. */
    def substituteColorModel(oldcm: ColorModel, newcm: ColorModel): Unit
}
