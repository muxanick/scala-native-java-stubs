package javax.naming

import java.lang.{Exception, Object, Throwable}

/** This exception is thrown when no initial context implementation
 *  can be created.  The policy of how an initial context implementation
 *  is selected is described in the documentation of the InitialContext class.
 * 
 *  This exception can be thrown during any interaction with the
 *  InitialContext, not only when the InitialContext is constructed.
 *  For example, the implementation of the initial context might lazily
 *  retrieve the context only when actual methods are invoked on it.
 *  The application should not have any dependency on when the existence
 *  of an initial context is determined.
 *  
 *  Synchronization and serialization issues that apply to NamingException
 *  apply directly here.
 */
class NoInitialContextException extends NamingException {

    /** Constructs an instance of NoInitialContextException. */
    @stub
    def this() = ???
}
