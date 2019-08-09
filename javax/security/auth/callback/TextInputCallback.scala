package javax.security.auth.callback

import java.io.Serializable
import java.lang.{Object, String}

//  Underlying security services instantiate and pass a
// TextInputCallback to the handle
// method of a CallbackHandler to retrieve generic text
// information.
class TextInputCallback extends Object with Callback, with Serializable {

    @stub
    // Construct a TextInputCallback with a prompt.
    def this(prompt: String) = ???

    @stub
    // Get the default text.
    def getDefaultText(): String = ???

    @stub
    // Get the prompt.
    def getPrompt(): String = ???

    @stub
    // Get the retrieved text.
    def getText(): String = ???
}
