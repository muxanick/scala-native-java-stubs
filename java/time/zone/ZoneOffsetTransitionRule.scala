package java.time.zone

import java.io.Serializable
import java.lang.{Object, String}
import java.time.{DayOfWeek, LocalTime, Month, ZoneOffset}
import scala.scalanative.annotation.stub

/** A rule expressing how to create a transition.
 *  
 *  This class allows rules for identifying future transitions to be expressed.
 *  A rule might be written in many forms:
 *  
 *  the 16th March
 *  the Sunday on or after the 16th March
 *  the Sunday on or before the 16th March
 *  the last Sunday in February
 *  
 *  These different rule types can be expressed and queried.
 */
final class ZoneOffsetTransitionRule extends Object with Serializable {

    /** Creates a transition instance for the specified year. */
    @stub
    def createTransition(year: Int): ZoneOffsetTransition = ???

    /** Checks if this object equals another. */
    @stub
    def equals(otherRule: Object): Boolean = ???

    /** Gets the indicator of the day-of-month of the transition. */
    @stub
    def getDayOfMonthIndicator(): Int = ???

    /** Gets the day-of-week of the transition. */
    @stub
    def getDayOfWeek(): DayOfWeek = ???

    /** Gets the local time of day of the transition which must be checked with
     *  isMidnightEndOfDay().
     */
    @stub
    def getLocalTime(): LocalTime = ???

    /** Gets the month of the transition. */
    @stub
    def getMonth(): Month = ???

    /** Gets the offset after the transition. */
    @stub
    def getOffsetAfter(): ZoneOffset = ???

    /** Gets the offset before the transition. */
    @stub
    def getOffsetBefore(): ZoneOffset = ???

    /** Gets the standard offset in force at the transition. */
    @stub
    def getStandardOffset(): ZoneOffset = ???

    /** Gets the time definition, specifying how to convert the time to an instant. */
    @stub
    def getTimeDefinition(): ZoneOffsetTransitionRule.TimeDefinition = ???

    /** Returns a suitable hash code. */
    @stub
    def hashCode(): Int = ???

    /** Is the transition local time midnight at the end of day. */
    @stub
    def isMidnightEndOfDay(): Boolean = ???

    /** Returns a string describing this object. */
    @stub
    def toString(): String = ???
}

object ZoneOffsetTransitionRule {
    /** A definition of the way a local time can be converted to the actual
     *  transition date-time.
     */
    @stub
    object TimeDefinition extends ZoneOffsetTransitionRule.TimeDefinition

    /** Obtains an instance defining the yearly rule to create transitions between two offsets. */
    @stub
    def of(month: Month, dayOfMonthIndicator: Int, dayOfWeek: DayOfWeek, time: LocalTime, timeEndOfDay: Boolean, timeDefnition: ZoneOffsetTransitionRule.TimeDefinition, standardOffset: ZoneOffset, offsetBefore: ZoneOffset, offsetAfter: ZoneOffset): ZoneOffsetTransitionRule = ???
}
