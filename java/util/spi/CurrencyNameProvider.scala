package java.util.spi

import java.lang.{Object, String}
import java.util.Locale

/** An abstract class for service providers that
 *  provide localized currency symbols and display names for the
 *  Currency class.
 *  Note that currency symbols are considered names when determining
 *  behaviors described in the
 *  LocaleServiceProvider
 *  specification.
 */
abstract class CurrencyNameProvider extends LocaleServiceProvider {

    /** Returns a name for the currency that is appropriate for display to the
     *  user.
     */
    def getDisplayName(currencyCode: String, locale: Locale): String
}
