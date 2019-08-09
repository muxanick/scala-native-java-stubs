package javax.security.auth.callback

import java.io.Serializable
import java.lang.{Object, String}

/**  Underlying security services instantiate and pass a
 *  TextInputCallback to the handle
 *  method of a CallbackHandler to retrieve generic text
 *  information.
 */
class TextInputCallback extends Object with Callback with Serializable {

    /** Construct a TextInputCallback with a prompt. */
    @stub
    def this(prompt: String) = ???

    /** Get the default text. */
    @stub
    def getDefaultText(): String = ???

    /** Get the prompt. */
    @stub
    def getPrompt(): String = ???

    /** Get the retrieved text. */
    @stub
    def getText(): String = ???
}
