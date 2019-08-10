package java.util

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** This enum provides constants to select a filtering mode for locale
 *  matching. Refer to RFC 4647
 *  Matching of Language Tags for details.
 * 
 *  As an example, think of two Language Priority Lists each of which
 *  includes only one language range and a set of following language tags:
 * 
 *  
 *     de (German)
 *     de-DE (German, Germany)
 *     de-Deva (German, in Devanagari script)
 *     de-Deva-DE (German, in Devanagari script, Germany)
 *     de-DE-1996 (German, Germany, orthography of 1996)
 *     de-Latn-DE (German, in Latin script, Germany)
 *     de-Latn-DE-1996 (German, in Latin script, Germany, orthography of 1996)
 *  
 * 
 *  The filtering method will behave as follows:
 * 
 *  
 *  
 *  Filtering Mode
 *  Language Priority List: "de-DE"
 *  Language Priority List: "de-*-DE"
 *  
 *  
 *  
 *  AUTOSELECT_FILTERING
 *  
 *  
 *  Performs basic filtering and returns "de-DE" and
 *  "de-DE-1996".
 *  
 *  
 *  Performs extended filtering and returns "de-DE",
 *  "de-Deva-DE", "de-DE-1996", "de-Latn-DE", and
 *  "de-Latn-DE-1996".
 *  
 *  
 *  
 *  
 *  EXTENDED_FILTERING
 *  
 *  
 *  Performs extended filtering and returns "de-DE",
 *  "de-Deva-DE", "de-DE-1996", "de-Latn-DE", and
 *  "de-Latn-DE-1996".
 *  
 *  Same as above.
 *  
 *  
 *  
 *  IGNORE_EXTENDED_RANGES
 *  
 *  
 *  Performs basic filtering and returns "de-DE" and
 *  "de-DE-1996".
 *  
 *  
 *  Performs basic filtering and returns null because
 *  nothing matches.
 *  
 *  
 *  
 *  
 *  MAP_EXTENDED_RANGES
 *  
 *  Same as above.
 *  
 *  Performs basic filtering and returns "de-DE" and
 *  "de-DE-1996" because "de-*-DE" is mapped to
 *  "de-DE".
 *  
 *  
 *  
 *  
 *  REJECT_EXTENDED_RANGES
 *  
 *  Same as above.
 *  
 *  Throws IllegalArgumentException because "de-*-DE" is
 *  not a valid basic language range.
 *  
 *  
 *  
 */
class Locale_FilteringMode private (name: String, ordinal: Int) extends Enum[Locale.FilteringMode](name, ordinal) {
}

object Locale_FilteringMode {
    /** Specifies automatic filtering mode based on the given Language
     *  Priority List consisting of language ranges.
     */
    final val AUTOSELECT_FILTERING = new Locale.FilteringMode(AUTOSELECT_FILTERING, 0)

    /** Specifies extended filtering. */
    final val EXTENDED_FILTERING = new Locale.FilteringMode(EXTENDED_FILTERING, 1)

    /** Specifies basic filtering: Note that any extended language ranges
     *  included in the given Language Priority List are ignored.
     */
    final val IGNORE_EXTENDED_RANGES = new Locale.FilteringMode(IGNORE_EXTENDED_RANGES, 2)

    /** Specifies basic filtering: If any extended language ranges are
     *  included in the given Language Priority List, they are mapped to the
     *  basic language range.
     */
    final val MAP_EXTENDED_RANGES = new Locale.FilteringMode(MAP_EXTENDED_RANGES, 3)

    /** Specifies basic filtering: If any extended language ranges are
     *  included in the given Language Priority List, the list is rejected
     *  and the filtering method throws IllegalArgumentException.
     */
    final val REJECT_EXTENDED_RANGES = new Locale.FilteringMode(REJECT_EXTENDED_RANGES, 4)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): Locale.FilteringMode = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[Locale.FilteringMode] = ???
}
