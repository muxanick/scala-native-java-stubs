package java.awt

import java.lang.{Exception, IllegalStateException, Object, RuntimeException, Throwable}

// Signals that an AWT component is not in an appropriate state for
// the requested operation.
class IllegalComponentStateException extends IllegalStateException {

    @stub
    // Constructs an IllegalComponentStateException with no detail message.
    def this() = ???
}
