package javax.security.sasl

import java.io.Serializable
import java.lang.{Object, String}
import javax.security.auth.callback.Callback

/** This callback is used by SaslServer to determine whether
 *  one entity (identified by an authenticated authentication id)
 *  can act on
 *  behalf of another entity (identified by an authorization id).
 */
class AuthorizeCallback extends Object with Callback with Serializable {

    /** Returns the authentication id to check. */
    @stub
    def getAuthenticationID(): String = ???

    /** Returns the authorization id to check. */
    @stub
    def getAuthorizationID(): String = ???

    /** Returns the id of the authorized user. */
    @stub
    def getAuthorizedID(): String = ???

    /** Determines whether the authentication id is allowed to
     *  act on behalf of the authorization id.
     */
    @stub
    def isAuthorized(): Boolean = ???

    /** Sets whether the authorization is allowed. */
    @stub
    def setAuthorized(ok: Boolean): Unit = ???
}
