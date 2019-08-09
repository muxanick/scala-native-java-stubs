package javax.naming.directory

import java.lang.{Exception, Object, String, Throwable}
import javax.naming.NamingException
import scala.scalanative.annotation.stub

/** This exception is thrown when the specification of
 *  a search filter is invalid.  The expression of the filter may
 *  be invalid, or there may be a problem with one of the parameters
 *  passed to the filter.
 *  
 *  Synchronization and serialization issues that apply to NamingException
 *  apply directly here.
 */
class InvalidSearchFilterException extends NamingException {

    /** Constructs a new instance of InvalidSearchFilterException. */
    @stub
    def this() = ???

    /** Constructs a new instance of InvalidSearchFilterException
     *  with an explanation.
     */
    @stub
    def this(msg: String) = ???
}
