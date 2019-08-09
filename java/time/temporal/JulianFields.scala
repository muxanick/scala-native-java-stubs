package java.time.temporal

import java.lang.Object
import scala.scalanative.annotation.stub

/** A set of date fields that provide access to Julian Days.
 *  
 *  The Julian Day is a standard way of expressing date and time commonly used in the scientific community.
 *  It is expressed as a decimal number of whole days where days start at midday.
 *  This class represents variations on Julian Days that count whole days from midnight.
 *  
 *  The fields are implemented relative to EPOCH_DAY.
 *  The fields are supported, and can be queried and set if EPOCH_DAY is available.
 *  The fields work with all chronologies.
 */
final class JulianFields extends Object {
}

object JulianFields {
    /** Julian Day field. */
    @stub
    val JULIAN_DAY: TemporalField = ???

    /** Modified Julian Day field. */
    @stub
    val MODIFIED_JULIAN_DAY: TemporalField = ???

    /** Rata Die field. */
    @stub
    val RATA_DIE: TemporalField = ???
}
