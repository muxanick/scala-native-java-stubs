package javax.management

import java.lang.{Exception, Object, RuntimeException, String, Throwable}
import scala.scalanative.annotation.stub

/** Represents runtime exceptions thrown in the agent when performing operations on MBeans.
 *  It wraps the actual java.lang.RuntimeException thrown.
 */
class RuntimeOperationsException extends JMRuntimeException {

    /** Creates a RuntimeOperationsException that wraps the actual java.lang.RuntimeException. */
    @stub
    def this(e: RuntimeException) = ???

    /** Creates a RuntimeOperationsException that wraps the actual java.lang.RuntimeException
     *  with a detailed message.
     */
    @stub
    def this(e: RuntimeException, message: String) = ???

    /** Returns the actual RuntimeException thrown. */
    @stub
    def getCause(): Throwable = ???

    /** Returns the actual RuntimeException thrown. */
    @stub
    def getTargetException(): RuntimeException = ???
}
