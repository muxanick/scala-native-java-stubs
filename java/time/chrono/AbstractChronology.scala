package java.time.chrono

import java.lang.{Long, Object, String}
import java.time.format.ResolverStyle
import java.time.temporal.TemporalField
import java.util.Map
import scala.scalanative.annotation.stub

/** An abstract implementation of a calendar system, used to organize and identify dates.
 *  
 *  The main date and time API is built on the ISO calendar system.
 *  The chronology operates behind the scenes to represent the general concept of a calendar system.
 *  
 *  See Chronology for more details.
 */
abstract class AbstractChronology extends Object with Chronology {

    /** Creates an instance. */
    @stub
    protected def this() = ???

    /** Compares this chronology to another chronology. */
    def compareTo(other: Chronology): Int

    /** Checks if this chronology is equal to another chronology. */
    def equals(obj: Object): Boolean

    /** A hash code for this chronology. */
    def hashCode(): Int

    /** Resolves parsed ChronoField values into a date during parsing. */
    def resolveDate(fieldValues: Map[TemporalField, Long], resolverStyle: ResolverStyle): ChronoLocalDate

    /** Outputs this chronology as a String, using the chronology ID. */
    def toString(): String
}
