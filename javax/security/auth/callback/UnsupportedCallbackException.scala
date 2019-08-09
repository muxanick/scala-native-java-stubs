package javax.security.auth.callback

import java.lang.{Exception, Object, Throwable}

/** Signals that a CallbackHandler does not
 *  recognize a particular Callback.
 */
class UnsupportedCallbackException extends Exception {

    /** Constructs a UnsupportedCallbackException
     *  with no detail message.
     */
    @stub
    def this(callback: Callback) = ???
}
