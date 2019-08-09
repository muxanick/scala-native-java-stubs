package javax.security.auth.callback

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Signals that a CallbackHandler does not
 *  recognize a particular Callback.
 */
class UnsupportedCallbackException extends Exception {

    /** Constructs a UnsupportedCallbackException
     *  with no detail message.
     */
    @stub
    def this(callback: Callback) = ???

    /** Constructs a UnsupportedCallbackException with the specified detail
     *  message.
     */
    @stub
    def this(callback: Callback, msg: String) = ???

    /** Get the unrecognized Callback. */
    @stub
    def getCallback(): Callback = ???
}
