package java.util.spi

import java.lang.{Object, String}
import java.util.Locale

/** An abstract class for service providers that
 *  provide localized names for the
 *  Locale class.
 */
abstract class LocaleNameProvider extends LocaleServiceProvider {

    /** Returns a localized name for the given 
     *  IETF BCP47 region code (either ISO 3166 country code or UN M.49 area
     *  codes) and the given locale that is appropriate for display to the user.
     */
    def getDisplayCountry(countryCode: String, locale: Locale): String

    /** Returns a localized name for the given 
     *  IETF BCP47 language code and the given locale that is appropriate for
     *  display to the user.
     */
    def getDisplayLanguage(languageCode: String, locale: Locale): String

    /** Returns a localized name for the given 
     *  IETF BCP47 script code and the given locale that is appropriate for
     *  display to the user.
     */
    def getDisplayScript(scriptCode: String, locale: Locale): String
}
