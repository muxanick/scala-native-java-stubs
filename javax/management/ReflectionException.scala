package javax.management

import java.lang.{Exception, Object, Throwable}

// Represents exceptions thrown in the MBean server when using the
// java.lang.reflect classes to invoke methods on MBeans. It "wraps" the
// actual java.lang.Exception thrown.
class ReflectionException extends JMException {

    @stub
    // Creates a ReflectionException that wraps the actual java.lang.Exception.
    def this(e: Exception) = ???

    @stub
    // Returns the actual Exception thrown.
    def getCause(): Throwable = ???
}