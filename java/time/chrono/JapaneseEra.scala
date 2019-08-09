package java.time.chrono

import java.io.Serializable
import java.lang.{Object, String}
import java.time.format.TextStyle
import java.time.temporal.{TemporalField, ValueRange}
import java.util.Locale

/** An era in the Japanese Imperial calendar system.
 *  
 *  The Japanese government defines the official name and start date of
 *  each era. Eras are consecutive and their date ranges do not overlap,
 *  so the end date of one era is always the day before the start date
 *  of the next era.
 *  
 *  The Java SE Platform supports all eras defined by the Japanese government,
 *  beginning with the Meiji era. Each era is identified in the Platform by an
 *  integer value and a name. The of(int) and valueOf(String)
 *  methods may be used to obtain a singleton instance of JapaneseEra for each
 *  era. The values() method returns the singleton instances of all
 *  supported eras.
 *  
 *  For convenience, this class declares a number of public static final fields
 *  that refer to singleton instances returned by the values() method.
 */
final class JapaneseEra extends Object with Era with Serializable {

    /** Gets the textual representation of this era. */
    @stub
    def getDisplayName(style: TextStyle, locale: Locale): String = ???

    /** Gets the numeric era int value. */
    @stub
    def getValue(): Int = ???

    /** Gets the range of valid values for the specified field. */
    @stub
    def range(field: TemporalField): ValueRange = ???

    /** Returns a string representation of the object. */
    @stub
    def toString(): String = ???
}

object JapaneseEra {
    /** The singleton instance for the 'Heisei' era (1989-01-08 - 2019-04-30)
     *  which has the value 2.
     */
    @stub
    val HEISEI: JapaneseEra = ???

    /** The singleton instance for the 'Meiji' era (1868-01-01 - 1912-07-29)
     *  which has the value -1.
     */
    @stub
    val MEIJI: JapaneseEra = ???

    /** The singleton instance for the 'Showa' era (1926-12-25 - 1989-01-07)
     *  which has the value 1.
     */
    @stub
    val SHOWA: JapaneseEra = ???

    /** Obtains an instance of JapaneseEra from an int value. */
    @stub
    def of(japaneseEra: Int): JapaneseEra = ???

    /** Returns the JapaneseEra with the name. */
    @stub
    def valueOf(japaneseEra: String): JapaneseEra = ???
}
