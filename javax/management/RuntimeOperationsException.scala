package javax.management

import java.lang.{Exception, Object, RuntimeException, Throwable}

// Represents runtime exceptions thrown in the agent when performing operations on MBeans.
// It wraps the actual java.lang.RuntimeException thrown.
class RuntimeOperationsException extends JMRuntimeException {

    @stub
    // Creates a RuntimeOperationsException that wraps the actual java.lang.RuntimeException.
    def this(e: RuntimeException) = ???

    @stub
    // Returns the actual RuntimeException thrown.
    def getCause(): Throwable = ???
}
