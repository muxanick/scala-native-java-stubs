package javax.naming

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** This exception is thrown when the naming operation
 *  being invoked has been interrupted. For example, an application
 *  might interrupt a thread that is performing a search. If the
 *  search supports being interrupted, it will throw
 *  InterruptedNamingException. Whether an operation is interruptible
 *  and when depends on its implementation (as provided by the
 *  service providers). Different implementations have different ways
 *  of protecting their resources and objects from being damaged
 *  due to unexpected interrupts.
 *  
 *  Synchronization and serialization issues that apply to NamingException
 *  apply directly here.
 */
class InterruptedNamingException extends NamingException {

    /** Constructs an instance of InterruptedNamingException with
     *  all name resolution fields and explanation initialized to null.
     */
    @stub
    def this() = ???

    /** Constructs an instance of InterruptedNamingException using an
     *  explanation of the problem.
     */
    @stub
    def this(explanation: String) = ???
}
