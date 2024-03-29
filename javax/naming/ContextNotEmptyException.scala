package javax.naming

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** This exception is thrown when attempting to destroy a context that
 *  is not empty.
 * 
 *  If the program wants to handle this exception in particular, it
 *  should catch ContextNotEmptyException explicitly before attempting to
 *  catch NamingException. For example, after catching ContextNotEmptyException,
 *  the program might try to remove the contents of the context before
 *  reattempting the destroy.
 *  
 *  Synchronization and serialization issues that apply to NamingException
 *  apply directly here.
 */
class ContextNotEmptyException extends NamingException {

    /** Constructs a new instance of ContextNotEmptyException with
     *  all name resolution fields and explanation initialized to null.
     */
    @stub
    def this() = ???

    /** Constructs a new instance of ContextNotEmptyException using an
     *  explanation.
     */
    @stub
    def this(explanation: String) = ???
}
