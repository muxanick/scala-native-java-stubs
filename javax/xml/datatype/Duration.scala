package javax.xml.datatype

import java.lang.{Number, Object, String}
import java.math.BigDecimal
import java.util.{Calendar, Date}
import javax.xml.namespace.QName
import scala.scalanative.annotation.stub

/** Immutable representation of a time span as defined in
 *  the W3C XML Schema 1.0 specification.
 * 
 *  A Duration object represents a period of Gregorian time,
 *  which consists of six fields (years, months, days, hours,
 *  minutes, and seconds) plus a sign (+/-) field.
 * 
 *  The first five fields have non-negative (>=0) integers or null
 *  (which represents that the field is not set),
 *  and the seconds field has a non-negative decimal or null.
 *  A negative sign indicates a negative duration.
 * 
 *  This class provides a number of methods that make it easy
 *  to use for the duration datatype of XML Schema 1.0 with
 *  the errata.
 * 
 *  Order relationship
 *  Duration objects only have partial order, where two values A and B
 *  maybe either:
 *  
 *   A<B (A is shorter than B)
 *   A>B (A is longer than B)
 *   A==B   (A and B are of the same duration)
 *   A<>B (Comparison between A and B is indeterminate)
 *  
 * 
 *  For example, 30 days cannot be meaningfully compared to one month.
 *  The compare(Duration duration) method implements this
 *  relationship.
 * 
 *  See the isLongerThan(Duration) method for details about
 *  the order relationship among Duration objects.
 * 
 *  Operations over Duration
 *  This class provides a set of basic arithmetic operations, such
 *  as addition, subtraction and multiplication.
 *  Because durations don't have total order, an operation could
 *  fail for some combinations of operations. For example, you cannot
 *  subtract 15 days from 1 month. See the javadoc of those methods
 *  for detailed conditions where this could happen.
 * 
 *  Also, division of a duration by a number is not provided because
 *  the Duration class can only deal with finite precision
 *  decimal numbers. For example, one cannot represent 1 sec divided by 3.
 * 
 *  However, you could substitute a division by 3 with multiplying
 *  by numbers such as 0.3 or 0.333.
 * 
 *  Range of allowed values
 *  
 *  Because some operations of Duration rely on Calendar
 *  even though Duration can hold very large or very small values,
 *  some of the methods may not work correctly on such Durations.
 *  The impacted methods document their dependency on Calendar.
 */
abstract class Duration extends Object {

    /** Default no-arg constructor. */
    @stub
    def this() = ???

    /** Computes a new duration whose value is this+rhs. */
    def add(rhs: Duration): Duration

    /** Adds this duration to a Calendar object. */
    def addTo(calendar: Calendar): Unit

    /** Adds this duration to a Date object. */
    def addTo(date: Date): Unit

    /** Partial order relation comparison with this Duration instance. */
    def compare(duration: Duration): Int

    /** Checks if this duration object has the same duration
     *  as another Duration object.
     */
    def equals(duration: Object): Boolean

    /** Obtains the value of the DAYS field as an integer value,
     *  or 0 if not present.
     */
    def getDays(): Int

    /** Gets the value of a field. */
    def getField(field: DatatypeConstants.Field): Number

    /** Obtains the value of the HOURS field as an integer value,
     *  or 0 if not present.
     */
    def getHours(): Int

    /** Obtains the value of the MINUTES field as an integer value,
     *  or 0 if not present.
     */
    def getMinutes(): Int

    /** Obtains the value of the MONTHS field as an integer value,
     *  or 0 if not present.
     */
    def getMonths(): Int

    /** Obtains the value of the SECONDS field as an integer value,
     *  or 0 if not present.
     */
    def getSeconds(): Int

    /** Returns the sign of this duration in -1,0, or 1. */
    def getSign(): Int

    /** Returns the length of the duration in milli-seconds. */
    def getTimeInMillis(startInstant: Calendar): Long

    /** Returns the length of the duration in milli-seconds. */
    def getTimeInMillis(startInstant: Date): Long

    /** Return the name of the XML Schema date/time type that this instance
     *  maps to.
     */
    def getXMLSchemaType(): QName

    /** Get the years value of this Duration as an int or 0 if not present. */
    def getYears(): Int

    /** Returns a hash code consistent with the definition of the equals method. */
    def hashCode(): Int

    /** Checks if this duration object is strictly longer than
     *  another Duration object.
     */
    def isLongerThan(duration: Duration): Boolean

    /** Checks if a field is set. */
    def isSet(field: DatatypeConstants.Field): Boolean

    /** Checks if this duration object is strictly shorter than
     *  another Duration object.
     */
    def isShorterThan(duration: Duration): Boolean

    /** Computes a new duration whose value is factor times
     *  longer than the value of this duration.
     */
    def multiply(factor: BigDecimal): Duration

    /** Computes a new duration whose value is factor times
     *  longer than the value of this duration.
     */
    def multiply(factor: Int): Duration

    /** Returns a new Duration object whose
     *  value is -this.
     */
    def negate(): Duration

    /** Converts the years and months fields into the days field
     *  by using a specific time instant as the reference point.
     */
    def normalizeWith(startTimeInstant: Calendar): Duration

    /** Computes a new duration whose value is this-rhs. */
    def subtract(rhs: Duration): Duration

    /** Returns a String representation of this Duration Object. */
    def toString(): String
}
