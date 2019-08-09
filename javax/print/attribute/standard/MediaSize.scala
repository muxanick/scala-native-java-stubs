package javax.print.attribute.standard

import java.lang.{Class, Object}
import javax.print.attribute.{Attribute, Size2DSyntax}

// Class MediaSize is a two-dimensional size valued printing attribute class
// that indicates the dimensions of the medium in a portrait orientation, with
// the X dimension running along the bottom edge and the Y dimension running
// along the left edge. Thus, the Y dimension must be greater than or equal to
// the X dimension. Class MediaSize declares many standard media size
// values, organized into nested classes for ISO, JIS, North American,
// engineering, and other media.
// 
// MediaSize is not yet used to specify media. Its current role is
// as a mapping for named media (see MediaSizeName).
// Clients can use the mapping method
// MediaSize.getMediaSizeForName(MediaSizeName)
// to find the physical dimensions of the MediaSizeName instances
// enumerated in this API. This is useful for clients which need this
// information to format & paginate printing.
// 
class MediaSize extends Size2DSyntax with Attribute {

    @stub
    // Construct a new media size attribute from the given floating-point
    // values.
    def this(x: float, y: float, units: Int) = ???

    @stub
    // Construct a new media size attribute from the given floating-point
    // values.
    def this(x: float, y: float, units: Int, media: MediaSizeName) = ???

    @stub
    // Construct a new media size attribute from the given integer values.
    def this(x: Int, y: Int, units: Int) = ???

    @stub
    // Returns whether this media size attribute is equivalent to the passed
    // in object.
    def equals(object: Object): Boolean = ???

    @stub
    // Get the printing attribute class which is to be used as the "category"
    // for this printing attribute value.
    def getCategory(): Class[_ <: Attribute] = ???

    @stub
    // Get the media name, if any, for this size.
    def getMediaSizeName(): MediaSizeName = ???
}

object MediaSize {
    @stub
    // Class MediaSize.Engineering includes MediaSize values
    // for engineering media.
    def MediaSize.Engineering: class = ???

    @stub
    // Class MediaSize.ISO includes MediaSize values for ISO
    // media.
    def MediaSize.ISO: class = ???

    @stub
    // Class MediaSize.JIS includes MediaSize values for JIS
    // (Japanese) media.
    def MediaSize.JIS: class = ???

    @stub
    // Class MediaSize.NA includes MediaSize values for North
    // American media.
    def MediaSize.NA: class = ???

    @stub
    // The specified dimensions are used to locate a matching MediaSize
    // instance from amongst all the standard MediaSize instances.
    def findMedia(x: float, y: float, units: Int): MediaSizeName = ???

    @stub
    // Get the MediaSize for the specified named media.
    def getMediaSizeForName(media: MediaSizeName): MediaSize = ???
}
