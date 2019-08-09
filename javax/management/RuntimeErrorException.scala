package javax.management

import java.lang.{Error, Exception, Object, RuntimeException, String, Throwable}
import scala.scalanative.annotation.stub

/** When a java.lang.Error occurs in the agent it should be caught and
 *  re-thrown as a RuntimeErrorException.
 */
class RuntimeErrorException extends JMRuntimeException {

    /** Default constructor. */
    @stub
    def this(e: Error) = ???

    /** Constructor that allows a specific error message to be specified. */
    @stub
    def this(e: Error, message: String) = ???

    /** Returns the actual Error thrown. */
    @stub
    def getCause(): Throwable = ???

    /** Returns the actual Error thrown. */
    @stub
    def getTargetError(): Error = ???
}
