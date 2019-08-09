package java.awt.color

import java.io.{InputStream, OutputStream, Serializable}
import java.lang.{Object, String}

// A representation of color profile data for device independent and
// device dependent color spaces based on the International Color
// Consortium Specification ICC.1:2001-12, File Format for Color Profiles,
// (see  http://www.color.org).
// 
// An ICC_ColorSpace object can be constructed from an appropriate
// ICC_Profile.
// Typically, an ICC_ColorSpace would be associated with an ICC
// Profile which is either an input, display, or output profile (see
// the ICC specification).  There are also device link, abstract,
// color space conversion, and named color profiles.  These are less
// useful for tagging a color or image, but are useful for other
// purposes (in particular device link profiles can provide improved
// performance for converting from one device's color space to
// another's).
// 
// ICC Profiles represent transformations from the color space of
// the profile (e.g. a monitor) to a Profile Connection Space (PCS).
// Profiles of interest for tagging images or colors have a PCS
// which is one of the two specific device independent
// spaces (one CIEXYZ space and one CIELab space) defined in the
// ICC Profile Format Specification.  Most profiles of interest
// either have invertible transformations or explicitly specify
// transformations going both directions.
class ICC_Profile extends Object with Serializable {

    @stub
    // Frees the resources associated with an ICC_Profile object.
    protected def finalize(): Unit = ???

    @stub
    // Returns the color space type.
    def getColorSpaceType(): Int = ???

    @stub
    // Returns a byte array corresponding to the data of this ICC_Profile.
    def getData(): Array[Byte] = ???

    @stub
    // Returns a particular tagged data element from the profile as
    // a byte array.
    def getData(tagSignature: Int): Array[Byte] = ???

    @stub
    // Returns profile major version.
    def getMajorVersion(): Int = ???

    @stub
    // Returns profile minor version.
    def getMinorVersion(): Int = ???

    @stub
    // Returns the number of color components in the "input" color
    // space of this profile.
    def getNumComponents(): Int = ???

    @stub
    // Returns the color space type of the Profile Connection Space (PCS).
    def getPCSType(): Int = ???

    @stub
    // Returns the profile class.
    def getProfileClass(): Int = ???

    @stub
    // Resolves instances being deserialized into instances registered
    // with CMM.
    protected def readResolve(): Object = ???

    @stub
    // Sets a particular tagged data element in the profile from
    // a byte array.
    def setData(tagSignature: Int, tagData: Array[Byte]): Unit = ???

    @stub
    // Write this ICC_Profile to an OutputStream.
    def write(s: OutputStream): Unit = ???
}

object ICC_Profile {
    @stub
    // Profile class is abstract.
    def CLASS_ABSTRACT: Int = ???

    @stub
    // Profile class is color space conversion.
    def CLASS_COLORSPACECONVERSION: Int = ???

    @stub
    // Profile class is device link.
    def CLASS_DEVICELINK: Int = ???

    @stub
    // Profile class is display.
    def CLASS_DISPLAY: Int = ???

    @stub
    // Profile class is input.
    def CLASS_INPUT: Int = ???

    @stub
    // Profile class is named color.
    def CLASS_NAMEDCOLOR: Int = ???

    @stub
    // Profile class is output.
    def CLASS_OUTPUT: Int = ???

    @stub
    // ICC Profile Rendering Intent: AbsoluteColorimetric.
    def icAbsoluteColorimetric: Int = ???

    @stub
    // ICC Profile Constant: curveType count.
    def icCurveCount: Int = ???

    @stub
    // ICC Profile Constant: curveType data.
    def icCurveData: Int = ???

    @stub
    // ICC Profile Header Location: device attributes.
    def icHdrAttributes: Int = ???

    @stub
    // ICC Profile Header Location: CMM for this profile.
    def icHdrCmmId: Int = ???

    @stub
    // ICC Profile Header Location: color space of data.
    def icHdrColorSpace: Int = ???

    @stub
    // ICC Profile Header Location: profile creator.
    def icHdrCreator: Int = ???

    @stub
    // ICC Profile Header Location: date profile was created.
    def icHdrDate: Int = ???

    @stub
    // ICC Profile Header Location: type of profile.
    def icHdrDeviceClass: Int = ???

    @stub
    // ICC Profile Header Location: various bit settings.
    def icHdrFlags: Int = ???

    @stub
    // ICC Profile Header Location: profile illuminant.
    def icHdrIlluminant: Int = ???

    @stub
    // ICC Profile Header Location: icMagicNumber.
    def icHdrMagic: Int = ???

    @stub
    // ICC Profile Header Location: device manufacturer.
    def icHdrManufacturer: Int = ???

    @stub
    // ICC Profile Header Location: device model number.
    def icHdrModel: Int = ???

