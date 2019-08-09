package javax.naming

import java.lang.{Exception, Object, Throwable}

// This exception is thrown when a malformed link was encountered while
// resolving or constructing a link.
// 
// Synchronization and serialization issues that apply to LinkException
// apply directly here.
class MalformedLinkException extends LinkException {

    @stub
    // Constructs a new instance of Malformed LinkException.
    def this() = ???
}
