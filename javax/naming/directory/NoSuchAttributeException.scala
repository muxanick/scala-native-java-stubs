package javax.naming.directory

import java.lang.{Exception, Object, Throwable}
import javax.naming.NamingException

/** This exception is thrown when attempting to access
 *  an attribute that does not exist.
 *  
 *  Synchronization and serialization issues that apply to NamingException
 *  apply directly here.
 */
class NoSuchAttributeException extends NamingException {

    /** Constructs a new instance of NoSuchAttributeException. */
    @stub
    def this() = ???
}
