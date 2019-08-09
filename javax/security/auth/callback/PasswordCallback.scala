package javax.security.auth.callback

import java.io.Serializable
import java.lang.{Object, String}

/**  Underlying security services instantiate and pass a
 *  PasswordCallback to the handle
 *  method of a CallbackHandler to retrieve password information.
 */
class PasswordCallback extends Object with Callback with Serializable {

    /** Clear the retrieved password. */
    @stub
    def clearPassword(): Unit = ???

    /** Get the retrieved password. */
    @stub
    def getPassword(): Array[Char] = ???

    /** Get the prompt. */
    @stub
    def getPrompt(): String = ???

    /** Return whether the password
     *  should be displayed as it is being typed.
     */
    @stub
    def isEchoOn(): Boolean = ???
}
