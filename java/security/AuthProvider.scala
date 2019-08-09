package java.security

import java.lang.Object
import java.util.{Dictionary, Hashtable, Properties}
import javax.security.auth.Subject
import javax.security.auth.callback.CallbackHandler

/** This class defines login and logout methods for a provider.
 * 
 *   While callers may invoke login directly,
 *  the provider may also invoke login on behalf of callers
 *  if it determines that a login must be performed
 *  prior to certain operations.
 */
abstract class AuthProvider extends Provider {

    /** Log in to this provider. */
    def login(subject: Subject, handler: CallbackHandler): Unit

    /** Log out from this provider. */
    def logout(): Unit
}
