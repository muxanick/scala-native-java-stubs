package javax.accessibility

import java.lang.{Object, String}
import java.util.Locale
import scala.scalanative.annotation.stub

/** Base class used to maintain a strongly typed enumeration.  This is
 *  the superclass of AccessibleState and AccessibleRole.
 *  The toDisplayString method allows you to obtain the localized string
 *  for a locale independent key from a predefined ResourceBundle for the
 *  keys defined in this class.  This localized string is intended to be
 *  readable by humans.
 */
abstract class AccessibleBundle extends Object {

    /** Construct an AccessibleBundle. */
    @stub
    def this() = ???

    /** The locale independent name of the state. */
    protected val key: String

    /** Gets localized string describing the key using the default locale. */
    def toDisplayString(): String

    /** Obtains the key as a localized string. */
    def toDisplayString(locale: Locale): String

    /** Obtains the key as a localized string. */
    protected def toDisplayString(resourceBundleName: String, locale: Locale): String

    /** Gets localized string describing the key using the default locale. */
    def toString(): String
}
