package java.time.chrono

import java.lang.{Enum, Object, String}

/** An era in the ISO calendar system.
 *  
 *  The ISO-8601 standard does not define eras.
 *  A definition has therefore been created with two eras - 'Current era' (CE) for
 *  years on or after 0001-01-01 (ISO), and 'Before current era' (BCE) for years before that.
 * 
 *  
 *  
 *  
 *  year-of-era
 *  era
 *  proleptic-year
 *  
 *  
 *  
 *  
 *  2CE2
 *  
 *  
 *  1CE1
 *  
 *  
 *  1BCE0
 *  
 *  
 *  2BCE-1
 *  
 *  
 *  
 *  
 *  Do not use ordinal() to obtain the numeric representation of IsoEra.
 *  Use getValue() instead.
 */
class IsoEra private (name: String, ordinal: Int) extends Enum[IsoEra](name, ordinal) with Era {
}

object IsoEra {
    /** The singleton instance for the era before the current one, 'Before Current Era',
     *  which has the numeric value 0.
     */
    final val BCE = new IsoEra(BCE, 0)

    /** Gets the numeric era int value. */
    @stub
    def getValue(): Int = ???

    /** Obtains an instance of IsoEra from an int value. */
    @stub
    def of(isoEra: Int): IsoEra = ???

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): IsoEra = ???
}
