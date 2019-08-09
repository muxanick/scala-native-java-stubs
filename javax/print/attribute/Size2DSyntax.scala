package javax.print.attribute

import java.io.Serializable
import java.lang.{Cloneable, Object, String}

/** Class Size2DSyntax is an abstract base class providing the common
 *  implementation of all attributes denoting a size in two dimensions.
 *  
 *  A two-dimensional size attribute's value consists of two items, the X
 *  dimension and the Y dimension. A two-dimensional size attribute may be
 *  constructed by supplying the two values and indicating the units in which the
 *  values are measured. Methods are provided to return a two-dimensional size
 *  attribute's values, indicating the units in which the values are to be
 *  returned. The two most common size units are inches (in) and millimeters
 *  (mm), and exported constants INCH and MM are provided for indicating those units.
 *  
 *  Once constructed, a two-dimensional size attribute's value is immutable.
 *  
 *  Design
 *  
 *  A two-dimensional size attribute's X and Y dimension values are stored
 *  internally as integers in units of micrometers (µm), where 1 micrometer
 *  = 10-6 meter = 1/1000 millimeter = 1/25400 inch. This permits
 *  dimensions to be represented exactly to a precision of 1/1000 mm (= 1
 *  µm) or 1/100 inch (= 254 µm). If fractional inches are expressed in
 *  negative powers of two, this permits dimensions to be represented exactly to
 *  a precision of 1/8 inch (= 3175 µm) but not 1/16 inch (because 1/16 inch
 *  does not equal an integral number of µm).
 *  
 *  Storing the dimensions internally in common units of µm lets two size
 *  attributes be compared without regard to the units in which they were
 *  created; for example, 8.5 in will compare equal to 215.9 mm, as they both are
 *  stored as 215900 µm. For example, a lookup service can
 *  match resolution attributes based on equality of their serialized
 *  representations regardless of the units in which they were created. Using
 *  integers for internal storage allows precise equality comparisons to be done,
 *  which would not be guaranteed if an internal floating point representation
 *  were used. Note that if you're looking for U.S. letter sized media in metric
 *  units, you have to search for a media size of 215.9 x 279.4 mm; rounding off
 *  to an integral 216 x 279 mm will not match.
 *  
 *  The exported constant INCH is actually the
 *  conversion factor by which to multiply a value in inches to get the value in
 *  µm. Likewise, the exported constant MM is the
 *  conversion factor by which to multiply a value in mm to get the value in
 *  µm. A client can specify a resolution value in units other than inches
 *  or mm by supplying its own conversion factor. However, since the internal
 *  units of µm was chosen with supporting only the external units of inch
 *  and mm in mind, there is no guarantee that the conversion factor for the
 *  client's units will be an exact integer. If the conversion factor isn't an
 *  exact integer, resolution values in the client's units won't be stored
 *  precisely.
 *  
 */
abstract class Size2DSyntax extends Object with Serializable with Cloneable {

    /** Construct a new two-dimensional size attribute from the given
     *  floating-point values.
     */
    @stub
    protected def this(x: Float, y: Float, units: Int) = ???

    /** Returns whether this two-dimensional size attribute is equivalent to the
     *  passed in object.
     */
    def equals(object: Object): Boolean

    /** Get this two-dimensional size attribute's dimensions in the given units
     *  as floating-point values.
     */
    def getSize(units: Int): Array[Float]

    /** Returns this two-dimensional size attribute's X dimension in the given
     *  units as a floating-point value.
     */
    def getX(units: Int): Float

    /** Returns this two-dimensional size attribute's X dimension in units of
     *  micrometers (µm).
     */
    protected def getXMicrometers(): Int

    /** Returns this two-dimensional size attribute's Y dimension in the given
     *  units as a floating-point value.
     */
    def getY(units: Int): Float

    /** Returns this two-dimensional size attribute's Y dimension in units of
     *  micrometers (µm).
     */
    protected def getYMicrometers(): Int

    /** Returns a hash code value for this two-dimensional size attribute. */
    def hashCode(): Int

    /** Returns a string version of this two-dimensional size attribute. */
    def toString(): String
}

object Size2DSyntax {
    /** Value to indicate units of inches (in). */
    @stub
    val INCH: Int = ???
}
