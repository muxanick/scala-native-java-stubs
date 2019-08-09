package java.awt.color

import java.io.{InputStream, OutputStream, Serializable}
import java.lang.{Object, String}

/** A representation of color profile data for device independent and
 *  device dependent color spaces based on the International Color
 *  Consortium Specification ICC.1:2001-12, File Format for Color Profiles,
 *  (see  http://www.color.org).
 *  
 *  An ICC_ColorSpace object can be constructed from an appropriate
 *  ICC_Profile.
 *  Typically, an ICC_ColorSpace would be associated with an ICC
 *  Profile which is either an input, display, or output profile (see
 *  the ICC specification).  There are also device link, abstract,
 *  color space conversion, and named color profiles.  These are less
 *  useful for tagging a color or image, but are useful for other
 *  purposes (in particular device link profiles can provide improved
 *  performance for converting from one device's color space to
 *  another's).
 *  
 *  ICC Profiles represent transformations from the color space of
 *  the profile (e.g. a monitor) to a Profile Connection Space (PCS).
 *  Profiles of interest for tagging images or colors have a PCS
 *  which is one of the two specific device independent
 *  spaces (one CIEXYZ space and one CIELab space) defined in the
 *  ICC Profile Format Specification.  Most profiles of interest
 *  either have invertible transformations or explicitly specify
 *  transformations going both directions.
 */
class ICC_Profile extends Object with Serializable {

    /** Frees the resources associated with an ICC_Profile object. */
    @stub
    protected def finalize(): Unit = ???

    /** Returns the color space type. */
    @stub
    def getColorSpaceType(): Int = ???

    /** Returns a byte array corresponding to the data of this ICC_Profile. */
    @stub
    def getData(): Array[Byte] = ???

    /** Returns a particular tagged data element from the profile as
     *  a byte array.
     */
    @stub
    def getData(tagSignature: Int): Array[Byte] = ???

    /** Returns profile major version. */
    @stub
    def getMajorVersion(): Int = ???

    /** Returns profile minor version. */
    @stub
    def getMinorVersion(): Int = ???

    /** Returns the number of color components in the "input" color
     *  space of this profile.
     */
    @stub
    def getNumComponents(): Int = ???

    /** Returns the color space type of the Profile Connection Space (PCS). */
    @stub
    def getPCSType(): Int = ???

    /** Returns the profile class. */
    @stub
    def getProfileClass(): Int = ???

    /** Resolves instances being deserialized into instances registered
     *  with CMM.
     */
    @stub
    protected def readResolve(): Object = ???

    /** Sets a particular tagged data element in the profile from
     *  a byte array.
     */
    @stub
    def setData(tagSignature: Int, tagData: Array[Byte]): Unit = ???

    /** Write this ICC_Profile to an OutputStream. */
    @stub
    def write(s: OutputStream): Unit = ???
}

object ICC_Profile {
    /** Profile class is abstract. */
    @stub
    val CLASS_ABSTRACT: Int = ???

    /** Profile class is color space conversion. */
    @stub
    val CLASS_COLORSPACECONVERSION: Int = ???

    /** Profile class is device link. */
    @stub
    val CLASS_DEVICELINK: Int = ???

    /** Profile class is display. */
    @stub
    val CLASS_DISPLAY: Int = ???

    /** Profile class is input. */
    @stub
    val CLASS_INPUT: Int = ???

    /** Profile class is named color. */
    @stub
    val CLASS_NAMEDCOLOR: Int = ???

    /** Profile class is output. */
    @stub
    val CLASS_OUTPUT: Int = ???

    /** ICC Profile Rendering Intent: AbsoluteColorimetric. */
    @stub
    val icAbsoluteColorimetric: Int = ???

    /** ICC Profile Constant: curveType count. */
    @stub
    val icCurveCount: Int = ???

    /** ICC Profile Constant: curveType data. */
    @stub
    val icCurveData: Int = ???

    /** ICC Profile Header Location: device attributes. */
    @stub
    val icHdrAttributes: Int = ???

    /** ICC Profile Header Location: CMM for this profile. */
    @stub
    val icHdrCmmId: Int = ???

    /** ICC Profile Header Location: color space of data. */
    @stub
    val icHdrColorSpace: Int = ???

    /** ICC Profile Header Location: profile creator. */
    @stub
    val icHdrCreator: Int = ???

    /** ICC Profile Header Location: date profile was created. */
    @stub
    val icHdrDate: Int = ???

    /** ICC Profile Header Location: type of profile. */
    @stub
    val icHdrDeviceClass: Int = ???

