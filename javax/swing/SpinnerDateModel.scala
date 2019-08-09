package javax.swing

import java.io.Serializable
import java.lang.{Comparable, Object}
import java.util.Date

// A SpinnerModel for sequences of Dates.
// The upper and lower bounds of the sequence are defined by properties called
// start and end and the size
// of the increase or decrease computed by the nextValue
// and previousValue methods is defined by a property
// called calendarField.  The start
// and end properties can be null to
// indicate that the sequence has no lower or upper limit.
// 
// The value of the calendarField property must be one of the
// java.util.Calendar constants that specify a field
// within a Calendar.  The getNextValue
// and getPreviousValue
// methods change the date forward or backwards by this amount.
// For example, if calendarField is Calendar.DAY_OF_WEEK,
// then nextValue produces a Date that's 24
// hours after the current value, and previousValue
// produces a Date that's 24 hours earlier.
// 
// The legal values for calendarField are:
// 
//   Calendar.ERA
//   Calendar.YEAR
//   Calendar.MONTH
//   Calendar.WEEK_OF_YEAR
//   Calendar.WEEK_OF_MONTH
//   Calendar.DAY_OF_MONTH
//   Calendar.DAY_OF_YEAR
//   Calendar.DAY_OF_WEEK
//   Calendar.DAY_OF_WEEK_IN_MONTH
//   Calendar.AM_PM
//   Calendar.HOUR
//   Calendar.HOUR_OF_DAY
//   Calendar.MINUTE
//   Calendar.SECOND
//   Calendar.MILLISECOND
// 
// However some UIs may set the calendarField before committing the edit
// to spin the field under the cursor. If you only want one field to
// spin you can subclass and ignore the setCalendarField calls.
// 
// This model inherits a ChangeListener.  The
// ChangeListeners are notified whenever the models
// value, calendarField,
// start, or end properties changes.
class SpinnerDateModel extends AbstractSpinnerModel with Serializable {

    @stub
    // Constructs a SpinnerDateModel whose initial
    // value is the current date, calendarField
    // is equal to Calendar.DAY_OF_MONTH, and for which
    // there are no start/end limits.
    def this() = ???

    @stub
    // Returns the Calendar field that is added to or subtracted from
    // by the nextValue and previousValue methods.
    def getCalendarField(): Int = ???

    @stub
    // Returns the current element in this sequence of Dates.
    def getDate(): Date = ???

    @stub
    // Returns the last Date in the sequence.
    def getEnd(): Comparable = ???

    @stub
    // Returns the next Date in the sequence, or null if
    // the next date is after end.
    def getNextValue(): Object = ???

    @stub
    // Returns the previous Date in the sequence, or null
    // if the previous date is before start.
    def getPreviousValue(): Object = ???

    @stub
    // Returns the first Date in the sequence.
    def getStart(): Comparable = ???

    @stub
    // Returns the current element in this sequence of Dates.
    def getValue(): Object = ???

    @stub
    // Changes the size of the date value change computed
    // by the nextValue and previousValue methods.
    def setCalendarField(calendarField: Int): Unit = ???

    @stub
    // Changes the upper limit for Dates in this sequence.
    def setEnd(end: Comparable): Unit = ???

    @stub
    // Changes the lower limit for Dates in this sequence.
    def setStart(start: Comparable): Unit = ???
}
