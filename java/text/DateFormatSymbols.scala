package java.text

import java.io.Serializable
import java.lang.{Cloneable, Object, String}
import java.util.Locale
import scala.scalanative.annotation.stub

/** DateFormatSymbols is a public class for encapsulating
 *  localizable date-time formatting data, such as the names of the
 *  months, the names of the days of the week, and the time zone data.
 *  SimpleDateFormat uses
 *  DateFormatSymbols to encapsulate this information.
 * 
 *  
 *  Typically you shouldn't use DateFormatSymbols directly.
 *  Rather, you are encouraged to create a date-time formatter with the
 *  DateFormat class's factory methods: getTimeInstance,
 *  getDateInstance, or getDateTimeInstance.
 *  These methods automatically create a DateFormatSymbols for
 *  the formatter so that you don't have to. After the
 *  formatter is created, you may modify its format pattern using the
 *  setPattern method. For more information about
 *  creating formatters using DateFormat's factory methods,
 *  see DateFormat.
 * 
 *  
 *  If you decide to create a date-time formatter with a specific
 *  format pattern for a specific locale, you can do so with:
 *  
 *  
 *  new SimpleDateFormat(aPattern, DateFormatSymbols.getInstance(aLocale)).
 *  
 *  
 * 
 *  
 *  DateFormatSymbols objects are cloneable. When you obtain
 *  a DateFormatSymbols object, feel free to modify the
 *  date-time formatting data. For instance, you can replace the localized
 *  date-time format pattern characters with the ones that you feel easy
 *  to remember. Or you can change the representative cities
 *  to your favorite ones.
 * 
 *  
 *  New DateFormatSymbols subclasses may be added to support
 *  SimpleDateFormat for date-time formatting for additional locales.
 */
class DateFormatSymbols extends Object with Serializable with Cloneable {

    /** Construct a DateFormatSymbols object by loading format data from
     *  resources for the default FORMAT
     *  locale.
     */
    @stub
    def this() = ???

    /** Construct a DateFormatSymbols object by loading format data from
     *  resources for the given locale.
     */
    @stub
    def this(locale: Locale) = ???

    /** Overrides Cloneable */
    @stub
    def clone(): Object = ???

    /** Override equals */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Gets ampm strings. */
    @stub
    def getAmPmStrings(): Array[String] = ???

    /** Gets era strings. */
    @stub
    def getEras(): Array[String] = ???

    /** Gets localized date-time pattern characters. */
    @stub
    def getLocalPatternChars(): String = ???

    /** Gets month strings. */
    @stub
    def getMonths(): Array[String] = ???

    /** Gets short month strings. */
    @stub
    def getShortMonths(): Array[String] = ???

    /** Gets short weekday strings. */
    @stub
    def getShortWeekdays(): Array[String] = ???

    /** Gets weekday strings. */
    @stub
    def getWeekdays(): Array[String] = ???

    /** Gets time zone strings. */
    @stub
    def getZoneStrings(): Array[Array[String]] = ???

    /** Override hashCode. */
    @stub
    def hashCode(): Int = ???

    /** Sets ampm strings. */
    @stub
    def setAmPmStrings(newAmpms: Array[String]): Unit = ???

    /** Sets era strings. */
    @stub
    def setEras(newEras: Array[String]): Unit = ???

    /** Sets localized date-time pattern characters. */
    @stub
    def setLocalPatternChars(newLocalPatternChars: String): Unit = ???

    /** Sets month strings. */
    @stub
    def setMonths(newMonths: Array[String]): Unit = ???

    /** Sets short month strings. */
    @stub
    def setShortMonths(newShortMonths: Array[String]): Unit = ???

    /** Sets short weekday strings. */
    @stub
    def setShortWeekdays(newShortWeekdays: Array[String]): Unit = ???

    /** Sets weekday strings. */
    @stub
    def setWeekdays(newWeekdays: Array[String]): Unit = ???

    /** Sets time zone strings. */
    @stub
    def setZoneStrings(newZoneStrings: Array[Array[String]]): Unit = ???
}

object DateFormatSymbols {
    /** Returns an array of all locales for which the
     *  getInstance methods of this class can return
     *  localized instances.
     */
    @stub
    def getAvailableLocales(): Array[Locale] = ???

    /** Gets the DateFormatSymbols instance for the default
     *  locale.
     */
    @stub
    def getInstance(): DateFormatSymbols = ???

    /** Gets the DateFormatSymbols instance for the specified
     *  locale.
     */
    @stub
    def getInstance(locale: Locale): DateFormatSymbols = ???
}
