package javax.management

import java.lang.{Error, Exception, Object, RuntimeException, Throwable}

/** When a java.lang.Error occurs in the agent it should be caught and
 *  re-thrown as a RuntimeErrorException.
 */
class RuntimeErrorException extends JMRuntimeException {

    /** Default constructor. */
    @stub
    def this(e: Error) = ???

    /** Returns the actual Error thrown. */
    @stub
    def getCause(): Throwable = ???
}
