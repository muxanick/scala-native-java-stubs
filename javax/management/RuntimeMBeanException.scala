package javax.management

import java.lang.{Exception, Object, RuntimeException, Throwable}

/** Represents runtime exceptions thrown by MBean methods in
 *  the agent. It "wraps" the actual java.lang.RuntimeException exception thrown.
 *  This exception will be built by the MBeanServer when a call to an
 *  MBean method throws a runtime exception.
 */
class RuntimeMBeanException extends JMRuntimeException {

    /** Creates a RuntimeMBeanException that wraps the actual java.lang.RuntimeException. */
    @stub
    def this(e: RuntimeException) = ???

    /** Returns the actual RuntimeException thrown. */
    @stub
    def getCause(): Throwable = ???
}
