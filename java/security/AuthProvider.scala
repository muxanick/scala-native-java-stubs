package java.security

import java.lang.{Object, String}
import java.util.{Dictionary, Hashtable, Properties}
import javax.security.auth.Subject
import javax.security.auth.callback.CallbackHandler
import scala.scalanative.annotation.stub

/** This class defines login and logout methods for a provider.
 * 
 *   While callers may invoke login directly,
 *  the provider may also invoke login on behalf of callers
 *  if it determines that a login must be performed
 *  prior to certain operations.
 */
abstract class AuthProvider extends Provider {

    /** Constructs a provider with the specified name, version number,
     *  and information.
     */
    @stub
    protected def this(name: String, version: Double, info: String) = ???

    /** Log in to this provider. */
    def login(subject: Subject, handler: CallbackHandler): Unit

    /** Log out from this provider. */
    def logout(): Unit

    /** Set a CallbackHandler. */
    def setCallbackHandler(handler: CallbackHandler): Unit
}
