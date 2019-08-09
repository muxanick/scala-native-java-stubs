package javax.naming

import java.lang.{Exception, Object, Throwable}

/** This exception is thrown when a component of the name cannot be resolved
 *  because it is not bound.
 *  
 *  Synchronization and serialization issues that apply to NamingException
 *  apply directly here.
 */
class NameNotFoundException extends NamingException {

    /** Constructs a new instance of NameNotFoundException. */
    @stub
    def this() = ???
}
