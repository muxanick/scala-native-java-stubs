package java.time.chrono

import java.lang.{Enum, Object, String}

// An era in the Thai Buddhist calendar system.
// 
// The Thai Buddhist calendar system has two eras.
// The current era, for years from 1 onwards, is known as the 'Buddhist' era.
// All previous years, zero or earlier in the proleptic count or one and greater
// in the year-of-era count, are part of the 'Before Buddhist' era.
//
// 
// 
// 
// year-of-era
// era
// proleptic-year
// ISO proleptic-year
// 
// 
// 
// 
// 2BE2-542
// 
// 
// 1BE1-543
// 
// 
// 1BEFORE_BE0-544
// 
// 
// 2BEFORE_BE-1-545
// 
// 
// 
// 
// Do not use ordinal() to obtain the numeric representation of ThaiBuddhistEra.
// Use getValue() instead.
class ThaiBuddhistEra private (name: String, ordinal: Int) extends Enum[ThaiBuddhistEra](name, ordinal) with Era {
}

object ThaiBuddhistEra {
    // The singleton instance for the current era, 'Buddhist Era',
    // which has the numeric value 1.
    final val BE = new ThaiBuddhistEra(BE, 0)

    @stub
    // Gets the numeric era int value.
    def getValue(): Int = ???

    @stub
    // Obtains an instance of ThaiBuddhistEra from an int value.
    def of(thaiBuddhistEra: Int): ThaiBuddhistEra = ???

    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): ThaiBuddhistEra = ???
}