    /** ICC Profile Header Location: various bit settings. */
    @stub
    val icHdrFlags: Int = ???

    /** ICC Profile Header Location: profile illuminant. */
    @stub
    val icHdrIlluminant: Int = ???

    /** ICC Profile Header Location: icMagicNumber. */
    @stub
    val icHdrMagic: Int = ???

    /** ICC Profile Header Location: device manufacturer. */
    @stub
    val icHdrManufacturer: Int = ???

    /** ICC Profile Header Location: device model number. */
    @stub
    val icHdrModel: Int = ???

    /** ICC Profile Header Location: PCS - XYZ or Lab only. */
    @stub
    val icHdrPcs: Int = ???

    /** ICC Profile Header Location: primary platform. */
    @stub
    val icHdrPlatform: Int = ???

    /** ICC Profile Header Location: profile's ID. */
    @stub
    val icHdrProfileID: Int = ???

    /** ICC Profile Header Location: rendering intent. */
    @stub
    val icHdrRenderingIntent: Int = ???

    /** ICC Profile Header Location: profile size in bytes. */
    @stub
    val icHdrSize: Int = ???

    /** ICC Profile Header Location: format version number. */
    @stub
    val icHdrVersion: Int = ???

    /** ICC Profile Rendering Intent: ICC-AbsoluteColorimetric. */
    @stub
    val icICCAbsoluteColorimetric: Int = ???

    /** ICC Profile Rendering Intent: Media-RelativeColorimetric. */
    @stub
    val icMediaRelativeColorimetric: Int = ???

    /** ICC Profile Rendering Intent: Perceptual. */
    @stub
    val icPerceptual: Int = ???

    /** ICC Profile Rendering Intent: RelativeColorimetric. */
    @stub
    val icRelativeColorimetric: Int = ???

    /** ICC Profile Rendering Intent: Saturation. */
    @stub
    val icSaturation: Int = ???

    /** ICC Profile Class Signature: 'abst'. */
    @stub
    val icSigAbstractClass: Int = ???

    /** ICC Profile Tag Signature: 'A2B0'. */
    @stub
    val icSigAToB0Tag: Int = ???

    /** ICC Profile Tag Signature: 'A2B1'. */
    @stub
    val icSigAToB1Tag: Int = ???

    /** ICC Profile Tag Signature: 'A2B2'. */
    @stub
    val icSigAToB2Tag: Int = ???

    /** ICC Profile Tag Signature: 'bXYZ'. */
    @stub
    val icSigBlueColorantTag: Int = ???

    /** ICC Profile Tag Signature: 'bXYZ'. */
    @stub
    val icSigBlueMatrixColumnTag: Int = ???

    /** ICC Profile Tag Signature: 'bTRC'. */
    @stub
    val icSigBlueTRCTag: Int = ???

    /** ICC Profile Tag Signature: 'B2A0'. */
    @stub
    val icSigBToA0Tag: Int = ???

    /** ICC Profile Tag Signature: 'B2A1'. */
    @stub
    val icSigBToA1Tag: Int = ???

    /** ICC Profile Tag Signature: 'B2A2'. */
    @stub
    val icSigBToA2Tag: Int = ???

    /** ICC Profile Tag Signature: 'calt'. */
    @stub
    val icSigCalibrationDateTimeTag: Int = ???

    /** ICC Profile Tag Signature: 'targ'. */
    @stub
    val icSigCharTargetTag: Int = ???

    /** ICC Profile Tag Signature: 'chad'. */
    @stub
    val icSigChromaticAdaptationTag: Int = ???

    /** ICC Profile Tag Signature: 'chrm'. */
    @stub
    val icSigChromaticityTag: Int = ???

    /** ICC Profile Color Space Type Signature: 'CMY '. */
    @stub
    val icSigCmyData: Int = ???

    /** ICC Profile Color Space Type Signature: 'CMYK'. */
    @stub
    val icSigCmykData: Int = ???

    /** ICC Profile Tag Signature: 'clro'. */
    @stub
    val icSigColorantOrderTag: Int = ???

    /** ICC Profile Tag Signature: 'clrt'. */
    @stub
    val icSigColorantTableTag: Int = ???

    /** ICC Profile Class Signature: 'spac'. */
    @stub
    val icSigColorSpaceClass: Int = ???

    /** ICC Profile Tag Signature: 'cprt'. */
    @stub
    val icSigCopyrightTag: Int = ???

