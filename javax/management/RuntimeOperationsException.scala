package javax.management

import java.lang.{Exception, Object, RuntimeException, Throwable}

/** Represents runtime exceptions thrown in the agent when performing operations on MBeans.
 *  It wraps the actual java.lang.RuntimeException thrown.
 */
class RuntimeOperationsException extends JMRuntimeException {

    /** Creates a RuntimeOperationsException that wraps the actual java.lang.RuntimeException. */
    @stub
    def this(e: RuntimeException) = ???

    /** Returns the actual RuntimeException thrown. */
    @stub
    def getCause(): Throwable = ???
}
