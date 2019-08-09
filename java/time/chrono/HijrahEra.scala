package java.time.chrono

import java.lang.{Enum, Object, String}
import java.time.temporal.{TemporalField, ValueRange}

/** An era in the Hijrah calendar system.
 *  
 *  The Hijrah calendar system has only one era covering the
 *  proleptic years greater than zero.
 *  
 *  Do not use ordinal() to obtain the numeric representation of HijrahEra.
 *  Use getValue() instead.
 */
class HijrahEra private (name: String, ordinal: Int) extends Enum[HijrahEra](name, ordinal) with Era {
}

object HijrahEra {
    /** Gets the numeric era int value. */
    @stub
    def getValue(): Int = ???

    /** Obtains an instance of HijrahEra from an int value. */
    @stub
    def of(hijrahEra: Int): HijrahEra = ???

    /** Gets the range of valid values for the specified field. */
    @stub
    def range(field: TemporalField): ValueRange = ???

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): HijrahEra = ???
}
