package java.util

import java.lang.{Object, String}

/** Calendar.Builder is used for creating a Calendar from
 *  various date-time parameters.
 * 
 *  There are two ways to set a Calendar to a date-time value. One
 *  is to set the instant parameter to a millisecond offset from the Epoch. The other is to set individual
 *  field parameters, such as YEAR, to their desired
 *  values. These two ways can't be mixed. Trying to set both the instant and
 *  individual fields will cause an IllegalStateException to be
 *  thrown. However, it is permitted to override previous values of the
 *  instant or field parameters.
 * 
 *  If no enough field parameters are given for determining date and/or
 *  time, calendar specific default values are used when building a
 *  Calendar. For example, if the YEAR value
 *  isn't given for the Gregorian calendar, 1970 will be used. If there are
 *  any conflicts among field parameters, the  resolution rules are applied.
 *  Therefore, the order of field setting matters.
 * 
 *  In addition to the date-time parameters,
 *  the locale,
 *  time zone,
 *  week definition, and
 *  leniency mode parameters can be set.
 * 
 *  Examples
 *  The following are sample usages. Sample code assumes that the
 *  Calendar constants are statically imported.
 * 
 *  The following code produces a Calendar with date 2012-12-31
 *  (Gregorian) because Monday is the first day of a week with the  ISO 8601
 *  compatible week parameters.
 *  
 *    Calendar cal = new Calendar.Builder().setCalendarType("iso8601")
 *                         .setWeekDate(2013, 1, MONDAY).build();
 *  The following code produces a Japanese Calendar with date
 *  1989-01-08 (Gregorian), assuming that the default ERA
 *  is Heisei that started on that day.
 *  
 *    Calendar cal = new Calendar.Builder().setCalendarType("japanese")
 *                         .setFields(YEAR, 1, DAY_OF_YEAR, 1).build();
 */
object Calendar.Builder extends Object {

    /** Returns a Calendar built from the parameters set by the
     *  setter methods.
     */
    @stub
    def build(): Calendar = ???

    /** Sets the field parameter to the given value. */
    @stub
    def set(field: Int, value: Int): Calendar.Builder = ???

    /** Sets the calendar type parameter to the given type. */
    @stub
    def setCalendarType(type: String): Calendar.Builder = ???

    /** Sets the date field parameters to the values given by year,
     *  month, and dayOfMonth.
     */
    @stub
    def setDate(year: Int, month: Int, dayOfMonth: Int): Calendar.Builder = ???

    /** Sets field parameters to their values given by
     *  fieldValuePairs that are pairs of a field and its value.
     */
    @stub
    def setFields(fieldValuePairs: int*): Calendar.Builder = ???

    /** Sets the instant parameter to the instant value given by a
     *  Date.
     */
    @stub
    def setInstant(instant: Date): Calendar.Builder = ???

    /** Sets the instant parameter to the given instant value that is
     *  a millisecond offset from the
     *  Epoch.
     */
    @stub
    def setInstant(instant: Long): Calendar.Builder = ???

    /** Sets the lenient mode parameter to the value given by lenient. */
    @stub
    def setLenient(lenient: Boolean): Calendar.Builder = ???

    /** Sets the locale parameter to the given locale. */
    @stub
    def setLocale(locale: Locale): Calendar.Builder = ???

    /** Sets the time of day field parameters to the values given by
     *  hourOfDay, minute, and second.
     */
    @stub
    def setTimeOfDay(hourOfDay: Int, minute: Int, second: Int): Calendar.Builder = ???

    /** Sets the time of day field parameters to the values given by
     *  hourOfDay, minute, second, and
     *  millis.
     */
    @stub
    def setTimeOfDay(hourOfDay: Int, minute: Int, second: Int, millis: Int): Calendar.Builder = ???

    /** Sets the time zone parameter to the given zone. */
    @stub
    def setTimeZone(zone: TimeZone): Calendar.Builder = ???

    /** Sets the week-based date parameters to the values with the given
     *  date specifiers - week year, week of year, and day of week.
     */
    @stub
    def setWeekDate(weekYear: Int, weekOfYear: Int, dayOfWeek: Int): Calendar.Builder = ???
}
