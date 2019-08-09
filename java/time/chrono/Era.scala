package java.time.chrono

import java.lang.String
import java.time.format.TextStyle
import java.time.temporal.{Temporal, TemporalAccessor, TemporalAdjuster, TemporalField, TemporalQuery, ValueRange}
import java.util.Locale
import scala.scalanative.annotation.stub

/** An era of the time-line.
 *  
 *  Most calendar systems have a single epoch dividing the time-line into two eras.
 *  However, some calendar systems, have multiple eras, such as one for the reign
 *  of each leader.
 *  In all cases, the era is conceptually the largest division of the time-line.
 *  Each chronology defines the Era's that are known Eras and a
 *  Chronology.eras to get the valid eras.
 *  
 *  For example, the Thai Buddhist calendar system divides time into two eras,
 *  before and after a single date. By contrast, the Japanese calendar system
 *  has one era for the reign of each Emperor.
 *  
 *  Instances of Era may be compared using the == operator.
 */
trait Era extends TemporalAccessor with TemporalAdjuster {

    /** Adjusts the specified temporal object to have the same era as this object. */
    @stub
    def adjustInto(temporal: Temporal): Temporal = ???

    /** Gets the value of the specified field from this era as an int. */
    @stub
    def get(field: TemporalField): Int = ???

    /** Gets the textual representation of this era. */
    @stub
    def getDisplayName(style: TextStyle, locale: Locale): String = ???

    /** Gets the value of the specified field from this era as a long. */
    @stub
    def getLong(field: TemporalField): Long = ???

    /** Gets the numeric value associated with the era as defined by the chronology. */
    @stub
    def getValue(): Int = ???

    /** Checks if the specified field is supported. */
    @stub
    def isSupported(field: TemporalField): Boolean = ???

    /** Queries this era using the specified query. */
    @stub
    val R: default[R] = ???

    /** Gets the range of valid values for the specified field. */
    @stub
    def range(field: TemporalField): ValueRange = ???
}
