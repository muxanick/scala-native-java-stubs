package java.awt.color

import java.lang.Object
import scala.scalanative.annotation.stub

/** The ICC_ProfileRGB class is a subclass of the ICC_Profile class
 *  that represents profiles which meet the following criteria:
 *  
 *  The profile's color space type is RGB.
 *  The profile includes the redColorantTag,
 *  greenColorantTag, blueColorantTag,
 *  redTRCTag, greenTRCTag,
 *  blueTRCTag, and mediaWhitePointTag tags.
 *  
 *  The ICC_Profile getInstance method will
 *  return an ICC_ProfileRGB object when these conditions are met.
 *  Three-component, matrix-based input profiles and RGB display profiles are
 *  examples of this type of profile.
 *  
 *  This profile class provides color transform matrices and lookup tables
 *  that Java or native methods can use directly to
 *  optimize color conversion in some cases.
 *  
 *  To transform from a device profile color space to the CIEXYZ Profile
 *  Connection Space, each device color component is first linearized by
 *  a lookup through the corresponding tone reproduction curve (TRC).
 *  The resulting linear RGB components are converted to the CIEXYZ PCS
 *  using a a 3x3 matrix constructed from the RGB colorants.
 *  
 * 
 *                  linearR = redTRC[deviceR]
 * 
 *                  linearG = greenTRC[deviceG]
 * 
 *                  linearB = blueTRC[deviceB]
 * 
 *    _      _       _                                             _   _         _
 *   [  PCSX  ]     [  redColorantX  greenColorantX  blueColorantX  ] [  linearR  ]
 *   [        ]     [                                               ] [           ]
 *   [  PCSY  ]  =  [  redColorantY  greenColorantY  blueColorantY  ] [  linearG  ]
 *   [        ]     [                                               ] [           ]
 *   [_ PCSZ _]     [_ redColorantZ  greenColorantZ  blueColorantZ _] [_ linearB _]
 * 
 *  
 *  The inverse transform is performed by converting PCS XYZ components to linear
 *  RGB components through the inverse of the above 3x3 matrix, and then converting
 *  linear RGB to device RGB through inverses of the TRCs.
 */
class ICC_ProfileRGB extends ICC_Profile {

    /** Returns a gamma value representing the tone reproduction curve
     *  (TRC) for a particular component.
     */
    @stub
    def getGamma(component: Int): Float = ???

    /** Returns a 3x3 float matrix constructed from the
     *  X, Y, and Z components of the profile's redColorantTag,
     *  greenColorantTag, and blueColorantTag.
     */
    @stub
    def getMatrix(): Array[Array[Float]] = ???

    /** Returns an array that contains the components of the profile's
     *  mediaWhitePointTag.
     */
    @stub
    def getMediaWhitePoint(): Array[Float] = ???

    /** Returns the TRC for a particular component as an array. */
    @stub
    def getTRC(component: Int): Array[Short] = ???
}

object ICC_ProfileRGB {
    /** Used to get a gamma value or TRC for the blue component. */
    @stub
    val BLUECOMPONENT: Int = ???

    /** Used to get a gamma value or TRC for the green component. */
    @stub
    val GREENCOMPONENT: Int = ???

    /** Used to get a gamma value or TRC for the red component. */
    @stub
    val REDCOMPONENT: Int = ???
}
