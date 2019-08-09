package java.time.chrono

import java.lang.{Enum, Object, String}
import java.time.temporal.{TemporalField, ValueRange}

// An era in the Hijrah calendar system.
// 
// The Hijrah calendar system has only one era covering the
// proleptic years greater than zero.
// 
// Do not use ordinal() to obtain the numeric representation of HijrahEra.
// Use getValue() instead.
class HijrahEra private (name: String, ordinal: Int) extends Enum[HijrahEra](name, ordinal) with Era {
}

object HijrahEra {
    @stub
    // Gets the numeric era int value.
    def getValue(): Int = ???

    @stub
    // Obtains an instance of HijrahEra from an int value.
    def of(hijrahEra: Int): HijrahEra = ???

    @stub
    // Gets the range of valid values for the specified field.
    def range(field: TemporalField): ValueRange = ???

    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): HijrahEra = ???
}
