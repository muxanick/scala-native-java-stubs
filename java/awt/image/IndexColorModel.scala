package java.awt.image

import java.lang.{Object, String}
import java.math.BigInteger
import scala.scalanative.annotation.stub

/** The IndexColorModel class is a ColorModel
 *  class that works with pixel values consisting of a
 *  single sample that is an index into a fixed colormap in the default
 *  sRGB color space.  The colormap specifies red, green, blue, and
 *  optional alpha components corresponding to each index.  All components
 *  are represented in the colormap as 8-bit unsigned integral values.
 *  Some constructors allow the caller to specify "holes" in the colormap
 *  by indicating which colormap entries are valid and which represent
 *  unusable colors via the bits set in a BigInteger object.
 *  This color model is similar to an X11 PseudoColor visual.
 *  
 *  Some constructors provide a means to specify an alpha component
 *  for each pixel in the colormap, while others either provide no
 *  such means or, in some cases, a flag to indicate whether the
 *  colormap data contains alpha values.  If no alpha is supplied to
 *  the constructor, an opaque alpha component (alpha = 1.0) is
 *  assumed for each entry.
 *  An optional transparent pixel value can be supplied that indicates a
 *  pixel to be made completely transparent, regardless of any alpha
 *  component supplied or assumed for that pixel value.
 *  Note that the color components in the colormap of an
 *  IndexColorModel objects are never pre-multiplied with
 *  the alpha components.
 *  
 *  
 *  The transparency of an IndexColorModel object is
 *  determined by examining the alpha components of the colors in the
 *  colormap and choosing the most specific value after considering
 *  the optional alpha values and any transparent index specified.
 *  The transparency value is Transparency.OPAQUE
 *  only if all valid colors in
 *  the colormap are opaque and there is no valid transparent pixel.
 *  If all valid colors
 *  in the colormap are either completely opaque (alpha = 1.0) or
 *  completely transparent (alpha = 0.0), which typically occurs when
 *  a valid transparent pixel is specified,
 *  the value is Transparency.BITMASK.
 *  Otherwise, the value is Transparency.TRANSLUCENT, indicating
 *  that some valid color has an alpha component that is
 *  neither completely transparent nor completely opaque
 *  (0.0 < alpha < 1.0).
 *  
 * 
 *  
 *  If an IndexColorModel object has
 *  a transparency value of Transparency.OPAQUE,
 *  then the hasAlpha
 *  and getNumComponents methods
 *  (both inherited from ColorModel)
 *  return false and 3, respectively.
 *  For any other transparency value,
 *  hasAlpha returns true
 *  and getNumComponents returns 4.
 * 
 *  
 *  
 *  The values used to index into the colormap are taken from the least
 *  significant n bits of pixel representations where
 *  n is based on the pixel size specified in the constructor.
 *  For pixel sizes smaller than 8 bits, n is rounded up to a
 *  power of two (3 becomes 4 and 5,6,7 become 8).
 *  For pixel sizes between 8 and 16 bits, n is equal to the
 *  pixel size.
 *  Pixel sizes larger than 16 bits are not supported by this class.
 *  Higher order bits beyond n are ignored in pixel representations.
 *  Index values greater than or equal to the map size, but less than
 *  2n, are undefined and return 0 for all color and
 *  alpha components.
 *  
 *  
 *  For those methods that use a primitive array pixel representation of
 *  type transferType, the array length is always one.
 *  The transfer types supported are DataBuffer.TYPE_BYTE and
 *  DataBuffer.TYPE_USHORT.  A single int pixel
 *  representation is valid for all objects of this class, since it is
 *  always possible to represent pixel values used with this class in a
 *  single int.  Therefore, methods that use this representation do
 *  not throw an IllegalArgumentException due to an invalid
 *  pixel value.
 *  
 *  Many of the methods in this class are final.  The reason for
 *  this is that the underlying native graphics code makes assumptions
 *  about the layout and operation of this class and those assumptions
 *  are reflected in the implementations of the methods here that are
 *  marked final.  You can subclass this class for other reasons, but
 *  you cannot override or modify the behaviour of those methods.
 */
class IndexColorModel extends ColorModel {

    /** Constructs an IndexColorModel from the specified
     *  arrays of red, green, and blue components.
     */
    @stub
    def this(bits: Int, size: Int, r: Array[Byte], g: Array[Byte], b: Array[Byte]) = ???

    /** Constructs an IndexColorModel from the given
     *  arrays of red, green, blue and alpha components.
     */
    @stub
    def this(bits: Int, size: Int, r: Array[Byte], g: Array[Byte], b: Array[Byte], a: Array[Byte]) = ???

    /** Constructs an IndexColorModel from the given arrays
     *  of red, green, and blue components.
     */
    @stub
    def this(bits: Int, size: Int, r: Array[Byte], g: Array[Byte], b: Array[Byte], trans: Int) = ???

    /** Constructs an IndexColorModel from a single
     *  array of interleaved red, green, blue and optional alpha
     *  components.
     */
    @stub
    def this(bits: Int, size: Int, cmap: Array[Byte], start: Int, hasalpha: Boolean) = ???

    /** Constructs an IndexColorModel from a single array of
     *  interleaved red, green, blue and optional alpha components.
     */
    @stub
    def this(bits: Int, size: Int, cmap: Array[Byte], start: Int, hasalpha: Boolean, trans: Int) = ???

    /** Constructs an IndexColorModel from an array of
     *  ints where each int is comprised of red, green, blue, and
     *  optional alpha components in the default RGB color model format.
     */
    @stub
    def this(bits: Int, size: Int, cmap: Array[Int], start: Int, hasalpha: Boolean, trans: Int, transferType: Int) = ???

