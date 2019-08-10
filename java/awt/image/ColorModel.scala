package java.awt.image

import java.awt.Transparency
import java.awt.color.ColorSpace
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** The ColorModel abstract class encapsulates the
 *  methods for translating a pixel value to color components
 *  (for example, red, green, and blue) and an alpha component.
 *  In order to render an image to the screen, a printer, or another
 *  image, pixel values must be converted to color and alpha components.
 *  As arguments to or return values from methods of this class,
 *  pixels are represented as 32-bit ints or as arrays of primitive types.
 *  The number, order, and interpretation of color components for a
 *  ColorModel is specified by its ColorSpace.
 *  A ColorModel used with pixel data that does not include
 *  alpha information treats all pixels as opaque, which is an alpha
 *  value of 1.0.
 *  
 *  This ColorModel class supports two representations of
 *  pixel values.  A pixel value can be a single 32-bit int or an
 *  array of primitive types.  The Java(tm) Platform 1.0 and 1.1 APIs
 *  represented pixels as single byte or single
 *  int values.  For purposes of the ColorModel
 *  class, pixel value arguments were passed as ints.  The Java(tm) 2
 *  Platform API introduced additional classes for representing images.
 *  With BufferedImage or RenderedImage
 *  objects, based on Raster and SampleModel classes, pixel
 *  values might not be conveniently representable as a single int.
 *  Consequently, ColorModel now has methods that accept
 *  pixel values represented as arrays of primitive types.  The primitive
 *  type used by a particular ColorModel object is called its
 *  transfer type.
 *  
 *  ColorModel objects used with images for which pixel values
 *  are not conveniently representable as a single int throw an
 *  IllegalArgumentException when methods taking a single int pixel
 *  argument are called.  Subclasses of ColorModel must
 *  specify the conditions under which this occurs.  This does not
 *  occur with DirectColorModel or IndexColorModel objects.
 *  
 *  Currently, the transfer types supported by the Java 2D(tm) API are
 *  DataBuffer.TYPE_BYTE, DataBuffer.TYPE_USHORT, DataBuffer.TYPE_INT,
 *  DataBuffer.TYPE_SHORT, DataBuffer.TYPE_FLOAT, and DataBuffer.TYPE_DOUBLE.
 *  Most rendering operations will perform much faster when using ColorModels
 *  and images based on the first three of these types.  In addition, some
 *  image filtering operations are not supported for ColorModels and
 *  images based on the latter three types.
 *  The transfer type for a particular ColorModel object is
 *  specified when the object is created, either explicitly or by default.
 *  All subclasses of ColorModel must specify what the
 *  possible transfer types are and how the number of elements in the
 *  primitive arrays representing pixels is determined.
 *  
 *  For BufferedImages, the transfer type of its
 *  Raster and of the Raster object's
 *  SampleModel (available from the
 *  getTransferType methods of these classes) must match that
 *  of the ColorModel.  The number of elements in an array
 *  representing a pixel for the Raster and
 *  SampleModel (available from the
 *  getNumDataElements methods of these classes) must match
 *  that of the ColorModel.
 *  
 *  The algorithm used to convert from pixel values to color and alpha
 *  components varies by subclass.  For example, there is not necessarily
 *  a one-to-one correspondence between samples obtained from the
 *  SampleModel of a BufferedImage object's
 *  Raster and color/alpha components.  Even when
 *  there is such a correspondence, the number of bits in a sample is not
 *  necessarily the same as the number of bits in the corresponding color/alpha
 *  component.  Each subclass must specify how the translation from
 *  pixel values to color/alpha components is done.
 *  
 *  Methods in the ColorModel class use two different
 *  representations of color and alpha components - a normalized form
 *  and an unnormalized form.  In the normalized form, each component is a
 *  float value between some minimum and maximum values.  For
 *  the alpha component, the minimum is 0.0 and the maximum is 1.0.  For
 *  color components the minimum and maximum values for each component can
 *  be obtained from the ColorSpace object.  These values
 *  will often be 0.0 and 1.0 (e.g. normalized component values for the
 *  default sRGB color space range from 0.0 to 1.0), but some color spaces
 *  have component values with different upper and lower limits.  These
 *  limits can be obtained using the getMinValue and
 *  getMaxValue methods of the ColorSpace
 *  class.  Normalized color component values are not premultiplied.
 *  All ColorModels must support the normalized form.
 *  
 *  In the unnormalized
 *  form, each component is an unsigned integral value between 0 and
 *  2n - 1, where n is the number of significant bits for a
 *  particular component.  If pixel values for a particular
 *  ColorModel represent color samples premultiplied by
 *  the alpha sample, unnormalized color component values are
 *  also premultiplied.  The unnormalized form is used only with instances
 *  of ColorModel whose ColorSpace has minimum
 *  component values of 0.0 for all components and maximum values of
 *  1.0 for all components.
 *  The unnormalized form for color and alpha components can be a convenient
 *  representation for ColorModels whose normalized component
 *  values all lie
 *  between 0.0 and 1.0.  In such cases the integral value 0 maps to 0.0 and
 *  the value 2n - 1 maps to 1.0.  In other cases, such as
 *  when the normalized component values can be either negative or positive,
 *  the unnormalized form is not convenient.  Such ColorModel
 *  objects throw an IllegalArgumentException when methods involving
 *  an unnormalized argument are called.  Subclasses of ColorModel
 *  must specify the conditions under which this occurs.
 */
