package java.awt.event

import java.awt.{AWTEvent, ActiveEvent}
import java.lang.{Exception, Object, Runnable, String, Throwable}
import java.util.EventObject
import scala.scalanative.annotation.stub

/** An event which executes the run() method on a Runnable
 *   when dispatched by the AWT event dispatcher thread. This class can
 *  be used as a reference implementation of ActiveEvent rather
 *  than declaring a new class and defining dispatch().
 * 
 *  Instances of this class are placed on the EventQueue by calls
 *  to invokeLater and invokeAndWait. Client code
 *  can use this fact to write replacement functions for invokeLater
 *   and invokeAndWait without writing special-case code
 *  in any AWTEventListener objects.
 *  
 *  An unspecified behavior will be caused if the id parameter
 *  of any particular InvocationEvent instance is not
 *  in the range from INVOCATION_FIRST to INVOCATION_LAST.
 */
class InvocationEvent extends AWTEvent with ActiveEvent {

    /** Constructs an InvocationEvent with the specified
     *  source and ID which will execute the runnable's run
     *  method when dispatched.
     */
    @stub
    protected def this(source: Object, id: Int, runnable: Runnable, notifier: Object, catchThrowables: Boolean) = ???

    /** Constructs an InvocationEvent with the specified
     *  source which will execute the runnable's run
     *  method when dispatched.
     */
    @stub
    def this(source: Object, runnable: Runnable) = ???

    /** Constructs an InvocationEvent with the specified
     *  source which will execute the runnable's run
     *  method when dispatched.
     */
    @stub
    def this(source: Object, runnable: Runnable, notifier: Object, catchThrowables: Boolean) = ???

    /** Constructs an InvocationEvent with the specified
     *  source which will execute the runnable's run
     *  method when dispatched.
     */
    @stub
    def this(source: Object, runnable: Runnable, listener: Runnable, catchThrowables: Boolean) = ???

    /** Set to true if dispatch() catches Throwable and stores it in the
     *  exception instance variable.
     */
    @stub
    protected val catchExceptions: Boolean = ???

    /** The (potentially null) Object whose notifyAll() method will be called
     *  immediately after the Runnable.run() method has returned or thrown an exception
     *  or after the event was disposed.
     */
    @stub
    protected val notifier: Object = ???

    /** The Runnable whose run() method will be called. */
    @stub
    protected val runnable: Runnable = ???

    /** Executes the Runnable's run() method and notifies the
     *  notifier (if any) when run() has returned or thrown an exception.
     */
    @stub
    def dispatch(): Unit = ???

    /** Returns any Exception caught while executing the Runnable's run()
     *   method.
     */
    @stub
    def getException(): Exception = ???

    /** Returns any Throwable caught while executing the Runnable's run()
     *   method.
     */
    @stub
    def getThrowable(): Throwable = ???

    /** Returns the timestamp of when this event occurred. */
    @stub
    def getWhen(): Long = ???

    /** Returns true if the event is dispatched or any exception is
     *  thrown while dispatching, false otherwise.
     */
    @stub
    def isDispatched(): Boolean = ???

    /** Returns a parameter string identifying this event. */
    @stub
    def paramString(): String = ???
}

object InvocationEvent {
    /** The default id for all InvocationEvents. */
    @stub
    val INVOCATION_DEFAULT: Int = ???

    /** Marks the first integer id for the range of invocation event ids. */
    @stub
    val INVOCATION_FIRST: Int = ???

    /** Marks the last integer id for the range of invocation event ids. */
    @stub
    val INVOCATION_LAST: Int = ???
}