    /** ICC Profile Tag Signature: 'crdi'. */
    @stub
    val icSigCrdInfoTag: Int = ???

    /** ICC Profile Tag Signature: 'dmnd'. */
    @stub
    val icSigDeviceMfgDescTag: Int = ???

    /** ICC Profile Tag Signature: 'dmdd'. */
    @stub
    val icSigDeviceModelDescTag: Int = ???

    /** ICC Profile Tag Signature: 'devs'. */
    @stub
    val icSigDeviceSettingsTag: Int = ???

    /** ICC Profile Class Signature: 'mntr'. */
    @stub
    val icSigDisplayClass: Int = ???

    /** ICC Profile Tag Signature: 'gamt'. */
    @stub
    val icSigGamutTag: Int = ???

    /** ICC Profile Color Space Type Signature: 'GRAY'. */
    @stub
    val icSigGrayData: Int = ???

    /** ICC Profile Tag Signature: 'kTRC'. */
    @stub
    val icSigGrayTRCTag: Int = ???

    /** ICC Profile Tag Signature: 'gXYZ'. */
    @stub
    val icSigGreenColorantTag: Int = ???

    /** ICC Profile Tag Signature: 'gXYZ'. */
    @stub
    val icSigGreenMatrixColumnTag: Int = ???

    /** ICC Profile Tag Signature: 'gTRC'. */
    @stub
    val icSigGreenTRCTag: Int = ???

    /** ICC Profile Tag Signature: 'head' - special. */
    @stub
    val icSigHead: Int = ???

    /** ICC Profile Color Space Type Signature: 'HLS'. */
    @stub
    val icSigHlsData: Int = ???

    /** ICC Profile Color Space Type Signature: 'HSV'. */
    @stub
    val icSigHsvData: Int = ???

    /** ICC Profile Class Signature: 'scnr'. */
    @stub
    val icSigInputClass: Int = ???

    /** ICC Profile Color Space Type Signature: 'Lab '. */
    @stub
    val icSigLabData: Int = ???

    /** ICC Profile Class Signature: 'link'. */
    @stub
    val icSigLinkClass: Int = ???

    /** ICC Profile Tag Signature: 'lumi'. */
    @stub
    val icSigLuminanceTag: Int = ???

    /** ICC Profile Color Space Type Signature: 'Luv '. */
    @stub
    val icSigLuvData: Int = ???

    /** ICC Profile Tag Signature: 'meas'. */
    @stub
    val icSigMeasurementTag: Int = ???

    /** ICC Profile Tag Signature: 'bkpt'. */
    @stub
    val icSigMediaBlackPointTag: Int = ???

    /** ICC Profile Tag Signature: 'wtpt'. */
    @stub
    val icSigMediaWhitePointTag: Int = ???

    /** ICC Profile Tag Signature: 'ncl2'. */
    @stub
    val icSigNamedColor2Tag: Int = ???

    /** ICC Profile Class Signature: 'nmcl'. */
    @stub
    val icSigNamedColorClass: Int = ???

    /** ICC Profile Class Signature: 'prtr'. */
    @stub
    val icSigOutputClass: Int = ???

    /** ICC Profile Tag Signature: 'resp'. */
    @stub
    val icSigOutputResponseTag: Int = ???

    /** ICC Profile Tag Signature: 'pre0'. */
    @stub
    val icSigPreview0Tag: Int = ???

    /** ICC Profile Tag Signature: 'pre1'. */
    @stub
    val icSigPreview1Tag: Int = ???

    /** ICC Profile Tag Signature: 'pre2'. */
    @stub
    val icSigPreview2Tag: Int = ???

    /** ICC Profile Tag Signature: 'desc'. */
    @stub
    val icSigProfileDescriptionTag: Int = ???

    /** ICC Profile Tag Signature: 'pseq'. */
    @stub
    val icSigProfileSequenceDescTag: Int = ???

    /** ICC Profile Tag Signature: 'psd0'. */
    @stub
    val icSigPs2CRD0Tag: Int = ???

    /** ICC Profile Tag Signature: 'psd1'. */
    @stub
    val icSigPs2CRD1Tag: Int = ???

    /** ICC Profile Tag Signature: 'psd2'. */
    @stub
    val icSigPs2CRD2Tag: Int = ???

    /** ICC Profile Tag Signature: 'psd3'. */
    @stub
    val icSigPs2CRD3Tag: Int = ???

    /** ICC Profile Tag Signature: 'ps2s'. */
    @stub
    val icSigPs2CSATag: Int = ???

