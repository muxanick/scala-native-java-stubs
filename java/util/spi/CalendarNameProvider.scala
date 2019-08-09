package java.util.spi

import java.lang.{Integer, Object, String}
import java.util.{Locale, Map}
import scala.scalanative.annotation.stub

/** An abstract class for service providers that provide localized string
 *  representations (display names) of Calendar field values.
 * 
 *  Calendar Types
 * 
 *  Calendar types are used to specify calendar systems for which the getDisplayName and getDisplayNames methods provide
 *  calendar field value names. See Calendar.getCalendarType() for details.
 * 
 *  Calendar Fields
 * 
 *  Calendar fields are specified with the constants defined in Calendar. The following are calendar-common fields and their values to be
 *  supported for each calendar system.
 * 
 *  
 *    
 *      Field
 *      Value
 *      Description
 *    
 *    
 *      Calendar.MONTH
 *      Calendar.JANUARY to Calendar.UNDECIMBER
 *      Month numbering is 0-based (e.g., 0 - January, ..., 11 -
 *          December). Some calendar systems have 13 months. Month
 *          names need to be supported in both the formatting and
 *          stand-alone forms if required by the supported locales. If there's
 *          no distinction in the two forms, the same names should be returned
 *          in both of the forms.
 *    
 *    
 *      Calendar.DAY_OF_WEEK
 *      Calendar.SUNDAY to Calendar.SATURDAY
 *      Day-of-week numbering is 1-based starting from Sunday (i.e., 1 - Sunday,
 *          ..., 7 - Saturday).
 *    
 *    
 *      Calendar.AM_PM
 *      Calendar.AM to Calendar.PM
 *      0 - AM, 1 - PM
 *    
 *  
 * 
 *  The following are calendar-specific fields and their values to be supported.
 * 
 *  
 *    
 *      Calendar Type
 *      Field
 *      Value
 *      Description
 *    
 *    
 *      "gregory"
 *      Calendar.ERA
 *      0
 *      GregorianCalendar.BC (BCE)
 *    
 *    
 *      1
 *      GregorianCalendar.AD (CE)
 *    
 *    
 *      "buddhist"
 *      Calendar.ERA
 *      0
 *      BC (BCE)
 *    
 *    
 *      1
 *      B.E. (Buddhist Era)
 *    
 *    
 *      "japanese"
 *      Calendar.ERA
 *      0
 *      Seireki (Before Meiji)
 *    
 *    
 *      1
 *      Meiji
 *    
 *    
 *      2
 *      Taisho
 *    
 *    
 *      3
 *      Showa
 *    
 *    
 *      4
 *      Heisei
 *    
 *    
 *      Calendar.YEAR
 *      1
 *      the first year in each era. It should be returned when a long
 *      style (Calendar.LONG_FORMAT or Calendar.LONG_STANDALONE) is
 *      specified. See also the 
 *      Year representation in SimpleDateFormat.
 *    
 *    
 *      "roc"
 *      Calendar.ERA
 *      0
 *      Before R.O.C.
 *    
 *    
 *      1
 *      R.O.C.
 *    
 *    
 *      "islamic"
 *      Calendar.ERA
 *      0
 *      Before AH
 *    
 *    
 *      1
 *      Anno Hijrah (AH)
 *    
 *  
 * 
 *  Calendar field value names for "gregory" must be consistent with
 *  the date-time symbols provided by DateFormatSymbolsProvider.
 * 
 *  Time zone names are supported by TimeZoneNameProvider.
 */
abstract class CalendarNameProvider extends LocaleServiceProvider {

    /** Sole constructor. */
    @stub
    protected def this() = ???

    /** Returns the string representation (display name) of the calendar
     *  field value in the given style and
     *  locale.
     */
    def getDisplayName(calendarType: String, field: Int, value: Int, style: Int, locale: Locale): String

    /** Returns a Map containing all string representations (display
     *  names) of the Calendar field in the given style
     *  and locale and their corresponding field values.
     */
    def getDisplayNames(calendarType: String, field: Int, style: Int, locale: Locale): Map[String, Integer]
}
