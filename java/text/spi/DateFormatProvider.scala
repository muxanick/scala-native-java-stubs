package java.text.spi

import java.lang.Object
import java.text.DateFormat
import java.util.Locale
import java.util.spi.LocaleServiceProvider
import scala.scalanative.annotation.stub

/** An abstract class for service providers that
 *  provide concrete implementations of the
 *  DateFormat class.
 */
abstract class DateFormatProvider extends LocaleServiceProvider {

    /** Sole constructor. */
    @stub
    protected def this() = ???

    /** Returns a new DateFormat instance which formats date
     *  with the given formatting style for the specified locale.
     */
    def getDateInstance(style: Int, locale: Locale): DateFormat

    /** Returns a new DateFormat instance which formats date and time
     *  with the given formatting style for the specified locale.
     */
    def getDateTimeInstance(dateStyle: Int, timeStyle: Int, locale: Locale): DateFormat

    /** Returns a new DateFormat instance which formats time
     *  with the given formatting style for the specified locale.
     */
    def getTimeInstance(style: Int, locale: Locale): DateFormat
}
