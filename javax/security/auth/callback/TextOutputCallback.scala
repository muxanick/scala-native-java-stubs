package javax.security.auth.callback

import java.io.Serializable
import java.lang.{Object, String}

/**  Underlying security services instantiate and pass a
 *  TextOutputCallback to the handle
 *  method of a CallbackHandler to display information messages,
 *  warning messages and error messages.
 */
class TextOutputCallback extends Object with Callback with Serializable {

    /** Get the message to be displayed. */
    @stub
    def getMessage(): String = ???
}

object TextOutputCallback {
    /** Error message. */
    @stub
    val ERROR: Int = ???

    /** Information message. */
    @stub
    val INFORMATION: Int = ???
}
