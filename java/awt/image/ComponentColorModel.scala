package java.awt.image

import java.awt.color.ColorSpace
import java.lang.Object

// A ColorModel class that works with pixel values that
// represent color and alpha information as separate samples and that
// store each sample in a separate data element.  This class can be
// used with an arbitrary ColorSpace.  The number of
// color samples in the pixel values must be same as the number of
// color components in the ColorSpace. There may be a
// single alpha sample.
// 
// For those methods that use
// a primitive array pixel representation of type transferType,
// the array length is the same as the number of color and alpha samples.
// Color samples are stored first in the array followed by the alpha
// sample, if present.  The order of the color samples is specified
// by the ColorSpace.  Typically, this order reflects the
// name of the color space type. For example, for TYPE_RGB,
// index 0 corresponds to red, index 1 to green, and index 2 to blue.
// 
// The translation from pixel sample values to color/alpha components for
// display or processing purposes is based on a one-to-one correspondence of
// samples to components.
// Depending on the transfer type used to create an instance of
// ComponentColorModel, the pixel sample values
// represented by that instance may be signed or unsigned and may
// be of integral type or float or double (see below for details).
// The translation from sample values to normalized color/alpha components
// must follow certain rules.  For float and double samples, the translation
// is an identity, i.e. normalized component values are equal to the
// corresponding sample values.  For integral samples, the translation
// should be only a simple scale and offset, where the scale and offset
// constants may be different for each component.  The result of
// applying the scale and offset constants is a set of color/alpha
// component values, which are guaranteed to fall within a certain
// range.  Typically, the range for a color component will be the range
// defined by the getMinValue and getMaxValue
// methods of the ColorSpace class.  The range for an
// alpha component should be 0.0 to 1.0.
// 
// Instances of ComponentColorModel created with transfer types
// DataBuffer.TYPE_BYTE, DataBuffer.TYPE_USHORT,
// and DataBuffer.TYPE_INT have pixel sample values which
// are treated as unsigned integral values.
// The number of bits in a color or alpha sample of a pixel value might not
// be the same as the number of bits for the corresponding color or alpha
// sample passed to the
// ComponentColorModel(ColorSpace, int[], boolean, boolean, int, int)
// constructor.  In
// that case, this class assumes that the least significant n bits of a sample
// value hold the component value, where n is the number of significant bits
// for the component passed to the constructor.  It also assumes that
// any higher-order bits in a sample value are zero.  Thus, sample values
// range from 0 to 2n - 1.  This class maps these sample values
// to normalized color component values such that 0 maps to the value
// obtained from the ColorSpace's getMinValue
// method for each component and 2n - 1 maps to the value
// obtained from getMaxValue.  To create a
// ComponentColorModel with a different color sample mapping
// requires subclassing this class and overriding the
// getNormalizedComponents(Object, float[], int) method.
// The mapping for an alpha sample always maps 0 to 0.0 and
// 2n - 1 to 1.0.
// 
// For instances with unsigned sample values,
// the unnormalized color/alpha component representation is only
// supported if two conditions hold.  First, sample value value 0 must
// map to normalized component value 0.0 and sample value 2n - 1
// to 1.0.  Second the min/max range of all color components of the
// ColorSpace must be 0.0 to 1.0.  In this case, the
// component representation is the n least
// significant bits of the corresponding sample.  Thus each component is
// an unsigned integral value between 0 and 2n - 1, where
// n is the number of significant bits for a particular component.
// If these conditions are not met, any method taking an unnormalized
// component argument will throw an IllegalArgumentException.
// 
// Instances of ComponentColorModel created with transfer types
// DataBuffer.TYPE_SHORT, DataBuffer.TYPE_FLOAT, and
// DataBuffer.TYPE_DOUBLE have pixel sample values which
// are treated as signed short, float, or double values.
// Such instances do not support the unnormalized color/alpha component
// representation, so any methods taking such a representation as an argument
// will throw an IllegalArgumentException when called on one
// of these instances.  The normalized component values of instances
// of this class have a range which depends on the transfer
// type as follows: for float samples, the full range of the float data
// type; for double samples, the full range of the float data type
// (resulting from casting double to float); for short samples,
// from approximately -maxVal to +maxVal, where maxVal is the per
// component maximum value for the ColorSpace
// (-32767 maps to -maxVal, 0 maps to 0.0, and 32767 maps
// to +maxVal).  A subclass may override the scaling for short sample
// values to normalized component values by overriding the
// getNormalizedComponents(Object, float[], int) method.
// For float and double samples, the normalized component values are
// taken to be equal to the corresponding sample values, and subclasses
// should not attempt to add any non-identity scaling for these transfer
// types.
// 
// Instances of ComponentColorModel created with transfer types
// DataBuffer.TYPE_SHORT, DataBuffer.TYPE_FLOAT, and
// DataBuffer.TYPE_DOUBLE
// use all the bits of all sample values.  Thus all color/alpha components
// have 16 bits when using DataBuffer.TYPE_SHORT, 32 bits when
// using DataBuffer.TYPE_FLOAT, and 64 bits when using
// DataBuffer.TYPE_DOUBLE.  When the
// ComponentColorModel(ColorSpace, int[], boolean, boolean, int, int)
// form of constructor is used with one of these transfer types, the
// bits array argument is ignored.
// 
// It is possible to have color/alpha sample values
// which cannot be reasonably interpreted as component values for rendering.
// This can happen when ComponentColorModel is subclassed to
// override the mapping of unsigned sample values to normalized color
// component values or when signed sample values outside a certain range
// are used.  (As an example, specifying an alpha component as a signed
// short value outside the range 0 to 32767, normalized range 0.0 to 1.0, can
// lead to unexpected results.) It is the
// responsibility of applications to appropriately scale pixel data before
// rendering such that color components fall within the normalized range
// of the ColorSpace (obtained using the getMinValue
// and getMaxValue methods of the ColorSpace class)
// and the alpha component is between 0.0 and 1.0.  If color or alpha
// component values fall outside these ranges, rendering results are
// indeterminate.
// 
// Methods that use a single int pixel representation throw
// an IllegalArgumentException, unless the number of components
// for the ComponentColorModel is one and the component
// value is unsigned -- in other words,  a single color component using
// a transfer type of DataBuffer.TYPE_BYTE,
// DataBuffer.TYPE_USHORT, or DataBuffer.TYPE_INT
// and no alpha.
// 
// A ComponentColorModel can be used in conjunction with a
// ComponentSampleModel, a BandedSampleModel,
// or a PixelInterleavedSampleModel to construct a
// BufferedImage.
class ComponentColorModel extends ColorModel {

