package java.time.chrono

import java.io.Serializable
import java.lang.{Object, String}
import java.time.format.TextStyle
import java.time.temporal.{TemporalField, ValueRange}
import java.util.Locale

// An era in the Japanese Imperial calendar system.
// 
// The Japanese government defines the official name and start date of
// each era. Eras are consecutive and their date ranges do not overlap,
// so the end date of one era is always the day before the start date
// of the next era.
// 
// The Java SE Platform supports all eras defined by the Japanese government,
// beginning with the Meiji era. Each era is identified in the Platform by an
// integer value and a name. The of(int) and valueOf(String)
// methods may be used to obtain a singleton instance of JapaneseEra for each
// era. The values() method returns the singleton instances of all
// supported eras.
// 
// For convenience, this class declares a number of public static final fields
// that refer to singleton instances returned by the values() method.
final class JapaneseEra extends Object with Era, with Serializable {

    @stub
    // Gets the textual representation of this era.
    def getDisplayName(style: TextStyle, locale: Locale): String = ???

    @stub
    // Gets the numeric era int value.
    def getValue(): Int = ???

    @stub
    // Gets the range of valid values for the specified field.
    def range(field: TemporalField): ValueRange = ???

    @stub
    // Returns a string representation of the object.
    def toString(): String = ???
}

object JapaneseEra {
    @stub
    // The singleton instance for the 'Heisei' era (1989-01-08 - 2019-04-30)
    // which has the value 2.
    def HEISEI: JapaneseEra = ???

    @stub
    // The singleton instance for the 'Meiji' era (1868-01-01 - 1912-07-29)
    // which has the value -1.
    def MEIJI: JapaneseEra = ???

    @stub
    // The singleton instance for the 'Showa' era (1926-12-25 - 1989-01-07)
    // which has the value 1.
    def SHOWA: JapaneseEra = ???

    @stub
    // Obtains an instance of JapaneseEra from an int value.
    def of(japaneseEra: Int): JapaneseEra = ???

    @stub
    // Returns the JapaneseEra with the name.
    def valueOf(japaneseEra: String): JapaneseEra = ???
}
