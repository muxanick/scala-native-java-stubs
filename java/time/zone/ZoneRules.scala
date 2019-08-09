package java.time.zone

import java.io.Serializable
import java.lang.{Object, String}
import java.time.{Duration, Instant, LocalDateTime, ZoneOffset}
import java.util.List
import scala.scalanative.annotation.stub

/** The rules defining how the zone offset varies for a single time-zone.
 *  
 *  The rules model all the historic and future transitions for a time-zone.
 *  ZoneOffsetTransition is used for known transitions, typically historic.
 *  ZoneOffsetTransitionRule is used for future transitions that are based
 *  on the result of an algorithm.
 *  
 *  The rules are loaded via ZoneRulesProvider using a ZoneId.
 *  The same rules may be shared internally between multiple zone IDs.
 *  
 *  Serializing an instance of ZoneRules will store the entire set of rules.
 *  It does not store the zone ID as it is not part of the state of this object.
 *  
 *  A rule implementation may or may not store full information about historic
 *  and future transitions, and the information stored is only as accurate as
 *  that supplied to the implementation by the rules provider.
 *  Applications should treat the data provided as representing the best information
 *  available to the implementation of this rule.
 */
final class ZoneRules extends Object with Serializable {

    /** Checks if this set of rules equals another. */
    @stub
    def equals(otherRules: Object): Boolean = ???

    /** Gets the amount of daylight savings in use for the specified instant in this zone. */
    @stub
    def getDaylightSavings(instant: Instant): Duration = ???

    /** Gets the offset applicable at the specified instant in these rules. */
    @stub
    def getOffset(instant: Instant): ZoneOffset = ???

    /** Gets a suitable offset for the specified local date-time in these rules. */
    @stub
    def getOffset(localDateTime: LocalDateTime): ZoneOffset = ???

    /** Gets the standard offset for the specified instant in this zone. */
    @stub
    def getStandardOffset(instant: Instant): ZoneOffset = ???

    /** Gets the offset transition applicable at the specified local date-time in these rules. */
    @stub
    def getTransition(localDateTime: LocalDateTime): ZoneOffsetTransition = ???

    /** Gets the list of transition rules for years beyond those defined in the transition list. */
    @stub
    def getTransitionRules(): List[ZoneOffsetTransitionRule] = ???

    /** Gets the complete list of fully defined transitions. */
    @stub
    def getTransitions(): List[ZoneOffsetTransition] = ???

    /** Gets the offset applicable at the specified local date-time in these rules. */
    @stub
    def getValidOffsets(localDateTime: LocalDateTime): List[ZoneOffset] = ???

    /** Returns a suitable hash code given the definition of #equals. */
    @stub
    def hashCode(): Int = ???

    /** Checks if the specified instant is in daylight savings. */
    @stub
    def isDaylightSavings(instant: Instant): Boolean = ???

    /** Checks of the zone rules are fixed, such that the offset never varies. */
    @stub
    def isFixedOffset(): Boolean = ???

    /** Checks if the offset date-time is valid for these rules. */
    @stub
    def isValidOffset(localDateTime: LocalDateTime, offset: ZoneOffset): Boolean = ???

    /** Gets the next transition after the specified instant. */
    @stub
    def nextTransition(instant: Instant): ZoneOffsetTransition = ???

    /** Gets the previous transition before the specified instant. */
    @stub
    def previousTransition(instant: Instant): ZoneOffsetTransition = ???

    /** Returns a string describing this object. */
    @stub
    def toString(): String = ???
}

object ZoneRules {
    /** Obtains an instance of ZoneRules that has fixed zone rules. */
    @stub
    def of(offset: ZoneOffset): ZoneRules = ???

    /** Obtains an instance of a ZoneRules. */
    @stub
    def of(baseStandardOffset: ZoneOffset, baseWallOffset: ZoneOffset, standardOffsetTransitionList: List[ZoneOffsetTransition], transitionList: List[ZoneOffsetTransition], lastRules: List[ZoneOffsetTransitionRule]): ZoneRules = ???
}
