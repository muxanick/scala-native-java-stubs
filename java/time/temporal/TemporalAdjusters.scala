package java.time.temporal

import java.lang.Object
import java.time.{DayOfWeek, LocalDate}
import java.util.function.UnaryOperator

/** Common and useful TemporalAdjusters.
 *  
 *  Adjusters are a key tool for modifying temporal objects.
 *  They exist to externalize the process of adjustment, permitting different
 *  approaches, as per the strategy design pattern.
 *  Examples might be an adjuster that sets the date avoiding weekends, or one that
 *  sets the date to the last day of the month.
 *  
 *  There are two equivalent ways of using a TemporalAdjuster.
 *  The first is to invoke the method on the interface directly.
 *  The second is to use Temporal.with(TemporalAdjuster):
 *  
 *    // these two lines are equivalent, but the second approach is recommended
 *    temporal = thisAdjuster.adjustInto(temporal);
 *    temporal = temporal.with(thisAdjuster);
 *  
 *  It is recommended to use the second approach, with(TemporalAdjuster),
 *  as it is a lot clearer to read in code.
 *  
 *  This class contains a standard set of adjusters, available as static methods.
 *  These include:
 *  
 *  finding the first or last day of the month
 *  finding the first day of next month
 *  finding the first or last day of the year
 *  finding the first day of next year
 *  finding the first or last day-of-week within a month, such as "first Wednesday in June"
 *  finding the next or previous day-of-week, such as "next Thursday"
 *  
 */
final class TemporalAdjusters extends Object {
}

object TemporalAdjusters {
    /** Returns the day-of-week in month adjuster, which returns a new date
     *  in the same month with the ordinal day-of-week.
     */
    @stub
    def dayOfWeekInMonth(ordinal: Int, dayOfWeek: DayOfWeek): TemporalAdjuster = ???

    /** Returns the "first day of month" adjuster, which returns a new date set to
     *  the first day of the current month.
     */
    @stub
    def firstDayOfMonth(): TemporalAdjuster = ???

    /** Returns the "first day of next month" adjuster, which returns a new date set to
     *  the first day of the next month.
     */
    @stub
    def firstDayOfNextMonth(): TemporalAdjuster = ???

    /** Returns the "first day of next year" adjuster, which returns a new date set to
     *  the first day of the next year.
     */
    @stub
    def firstDayOfNextYear(): TemporalAdjuster = ???

    /** Returns the "first day of year" adjuster, which returns a new date set to
     *  the first day of the current year.
     */
    @stub
    def firstDayOfYear(): TemporalAdjuster = ???

    /** Returns the first in month adjuster, which returns a new date
     *  in the same month with the first matching day-of-week.
     */
    @stub
    def firstInMonth(dayOfWeek: DayOfWeek): TemporalAdjuster = ???

    /** Returns the "last day of month" adjuster, which returns a new date set to
     *  the last day of the current month.
     */
    @stub
    def lastDayOfMonth(): TemporalAdjuster = ???

    /** Returns the "last day of year" adjuster, which returns a new date set to
     *  the last day of the current year.
     */
    @stub
    def lastDayOfYear(): TemporalAdjuster = ???

    /** Returns the last in month adjuster, which returns a new date
     *  in the same month with the last matching day-of-week.
     */
    @stub
    def lastInMonth(dayOfWeek: DayOfWeek): TemporalAdjuster = ???

    /** Returns the next day-of-week adjuster, which adjusts the date to the
     *  first occurrence of the specified day-of-week after the date being adjusted.
     */
    @stub
    def next(dayOfWeek: DayOfWeek): TemporalAdjuster = ???

    /** Returns the next-or-same day-of-week adjuster, which adjusts the date to the
     *  first occurrence of the specified day-of-week after the date being adjusted
     *  unless it is already on that day in which case the same object is returned.
     */
    @stub
    def nextOrSame(dayOfWeek: DayOfWeek): TemporalAdjuster = ???

    /** Obtains a TemporalAdjuster that wraps a date adjuster. */
    @stub
    def ofDateAdjuster(dateBasedAdjuster: UnaryOperator[LocalDate]): TemporalAdjuster = ???

    /** Returns the previous day-of-week adjuster, which adjusts the date to the
     *  first occurrence of the specified day-of-week before the date being adjusted.
     */
    @stub
    def previous(dayOfWeek: DayOfWeek): TemporalAdjuster = ???
}
