package java.text.spi

import java.lang.Object
import java.text.DateFormatSymbols
import java.util.Locale
import java.util.spi.LocaleServiceProvider
import scala.scalanative.annotation.stub

/** An abstract class for service providers that
 *  provide instances of the
 *  DateFormatSymbols class.
 */
abstract class DateFormatSymbolsProvider extends LocaleServiceProvider {

    /** Sole constructor. */
    @stub
    protected def this() = ???

    /** Returns a new DateFormatSymbols instance for the
     *  specified locale.
     */
    def getInstance(locale: Locale): DateFormatSymbols
}
