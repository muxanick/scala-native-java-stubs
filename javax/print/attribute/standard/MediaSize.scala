package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import javax.print.attribute.{Attribute, Size2DSyntax}
import scala.scalanative.annotation.stub

/** Class MediaSize is a two-dimensional size valued printing attribute class
 *  that indicates the dimensions of the medium in a portrait orientation, with
 *  the X dimension running along the bottom edge and the Y dimension running
 *  along the left edge. Thus, the Y dimension must be greater than or equal to
 *  the X dimension. Class MediaSize declares many standard media size
 *  values, organized into nested classes for ISO, JIS, North American,
 *  engineering, and other media.
 *  
 *  MediaSize is not yet used to specify media. Its current role is
 *  as a mapping for named media (see MediaSizeName).
 *  Clients can use the mapping method
 *  MediaSize.getMediaSizeForName(MediaSizeName)
 *  to find the physical dimensions of the MediaSizeName instances
 *  enumerated in this API. This is useful for clients which need this
 *  information to format & paginate printing.
 *  
 */
class MediaSize extends Size2DSyntax with Attribute {

    /** Construct a new media size attribute from the given floating-point
     *  values.
     */
    @stub
    def this(x: Float, y: Float, units: Int) = ???

    /** Construct a new media size attribute from the given floating-point
     *  values.
     */
    @stub
    def this(x: Float, y: Float, units: Int, media: MediaSizeName) = ???

    /** Construct a new media size attribute from the given integer values. */
    @stub
    def this(x: Int, y: Int, units: Int) = ???

    /** Construct a new media size attribute from the given integer values. */
    @stub
    def this(x: Int, y: Int, units: Int, media: MediaSizeName) = ???

    /** Returns whether this media size attribute is equivalent to the passed
     *  in object.
     */
    @stub
    def equals(object: Object): Boolean = ???

    /** Get the printing attribute class which is to be used as the "category"
     *  for this printing attribute value.
     */
    @stub
    def getCategory(): Class[_ <: Attribute] = ???

    /** Get the media name, if any, for this size. */
    @stub
    def getMediaSizeName(): MediaSizeName = ???

    /** Get the name of the category of which this attribute value is an
     *  instance.
     */
    @stub
    def getName(): String = ???
}

object MediaSize {
    /** Class MediaSize.Engineering includes MediaSize values
     *  for engineering media.
     */
    @stub
    object Engineering extends MediaSize.Engineering

    /** Class MediaSize.ISO includes MediaSize values for ISO
     *  media.
     */
    @stub
    object ISO extends MediaSize.ISO

    /** Class MediaSize.JIS includes MediaSize values for JIS
     *  (Japanese) media.
     */
    @stub
    object JIS extends MediaSize.JIS

    /** Class MediaSize.NA includes MediaSize values for North
     *  American media.
     */
    @stub
    object NA extends MediaSize.NA

    /** Class MediaSize.Other includes MediaSize values for
     *  miscellaneous media.
     */
    @stub
    object Other extends MediaSize.Other

    /** The specified dimensions are used to locate a matching MediaSize
     *  instance from amongst all the standard MediaSize instances.
     */
    @stub
    def findMedia(x: Float, y: Float, units: Int): MediaSizeName = ???

    /** Get the MediaSize for the specified named media. */
    @stub
    def getMediaSizeForName(media: MediaSizeName): MediaSize = ???
}
