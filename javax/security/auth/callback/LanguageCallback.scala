package javax.security.auth.callback

import java.io.Serializable
import java.lang.Object
import java.util.Locale

/**  Underlying security services instantiate and pass a
 *  LanguageCallback to the handle
 *  method of a CallbackHandler to retrieve the Locale
 *  used for localizing text.
 */
class LanguageCallback extends Object with Callback with Serializable {

    /** Get the retrieved Locale. */
    @stub
    def getLocale(): Locale = ???
}
