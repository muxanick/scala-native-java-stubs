package java.awt.image

import java.awt.color.ColorSpace
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** The DirectColorModel class is a ColorModel
 *  class that works with pixel values that represent RGB
 *  color and alpha information as separate samples and that pack all
 *  samples for a single pixel into a single int, short, or byte quantity.
 *  This class can be used only with ColorSpaces of type ColorSpace.TYPE_RGB.
 *  In addition, for each component of the ColorSpace, the minimum
 *  normalized component value obtained via the getMinValue()
 *  method of ColorSpace must be 0.0, and the maximum value obtained via
 *  the getMaxValue() method must be 1.0 (these min/max
 *  values are typical for RGB spaces).
 *  There must be three color samples in the pixel values and there can
 *  be a single alpha sample.  For those methods that use a primitive array
 *  pixel representation of type transferType, the array
 *  length is always one.  The transfer
 *  types supported are DataBuffer.TYPE_BYTE,
 *  DataBuffer.TYPE_USHORT, and DataBuffer.TYPE_INT.
 *  Color and alpha samples are stored in the single
 *  element of the array in bits indicated by bit masks.  Each bit mask
 *  must be contiguous and masks must not overlap.  The same masks apply to
 *  the single int pixel representation used by other methods.  The
 *  correspondence of masks and color/alpha samples is as follows:
 *  
 *   Masks are identified by indices running from 0 through 2
 *  if no alpha is present, or 3 if an alpha is present.
 *   The first three indices refer to color samples;
 *  index 0 corresponds to red, index 1 to green, and index 2 to blue.
 *   Index 3 corresponds to the alpha sample, if present.
 *  
 *  
 *  The translation from pixel values to color/alpha components for
 *  display or processing purposes is a one-to-one correspondence of
 *  samples to components.  A DirectColorModel is
 *  typically used with image data which uses masks to define packed
 *  samples.  For example, a DirectColorModel can be used in
 *  conjunction with a SinglePixelPackedSampleModel to
 *  construct a BufferedImage.  Normally the masks used by the
 *  SampleModel and the ColorModel would be the
 *  same.  However, if they are different, the color interpretation
 *  of pixel data will be done according to the masks of the
 *  ColorModel.
 *  
 *  A single int pixel representation is valid for all objects of this
 *  class, since it is always possible to represent pixel values used with
 *  this class in a single int.  Therefore, methods which use this
 *  representation will not throw an IllegalArgumentException
 *  due to an invalid pixel value.
 *  
 *  This color model is similar to an X11 TrueColor visual.
 *  The default RGB ColorModel specified by the
 *  getRGBdefault method is a
 *  DirectColorModel with the following parameters:
 *  
 *  Number of bits:        32
 *  Red mask:              0x00ff0000
 *  Green mask:            0x0000ff00
 *  Blue mask:             0x000000ff
 *  Alpha mask:            0xff000000
 *  Color space:           sRGB
 *  isAlphaPremultiplied:  False
 *  Transparency:          Transparency.TRANSLUCENT
 *  transferType:          DataBuffer.TYPE_INT
 *  
 *  
 *  Many of the methods in this class are final. This is because the
 *  underlying native graphics code makes assumptions about the layout
 *  and operation of this class and those assumptions are reflected in
 *  the implementations of the methods here that are marked final.  You
 *  can subclass this class for other reasons, but you cannot override
 *  or modify the behavior of those methods.
 */
class DirectColorModel extends PackedColorModel {

    /** Constructs a DirectColorModel from the specified
     *  parameters.
     */
    @stub
    def this(space: ColorSpace, bits: Int, rmask: Int, gmask: Int, bmask: Int, amask: Int, isAlphaPremultiplied: Boolean, transferType: Int) = ???

    /** Constructs a DirectColorModel from the specified masks
     *  that indicate which bits in an int pixel representation
     *  contain the red, green and blue color samples.
     */
    @stub
    def this(bits: Int, rmask: Int, gmask: Int, bmask: Int) = ???

    /** Constructs a DirectColorModel from the specified masks
     *  that indicate which bits in an int pixel representation
     *  contain the red, green and blue color samples and the alpha sample,
     *  if present.
     */
    @stub
    def this(bits: Int, rmask: Int, gmask: Int, bmask: Int, amask: Int) = ???

