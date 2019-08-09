package javax.security.auth.callback

import java.io.Serializable
import java.lang.{Object, String}

//  Underlying security services instantiate and pass a
// PasswordCallback to the handle
// method of a CallbackHandler to retrieve password information.
class PasswordCallback extends Object with Callback, with Serializable {

    @stub
    // Clear the retrieved password.
    def clearPassword(): Unit = ???

    @stub
    // Get the retrieved password.
    def getPassword(): Array[Char] = ???

    @stub
    // Get the prompt.
    def getPrompt(): String = ???

    @stub
    // Return whether the password
    // should be displayed as it is being typed.
    def isEchoOn(): Boolean = ???
}
