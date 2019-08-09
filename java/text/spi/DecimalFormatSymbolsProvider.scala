package java.text.spi

import java.lang.Object
import java.text.DecimalFormatSymbols
import java.util.Locale
import java.util.spi.LocaleServiceProvider
import scala.scalanative.annotation.stub

/** An abstract class for service providers that
 *  provide instances of the
 *  DecimalFormatSymbols class.
 * 
 *  The requested Locale may contain an  extension for
 *  specifying the desired numbering system. For example, "ar-u-nu-arab"
 *  (in the BCP 47 language tag form) specifies Arabic with the Arabic-Indic
 *  digits and symbols, while "ar-u-nu-latn" specifies Arabic with the
 *  Latin digits and symbols. Refer to the Unicode Locale Data Markup
 *  Language (LDML) specification for numbering systems.
 */
abstract class DecimalFormatSymbolsProvider extends LocaleServiceProvider {

    /** Sole constructor. */
    @stub
    protected def this() = ???

    /** Returns a new DecimalFormatSymbols instance for the
     *  specified locale.
     */
    def getInstance(locale: Locale): DecimalFormatSymbols
}
