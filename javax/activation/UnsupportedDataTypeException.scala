package javax.activation

import java.io.IOException
import java.lang.{Exception, Object, Throwable}

// Signals that the requested operation does not support the
// requested data type.
class UnsupportedDataTypeException extends IOException {

    @stub
    // Constructs an UnsupportedDataTypeException with no detail
    // message.
    def this() = ???
}
