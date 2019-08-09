package javax.naming.directory

import java.lang.{Exception, Object, Throwable}
import javax.naming.NamingException

// This exception is thrown when the specification of
// a search filter is invalid.  The expression of the filter may
// be invalid, or there may be a problem with one of the parameters
// passed to the filter.
// 
// Synchronization and serialization issues that apply to NamingException
// apply directly here.
class InvalidSearchFilterException extends NamingException {

    @stub
    // Constructs a new instance of InvalidSearchFilterException.
    def this() = ???
}
