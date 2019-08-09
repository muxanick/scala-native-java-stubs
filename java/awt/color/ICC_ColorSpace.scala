package java.awt.color

import java.lang.Object
import scala.scalanative.annotation.stub

/** The ICC_ColorSpace class is an implementation of the abstract
 *  ColorSpace class.  This representation of
 *  device independent and device dependent color spaces is based on the
 *  International Color Consortium Specification ICC.1:2001-12, File Format for
 *  Color Profiles (see http://www.color.org).
 *  
 *  Typically, a Color or ColorModel would be associated with an ICC
 *  Profile which is either an input, display, or output profile (see
 *  the ICC specification).  There are other types of ICC Profiles, e.g.
 *  abstract profiles, device link profiles, and named color profiles,
 *  which do not contain information appropriate for representing the color
 *  space of a color, image, or device (see ICC_Profile).
 *  Attempting to create an ICC_ColorSpace object from an inappropriate ICC
 *  Profile is an error.
 *  
 *  ICC Profiles represent transformations from the color space of
 *  the profile (e.g. a monitor) to a Profile Connection Space (PCS).
 *  Profiles of interest for tagging images or colors have a
 *  PCS which is one of the device independent
 *  spaces (one CIEXYZ space and two CIELab spaces) defined in the
 *  ICC Profile Format Specification.  Most profiles of interest
 *  either have invertible transformations or explicitly specify
 *  transformations going both directions.  Should an ICC_ColorSpace
 *  object be used in a way requiring a conversion from PCS to
 *  the profile's native space and there is inadequate data to
 *  correctly perform the conversion, the ICC_ColorSpace object will
 *  produce output in the specified type of color space (e.g. TYPE_RGB,
 *  TYPE_CMYK, etc.), but the specific color values of the output data
 *  will be undefined.
 *  
 *  The details of this class are not important for simple applets,
 *  which draw in a default color space or manipulate and display
 *  imported images with a known color space.  At most, such applets
 *  would need to get one of the default color spaces via
 *  ColorSpace.getInstance().
 */
class ICC_ColorSpace extends ColorSpace {

    /** Constructs a new ICC_ColorSpace from an ICC_Profile object. */
    @stub
    def this(profile: ICC_Profile) = ???

    /** Transforms a color value assumed to be in the CS_CIEXYZ conversion
     *  color space into this ColorSpace.
     */
    @stub
    def fromCIEXYZ(colorvalue: Array[Float]): Array[Float] = ???

    /** Transforms a color value assumed to be in the default CS_sRGB
     *  color space into this ColorSpace.
     */
    @stub
    def fromRGB(rgbvalue: Array[Float]): Array[Float] = ???

    /** Returns the maximum normalized color component value for the
     *  specified component.
     */
    @stub
    def getMaxValue(component: Int): Float = ???

    /** Returns the minimum normalized color component value for the
     *  specified component.
     */
    @stub
    def getMinValue(component: Int): Float = ???

    /** Returns the ICC_Profile for this ICC_ColorSpace. */
    @stub
    def getProfile(): ICC_Profile = ???

    /** Transforms a color value assumed to be in this ColorSpace
     *  into the CS_CIEXYZ conversion color space.
     */
    @stub
    def toCIEXYZ(colorvalue: Array[Float]): Array[Float] = ???

    /** Transforms a color value assumed to be in this ColorSpace
     *  into a value in the default CS_sRGB color space.
     */
    @stub
    def toRGB(colorvalue: Array[Float]): Array[Float] = ???
}