    @stub
    // Constructs a ComponentColorModel from the specified
    // parameters.
    def this(colorSpace: ColorSpace, hasAlpha: Boolean, isAlphaPremultiplied: Boolean, transparency: Int, transferType: Int) = ???

    @stub
    // Forces the raster data to match the state specified in the
    // isAlphaPremultiplied variable, assuming the data
    // is currently correctly described by this ColorModel.
    def coerceData(raster: WritableRaster, isAlphaPremultiplied: Boolean): ColorModel = ???

    @stub
    // Creates a SampleModel with the specified width and height,
    // that  has a data layout compatible with this ColorModel.
    def createCompatibleSampleModel(w: Int, h: Int): SampleModel = ???

    @stub
    // Creates a WritableRaster with the specified width and height,
    // that  has a data layout (SampleModel) compatible with
    // this ColorModel.
    def createCompatibleWritableRaster(w: Int, h: Int): WritableRaster = ???

    @stub
    // Compares this color model with another for equality.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the alpha component for the specified pixel, scaled
    // from 0 to 255.
    def getAlpha(pixel: Int): Int = ???

    @stub
    // Returns the alpha component for the specified pixel, scaled from
    // 0 to 255.
    def getAlpha(inData: Object): Int = ???

    @stub
    // Returns a Raster representing the alpha channel of an image,
    // extracted from the input Raster.
    def getAlphaRaster(raster: WritableRaster): WritableRaster = ???

