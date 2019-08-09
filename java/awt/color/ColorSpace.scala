package java.awt.color

import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** This abstract class is used to serve as a color space tag to identify the
 *  specific color space of a Color object or, via a ColorModel object,
 *  of an Image, a BufferedImage, or a GraphicsDevice.  It contains
 *  methods that transform colors in a specific color space to/from sRGB
 *  and to/from a well-defined CIEXYZ color space.
 *  
 *  For purposes of the methods in this class, colors are represented as
 *  arrays of color components represented as floats in a normalized range
 *  defined by each ColorSpace.  For many ColorSpaces (e.g. sRGB), this
 *  range is 0.0 to 1.0.  However, some ColorSpaces have components whose
 *  values have a different range.  Methods are provided to inquire per
 *  component minimum and maximum normalized values.
 *  
 *  Several variables are defined for purposes of referring to color
 *  space types (e.g. TYPE_RGB, TYPE_XYZ, etc.) and to refer to specific
 *  color spaces (e.g. CS_sRGB and CS_CIEXYZ).
 *  sRGB is a proposed standard RGB color space.  For more information,
 *  see 
 *  http://www.w3.org/pub/WWW/Graphics/Color/sRGB.html
 *  .
 *  
 *  The purpose of the methods to transform to/from the well-defined
 *  CIEXYZ color space is to support conversions between any two color
 *  spaces at a reasonably high degree of accuracy.  It is expected that
 *  particular implementations of subclasses of ColorSpace (e.g.
 *  ICC_ColorSpace) will support high performance conversion based on
 *  underlying platform color management systems.
 *  
 *  The CS_CIEXYZ space used by the toCIEXYZ/fromCIEXYZ methods can be
 *  described as follows:
 * 
 * 
 *       CIEXYZ
 *       viewing illuminance: 200 lux
 *       viewing white point: CIE D50
 *       media white point: "that of a perfectly reflecting diffuser" -- D50
 *       media black point: 0 lux or 0 Reflectance
 *       flare: 1 percent
 *       surround: 20percent of the media white point
 *       media description: reflection print (i.e., RLAB, Hunt viewing media)
 *       note: For developers creating an ICC profile for this conversion
 *             space, the following is applicable.  Use a simple Von Kries
 *             white point adaptation folded into the 3X3 matrix parameters
 *             and fold the flare and surround effects into the three
 *             one-dimensional lookup tables (assuming one uses the minimal
 *             model for monitors).
 * 
 * 
 */
abstract class ColorSpace extends Object with Serializable {

    /** Constructs a ColorSpace object given a color space type
     *  and the number of components.
     */
    @stub
    protected def this(type: Int, numcomponents: Int) = ???

    /** Transforms a color value assumed to be in the CS_CIEXYZ conversion
     *  color space into this ColorSpace.
     */
    def fromCIEXYZ(colorvalue: Array[Float]): Array[Float]

    /** Transforms a color value assumed to be in the default CS_sRGB
     *  color space into this ColorSpace.
     */
    def fromRGB(rgbvalue: Array[Float]): Array[Float]

    /** Returns the maximum normalized color component value for the
     *  specified component.
     */
    def getMaxValue(component: Int): Float

    /** Returns the minimum normalized color component value for the
     *  specified component.
     */
    def getMinValue(component: Int): Float

    /** Returns the name of the component given the component index. */
    def getName(idx: Int): String

    /** Returns the number of components of this ColorSpace. */
    def getNumComponents(): Int

    /** Returns the color space type of this ColorSpace (for example
     *  TYPE_RGB, TYPE_XYZ, ...).
     */
    def getType(): Int

    /** Returns true if the ColorSpace is CS_sRGB. */
    def isCS_sRGB(): Boolean

    /** Transforms a color value assumed to be in this ColorSpace
     *  into the CS_CIEXYZ conversion color space.
     */
    def toCIEXYZ(colorvalue: Array[Float]): Array[Float]

    /** Transforms a color value assumed to be in this ColorSpace
     *  into a value in the default CS_sRGB color space.
     */
    def toRGB(colorvalue: Array[Float]): Array[Float]
}

object ColorSpace {
    /** The CIEXYZ conversion color space defined above. */
    @stub
    val CS_CIEXYZ: Int = ???

    /** The built-in linear gray scale color space. */
    @stub
    val CS_GRAY: Int = ???

    /** A built-in linear RGB color space. */
    @stub
    val CS_LINEAR_RGB: Int = ???

    /** The Photo YCC conversion color space. */
    @stub
    val CS_PYCC: Int = ???

    /** The sRGB color space defined at
     *  
     *  http://www.w3.org/pub/WWW/Graphics/Color/sRGB.html
     *  .
     */
    @stub
    val CS_sRGB: Int = ???

    /** Generic 2 component color spaces. */
    @stub
    val TYPE_2CLR: Int = ???

    /** Generic 3 component color spaces. */
    @stub
    val TYPE_3CLR: Int = ???

    /** Generic 4 component color spaces. */
    @stub
    val TYPE_4CLR: Int = ???

    /** Generic 5 component color spaces. */
    @stub
    val TYPE_5CLR: Int = ???

    /** Generic 6 component color spaces. */
    @stub
    val TYPE_6CLR: Int = ???

    /** Generic 7 component color spaces. */
    @stub
    val TYPE_7CLR: Int = ???

    /** Generic 8 component color spaces. */
    @stub
    val TYPE_8CLR: Int = ???

    /** Generic 9 component color spaces. */
    @stub
    val TYPE_9CLR: Int = ???

    /** Generic 10 component color spaces. */
    @stub
    val TYPE_ACLR: Int = ???

    /** Generic 11 component color spaces. */
    @stub
    val TYPE_BCLR: Int = ???

    /** Generic 12 component color spaces. */
    @stub
    val TYPE_CCLR: Int = ???

    /** Any of the family of CMY color spaces. */
    @stub
    val TYPE_CMY: Int = ???

    /** Any of the family of CMYK color spaces. */
    @stub
    val TYPE_CMYK: Int = ???

    /** Generic 13 component color spaces. */
    @stub
    val TYPE_DCLR: Int = ???

    /** Generic 14 component color spaces. */
    @stub
    val TYPE_ECLR: Int = ???

    /** Generic 15 component color spaces. */
    @stub
    val TYPE_FCLR: Int = ???

    /** Any of the family of GRAY color spaces. */
    @stub
    val TYPE_GRAY: Int = ???

    /** Any of the family of HLS color spaces. */
    @stub
    val TYPE_HLS: Int = ???

    /** Any of the family of HSV color spaces. */
    @stub
    val TYPE_HSV: Int = ???

    /** Any of the family of Lab color spaces. */
    @stub
    val TYPE_Lab: Int = ???

    /** Any of the family of Luv color spaces. */
    @stub
    val TYPE_Luv: Int = ???

    /** Any of the family of RGB color spaces. */
    @stub
    val TYPE_RGB: Int = ???

    /** Any of the family of XYZ color spaces. */
    @stub
    val TYPE_XYZ: Int = ???

    /** Any of the family of YCbCr color spaces. */
    @stub
    val TYPE_YCbCr: Int = ???

    /** Any of the family of Yxy color spaces. */
    @stub
    val TYPE_Yxy: Int = ???

    /** Returns a ColorSpace representing one of the specific
     *  predefined color spaces.
     */
    @stub
    def getInstance(colorspace: Int): ColorSpace = ???
}
