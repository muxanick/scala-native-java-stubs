package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import javax.print.attribute.{Attribute, DocAttribute, PrintJobAttribute, PrintRequestAttribute}
import scala.scalanative.annotation.stub

/** Class MediaPrintableArea is a printing attribute used to distinguish
 *  the printable and non-printable areas of media.
 *  
 *  The printable area is specified to be a rectangle, within the overall
 *  dimensions of a media.
 *  
 *  Most printers cannot print on the entire surface of the media, due
 *  to printer hardware limitations. This class can be used to query
 *  the acceptable values for a supposed print job, and to request an area
 *  within the constraints of the printable area to be used in a print job.
 *  
 *  To query for the printable area, a client must supply a suitable context.
 *  Without specifying at the very least the size of the media being used
 *  no meaningful value for printable area can be obtained.
 *  
 *  The attribute is not described in terms of the distance from the edge
 *  of the paper, in part to emphasise that this attribute is not independent
 *  of a particular media, but must be described within the context of a
 *  choice of other attributes. Additionally it is usually more convenient
 *  for a client to use the printable area.
 *  
 *  The hardware's minimum margins is not just a property of the printer,
 *  but may be a function of the media size, orientation, media type, and
 *  any specified finishings.
 *  PrintService provides the method to query the supported
 *  values of an attribute in a suitable context :
 *  See  PrintService.getSupportedAttributeValues()
 *  
 *  The rectangular printable area is defined thus:
 *  The (x,y) origin is positioned at the top-left of the paper in portrait
 *  mode regardless of the orientation specified in the requesting context.
 *  For example a printable area for A4 paper in portrait or landscape
 *  orientation will have height > width.
 *  
 *  A printable area attribute's values are stored
 *  internally as integers in units of micrometers (µm), where 1 micrometer
 *  = 10-6 meter = 1/1000 millimeter = 1/25400 inch. This permits
 *  dimensions to be represented exactly to a precision of 1/1000 mm (= 1
 *  µm) or 1/100 inch (= 254 µm). If fractional inches are expressed in
 * 
 *  negative powers of two, this permits dimensions to be represented exactly to
 *  a precision of 1/8 inch (= 3175 µm) but not 1/16 inch (because 1/16 inch
 * 
 *  does not equal an integral number of µm).
 *  
 *  IPP Compatibility: MediaPrintableArea is not an IPP attribute.
 */
final class MediaPrintableArea extends Object with DocAttribute with PrintRequestAttribute with PrintJobAttribute {

    /** Constructs a MediaPrintableArea object from floating point values. */
    @stub
    def this(x: Float, y: Float, w: Float, h: Float, units: Int) = ???

    /** Constructs a MediaPrintableArea object from integer values. */
    @stub
    def this(x: Int, y: Int, w: Int, h: Int, units: Int) = ???

    /** Returns whether this media margins attribute is equivalent to the passed
     *  in object.
     */
    @stub
    def equals(object: Object): Boolean = ???

    /** Get the printing attribute class which is to be used as the "category"
     *  for this printing attribute value.
     */
    @stub
    def getCategory(): Class[_ <: Attribute] = ???

    /** Get the height of the printable area in the specified units. */
    @stub
    def getHeight(units: Int): Float = ???

    /** Get the name of the category of which this attribute value is an
     *  instance.
     */
    @stub
    def getName(): String = ???

    /** Get the printable area as an array of 4 values in the order
     *  x, y, w, h.
     */
    @stub
    def getPrintableArea(units: Int): Array[Float] = ???

    /** Get the width of the printable area in the specified units. */
    @stub
    def getWidth(units: Int): Float = ???

    /** Get the x location of the origin of the printable area in the
     *  specified units.
     */
    @stub
    def getX(units: Int): Float = ???

    /** Get the y location of the origin of the printable area in the
     *  specified units.
     */
    @stub
    def getY(units: Int): Float = ???

    /** Returns a hash code value for this attribute. */
    @stub
    def hashCode(): Int = ???

    /** Returns a string version of this rectangular size attribute in mm. */
    @stub
    def toString(): String = ???

    /** Returns a string version of this rectangular size attribute in the
     *  given units.
     */
    @stub
    def toString(units: Int, unitsName: String): String = ???
}

object MediaPrintableArea {
    /** Value to indicate units of inches (in). */
    @stub
    val INCH: Int = ???

    /** Value to indicate units of millimeters (mm). */
    @stub
    val MM: Int = ???
}