abstract class ColorModel extends Object with Transparency {

    /** Constructs a ColorModel that translates pixels of the
     *  specified number of bits to color/alpha components.
     */
    @stub
    def this(bits: Int) = ???

    /** Constructs a ColorModel that translates pixel values
     *  to color/alpha components.
     */
    @stub
    protected def this(pixel_bits: Int, bits: Array[Int], cspace: ColorSpace, hasAlpha: Boolean, isAlphaPremultiplied: Boolean, transparency: Int, transferType: Int) = ???

    /** The total number of bits in the pixel. */
    protected val pixel_bits: Int

    /** Data type of the array used to represent pixel values. */
    protected val transferType: Int

    /** Forces the raster data to match the state specified in the
     *  isAlphaPremultiplied variable, assuming the data is
     *  currently correctly described by this ColorModel.
     */
    def coerceData(raster: WritableRaster, isAlphaPremultiplied: Boolean): ColorModel

    /** Creates a SampleModel with the specified width and
     *  height that has a data layout compatible with this
     *  ColorModel.
     */
    def createCompatibleSampleModel(w: Int, h: Int): SampleModel

    /** Creates a WritableRaster with the specified width and
     *  height that has a data layout (SampleModel) compatible
     *  with this ColorModel.
     */
    def createCompatibleWritableRaster(w: Int, h: Int): WritableRaster

    /** Tests if the specified Object is an instance of
     *  ColorModel and if it equals this
     *  ColorModel.
     */
    def equals(obj: Any): Boolean

    /** Disposes of system resources associated with this
     *  ColorModel once this ColorModel is no
     *  longer referenced.
     */
    def finalize(): Unit

    /** Returns the alpha component for the specified pixel, scaled
     *  from 0 to 255.
     */
    def getAlpha(pixel: Int): Int

    /** Returns the alpha component for the specified pixel, scaled
     *  from 0 to 255.
     */
    def getAlpha(inData: Any): Int

    /** Returns a Raster representing the alpha channel of an
     *  image, extracted from the input Raster, provided that
     *  pixel values of this ColorModel represent color and
     *  alpha information as separate spatial bands (e.g.
     */
    def getAlphaRaster(raster: WritableRaster): WritableRaster

    /** Returns the blue color component for the specified pixel, scaled
     *  from 0 to 255 in the default RGB ColorSpace, sRGB.
     */
    def getBlue(pixel: Int): Int

    /** Returns the blue color component for the specified pixel, scaled
     *  from 0 to 255 in the default RGB ColorSpace, sRGB.
     */
    def getBlue(inData: Any): Int

    /** Returns the ColorSpace associated with this
     *  ColorModel.
     */
    def getColorSpace(): ColorSpace

    /** Returns an array of unnormalized color/alpha components given a pixel
     *  in this ColorModel.
     */
    def getComponents(pixel: Int, components: Array[Int], offset: Int): Array[Int]

    /** Returns an array of unnormalized color/alpha components given a pixel
     *  in this ColorModel.
     */
    def getComponents(pixel: Any, components: Array[Int], offset: Int): Array[Int]

    /** Returns an array of the number of bits per color/alpha component. */
    def getComponentSize(): Array[Int]

