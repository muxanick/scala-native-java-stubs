package javax.security.auth.callback

import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/**  Underlying security services instantiate and pass a
 *  TextInputCallback to the handle
 *  method of a CallbackHandler to retrieve generic text
 *  information.
 */
class TextInputCallback extends Object with Callback with Serializable {

    /** Construct a TextInputCallback with a prompt. */
    @stub
    def this(prompt: String) = ???

    /** Construct a TextInputCallback with a prompt
     *  and default input value.
     */
    @stub
    def this(prompt: String, defaultText: String) = ???

    /** Get the default text. */
    @stub
    def getDefaultText(): String = ???

    /** Get the prompt. */
    @stub
    def getPrompt(): String = ???

    /** Get the retrieved text. */
    @stub
    def getText(): String = ???

    /** Set the retrieved text. */
    @stub
    def setText(text: String): Unit = ???
}
