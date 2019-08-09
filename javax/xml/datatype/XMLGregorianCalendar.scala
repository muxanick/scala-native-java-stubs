package javax.xml.datatype

import java.lang.{Cloneable, Object, String}
import java.math.{BigDecimal, BigInteger}
import java.util.{GregorianCalendar, Locale, TimeZone}
import javax.xml.namespace.QName

/** Representation for W3C XML Schema 1.0 date/time datatypes.
 *  Specifically, these date/time datatypes are
 *  DatatypeConstants.DATETIME,
 *  DatatypeConstants.TIME,
 *  DatatypeConstants.DATE,
 *  DatatypeConstants.GYEARMONTH,
 *  DatatypeConstants.GMONTHDAY,
 *  DatatypeConstants.GYEAR,
 *  DatatypeConstants.GMONTH, and
 *  DatatypeConstants.GDAY
 *  defined in the XML Namespace
 *  "http://www.w3.org/2001/XMLSchema".
 *  These datatypes are normatively defined in
 *  W3C XML Schema 1.0 Part 2, Section 3.2.7-14.
 * 
 *  The table below defines the mapping between XML Schema 1.0
 *  date/time datatype fields and this class' fields. It also summarizes
 *  the value constraints for the date and time fields defined in
 *  W3C XML Schema 1.0 Part 2, Appendix D,
 *  ISO 8601 Date and Time Formats.
 * 
 *  
 *  
 *    
 *      
 *        
 *          Date/Time Datatype Field Mapping Between XML Schema 1.0 and Java Representation
 *        
 *      
 *    
 *    
 *      
 *        XML Schema 1.0
 *            datatype
 *             field
 *        RelatedXMLGregorianCalendarAccessor(s)
 *        Value Range
 *      
 *      
 *        year
 *         getYear() + getEon() or
 *             getEonAndYear()
 *        
 *         getYear() is a value between -(10^9-1) to (10^9)-1
 *             or DatatypeConstants.FIELD_UNDEFINED.
 *             getEon() is high order year value in billion of years.
 *             getEon() has values greater than or equal to (10^9) or less than or equal to -(10^9).
 *             A value of null indicates field is undefined.
 *             Given that XML Schema 1.0 errata states that the year zero
 *             will be a valid lexical value in a future version of XML Schema,
 *             this class allows the year field to be set to zero. Otherwise,
 *             the year field value is handled exactly as described
 *             in the errata and [ISO-8601-1988]. Note that W3C XML Schema 1.0
 *             validation does not allow for the year field to have a value of zero.
 *             
 *      
 *      
 *        month
 *         getMonth() 
 *         1 to 12 or DatatypeConstants.FIELD_UNDEFINED 
 *      
 *      
 *        day
 *         getDay() 
 *         Independent of month, max range is 1 to 31 or DatatypeConstants.FIELD_UNDEFINED.
 *             The normative value constraint stated relative to month
 *             field's value is in W3C XML Schema 1.0 Part 2, Appendix D.
 *        
 *      
 *      
 *        hour
 *        getHour()
 *        
 *          0 to 23 or DatatypeConstants.FIELD_UNDEFINED.
 *          An hour value of 24 is allowed to be set in the lexical space provided the minute and second
 *          field values are zero. However, an hour value of 24 is not allowed in value space and will be
 *          transformed to represent the value of the first instance of the following day as per
 *          
 *          XML Schema Part 2: Datatypes Second Edition, 3.2 Primitive datatypes.
 *        
 *      
 *      
 *        minute
 *         getMinute() 
 *         0 to 59 or DatatypeConstants.FIELD_UNDEFINED 
 *      
 *      
 *        second
 *        
 *          getSecond() + getMillisecond()/1000 or
 *          getSecond() + getFractionalSecond()
 *        
 *        
 *          getSecond() from 0 to 60 or DatatypeConstants.FIELD_UNDEFINED.
 *          (Note: 60 only allowable for leap second.)
 *          getFractionalSecond() allows for infinite precision over the range from 0.0 to 1.0 when
 *          the getSecond() is defined.
 *          FractionalSecond is optional and has a value of null when it is undefined.
 *             getMillisecond() is the convenience
 *             millisecond precision of value of getFractionalSecond().
 *        
 *      
 *      
 *        timezone
 *         getTimezone() 
 *         Number of minutes or DatatypeConstants.FIELD_UNDEFINED.
 *          Value range from -14 hours (-14 * 60 minutes) to 14 hours (14 * 60 minutes).
 *        
 *      
 *    
 *   
 * 
 *  All maximum value space constraints listed for the fields in the table
 *  above are checked by factory methods, @{link DatatypeFactory},
 *  setter methods and parse methods of
 *  this class. IllegalArgumentException is thrown when a
 *  parameter's value is outside the value constraint for the field or
 *  if the composite
 *  values constitute an invalid XMLGregorianCalendar instance (for example, if
 *  the 31st of June is specified).
 *  
 * 
 *  The following operations are defined for this class:
 *  
 *    accessors/mutators for independent date/time fields
 *    conversion between this class and W3C XML Schema 1.0 lexical representation,
 *      toString(), DatatypeFactory.newXMLGregorianCalendar(String lexicalRepresentation)
 *    conversion between this class and GregorianCalendar,
 *      toGregorianCalendar(java.util.TimeZone timezone, java.util.Locale aLocale, XMLGregorianCalendar defaults),
 *      DatatypeFactory
 *    partial order relation comparator method, compare(XMLGregorianCalendar xmlGregorianCalendar)
 *    equals(Object) defined relative to compare(XMLGregorianCalendar xmlGregorianCalendar).
 *    addition operation with Duration
 *       instance as defined in 
 *       W3C XML Schema 1.0 Part 2, Appendix E, Adding durations to dateTimes.
 *    
 *  
 *  
 */
