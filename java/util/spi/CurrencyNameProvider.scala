package java.util.spi

import java.lang.{Object, String}
import java.util.Locale
import scala.scalanative.annotation.stub

/** An abstract class for service providers that
 *  provide localized currency symbols and display names for the
 *  Currency class.
 *  Note that currency symbols are considered names when determining
 *  behaviors described in the
 *  LocaleServiceProvider
 *  specification.
 */
abstract class CurrencyNameProvider extends LocaleServiceProvider {

    /** Sole constructor. */
    @stub
    protected def this() = ???

    /** Returns a name for the currency that is appropriate for display to the
     *  user.
     */
    def getDisplayName(currencyCode: String, locale: Locale): String

    /** Gets the symbol of the given currency code for the specified locale. */
    def getSymbol(currencyCode: String, locale: Locale): String
}
