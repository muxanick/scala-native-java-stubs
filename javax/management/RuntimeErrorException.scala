package javax.management

import java.lang.{Error, Exception, Object, RuntimeException, Throwable}

// When a java.lang.Error occurs in the agent it should be caught and
// re-thrown as a RuntimeErrorException.
class RuntimeErrorException extends JMRuntimeException {

    @stub
    // Default constructor.
    def this(e: Error) = ???

    @stub
    // Returns the actual Error thrown.
    def getCause(): Throwable = ???
}
