package javax.management

import java.lang.{Exception, Object, Throwable}

/** Represents "user defined" exceptions thrown by MBean methods
 *  in the agent. It "wraps" the actual "user defined" exception thrown.
 *  This exception will be built by the MBeanServer when a call to an
 *  MBean method results in an unknown exception.
 */
class MBeanException extends JMException {

    /** Creates an MBeanException that wraps the actual java.lang.Exception. */
    @stub
    def this(e: Exception) = ???

    /** Return the actual Exception thrown. */
    @stub
    def getCause(): Throwable = ???
}
