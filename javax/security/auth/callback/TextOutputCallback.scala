package javax.security.auth.callback

import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/**  Underlying security services instantiate and pass a
 *  TextOutputCallback to the handle
 *  method of a CallbackHandler to display information messages,
 *  warning messages and error messages.
 */
class TextOutputCallback extends Object with Callback with Serializable {

    /** Construct a TextOutputCallback with a message type and message
     *  to be displayed.
     */
    @stub
    def this(messageType: Int, message: String) = ???

    /** Get the message to be displayed. */
    @stub
    def getMessage(): String = ???

    /** Get the message type. */
    @stub
    def getMessageType(): Int = ???
}

object TextOutputCallback {
    /** Error message. */
    @stub
    val ERROR: Int = ???

    /** Information message. */
    @stub
    val INFORMATION: Int = ???

    /** Warning message. */
    @stub
    val WARNING: Int = ???
}
