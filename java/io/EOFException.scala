package java.io

import java.lang.{Exception, Object, Throwable}

// Signals that an end of file or end of stream has been reached
// unexpectedly during input.
// 
// This exception is mainly used by data input streams to signal end of
// stream. Note that many other input operations return a special value on
// end of stream rather than throwing an exception.
class EOFException extends IOException {

    @stub
    // Constructs an EOFException with null
    // as its error detail message.
    def this() = ???
}