    /** ICC Profile Tag Signature: 'ps2i'. */
    @stub
    val icSigPs2RenderingIntentTag: Int = ???

    /** ICC Profile Tag Signature: 'rXYZ'. */
    @stub
    val icSigRedColorantTag: Int = ???

    /** ICC Profile Tag Signature: 'rXYZ'. */
    @stub
    val icSigRedMatrixColumnTag: Int = ???

    /** ICC Profile Tag Signature: 'rTRC'. */
    @stub
    val icSigRedTRCTag: Int = ???

    /** ICC Profile Color Space Type Signature: 'RGB '. */
    @stub
    val icSigRgbData: Int = ???

    /** ICC Profile Tag Signature: 'scrd'. */
    @stub
    val icSigScreeningDescTag: Int = ???

    /** ICC Profile Tag Signature: 'scrn'. */
    @stub
    val icSigScreeningTag: Int = ???

    /** ICC Profile Color Space Type Signature: '2CLR'. */
    @stub
    val icSigSpace2CLR: Int = ???

    /** ICC Profile Color Space Type Signature: '3CLR'. */
    @stub
    val icSigSpace3CLR: Int = ???

    /** ICC Profile Color Space Type Signature: '4CLR'. */
    @stub
    val icSigSpace4CLR: Int = ???

    /** ICC Profile Color Space Type Signature: '5CLR'. */
    @stub
    val icSigSpace5CLR: Int = ???

    /** ICC Profile Color Space Type Signature: '6CLR'. */
    @stub
    val icSigSpace6CLR: Int = ???

    /** ICC Profile Color Space Type Signature: '7CLR'. */
    @stub
    val icSigSpace7CLR: Int = ???

    /** ICC Profile Color Space Type Signature: '8CLR'. */
    @stub
    val icSigSpace8CLR: Int = ???

    /** ICC Profile Color Space Type Signature: '9CLR'. */
    @stub
    val icSigSpace9CLR: Int = ???

    /** ICC Profile Color Space Type Signature: 'ACLR'. */
    @stub
    val icSigSpaceACLR: Int = ???

    /** ICC Profile Color Space Type Signature: 'BCLR'. */
    @stub
    val icSigSpaceBCLR: Int = ???

    /** ICC Profile Color Space Type Signature: 'CCLR'. */
    @stub
    val icSigSpaceCCLR: Int = ???

    /** ICC Profile Color Space Type Signature: 'DCLR'. */
    @stub
    val icSigSpaceDCLR: Int = ???

    /** ICC Profile Color Space Type Signature: 'ECLR'. */
    @stub
    val icSigSpaceECLR: Int = ???

    /** ICC Profile Color Space Type Signature: 'FCLR'. */
    @stub
    val icSigSpaceFCLR: Int = ???

    /** ICC Profile Tag Signature: 'tech'. */
    @stub
    val icSigTechnologyTag: Int = ???

    /** ICC Profile Tag Signature: 'bfd '. */
    @stub
    val icSigUcrBgTag: Int = ???

    /** ICC Profile Tag Signature: 'vued'. */
    @stub
    val icSigViewingCondDescTag: Int = ???

    /** ICC Profile Tag Signature: 'view'. */
    @stub
    val icSigViewingConditionsTag: Int = ???

    /** ICC Profile Color Space Type Signature: 'XYZ '. */
    @stub
    val icSigXYZData: Int = ???

    /** ICC Profile Color Space Type Signature: 'YCbr'. */
    @stub
    val icSigYCbCrData: Int = ???

    /** ICC Profile Color Space Type Signature: 'Yxy '. */
    @stub
    val icSigYxyData: Int = ???

    /** ICC Profile Constant: reserved. */
    @stub
    val icTagReserved: Int = ???

    /** ICC Profile Constant: tag type signaturE. */
    @stub
    val icTagType: Int = ???

    /** Constructs an ICC_Profile object corresponding to the data in
     *  a byte array.
     */
    @stub
    def getInstance(data: Array[Byte]): ICC_Profile = ???

    /** Constructs an ICC_Profile corresponding to the data in an InputStream. */
    @stub
    def getInstance(s: InputStream): ICC_Profile = ???

    /** Constructs an ICC_Profile corresponding to one of the specific color
     *  spaces defined by the ColorSpace class (for example CS_sRGB).
     */
    @stub
    def getInstance(cspace: Int): ICC_Profile = ???

    /** Constructs an ICC_Profile corresponding to the data in a file. */
    @stub
    def getInstance(fileName: String): ICC_Profile = ???
}
