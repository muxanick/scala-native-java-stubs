package java.awt.event

import java.awt.{AWTEvent, ActiveEvent}
import java.lang.{Exception, Object, Runnable, Throwable}
import java.util.EventObject

// An event which executes the run() method on a Runnable
//  when dispatched by the AWT event dispatcher thread. This class can
// be used as a reference implementation of ActiveEvent rather
// than declaring a new class and defining dispatch().
//
// Instances of this class are placed on the EventQueue by calls
// to invokeLater and invokeAndWait. Client code
// can use this fact to write replacement functions for invokeLater
//  and invokeAndWait without writing special-case code
// in any AWTEventListener objects.
// 
// An unspecified behavior will be caused if the id parameter
// of any particular InvocationEvent instance is not
// in the range from INVOCATION_FIRST to INVOCATION_LAST.
class InvocationEvent extends AWTEvent with ActiveEvent {

    @stub
    // Constructs an InvocationEvent with the specified
    // source and ID which will execute the runnable's run
    // method when dispatched.
    protected def this(source: Object, id: Int, runnable: Runnable, notifier: Object, catchThrowables: Boolean) = ???

    @stub
    // Constructs an InvocationEvent with the specified
    // source which will execute the runnable's run
    // method when dispatched.
    def this(source: Object, runnable: Runnable) = ???

    @stub
    // Constructs an InvocationEvent with the specified
    // source which will execute the runnable's run
    // method when dispatched.
    def this(source: Object, runnable: Runnable, notifier: Object, catchThrowables: Boolean) = ???

    @stub
    // Set to true if dispatch() catches Throwable and stores it in the
    // exception instance variable.
    protected def catchExceptions: Boolean = ???

    @stub
    // The (potentially null) Object whose notifyAll() method will be called
    // immediately after the Runnable.run() method has returned or thrown an exception
    // or after the event was disposed.
    protected def notifier: Object = ???

    @stub
    // Executes the Runnable's run() method and notifies the
    // notifier (if any) when run() has returned or thrown an exception.
    def dispatch(): Unit = ???

    @stub
    // Returns any Exception caught while executing the Runnable's run()
    //  method.
    def getException(): Exception = ???

    @stub
    // Returns any Throwable caught while executing the Runnable's run()
    //  method.
    def getThrowable(): Throwable = ???

    @stub
    // Returns the timestamp of when this event occurred.
    def getWhen(): Long = ???

    @stub
    // Returns true if the event is dispatched or any exception is
    // thrown while dispatching, false otherwise.
    def isDispatched(): Boolean = ???
}

object InvocationEvent {
    @stub
    // The default id for all InvocationEvents.
    def INVOCATION_DEFAULT: Int = ???

    @stub
    // Marks the first integer id for the range of invocation event ids.
    def INVOCATION_FIRST: Int = ???

    @stub
    // Marks the last integer id for the range of invocation event ids.
    def INVOCATION_LAST: Int = ???
}
