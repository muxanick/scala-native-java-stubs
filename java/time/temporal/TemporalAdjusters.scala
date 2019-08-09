package java.time.temporal

import java.lang.Object
import java.time.{DayOfWeek, LocalDate}
import java.util.function.UnaryOperator

// Common and useful TemporalAdjusters.
// 
// Adjusters are a key tool for modifying temporal objects.
// They exist to externalize the process of adjustment, permitting different
// approaches, as per the strategy design pattern.
// Examples might be an adjuster that sets the date avoiding weekends, or one that
// sets the date to the last day of the month.
// 
// There are two equivalent ways of using a TemporalAdjuster.
// The first is to invoke the method on the interface directly.
// The second is to use Temporal.with(TemporalAdjuster):
// 
//   // these two lines are equivalent, but the second approach is recommended
//   temporal = thisAdjuster.adjustInto(temporal);
//   temporal = temporal.with(thisAdjuster);
// 
// It is recommended to use the second approach, with(TemporalAdjuster),
// as it is a lot clearer to read in code.
// 
// This class contains a standard set of adjusters, available as static methods.
// These include:
// 
// finding the first or last day of the month
// finding the first day of next month
// finding the first or last day of the year
// finding the first day of next year
// finding the first or last day-of-week within a month, such as "first Wednesday in June"
// finding the next or previous day-of-week, such as "next Thursday"
// 
final class TemporalAdjusters extends Object {
}

object TemporalAdjusters {
    @stub
    // Returns the day-of-week in month adjuster, which returns a new date
    // in the same month with the ordinal day-of-week.
    def dayOfWeekInMonth(ordinal: Int, dayOfWeek: DayOfWeek): TemporalAdjuster = ???

    @stub
    // Returns the "first day of month" adjuster, which returns a new date set to
    // the first day of the current month.
    def firstDayOfMonth(): TemporalAdjuster = ???

    @stub
    // Returns the "first day of next month" adjuster, which returns a new date set to
    // the first day of the next month.
    def firstDayOfNextMonth(): TemporalAdjuster = ???

    @stub
    // Returns the "first day of next year" adjuster, which returns a new date set to
    // the first day of the next year.
    def firstDayOfNextYear(): TemporalAdjuster = ???

    @stub
    // Returns the "first day of year" adjuster, which returns a new date set to
    // the first day of the current year.
    def firstDayOfYear(): TemporalAdjuster = ???

    @stub
    // Returns the first in month adjuster, which returns a new date
    // in the same month with the first matching day-of-week.
    def firstInMonth(dayOfWeek: DayOfWeek): TemporalAdjuster = ???

    @stub
    // Returns the "last day of month" adjuster, which returns a new date set to
    // the last day of the current month.
    def lastDayOfMonth(): TemporalAdjuster = ???

    @stub
    // Returns the "last day of year" adjuster, which returns a new date set to
    // the last day of the current year.
    def lastDayOfYear(): TemporalAdjuster = ???

    @stub
    // Returns the last in month adjuster, which returns a new date
    // in the same month with the last matching day-of-week.
    def lastInMonth(dayOfWeek: DayOfWeek): TemporalAdjuster = ???

    @stub
    // Returns the next day-of-week adjuster, which adjusts the date to the
    // first occurrence of the specified day-of-week after the date being adjusted.
    def next(dayOfWeek: DayOfWeek): TemporalAdjuster = ???

    @stub
    // Returns the next-or-same day-of-week adjuster, which adjusts the date to the
    // first occurrence of the specified day-of-week after the date being adjusted
    // unless it is already on that day in which case the same object is returned.
    def nextOrSame(dayOfWeek: DayOfWeek): TemporalAdjuster = ???

    @stub
    // Obtains a TemporalAdjuster that wraps a date adjuster.
    def ofDateAdjuster(dateBasedAdjuster: UnaryOperator[LocalDate]): TemporalAdjuster = ???

    @stub
    // Returns the previous day-of-week adjuster, which adjusts the date to the
    // first occurrence of the specified day-of-week before the date being adjusted.
    def previous(dayOfWeek: DayOfWeek): TemporalAdjuster = ???
}
