package java.time

import java.io.Serializable
import java.lang.{Object, String}
import java.time.format.TextStyle
import java.time.temporal.TemporalAccessor
import java.time.zone.ZoneRules
import java.util.{Locale, Map, Set}
import scala.scalanative.annotation.stub

/** A time-zone ID, such as Europe/Paris.
 *  
 *  A ZoneId is used to identify the rules used to convert between
 *  an Instant and a LocalDateTime.
 *  There are two distinct types of ID:
 *  
 *  Fixed offsets - a fully resolved offset from UTC/Greenwich, that uses
 *   the same offset for all local date-times
 *  Geographical regions - an area where a specific set of rules for finding
 *   the offset from UTC/Greenwich apply
 *  
 *  Most fixed offsets are represented by ZoneOffset.
 *  Calling normalized() on any ZoneId will ensure that a
 *  fixed offset ID will be represented as a ZoneOffset.
 *  
 *  The actual rules, describing when and how the offset changes, are defined by ZoneRules.
 *  This class is simply an ID used to obtain the underlying rules.
 *  This approach is taken because rules are defined by governments and change
 *  frequently, whereas the ID is stable.
 *  
 *  The distinction has other effects. Serializing the ZoneId will only send
 *  the ID, whereas serializing the rules sends the entire data set.
 *  Similarly, a comparison of two IDs only examines the ID, whereas
 *  a comparison of two rules examines the entire data set.
 * 
 *  Time-zone IDs
 *  The ID is unique within the system.
 *  There are three types of ID.
 *  
 *  The simplest type of ID is that from ZoneOffset.
 *  This consists of 'Z' and IDs starting with '+' or '-'.
 *  
 *  The next type of ID are offset-style IDs with some form of prefix,
 *  such as 'GMT+2' or 'UTC+01:00'.
 *  The recognised prefixes are 'UTC', 'GMT' and 'UT'.
 *  The offset is the suffix and will be normalized during creation.
 *  These IDs can be normalized to a ZoneOffset using normalized().
 *  
 *  The third type of ID are region-based IDs. A region-based ID must be of
 *  two or more characters, and not start with 'UTC', 'GMT', 'UT' '+' or '-'.
 *  Region-based IDs are defined by configuration, see ZoneRulesProvider.
 *  The configuration focuses on providing the lookup from the ID to the
 *  underlying ZoneRules.
 *  
 *  Time-zone rules are defined by governments and change frequently.
 *  There are a number of organizations, known here as groups, that monitor
 *  time-zone changes and collate them.
 *  The default group is the IANA Time Zone Database (TZDB).
 *  Other organizations include IATA (the airline industry body) and Microsoft.
 *  
 *  Each group defines its own format for the region ID it provides.
 *  The TZDB group defines IDs such as 'Europe/London' or 'America/New_York'.
 *  TZDB IDs take precedence over other groups.
 *  
 *  It is strongly recommended that the group name is included in all IDs supplied by
 *  groups other than TZDB to avoid conflicts. For example, IATA airline time-zone
 *  region IDs are typically the same as the three letter airport code.
 *  However, the airport of Utrecht has the code 'UTC', which is obviously a conflict.
 *  The recommended format for region IDs from groups other than TZDB is 'group~region'.
 *  Thus if IATA data were defined, Utrecht airport would be 'IATA~UTC'.
 * 
 *  Serialization
 *  This class can be serialized and stores the string zone ID in the external form.
 *  The ZoneOffset subclass uses a dedicated format that only stores the
 *  offset from UTC/Greenwich.
 *  
 *  A ZoneId can be deserialized in a Java Runtime where the ID is unknown.
 *  For example, if a server-side Java Runtime has been updated with a new zone ID, but
 *  the client-side Java Runtime has not been updated. In this case, the ZoneId
 *  object will exist, and can be queried using getId, equals,
 *  hashCode, toString, getDisplayName and normalized.
 *  However, any call to getRules will fail with ZoneRulesException.
 *  This approach is designed to allow a ZonedDateTime to be loaded and
 *  queried, but not modified, on a Java Runtime with incomplete time-zone information.
 * 
 *  
 *  This is a value-based
 *  class; use of identity-sensitive operations (including reference equality
 *  (==), identity hash code, or synchronization) on instances of
 *  ZoneId may have unpredictable results and should be avoided.
 *  The equals method should be used for comparisons.
 */
abstract class ZoneId extends Object with Serializable {

    /** Checks if this time-zone ID is equal to another time-zone ID. */
    def equals(obj: Object): Boolean

    /** Gets the textual representation of the zone, such as 'British Time' or
     *  '+02:00'.
     */
    def getDisplayName(style: TextStyle, locale: Locale): String

    /** Gets the unique time-zone ID. */
    def getId(): String

    /** Gets the time-zone rules for this ID allowing calculations to be performed. */
    def getRules(): ZoneRules

    /** A hash code for this time-zone ID. */
    def hashCode(): Int

    /** Normalizes the time-zone ID, returning a ZoneOffset where possible. */
    def normalized(): ZoneId

    /** Outputs this zone as a String, using the ID. */
    def toString(): String
}

object ZoneId {
    /** A map of zone overrides to enable the short time-zone names to be used. */
    @stub
    val SHORT_IDS: Map[String, String] = ???

    /** Obtains an instance of ZoneId from a temporal object. */
    @stub
    def from(temporal: TemporalAccessor): ZoneId = ???

    /** Gets the set of available zone IDs. */
    @stub
    def getAvailableZoneIds(): Set[String] = ???

    /** Obtains an instance of ZoneId from an ID ensuring that the
     *  ID is valid and available for use.
     */
    @stub
    def of(zoneId: String): ZoneId = ???

    /** Obtains an instance of ZoneId using its ID using a map
     *  of aliases to supplement the standard zone IDs.
     */
    @stub
    def of(zoneId: String, aliasMap: Map[String, String]): ZoneId = ???

    /** Obtains an instance of ZoneId wrapping an offset. */
    @stub
    def ofOffset(prefix: String, offset: ZoneOffset): ZoneId = ???

    /** Gets the system default time-zone. */
    @stub
    def systemDefault(): ZoneId = ???
}
