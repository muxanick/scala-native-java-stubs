package java.time.zone

import java.io.Serializable
import java.lang.Object
import java.time.{Duration, Instant, LocalDateTime, ZoneOffset}
import java.util.List

// The rules defining how the zone offset varies for a single time-zone.
// 
// The rules model all the historic and future transitions for a time-zone.
// ZoneOffsetTransition is used for known transitions, typically historic.
// ZoneOffsetTransitionRule is used for future transitions that are based
// on the result of an algorithm.
// 
// The rules are loaded via ZoneRulesProvider using a ZoneId.
// The same rules may be shared internally between multiple zone IDs.
// 
// Serializing an instance of ZoneRules will store the entire set of rules.
// It does not store the zone ID as it is not part of the state of this object.
// 
// A rule implementation may or may not store full information about historic
// and future transitions, and the information stored is only as accurate as
// that supplied to the implementation by the rules provider.
// Applications should treat the data provided as representing the best information
// available to the implementation of this rule.
final class ZoneRules extends Object with Serializable {

    @stub
    // Checks if this set of rules equals another.
    def equals(otherRules: Object): Boolean = ???

    @stub
    // Gets the amount of daylight savings in use for the specified instant in this zone.
    def getDaylightSavings(instant: Instant): Duration = ???

    @stub
    // Gets the offset applicable at the specified instant in these rules.
    def getOffset(instant: Instant): ZoneOffset = ???

    @stub
    // Gets a suitable offset for the specified local date-time in these rules.
    def getOffset(localDateTime: LocalDateTime): ZoneOffset = ???

    @stub
    // Gets the standard offset for the specified instant in this zone.
    def getStandardOffset(instant: Instant): ZoneOffset = ???

    @stub
    // Gets the offset transition applicable at the specified local date-time in these rules.
    def getTransition(localDateTime: LocalDateTime): ZoneOffsetTransition = ???

    @stub
    // Gets the list of transition rules for years beyond those defined in the transition list.
    def getTransitionRules(): List[ZoneOffsetTransitionRule] = ???

    @stub
    // Gets the complete list of fully defined transitions.
    def getTransitions(): List[ZoneOffsetTransition] = ???

    @stub
    // Gets the offset applicable at the specified local date-time in these rules.
    def getValidOffsets(localDateTime: LocalDateTime): List[ZoneOffset] = ???

    @stub
    // Returns a suitable hash code given the definition of #equals.
    def hashCode(): Int = ???

    @stub
    // Checks if the specified instant is in daylight savings.
    def isDaylightSavings(instant: Instant): Boolean = ???

    @stub
    // Checks of the zone rules are fixed, such that the offset never varies.
    def isFixedOffset(): Boolean = ???

    @stub
    // Checks if the offset date-time is valid for these rules.
    def isValidOffset(localDateTime: LocalDateTime, offset: ZoneOffset): Boolean = ???

    @stub
    // Gets the next transition after the specified instant.
    def nextTransition(instant: Instant): ZoneOffsetTransition = ???

    @stub
    // Gets the previous transition before the specified instant.
    def previousTransition(instant: Instant): ZoneOffsetTransition = ???
}

object ZoneRules {
    @stub
    // Obtains an instance of ZoneRules that has fixed zone rules.
    def of(offset: ZoneOffset): ZoneRules = ???

    @stub
    // Obtains an instance of a ZoneRules.
    def of(baseStandardOffset: ZoneOffset, baseWallOffset: ZoneOffset, standardOffsetTransitionList: List[ZoneOffsetTransition], transitionList: List[ZoneOffsetTransition], lastRules: List[ZoneOffsetTransitionRule]): ZoneRules = ???
}
