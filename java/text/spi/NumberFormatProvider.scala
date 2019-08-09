package java.text.spi

import java.lang.Object
import java.text.NumberFormat
import java.util.Locale
import java.util.spi.LocaleServiceProvider

// An abstract class for service providers that
// provide concrete implementations of the
// NumberFormat class.
abstract class NumberFormatProvider extends LocaleServiceProvider {

    // Returns a new NumberFormat instance which formats
    // monetary values for the specified locale.
    def getCurrencyInstance(locale: Locale): NumberFormat

    // Returns a new NumberFormat instance which formats
    // integer values for the specified locale.
    def getIntegerInstance(locale: Locale): NumberFormat

    // Returns a new general-purpose NumberFormat instance for
    // the specified locale.
    def getNumberInstance(locale: Locale): NumberFormat
}
