package java.security

import java.lang.Object
import javax.security.auth.callback.CallbackHandler
import scala.scalanative.annotation.stub

/** A ProtectionParameter encapsulating a CallbackHandler. */
object KeyStore.CallbackHandlerProtection extends Object with KeyStore.ProtectionParameter {

    /** Constructs a new CallbackHandlerProtection from a
     *  CallbackHandler.
     */
    @stub
    def CallbackHandlerProtection(handler: CallbackHandler) = ???

    /** Returns the CallbackHandler. */
    @stub
    def getCallbackHandler(): CallbackHandler = ???
}
