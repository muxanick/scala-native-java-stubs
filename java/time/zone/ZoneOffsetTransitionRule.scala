package java.time.zone

import java.io.Serializable
import java.lang.Object
import java.time.{DayOfWeek, LocalTime, Month, ZoneOffset}

// A rule expressing how to create a transition.
// 
// This class allows rules for identifying future transitions to be expressed.
// A rule might be written in many forms:
// 
// the 16th March
// the Sunday on or after the 16th March
// the Sunday on or before the 16th March
// the last Sunday in February
// 
// These different rule types can be expressed and queried.
final class ZoneOffsetTransitionRule extends Object with Serializable {

    @stub
    // Creates a transition instance for the specified year.
    def createTransition(year: Int): ZoneOffsetTransition = ???

    @stub
    // Checks if this object equals another.
    def equals(otherRule: Object): Boolean = ???

    @stub
    // Gets the indicator of the day-of-month of the transition.
    def getDayOfMonthIndicator(): Int = ???

    @stub
    // Gets the day-of-week of the transition.
    def getDayOfWeek(): DayOfWeek = ???

    @stub
    // Gets the local time of day of the transition which must be checked with
    // isMidnightEndOfDay().
    def getLocalTime(): LocalTime = ???

    @stub
    // Gets the month of the transition.
    def getMonth(): Month = ???

    @stub
    // Gets the offset after the transition.
    def getOffsetAfter(): ZoneOffset = ???

    @stub
    // Gets the offset before the transition.
    def getOffsetBefore(): ZoneOffset = ???

    @stub
    // Gets the standard offset in force at the transition.
    def getStandardOffset(): ZoneOffset = ???

    @stub
    // Gets the time definition, specifying how to convert the time to an instant.
    def getTimeDefinition(): ZoneOffsetTransitionRule.TimeDefinition = ???

    @stub
    // Returns a suitable hash code.
    def hashCode(): Int = ???

    @stub
    // Is the transition local time midnight at the end of day.
    def isMidnightEndOfDay(): Boolean = ???
}

object ZoneOffsetTransitionRule {
    @stub
    // Obtains an instance defining the yearly rule to create transitions between two offsets.
    def of(month: Month, dayOfMonthIndicator: Int, dayOfWeek: DayOfWeek, time: LocalTime, timeEndOfDay: Boolean, timeDefnition: ZoneOffsetTransitionRule.TimeDefinition, standardOffset: ZoneOffset, offsetBefore: ZoneOffset, offsetAfter: ZoneOffset): ZoneOffsetTransitionRule = ???
}
