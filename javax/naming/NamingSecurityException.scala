package javax.naming

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** This is the superclass of security-related exceptions
 *  thrown by operations in the Context and DirContext interfaces.
 *  The nature of the failure is described by the name of the subclass.
 * 
 *  If the program wants to handle this exception in particular, it
 *  should catch NamingSecurityException explicitly before attempting to
 *  catch NamingException. A program might want to do this, for example,
 *  if it wants to treat security-related exceptions specially from
 *  other sorts of naming exception.
 *  
 *  Synchronization and serialization issues that apply to NamingException
 *  apply directly here.
 */
abstract class NamingSecurityException extends NamingException {

    /** Constructs a new instance of NamingSecurityException. */
    @stub
    def this() = ???

    /** Constructs a new instance of NamingSecurityException using the
     *  explanation supplied.
     */
    @stub
    def this(explanation: String) = ???
}
