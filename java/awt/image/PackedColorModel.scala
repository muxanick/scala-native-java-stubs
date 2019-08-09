package java.awt.image

import java.awt.color.ColorSpace
import java.lang.Object
import scala.scalanative.annotation.stub

/** The PackedColorModel class is an abstract
 *  ColorModel class that works with pixel values which represent
 *  color and alpha information as separate samples and which pack all
 *  samples for a single pixel into a single int, short, or byte quantity.
 *  This class can be used with an arbitrary ColorSpace.  The number of
 *  color samples in the pixel values must be the same as the number of color
 *  components in the ColorSpace.  There can be a single alpha
 *  sample.  The array length is always 1 for those methods that use a
 *  primitive array pixel representation of type transferType.
 *  The transfer types supported are DataBuffer.TYPE_BYTE,
 *  DataBuffer.TYPE_USHORT, and DataBuffer.TYPE_INT.
 *  Color and alpha samples are stored in the single element of the array
 *  in bits indicated by bit masks.  Each bit mask must be contiguous and
 *  masks must not overlap.  The same masks apply to the single int
 *  pixel representation used by other methods.  The correspondence of
 *  masks and color/alpha samples is as follows:
 *  
 *   Masks are identified by indices running from 0 through
 *  getNumComponents - 1.
 *   The first
 *  getNumColorComponents
 *  indices refer to color samples.
 *   If an alpha sample is present, it corresponds the last index.
 *   The order of the color indices is specified
 *  by the ColorSpace.  Typically, this reflects the name of
 *  the color space type (for example, TYPE_RGB), index 0
 *  corresponds to red, index 1 to green, and index 2 to blue.
 *  
 *  
 *  The translation from pixel values to color/alpha components for
 *  display or processing purposes is a one-to-one correspondence of
 *  samples to components.
 *  A PackedColorModel is typically used with image data
 *  that uses masks to define packed samples.  For example, a
 *  PackedColorModel can be used in conjunction with a
 *  SinglePixelPackedSampleModel to construct a
 *  BufferedImage.  Normally the masks used by the
 *  SampleModel and the ColorModel would be the same.
 *  However, if they are different, the color interpretation of pixel data is
 *  done according to the masks of the ColorModel.
 *  
 *  A single int pixel representation is valid for all objects
 *  of this class since it is always possible to represent pixel values
 *  used with this class in a single int.  Therefore, methods
 *  that use this representation do not throw an
 *  IllegalArgumentException due to an invalid pixel value.
 *  
 *  A subclass of PackedColorModel is DirectColorModel,
 *  which is similar to an X11 TrueColor visual.
 */
abstract class PackedColorModel extends ColorModel {

    /** Constructs a PackedColorModel from a color mask array,
     *  which specifies which bits in an int pixel representation
     *  contain each of the color samples, and an alpha mask.
     */
    @stub
    def this(space: ColorSpace, bits: Int, colorMaskArray: Array[Int], alphaMask: Int, isAlphaPremultiplied: Boolean, trans: Int, transferType: Int) = ???

    /** Constructs a PackedColorModel from the specified
     *  masks which indicate which bits in an int pixel
     *  representation contain the alpha, red, green and blue color samples.
     */
    @stub
    def this(space: ColorSpace, bits: Int, rmask: Int, gmask: Int, bmask: Int, amask: Int, isAlphaPremultiplied: Boolean, trans: Int, transferType: Int) = ???

    /** Creates a SampleModel with the specified width and
     *  height that has a data layout compatible with this
     *  ColorModel.
     */
    def createCompatibleSampleModel(w: Int, h: Int): SampleModel

    /** Tests if the specified Object is an instance
     *  of PackedColorModel and equals this
     *  PackedColorModel.
     */
    def equals(obj: Object): Boolean

    /** Returns a WritableRaster representing the alpha channel of
     *  an image, extracted from the input WritableRaster.
     */
    def getAlphaRaster(raster: WritableRaster): WritableRaster

    /** Returns the mask indicating which bits in a pixel
     *  contain the specified color/alpha sample.
     */
    def getMask(index: Int): Int

    /** Returns a mask array indicating which bits in a pixel
     *  contain the color and alpha samples.
     */
    def getMasks(): Array[Int]

    /** Checks if the specified SampleModel is compatible
     *  with this ColorModel.
     */
    def isCompatibleSampleModel(sm: SampleModel): Boolean
}