    /** Forces the raster data to match the state specified in the
     *  isAlphaPremultiplied variable, assuming the data is
     *  currently correctly described by this ColorModel.
     */
    @stub
    def coerceData(raster: WritableRaster, isAlphaPremultiplied: Boolean): ColorModel = ???

    /** Creates a WritableRaster with the specified width and
     *  height that has a data layout (SampleModel) compatible
     *  with this ColorModel.
     */
    @stub
    def createCompatibleWritableRaster(w: Int, h: Int): WritableRaster = ???

    /** Returns the alpha component for the specified pixel, scaled
     *  from 0 to 255.
     */
    @stub
    def getAlpha(pixel: Int): Int = ???

    /** Returns the alpha component for the specified pixel, scaled
     *  from 0 to 255.
     */
    @stub
    def getAlpha(inData: Any): Int = ???

    /** Returns the mask indicating which bits in an int pixel
     *  representation contain the alpha component.
     */
    @stub
    def getAlphaMask(): Int = ???

    /** Returns the blue color component for the specified pixel, scaled
     *  from 0 to 255 in the default RGB ColorSpace, sRGB.
     */
    @stub
    def getBlue(pixel: Int): Int = ???

    /** Returns the blue color component for the specified pixel, scaled
     *  from 0 to 255 in the default RGB ColorSpace, sRGB.
     */
    @stub
    def getBlue(inData: Any): Int = ???

    /** Returns the mask indicating which bits in an int pixel
     *  representation contain the blue color component.
     */
    @stub
    def getBlueMask(): Int = ???

    /** Returns an array of unnormalized color/alpha components given a pixel
     *  in this ColorModel.
     */
    @stub
    def getComponents(pixel: Int, components: Array[Int], offset: Int): Array[Int] = ???

    /** Returns an array of unnormalized color/alpha components given a pixel
     *  in this ColorModel.
     */
    @stub
    def getComponents(pixel: Any, components: Array[Int], offset: Int): Array[Int] = ???

    /** Returns a pixel value represented as an int in this
     *  ColorModel, given an array of unnormalized color/alpha
     *  components.
     */
    @stub
    def getDataElement(components: Array[Int], offset: Int): Int = ???

    /** Returns a data element array representation of a pixel in this
     *  ColorModel, given an array of unnormalized color/alpha
     *  components.
     */
    @stub
    def getDataElements(components: Array[Int], offset: Int, obj: Any): Any = ???

    /** Returns a data element array representation of a pixel in this
     *  ColorModel, given an integer pixel representation in the
     *  default RGB color model.
     */
    @stub
    def getDataElements(rgb: Int, pixel: Any): Any = ???

    /** Returns the green color component for the specified pixel, scaled
     *  from 0 to 255 in the default RGB ColorSpace, sRGB.
     */
    @stub
    def getGreen(pixel: Int): Int = ???

    /** Returns the green color component for the specified pixel, scaled
     *  from 0 to 255 in the default RGB ColorSpace, sRGB.
     */
    @stub
    def getGreen(inData: Any): Int = ???

    /** Returns the mask indicating which bits in an int pixel
     *  representation contain the green color component.
     */
    @stub
    def getGreenMask(): Int = ???

    /** Returns the red color component for the specified pixel, scaled
     *  from 0 to 255 in the default RGB ColorSpace, sRGB.
     */
    @stub
    def getRed(pixel: Int): Int = ???

    /** Returns the red color component for the specified pixel, scaled
     *  from 0 to 255 in the default RGB ColorSpace, sRGB.
     */
    @stub
    def getRed(inData: Any): Int = ???

    /** Returns the mask indicating which bits in an int pixel
     *  representation contain the red color component.
     */
    @stub
    def getRedMask(): Int = ???

    /** Returns the color/alpha components of the pixel in the default
     *  RGB color model format.
     */
    @stub
    def getRGB(pixel: Int): Int = ???

    /** Returns the color/alpha components for the specified pixel in the
     *  default RGB color model format.
     */
    @stub
    def getRGB(inData: Any): Int = ???

    /** Returns true if raster is compatible
     *  with this ColorModel and false if it is
     *  not.
     */
    @stub
    def isCompatibleRaster(raster: Raster): Boolean = ???

    /** Returns a String that represents this
     *  DirectColorModel.
     */
    @stub
    def toString(): String = ???
}
