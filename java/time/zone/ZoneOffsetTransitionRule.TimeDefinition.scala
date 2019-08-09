package java.time.zone

import java.lang.{Enum, Object, String}
import java.time.{LocalDateTime, ZoneOffset}
import scala.scalanative.annotation.stub

/** A definition of the way a local time can be converted to the actual
 *  transition date-time.
 *  
 *  Time zone rules are expressed in one of three ways:
 *  
 *  Relative to UTC
 *  Relative to the standard offset in force
 *  Relative to the wall offset (what you would see on a clock on the wall)
 *  
 */
class ZoneOffsetTransitionRule.TimeDefinition private (name: String, ordinal: Int) extends Enum[ZoneOffsetTransitionRule.TimeDefinition](name, ordinal) {
}

object ZoneOffsetTransitionRule.TimeDefinition {
    /** The local date-time is expressed in terms of the standard offset. */
    final val STANDARD = new ZoneOffsetTransitionRule.TimeDefinition(STANDARD, 0)

    /** The local date-time is expressed in terms of the UTC offset. */
    final val UTC = new ZoneOffsetTransitionRule.TimeDefinition(UTC, 1)

    /** The local date-time is expressed in terms of the wall offset. */
    final val WALL = new ZoneOffsetTransitionRule.TimeDefinition(WALL, 2)

    /** Converts the specified local date-time to the local date-time actually
     *  seen on a wall clock.
     */
    @stub
    def createDateTime(dateTime: LocalDateTime, standardOffset: ZoneOffset, wallOffset: ZoneOffset): LocalDateTime = ???

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): ZoneOffsetTransitionRule.TimeDefinition = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[ZoneOffsetTransitionRule.TimeDefinition] = ???
}
