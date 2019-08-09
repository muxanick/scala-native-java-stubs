package javax.security.auth.callback

import java.io.Serializable
import java.lang.{Object, String}

//  Underlying security services instantiate and pass a
// NameCallback to the handle
// method of a CallbackHandler to retrieve name information.
class NameCallback extends Object with Callback, with Serializable {

    @stub
    // Construct a NameCallback with a prompt.
    def this(prompt: String) = ???

    @stub
    // Get the default name.
    def getDefaultName(): String = ???

    @stub
    // Get the retrieved name.
    def getName(): String = ???

    @stub
    // Get the prompt.
    def getPrompt(): String = ???
}