    @stub
    // Returns the blue color component for the specified pixel, scaled
    // from 0 to 255 in the default RGB ColorSpace, sRGB.
    def getBlue(pixel: Int): Int = ???

    @stub
    // Returns the blue color component for the specified pixel, scaled
    // from 0 to 255 in the default RGB ColorSpace, sRGB.
    def getBlue(inData: Object): Int = ???

    @stub
    // Returns an array of unnormalized color/alpha components given a pixel
    // in this ColorModel.
    def getComponents(pixel: Int, components: Array[Int], offset: Int): Array[Int] = ???

    @stub
    // Returns an array of unnormalized color/alpha components given a pixel
    // in this ColorModel.
    def getComponents(pixel: Object, components: Array[Int], offset: Int): Array[Int] = ???

    @stub
    // Returns a pixel value represented as an int in this
    // ColorModel, given an array of normalized color/alpha
    // components.
    def getDataElement(normComponents: Array[float], normOffset: Int): Int = ???

    @stub
    // Returns a pixel value represented as an int in this ColorModel,
    // given an array of unnormalized color/alpha components.
    def getDataElement(components: Array[Int], offset: Int): Int = ???

    @stub
    // Returns a data element array representation of a pixel in this
    // ColorModel, given an array of normalized color/alpha
    // components.
    def getDataElements(normComponents: Array[float], normOffset: Int, obj: Object): Object = ???

    @stub
    // Returns a data element array representation of a pixel in this
    // ColorModel, given an array of unnormalized color/alpha
    // components.
    def getDataElements(components: Array[Int], offset: Int, obj: Object): Object = ???

    @stub
    // Returns a data element array representation of a pixel in this
    // ColorModel, given an integer pixel representation
    // in the default RGB color model.
    def getDataElements(rgb: Int, pixel: Object): Object = ???

    @stub
    // Returns the green color component for the specified pixel, scaled
    // from 0 to 255 in the default RGB ColorSpace, sRGB.
    def getGreen(pixel: Int): Int = ???

    @stub
    // Returns the green color component for the specified pixel, scaled
    // from 0 to 255 in the default RGB ColorSpace, sRGB.
    def getGreen(inData: Object): Int = ???

    @stub
    // Returns an array of all of the color/alpha components in normalized
    // form, given an unnormalized component array.
    def getNormalizedComponents(components: Array[Int], offset: Int, normComponents: Array[float], normOffset: Int): Array[float] = ???

    @stub
    // Returns an array of all of the color/alpha components in normalized
    // form, given a pixel in this ColorModel.
    def getNormalizedComponents(pixel: Object, normComponents: Array[float], normOffset: Int): Array[float] = ???

    @stub
    // Returns the red color component for the specified pixel, scaled
    // from 0 to 255 in the default RGB ColorSpace, sRGB.
    def getRed(pixel: Int): Int = ???

    @stub
    // Returns the red color component for the specified pixel, scaled
    // from 0 to 255 in the default RGB ColorSpace, sRGB.
    def getRed(inData: Object): Int = ???

    @stub
    // Returns the color/alpha components of the pixel in the default
    // RGB color model format.
    def getRGB(pixel: Int): Int = ???

    @stub
    // Returns the color/alpha components for the specified pixel in the
    // default RGB color model format.
    def getRGB(inData: Object): Int = ???

    @stub
    // Returns an array of all of the color/alpha components in unnormalized
    // form, given a normalized component array.
    def getUnnormalizedComponents(normComponents: Array[float], normOffset: Int, components: Array[Int], offset: Int): Array[Int] = ???

    @stub
    // Returns true if raster is compatible with this
    // ColorModel; false if it is not.
    def isCompatibleRaster(raster: Raster): Boolean = ???
}
