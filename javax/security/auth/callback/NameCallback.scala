package javax.security.auth.callback

import java.io.Serializable
import java.lang.{Object, String}

/**  Underlying security services instantiate and pass a
 *  NameCallback to the handle
 *  method of a CallbackHandler to retrieve name information.
 */
class NameCallback extends Object with Callback with Serializable {

    /** Construct a NameCallback with a prompt. */
    @stub
    def this(prompt: String) = ???

    /** Get the default name. */
    @stub
    def getDefaultName(): String = ???

    /** Get the retrieved name. */
    @stub
    def getName(): String = ???

    /** Get the prompt. */
    @stub
    def getPrompt(): String = ???
}
