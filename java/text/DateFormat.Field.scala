package java.text

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Defines constants that are used as attribute keys in the
 *  AttributedCharacterIterator returned
 *  from DateFormat.formatToCharacterIterator and as
 *  field identifiers in FieldPosition.
 *  
 *  The class also provides two methods to map
 *  between its constants and the corresponding Calendar constants.
 */
object DateFormat.Field extends Format.Field {

    /** Creates a Field. */
    @stub
    protected def Field(name: String, calendarField: Int) = ???

    /** Constant identifying the time of day indicator
     *  (e.g.
     */
    @stub
    val AM_PM: DateFormat.Field = ???

    /** Constant identifying the day of month field. */
    @stub
    val DAY_OF_MONTH: DateFormat.Field = ???

    /** Constant identifying the day of week field. */
    @stub
    val DAY_OF_WEEK: DateFormat.Field = ???

    /** Constant identifying the day of week field. */
    @stub
    val DAY_OF_WEEK_IN_MONTH: DateFormat.Field = ???

    /** Constant identifying the day of year field. */
    @stub
    val DAY_OF_YEAR: DateFormat.Field = ???

    /** Constant identifying the era field. */
    @stub
    val ERA: DateFormat.Field = ???

    /** Constant identifying the hour of day field, where the legal values
     *  are 0 to 23.
     */
    @stub
    val HOUR_OF_DAY0: DateFormat.Field = ???

    /** Constant identifying the hour of day field, where the legal values
     *  are 1 to 24.
     */
    @stub
    val HOUR_OF_DAY1: DateFormat.Field = ???

    /** Constant identifying the hour field, where the legal values are
     *  0 to 11.
     */
    @stub
    val HOUR0: DateFormat.Field = ???

    /** Constant identifying the hour field, where the legal values are
     *  1 to 12.
     */
    @stub
    val HOUR1: DateFormat.Field = ???

    /** Constant identifying the millisecond field. */
    @stub
    val MILLISECOND: DateFormat.Field = ???

    /** Constant identifying the minute field. */
    @stub
    val MINUTE: DateFormat.Field = ???

    /** Constant identifying the month field. */
    @stub
    val MONTH: DateFormat.Field = ???

    /** Constant identifying the second field. */
    @stub
    val SECOND: DateFormat.Field = ???

    /** Constant identifying the time zone field. */
    @stub
    val TIME_ZONE: DateFormat.Field = ???

    /** Constant identifying the week of month field. */
    @stub
    val WEEK_OF_MONTH: DateFormat.Field = ???

    /** Constant identifying the week of year field. */
    @stub
    val WEEK_OF_YEAR: DateFormat.Field = ???

    /** Constant identifying the year field. */
    @stub
    val YEAR: DateFormat.Field = ???

    /** Returns the Calendar field associated with this
     *  attribute.
     */
    @stub
    def getCalendarField(): Int = ???

    /** Returns the Field constant that corresponds to
     *  the Calendar constant calendarField.
     */
    @stub
    def ofCalendarField(calendarField: Int): DateFormat.Field = ???

    /** Resolves instances being deserialized to the predefined constants. */
    @stub
    protected def readResolve(): Object = ???
}
