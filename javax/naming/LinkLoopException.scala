package javax.naming

import java.lang.{Exception, Object, Throwable}

// This exception is thrown when
// a loop was detected will attempting to resolve a link, or an implementation
// specific limit on link counts has been reached.
// 
// Synchronization and serialization issues that apply to LinkException
// apply directly here.
class LinkLoopException extends LinkException {

    @stub
    // Constructs a new instance of LinkLoopException.
    def this() = ???
}
