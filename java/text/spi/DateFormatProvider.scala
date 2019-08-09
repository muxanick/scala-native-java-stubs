package java.text.spi

import java.lang.Object
import java.text.DateFormat
import java.util.Locale
import java.util.spi.LocaleServiceProvider

/** An abstract class for service providers that
 *  provide concrete implementations of the
 *  DateFormat class.
 */
abstract class DateFormatProvider extends LocaleServiceProvider {

    /** Returns a new DateFormat instance which formats date
     *  with the given formatting style for the specified locale.
     */
    def getDateInstance(style: Int, locale: Locale): DateFormat

    /** Returns a new DateFormat instance which formats date and time
     *  with the given formatting style for the specified locale.
     */
    def getDateTimeInstance(dateStyle: Int, timeStyle: Int, locale: Locale): DateFormat
}
