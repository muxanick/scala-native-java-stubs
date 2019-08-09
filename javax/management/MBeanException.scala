package javax.management

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Represents "user defined" exceptions thrown by MBean methods
 *  in the agent. It "wraps" the actual "user defined" exception thrown.
 *  This exception will be built by the MBeanServer when a call to an
 *  MBean method results in an unknown exception.
 */
class MBeanException extends JMException {

    /** Creates an MBeanException that wraps the actual java.lang.Exception. */
    @stub
    def this(e: Exception) = ???

    /** Creates an MBeanException that wraps the actual java.lang.Exception with
     *  a detail message.
     */
    @stub
    def this(e: Exception, message: String) = ???

    /** Return the actual Exception thrown. */
    @stub
    def getCause(): Throwable = ???

    /** Return the actual Exception thrown. */
    @stub
    def getTargetException(): Exception = ???
}
