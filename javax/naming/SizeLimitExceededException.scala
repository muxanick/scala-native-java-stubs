package javax.naming

import java.lang.{Exception, Object, Throwable}

/** This exception is thrown when a method
 *  produces a result that exceeds a size-related limit.
 *  This can happen, for example, if the result contains
 *  more objects than the user requested, or when the size
 *  of the result exceeds some implementation-specific limit.
 *  
 *  Synchronization and serialization issues that apply to NamingException
 *  apply directly here.
 */
class SizeLimitExceededException extends LimitExceededException {

    /** Constructs a new instance of SizeLimitExceededException. */
    @stub
    def this() = ???
}
