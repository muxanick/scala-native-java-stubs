package javax.security.auth.callback

import java.lang.{Exception, Object, Throwable}

// Signals that a CallbackHandler does not
// recognize a particular Callback.
class UnsupportedCallbackException extends Exception {

    @stub
    // Constructs a UnsupportedCallbackException
    // with no detail message.
    def this(callback: Callback) = ???
}
