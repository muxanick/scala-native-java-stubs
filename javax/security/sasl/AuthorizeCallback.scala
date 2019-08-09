package javax.security.sasl

import java.io.Serializable
import java.lang.{Object, String}
import javax.security.auth.callback.Callback

// This callback is used by SaslServer to determine whether
// one entity (identified by an authenticated authentication id)
// can act on
// behalf of another entity (identified by an authorization id).
class AuthorizeCallback extends Object with Callback, with Serializable {

    @stub
    // Returns the authentication id to check.
    def getAuthenticationID(): String = ???

    @stub
    // Returns the authorization id to check.
    def getAuthorizationID(): String = ???

    @stub
    // Returns the id of the authorized user.
    def getAuthorizedID(): String = ???

    @stub
    // Determines whether the authentication id is allowed to
    // act on behalf of the authorization id.
    def isAuthorized(): Boolean = ???

    @stub
    // Sets whether the authorization is allowed.
    def setAuthorized(ok: Boolean): Unit = ???
}
