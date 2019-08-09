package javax.security.auth.callback

import java.io.Serializable
import java.lang.Object
import java.util.Locale
import scala.scalanative.annotation.stub

/**  Underlying security services instantiate and pass a
 *  LanguageCallback to the handle
 *  method of a CallbackHandler to retrieve the Locale
 *  used for localizing text.
 */
class LanguageCallback extends Object with Callback with Serializable {

    /** Construct a LanguageCallback. */
    @stub
    def this() = ???

    /** Get the retrieved Locale. */
    @stub
    def getLocale(): Locale = ???

    /** Set the retrieved Locale. */
    @stub
    def setLocale(locale: Locale): Unit = ???
}
