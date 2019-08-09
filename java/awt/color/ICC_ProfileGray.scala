package java.awt.color

import java.lang.Object

/** A subclass of the ICC_Profile class which represents profiles
 *  which meet the following criteria: the color space type of the
 *  profile is TYPE_GRAY and the profile includes the grayTRCTag and
 *  mediaWhitePointTag tags.  Examples of this kind of profile are
 *  monochrome input profiles, monochrome display profiles, and
 *  monochrome output profiles.  The getInstance methods in the
 *  ICC_Profile class will
 *  return an ICC_ProfileGray object when the above conditions are
 *  met.  The advantage of this class is that it provides a lookup
 *  table that Java or native methods may be able to use directly to
 *  optimize color conversion in some cases.
 *  
 *  To transform from a GRAY device profile color space to the CIEXYZ Profile
 *  Connection Space, the device gray component is transformed by
 *  a lookup through the tone reproduction curve (TRC).  The result is
 *  treated as the achromatic component of the PCS.
 * 
 * 
 *                 PCSY = grayTRC[deviceGray]
 * 
 * 
 *  The inverse transform is done by converting the PCS Y components to
 *  device Gray via the inverse of the grayTRC.
 */
class ICC_ProfileGray extends ICC_Profile {

    /** Returns a gamma value representing the tone reproduction
     *  curve (TRC).
     */
    @stub
    def getGamma(): Float = ???

    /** Returns a float array of length 3 containing the X, Y, and Z
     *  components of the mediaWhitePointTag in the ICC profile.
     */
    @stub
    def getMediaWhitePoint(): Array[Float] = ???
}