    @stub
    // ICC Profile Header Location: PCS - XYZ or Lab only.
    def icHdrPcs: Int = ???

    @stub
    // ICC Profile Header Location: primary platform.
    def icHdrPlatform: Int = ???

    @stub
    // ICC Profile Header Location: profile's ID.
    def icHdrProfileID: Int = ???

    @stub
    // ICC Profile Header Location: rendering intent.
    def icHdrRenderingIntent: Int = ???

    @stub
    // ICC Profile Header Location: profile size in bytes.
    def icHdrSize: Int = ???

    @stub
    // ICC Profile Header Location: format version number.
    def icHdrVersion: Int = ???

    @stub
    // ICC Profile Rendering Intent: ICC-AbsoluteColorimetric.
    def icICCAbsoluteColorimetric: Int = ???

    @stub
    // ICC Profile Rendering Intent: Media-RelativeColorimetric.
    def icMediaRelativeColorimetric: Int = ???

    @stub
    // ICC Profile Rendering Intent: Perceptual.
    def icPerceptual: Int = ???

    @stub
    // ICC Profile Rendering Intent: RelativeColorimetric.
    def icRelativeColorimetric: Int = ???

    @stub
    // ICC Profile Rendering Intent: Saturation.
    def icSaturation: Int = ???

    @stub
    // ICC Profile Class Signature: 'abst'.
    def icSigAbstractClass: Int = ???

    @stub
    // ICC Profile Tag Signature: 'A2B0'.
    def icSigAToB0Tag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'A2B1'.
    def icSigAToB1Tag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'A2B2'.
    def icSigAToB2Tag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'bXYZ'.
    def icSigBlueColorantTag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'bXYZ'.
    def icSigBlueMatrixColumnTag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'bTRC'.
    def icSigBlueTRCTag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'B2A0'.
    def icSigBToA0Tag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'B2A1'.
    def icSigBToA1Tag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'B2A2'.
    def icSigBToA2Tag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'calt'.
    def icSigCalibrationDateTimeTag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'targ'.
    def icSigCharTargetTag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'chad'.
    def icSigChromaticAdaptationTag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'chrm'.
    def icSigChromaticityTag: Int = ???

    @stub
    // ICC Profile Color Space Type Signature: 'CMY '.
    def icSigCmyData: Int = ???

    @stub
    // ICC Profile Color Space Type Signature: 'CMYK'.
    def icSigCmykData: Int = ???

    @stub
    // ICC Profile Tag Signature: 'clro'.
    def icSigColorantOrderTag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'clrt'.
    def icSigColorantTableTag: Int = ???

    @stub
    // ICC Profile Class Signature: 'spac'.
    def icSigColorSpaceClass: Int = ???

    @stub
    // ICC Profile Tag Signature: 'cprt'.
    def icSigCopyrightTag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'crdi'.
    def icSigCrdInfoTag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'dmnd'.
    def icSigDeviceMfgDescTag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'dmdd'.
    def icSigDeviceModelDescTag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'devs'.
    def icSigDeviceSettingsTag: Int = ???

    @stub
    // ICC Profile Class Signature: 'mntr'.
    def icSigDisplayClass: Int = ???

    @stub
    // ICC Profile Tag Signature: 'gamt'.
    def icSigGamutTag: Int = ???

    @stub
    // ICC Profile Color Space Type Signature: 'GRAY'.
    def icSigGrayData: Int = ???

    @stub
    // ICC Profile Tag Signature: 'kTRC'.
    def icSigGrayTRCTag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'gXYZ'.
    def icSigGreenColorantTag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'gXYZ'.
    def icSigGreenMatrixColumnTag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'gTRC'.
    def icSigGreenTRCTag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'head' - special.
    def icSigHead: Int = ???

    @stub
    // ICC Profile Color Space Type Signature: 'HLS'.
    def icSigHlsData: Int = ???

    @stub
    // ICC Profile Color Space Type Signature: 'HSV'.
    def icSigHsvData: Int = ???

    @stub
    // ICC Profile Class Signature: 'scnr'.
    def icSigInputClass: Int = ???

    @stub
    // ICC Profile Color Space Type Signature: 'Lab '.
    def icSigLabData: Int = ???

    @stub
    // ICC Profile Class Signature: 'link'.
    def icSigLinkClass: Int = ???

    @stub
    // ICC Profile Tag Signature: 'lumi'.
    def icSigLuminanceTag: Int = ???

    @stub
    // ICC Profile Color Space Type Signature: 'Luv '.
    def icSigLuvData: Int = ???

    @stub
    // ICC Profile Tag Signature: 'meas'.
    def icSigMeasurementTag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'bkpt'.
    def icSigMediaBlackPointTag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'wtpt'.
    def icSigMediaWhitePointTag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'ncl2'.
    def icSigNamedColor2Tag: Int = ???