    /** Constructs an IndexColorModel from an
     *  int array where each int is
     *  comprised of red, green, blue, and alpha
     *  components in the default RGB color model format.
     */
    @stub
    def this(bits: Int, size: Int, cmap: Array[Int], start: Int, transferType: Int, validBits: BigInteger) = ???

    /** Returns a new BufferedImage of TYPE_INT_ARGB or
     *  TYPE_INT_RGB that has a Raster with pixel data
     *  computed by expanding the indices in the source Raster
     *  using the color/alpha component arrays of this ColorModel.
     */
    @stub
    def convertToIntDiscrete(raster: Raster, forceARGB: Boolean): BufferedImage = ???

    /** Creates a SampleModel with the specified
     *  width and height that has a data layout compatible with
     *  this ColorModel.
     */
    @stub
    def createCompatibleSampleModel(w: Int, h: Int): SampleModel = ???

    /** Creates a WritableRaster with the specified width
     *  and height that has a data layout (SampleModel)
     *  compatible with this ColorModel.
     */
    @stub
    def createCompatibleWritableRaster(w: Int, h: Int): WritableRaster = ???

    /** Disposes of system resources associated with this
     *  ColorModel once this ColorModel is no
     *  longer referenced.
     */
    @stub
    def finalize(): Unit = ???

    /** Returns the alpha component for the specified pixel, scaled
     *  from 0 to 255.
     */
    @stub
    def getAlpha(pixel: Int): Int = ???

    /** Copies the array of alpha transparency components into the
     *  specified array.
     */
    @stub
    def getAlphas(a: Array[Byte]): Unit = ???

    /** Returns the blue color component for the specified pixel, scaled
     *  from 0 to 255 in the default RGB ColorSpace, sRGB.
     */
    @stub
    def getBlue(pixel: Int): Int = ???

    /** Copies the array of blue color components into the specified array. */
    @stub
    def getBlues(b: Array[Byte]): Unit = ???

    /** Returns an array of unnormalized color/alpha components for a
     *  specified pixel in this ColorModel.
     */
    @stub
    def getComponents(pixel: Int, components: Array[Int], offset: Int): Array[Int] = ???

    /** Returns an array of unnormalized color/alpha components for
     *  a specified pixel in this ColorModel.
     */
    @stub
    def getComponents(pixel: Object, components: Array[Int], offset: Int): Array[Int] = ???

    /** Returns an array of the number of bits for each color/alpha component. */
    @stub
    def getComponentSize(): Array[Int] = ???

    /** Returns a pixel value represented as an int in this
     *  ColorModel given an array of unnormalized
     *  color/alpha components.
     */
    @stub
    def getDataElement(components: Array[Int], offset: Int): Int = ???

    /** Returns a data element array representation of a pixel in this
     *  ColorModel given an array of unnormalized color/alpha
     *  components.
     */
    @stub
    def getDataElements(components: Array[Int], offset: Int, pixel: Object): Object = ???

    /** Returns a data element array representation of a pixel in this
     *  ColorModel, given an integer pixel representation in the
     *  default RGB color model.
     */
    @stub
    def getDataElements(rgb: Int, pixel: Object): Object = ???

    /** Returns the green color component for the specified pixel, scaled
     *  from 0 to 255 in the default RGB ColorSpace, sRGB.
     */
    @stub
    def getGreen(pixel: Int): Int = ???

    /** Copies the array of green color components into the specified array. */
    @stub
    def getGreens(g: Array[Byte]): Unit = ???

    /** Returns the size of the color/alpha component arrays in this
     *  IndexColorModel.
     */
    @stub
    def getMapSize(): Int = ???

    /** Returns the red color component for the specified pixel, scaled
     *  from 0 to 255 in the default RGB ColorSpace, sRGB.
     */
    @stub
    def getRed(pixel: Int): Int = ???

    /** Copies the array of red color components into the specified array. */
    @stub
    def getReds(r: Array[Byte]): Unit = ???

    /** Returns the color/alpha components of the pixel in the default
     *  RGB color model format.
     */
    @stub
    def getRGB(pixel: Int): Int = ???

    /** Converts data for each index from the color and alpha component
     *  arrays to an int in the default RGB ColorModel format and copies
     *  the resulting 32-bit ARGB values into the specified array.
     */
    @stub
    def getRGBs(rgb: Array[Int]): Unit = ???

    /** Returns the transparency. */
    @stub
    def getTransparency(): Int = ???

    /** Returns the index of a transparent pixel in this
     *  IndexColorModel or -1 if there is no pixel
     *  with an alpha value of 0.
     */
    @stub
    def getTransparentPixel(): Int = ???

    /** Returns a BigInteger that indicates the valid/invalid
     *  pixels in the colormap.
     */
    @stub
    def getValidPixels(): BigInteger = ???

    /** Returns true if raster is compatible
     *  with this ColorModel or false if it
     *  is not compatible with this ColorModel.
     */
    @stub
    def isCompatibleRaster(raster: Raster): Boolean = ???

    /** Checks if the specified SampleModel is compatible
     *  with this ColorModel.
     */
    @stub
    def isCompatibleSampleModel(sm: SampleModel): Boolean = ???

    /** Returns whether or not all of the pixels are valid. */
    @stub
    def isValid(): Boolean = ???

    /** Returns whether or not the pixel is valid. */
    @stub
    def isValid(pixel: Int): Boolean = ???

    /** Returns the String representation of the contents of
     *  this ColorModelobject.
     */
    @stub
    def toString(): String = ???
}
