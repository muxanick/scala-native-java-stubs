package javax.management

import java.lang.{Exception, Object, Throwable}

// Represents "user defined" exceptions thrown by MBean methods
// in the agent. It "wraps" the actual "user defined" exception thrown.
// This exception will be built by the MBeanServer when a call to an
// MBean method results in an unknown exception.
class MBeanException extends JMException {

    @stub
    // Creates an MBeanException that wraps the actual java.lang.Exception.
    def this(e: Exception) = ???

    @stub
    // Return the actual Exception thrown.
    def getCause(): Throwable = ???
}
