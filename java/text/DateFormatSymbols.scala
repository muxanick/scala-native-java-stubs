package java.text

import java.io.Serializable
import java.lang.{Cloneable, Object, String}
import java.util.Locale

// DateFormatSymbols is a public class for encapsulating
// localizable date-time formatting data, such as the names of the
// months, the names of the days of the week, and the time zone data.
// SimpleDateFormat uses
// DateFormatSymbols to encapsulate this information.
//
// 
// Typically you shouldn't use DateFormatSymbols directly.
// Rather, you are encouraged to create a date-time formatter with the
// DateFormat class's factory methods: getTimeInstance,
// getDateInstance, or getDateTimeInstance.
// These methods automatically create a DateFormatSymbols for
// the formatter so that you don't have to. After the
// formatter is created, you may modify its format pattern using the
// setPattern method. For more information about
// creating formatters using DateFormat's factory methods,
// see DateFormat.
//
// 
// If you decide to create a date-time formatter with a specific
// format pattern for a specific locale, you can do so with:
// 
// 
// new SimpleDateFormat(aPattern, DateFormatSymbols.getInstance(aLocale)).
// 
// 
//
// 
// DateFormatSymbols objects are cloneable. When you obtain
// a DateFormatSymbols object, feel free to modify the
// date-time formatting data. For instance, you can replace the localized
// date-time format pattern characters with the ones that you feel easy
// to remember. Or you can change the representative cities
// to your favorite ones.
//
// 
// New DateFormatSymbols subclasses may be added to support
// SimpleDateFormat for date-time formatting for additional locales.
class DateFormatSymbols extends Object with Serializable, with Cloneable {

    @stub
    // Construct a DateFormatSymbols object by loading format data from
    // resources for the default FORMAT
    // locale.
    def this() = ???

    @stub
    // Overrides Cloneable
    def clone(): Object = ???

    @stub
    // Override equals
    def equals(obj: Object): Boolean = ???

    @stub
    // Gets ampm strings.
    def getAmPmStrings(): Array[String] = ???

    @stub
    // Gets era strings.
    def getEras(): Array[String] = ???

    @stub
    // Gets localized date-time pattern characters.
    def getLocalPatternChars(): String = ???

    @stub
    // Gets month strings.
    def getMonths(): Array[String] = ???

    @stub
    // Gets short month strings.
    def getShortMonths(): Array[String] = ???

    @stub
    // Gets short weekday strings.
    def getShortWeekdays(): Array[String] = ???

    @stub
    // Gets weekday strings.
    def getWeekdays(): Array[String] = ???

    @stub
    // Gets time zone strings.
    def getZoneStrings(): Array[Array[String]] = ???

    @stub
    // Override hashCode.
    def hashCode(): Int = ???

    @stub
    // Sets ampm strings.
    def setAmPmStrings(newAmpms: Array[String]): Unit = ???

    @stub
    // Sets era strings.
    def setEras(newEras: Array[String]): Unit = ???

    @stub
    // Sets localized date-time pattern characters.
    def setLocalPatternChars(newLocalPatternChars: String): Unit = ???

    @stub
    // Sets month strings.
    def setMonths(newMonths: Array[String]): Unit = ???

    @stub
    // Sets short month strings.
    def setShortMonths(newShortMonths: Array[String]): Unit = ???

    @stub
    // Sets short weekday strings.
    def setShortWeekdays(newShortWeekdays: Array[String]): Unit = ???

    @stub
    // Sets weekday strings.
    def setWeekdays(newWeekdays: Array[String]): Unit = ???
}

object DateFormatSymbols {
    @stub
    // Returns an array of all locales for which the
    // getInstance methods of this class can return
    // localized instances.
    def getAvailableLocales(): Array[Locale] = ???

    @stub
    // Gets the DateFormatSymbols instance for the default
    // locale.
    def getInstance(): DateFormatSymbols = ???

    @stub
    // Gets the DateFormatSymbols instance for the specified
    // locale.
    def getInstance(locale: Locale): DateFormatSymbols = ???
}
