package javax.accessibility

import java.lang.{Object, String}
import java.util.Locale

// Base class used to maintain a strongly typed enumeration.  This is
// the superclass of AccessibleState and AccessibleRole.
// The toDisplayString method allows you to obtain the localized string
// for a locale independent key from a predefined ResourceBundle for the
// keys defined in this class.  This localized string is intended to be
// readable by humans.
abstract class AccessibleBundle extends Object {

    // Gets localized string describing the key using the default locale.
    def toDisplayString(): String

    // Obtains the key as a localized string.
    def toDisplayString(locale: Locale): String

    // Obtains the key as a localized string.
    protected def toDisplayString(resourceBundleName: String, locale: Locale): String
}
