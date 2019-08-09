package java.text

import java.lang.Object

// Defines constants that are used as attribute keys in the
// AttributedCharacterIterator returned
// from DateFormat.formatToCharacterIterator and as
// field identifiers in FieldPosition.
// 
// The class also provides two methods to map
// between its constants and the corresponding Calendar constants.
object DateFormat.Field extends Format.Field {

    @stub
    // Constant identifying the time of day indicator
    // (e.g.
    def AM_PM: DateFormat.Field = ???

    @stub
    // Constant identifying the day of month field.
    def DAY_OF_MONTH: DateFormat.Field = ???

    @stub
    // Constant identifying the day of week field.
    def DAY_OF_WEEK: DateFormat.Field = ???

    @stub
    // Constant identifying the day of week field.
    def DAY_OF_WEEK_IN_MONTH: DateFormat.Field = ???

    @stub
    // Constant identifying the day of year field.
    def DAY_OF_YEAR: DateFormat.Field = ???

    @stub
    // Constant identifying the era field.
    def ERA: DateFormat.Field = ???

    @stub
    // Constant identifying the hour of day field, where the legal values
    // are 0 to 23.
    def HOUR_OF_DAY0: DateFormat.Field = ???

    @stub
    // Constant identifying the hour of day field, where the legal values
    // are 1 to 24.
    def HOUR_OF_DAY1: DateFormat.Field = ???

    @stub
    // Constant identifying the hour field, where the legal values are
    // 0 to 11.
    def HOUR0: DateFormat.Field = ???

    @stub
    // Constant identifying the hour field, where the legal values are
    // 1 to 12.
    def HOUR1: DateFormat.Field = ???

    @stub
    // Constant identifying the millisecond field.
    def MILLISECOND: DateFormat.Field = ???

    @stub
    // Constant identifying the minute field.
    def MINUTE: DateFormat.Field = ???

    @stub
    // Constant identifying the month field.
    def MONTH: DateFormat.Field = ???

    @stub
    // Constant identifying the second field.
    def SECOND: DateFormat.Field = ???

    @stub
    // Constant identifying the time zone field.
    def TIME_ZONE: DateFormat.Field = ???

    @stub
    // Constant identifying the week of month field.
    def WEEK_OF_MONTH: DateFormat.Field = ???

    @stub
    // Constant identifying the week of year field.
    def WEEK_OF_YEAR: DateFormat.Field = ???

    @stub
    // Returns the Calendar field associated with this
    // attribute.
    def getCalendarField(): Int = ???

    @stub
    // Returns the Field constant that corresponds to
    // the Calendar constant calendarField.
    def ofCalendarField(calendarField: Int): DateFormat.Field = ???
}