abstract class XMLGregorianCalendar extends Object with Cloneable {

    /** Add duration to this instance. */
    def add(duration: Duration): Unit

    /** Unset all fields to undefined. */
    def clear(): Unit

    /** Creates and returns a copy of this object. */
    def clone(): Object

    /** Compare two instances of W3C XML Schema 1.0 date/time datatypes
     *  according to partial order relation defined in
     *  W3C XML Schema 1.0 Part 2, Section 3.2.7.3,
     *  Order relation on dateTime.
     */
    def compare(xmlGregorianCalendar: XMLGregorianCalendar): Int

    /** Compares this calendar to the specified object. */
    def equals(obj: Object): Boolean

    /** Return day in month or DatatypeConstants.FIELD_UNDEFINED. */
    def getDay(): Int

    /** Return high order component for XML Schema 1.0 dateTime datatype field for
     *  year.
     */
    def getEon(): BigInteger

    /** Return XML Schema 1.0 dateTime datatype field for
     *  year.
     */
    def getEonAndYear(): BigInteger

    /** Return fractional seconds. */
    def getFractionalSecond(): BigDecimal

    /** Return hours or DatatypeConstants.FIELD_UNDEFINED. */
    def getHour(): Int

    /** Return millisecond precision of getFractionalSecond(). */
    def getMillisecond(): Int

    /** Return minutes or DatatypeConstants.FIELD_UNDEFINED. */
    def getMinute(): Int

    /** Return number of month or DatatypeConstants.FIELD_UNDEFINED. */
    def getMonth(): Int

    /** Return seconds or DatatypeConstants.FIELD_UNDEFINED. */
    def getSecond(): Int

    /** Return timezone offset in minutes or
     *  DatatypeConstants.FIELD_UNDEFINED if this optional field is not defined.
     */
    def getTimezone(): Int

    /** Returns a java.util.TimeZone for this class. */
    def getTimeZone(defaultZoneoffset: Int): TimeZone

    /** Return the name of the XML Schema date/time type that this instance
     *  maps to.
     */
    def getXMLSchemaType(): QName

    /** Return low order component for XML Schema 1.0 dateTime datatype field for
     *  year or DatatypeConstants.FIELD_UNDEFINED.
     */
    def getYear(): Int

    /** Returns a hash code consistent with the definition of the equals method. */
    def hashCode(): Int

    /** Validate instance by getXMLSchemaType() constraints. */
    def isValid(): Boolean

    /** Normalize this instance to UTC. */
    def normalize(): XMLGregorianCalendar

    /** Reset this XMLGregorianCalendar to its original values. */
    def reset(): Unit

    /** Set days in month. */
    def setDay(day: Int): Unit

    /** Set fractional seconds. */
    def setFractionalSecond(fractional: BigDecimal): Unit

    /** Set hours. */
    def setHour(hour: Int): Unit

    /** Set milliseconds. */
    def setMillisecond(millisecond: Int): Unit

    /** Set minutes. */
    def setMinute(minute: Int): Unit

    /** Set month. */
    def setMonth(month: Int): Unit

    /** Set seconds. */
    def setSecond(second: Int): Unit

    /** Set time as one unit. */
    def setTime(hour: Int, minute: Int, second: Int): Unit

    /** Set time as one unit, including the optional infinite precision
     *  fractional seconds.
     */
    def setTime(hour: Int, minute: Int, second: Int, fractional: BigDecimal): Unit

    /** Set time as one unit, including optional milliseconds. */
    def setTime(hour: Int, minute: Int, second: Int, millisecond: Int): Unit

    /** Set the number of minutes in the timezone offset. */
    def setTimezone(offset: Int): Unit

    /** Set low and high order component of XSD dateTime year field. */
    def setYear(year: BigInteger): Unit

    /** Set year of XSD dateTime year field. */
    def setYear(year: Int): Unit

    /** Convert this XMLGregorianCalendar to a GregorianCalendar. */
    def toGregorianCalendar(): GregorianCalendar

    /** Convert this XMLGregorianCalendar along with provided parameters
     *  to a GregorianCalendar instance.
     */
    def toGregorianCalendar(timezone: TimeZone, aLocale: Locale, defaults: XMLGregorianCalendar): GregorianCalendar

    /** Returns a String representation of this XMLGregorianCalendar Object. */
    def toString(): String
}