    /** Returns the number of bits for the specified color/alpha component. */
    def getComponentSize(componentIdx: Int): Int

    /** Returns a pixel value represented as an int in this
     *  ColorModel, given an array of normalized color/alpha
     *  components.
     */
    def getDataElement(normComponents: Array[Float], normOffset: Int): Int

    /** Returns a pixel value represented as an int in this
     *  ColorModel, given an array of unnormalized color/alpha
     *  components.
     */
    def getDataElement(components: Array[Int], offset: Int): Int

    /** Returns a data element array representation of a pixel in this
     *  ColorModel, given an array of normalized color/alpha
     *  components.
     */
    def getDataElements(normComponents: Array[Float], normOffset: Int, obj: Any): Any

    /** Returns a data element array representation of a pixel in this
     *  ColorModel, given an array of unnormalized color/alpha
     *  components.
     */
    def getDataElements(components: Array[Int], offset: Int, obj: Any): Any

    /** Returns a data element array representation of a pixel in this
     *  ColorModel, given an integer pixel representation in
     *  the default RGB color model.
     */
    def getDataElements(rgb: Int, pixel: Any): Any

    /** Returns the green color component for the specified pixel, scaled
     *  from 0 to 255 in the default RGB ColorSpace, sRGB.
     */
    def getGreen(pixel: Int): Int

    /** Returns the green color component for the specified pixel, scaled
     *  from 0 to 255 in the default RGB ColorSpace, sRGB.
     */
    def getGreen(inData: Any): Int

    /** Returns an array of all of the color/alpha components in normalized
     *  form, given an unnormalized component array.
     */
    def getNormalizedComponents(components: Array[Int], offset: Int, normComponents: Array[Float], normOffset: Int): Array[Float]

    /** Returns an array of all of the color/alpha components in normalized
     *  form, given a pixel in this ColorModel.
     */
    def getNormalizedComponents(pixel: Any, normComponents: Array[Float], normOffset: Int): Array[Float]

    /** Returns the number of color components in this
     *  ColorModel.
     */
    def getNumColorComponents(): Int

    /** Returns the number of components, including alpha, in this
     *  ColorModel.
     */
    def getNumComponents(): Int

    /** Returns the number of bits per pixel described by this
     *  ColorModel.
     */
    def getPixelSize(): Int

    /** Returns the red color component for the specified pixel, scaled
     *  from 0 to 255 in the default RGB ColorSpace, sRGB.
     */
    def getRed(pixel: Int): Int

    /** Returns the red color component for the specified pixel, scaled
     *  from 0 to 255 in the default RGB ColorSpace, sRGB.
     */
    def getRed(inData: Any): Int

    /** Returns the color/alpha components of the pixel in the default
     *  RGB color model format.
     */
    def getRGB(pixel: Int): Int

    /** Returns the color/alpha components for the specified pixel in the
     *  default RGB color model format.
     */
    def getRGB(inData: Any): Int

    /** Returns the transfer type of this ColorModel. */
    def getTransferType(): Int

    /** Returns the transparency. */
    def getTransparency(): Int

    /** Returns an array of all of the color/alpha components in unnormalized
     *  form, given a normalized component array.
     */
    def getUnnormalizedComponents(normComponents: Array[Float], normOffset: Int, components: Array[Int], offset: Int): Array[Int]

    /** Returns whether or not alpha is supported in this
     *  ColorModel.
     */
    def hasAlpha(): Boolean

    /** Returns the hash code for this ColorModel. */
    def hashCode(): Int

    /** Returns whether or not the alpha has been premultiplied in the
     *  pixel values to be translated by this ColorModel.
     */
    def isAlphaPremultiplied(): Boolean

    /** Returns true if raster is compatible
     *  with this ColorModel and false if it is
     *  not.
     */
    def isCompatibleRaster(raster: Raster): Boolean

    /** Checks if the SampleModel is compatible with this
     *  ColorModel.
     */
    def isCompatibleSampleModel(sm: SampleModel): Boolean

    /** Returns the String representation of the contents of
     *  this ColorModelobject.
     */
    def toString(): String
}

object ColorModel {
    /** Returns a DirectColorModel that describes the default
     *  format for integer RGB values used in many of the methods in the
     *  AWT image interfaces for the convenience of the programmer.
     */
    @stub
    def getRGBdefault(): ColorModel = ???
}
