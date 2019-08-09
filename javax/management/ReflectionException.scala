package javax.management

import java.lang.{Exception, Object, Throwable}

/** Represents exceptions thrown in the MBean server when using the
 *  java.lang.reflect classes to invoke methods on MBeans. It "wraps" the
 *  actual java.lang.Exception thrown.
 */
class ReflectionException extends JMException {

    /** Creates a ReflectionException that wraps the actual java.lang.Exception. */
    @stub
    def this(e: Exception) = ???

    /** Returns the actual Exception thrown. */
    @stub
    def getCause(): Throwable = ???
}
