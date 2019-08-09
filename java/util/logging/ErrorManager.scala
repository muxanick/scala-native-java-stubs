package java.util.logging

import java.lang.Object

// ErrorManager objects can be attached to Handlers to process
// any error that occurs on a Handler during Logging.
// 
// When processing logging output, if a Handler encounters problems
// then rather than throwing an Exception back to the issuer of
// the logging call (who is unlikely to be interested) the Handler
// should call its associated ErrorManager.
class ErrorManager extends Object {
}

object ErrorManager {
    @stub
    // CLOSE_FAILURE is used when a close of an output stream fails.
    def CLOSE_FAILURE: Int = ???

    @stub
    // FLUSH_FAILURE is used when a flush to an output stream fails.
    def FLUSH_FAILURE: Int = ???

    @stub
    // FORMAT_FAILURE is used when formatting fails for any reason.
    def FORMAT_FAILURE: Int = ???

    @stub
    // GENERIC_FAILURE is used for failure that don't fit
    // into one of the other categories.
    def GENERIC_FAILURE: Int = ???

    @stub
    // OPEN_FAILURE is used when an open of an output stream fails.
    def OPEN_FAILURE: Int = ???
}