    @stub
    // ICC Profile Class Signature: 'nmcl'.
    def icSigNamedColorClass: Int = ???

    @stub
    // ICC Profile Class Signature: 'prtr'.
    def icSigOutputClass: Int = ???

    @stub
    // ICC Profile Tag Signature: 'resp'.
    def icSigOutputResponseTag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'pre0'.
    def icSigPreview0Tag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'pre1'.
    def icSigPreview1Tag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'pre2'.
    def icSigPreview2Tag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'desc'.
    def icSigProfileDescriptionTag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'pseq'.
    def icSigProfileSequenceDescTag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'psd0'.
    def icSigPs2CRD0Tag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'psd1'.
    def icSigPs2CRD1Tag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'psd2'.
    def icSigPs2CRD2Tag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'psd3'.
    def icSigPs2CRD3Tag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'ps2s'.
    def icSigPs2CSATag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'ps2i'.
    def icSigPs2RenderingIntentTag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'rXYZ'.
    def icSigRedColorantTag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'rXYZ'.
    def icSigRedMatrixColumnTag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'rTRC'.
    def icSigRedTRCTag: Int = ???

    @stub
    // ICC Profile Color Space Type Signature: 'RGB '.
    def icSigRgbData: Int = ???

    @stub
    // ICC Profile Tag Signature: 'scrd'.
    def icSigScreeningDescTag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'scrn'.
    def icSigScreeningTag: Int = ???

    @stub
    // ICC Profile Color Space Type Signature: '2CLR'.
    def icSigSpace2CLR: Int = ???

    @stub
    // ICC Profile Color Space Type Signature: '3CLR'.
    def icSigSpace3CLR: Int = ???

    @stub
    // ICC Profile Color Space Type Signature: '4CLR'.
    def icSigSpace4CLR: Int = ???

    @stub
    // ICC Profile Color Space Type Signature: '5CLR'.
    def icSigSpace5CLR: Int = ???

    @stub
    // ICC Profile Color Space Type Signature: '6CLR'.
    def icSigSpace6CLR: Int = ???

    @stub
    // ICC Profile Color Space Type Signature: '7CLR'.
    def icSigSpace7CLR: Int = ???

    @stub
    // ICC Profile Color Space Type Signature: '8CLR'.
    def icSigSpace8CLR: Int = ???

    @stub
    // ICC Profile Color Space Type Signature: '9CLR'.
    def icSigSpace9CLR: Int = ???

    @stub
    // ICC Profile Color Space Type Signature: 'ACLR'.
    def icSigSpaceACLR: Int = ???

    @stub
    // ICC Profile Color Space Type Signature: 'BCLR'.
    def icSigSpaceBCLR: Int = ???

    @stub
    // ICC Profile Color Space Type Signature: 'CCLR'.
    def icSigSpaceCCLR: Int = ???

    @stub
    // ICC Profile Color Space Type Signature: 'DCLR'.
    def icSigSpaceDCLR: Int = ???

    @stub
    // ICC Profile Color Space Type Signature: 'ECLR'.
    def icSigSpaceECLR: Int = ???

    @stub
    // ICC Profile Color Space Type Signature: 'FCLR'.
    def icSigSpaceFCLR: Int = ???

    @stub
    // ICC Profile Tag Signature: 'tech'.
    def icSigTechnologyTag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'bfd '.
    def icSigUcrBgTag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'vued'.
    def icSigViewingCondDescTag: Int = ???

    @stub
    // ICC Profile Tag Signature: 'view'.
    def icSigViewingConditionsTag: Int = ???

    @stub
    // ICC Profile Color Space Type Signature: 'XYZ '.
    def icSigXYZData: Int = ???

    @stub
    // ICC Profile Color Space Type Signature: 'YCbr'.
    def icSigYCbCrData: Int = ???

    @stub
    // ICC Profile Color Space Type Signature: 'Yxy '.
    def icSigYxyData: Int = ???

    @stub
    // ICC Profile Constant: reserved.
    def icTagReserved: Int = ???

    @stub
    // ICC Profile Constant: tag type signaturE.
    def icTagType: Int = ???

    @stub
    // Constructs an ICC_Profile object corresponding to the data in
    // a byte array.
    def getInstance(data: Array[Byte]): ICC_Profile = ???

    @stub
    // Constructs an ICC_Profile corresponding to the data in an InputStream.
    def getInstance(s: InputStream): ICC_Profile = ???

    @stub
    // Constructs an ICC_Profile corresponding to one of the specific color
    // spaces defined by the ColorSpace class (for example CS_sRGB).
    def getInstance(cspace: Int): ICC_Profile = ???

    @stub
    // Constructs an ICC_Profile corresponding to the data in a file.
    def getInstance(fileName: String): ICC_Profile = ???
}
