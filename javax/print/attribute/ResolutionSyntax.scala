package javax.print.attribute

import java.io.Serializable
import java.lang.{Cloneable, Object, String}
import scala.scalanative.annotation.stub

/** Class ResolutionSyntax is an abstract base class providing the common
 *  implementation of all attributes denoting a printer resolution.
 *  
 *  A resolution attribute's value consists of two items, the cross feed
 *  direction resolution and the feed direction resolution. A resolution
 *  attribute may be constructed by supplying the two values and indicating the
 *  units in which the values are measured. Methods are provided to return a
 *  resolution attribute's values, indicating the units in which the values are
 *  to be returned. The two most common resolution units are dots per inch (dpi)
 *  and dots per centimeter (dpcm), and exported constants DPI and DPCM are provided for
 *  indicating those units.
 *  
 *  Once constructed, a resolution attribute's value is immutable.
 *  
 *  Design
 *  
 *  A resolution attribute's cross feed direction resolution and feed direction
 *  resolution values are stored internally using units of dots per 100 inches
 *  (dphi). Storing the values in dphi rather than, say, metric units allows
 *  precise integer arithmetic conversions between dpi and dphi and between dpcm
 *  and dphi: 1 dpi = 100 dphi, 1 dpcm = 254 dphi. Thus, the values can be stored
 *  into and retrieved back from a resolution attribute in either units with no
 *  loss of precision. This would not be guaranteed if a floating point
 *  representation were used. However, roundoff error will in general occur if a
 *  resolution attribute's values are created in one units and retrieved in
 *  different units; for example, 600 dpi will be rounded to 236 dpcm, whereas
 *  the true value (to five figures) is 236.22 dpcm.
 *  
 *  Storing the values internally in common units of dphi lets two resolution
 *  attributes be compared without regard to the units in which they were
 *  created; for example, 300 dpcm will compare equal to 762 dpi, as they both
 *  are stored as 76200 dphi. In particular, a lookup service can
 *  match resolution attributes based on equality of their serialized
 *  representations regardless of the units in which they were created. Again,
 *  using integers for internal storage allows precise equality comparisons to be
 *  done, which would not be guaranteed if a floating point representation were
 *  used.
 *  
 *  The exported constant DPI is actually the
 *  conversion factor by which to multiply a value in dpi to get the value in
 *  dphi. Likewise, the exported constant DPCM is the
 *  conversion factor by which to multiply a value in dpcm to get the value in
 *  dphi. A client can specify a resolution value in units other than dpi or dpcm
 *  by supplying its own conversion factor. However, since the internal units of
 *  dphi was chosen with supporting only the external units of dpi and dpcm in
 *  mind, there is no guarantee that the conversion factor for the client's units
 *  will be an exact integer. If the conversion factor isn't an exact integer,
 *  resolution values in the client's units won't be stored precisely.
 *  
 */
abstract class ResolutionSyntax extends Object with Serializable with Cloneable {

    /** Construct a new resolution attribute from the given items. */
    @stub
    def this(crossFeedResolution: Int, feedResolution: Int, units: Int) = ???

    /** Returns whether this resolution attribute is equivalent to the passed in
     *  object.
     */
    def equals(object: Any): Boolean

    /** Returns this resolution attribute's cross feed direction resolution in
     *  the given units.
     */
    def getCrossFeedResolution(units: Int): Int

    /** Returns this resolution attribute's cross feed direction resolution in
     *  units of dphi.
     */
    protected def getCrossFeedResolutionDphi(): Int

    /** Returns this resolution attribute's feed direction resolution in the
     *  given units.
     */
    def getFeedResolution(units: Int): Int

    /** Returns this resolution attribute's feed direction resolution in units
     *  of dphi.
     */
    protected def getFeedResolutionDphi(): Int

    /** Get this resolution attribute's resolution values in the given units. */
    def getResolution(units: Int): Array[Int]

    /** Returns a hash code value for this resolution attribute. */
    def hashCode(): Int

    /** Determine whether this resolution attribute's value is less than or
     *  equal to the given resolution attribute's value.
     */
    def lessThanOrEquals(other: ResolutionSyntax): Boolean

    /** Returns a string version of this resolution attribute. */
    def toString(): String

    /** Returns a string version of this resolution attribute in the given units. */
    def toString(units: Int, unitsName: String): String
}

object ResolutionSyntax {
    /** Value to indicate units of dots per centimeter (dpcm). */
    @stub
    val DPCM: Int = ???

    /** Value to indicate units of dots per inch (dpi). */
    @stub
    val DPI: Int = ???
}
