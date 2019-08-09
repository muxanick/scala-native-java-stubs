package java.lang

import java.util.Map

// A thread is a thread of execution in a program. The Java
// Virtual Machine allows an application to have multiple threads of
// execution running concurrently.
// 
// Every thread has a priority. Threads with higher priority are
// executed in preference to threads with lower priority. Each thread
// may or may not also be marked as a daemon. When code running in
// some thread creates a new Thread object, the new
// thread has its priority initially set equal to the priority of the
// creating thread, and is a daemon thread if and only if the
// creating thread is a daemon.
// 
// When a Java Virtual Machine starts up, there is usually a single
// non-daemon thread (which typically calls the method named
// main of some designated class). The Java Virtual
// Machine continues to execute threads until either of the following
// occurs:
// 
// The exit method of class Runtime has been
//     called and the security manager has permitted the exit operation
//     to take place.
// All threads that are not daemon threads have died, either by
//     returning from the call to the run method or by
//     throwing an exception that propagates beyond the run
//     method.
// 
// 
// There are two ways to create a new thread of execution. One is to
// declare a class to be a subclass of Thread. This
// subclass should override the run method of class
// Thread. An instance of the subclass can then be
// allocated and started. For example, a thread that computes primes
// larger than a stated value could be written as follows:
// 
//     class PrimeThread extends Thread {
//         long minPrime;
//         PrimeThread(long minPrime) {
//             this.minPrime = minPrime;
//         }
//
//         public void run() {
//             // compute primes larger than minPrime
//              . . .
//         }
//     }
// 
// 
// The following code would then create a thread and start it running:
// 
//     PrimeThread p = new PrimeThread(143);
//     p.start();
// 
// 
// The other way to create a thread is to declare a class that
// implements the Runnable interface. That class then
// implements the run method. An instance of the class can
// then be allocated, passed as an argument when creating
// Thread, and started. The same example in this other
// style looks like the following:
// 
//     class PrimeRun implements Runnable {
//         long minPrime;
//         PrimeRun(long minPrime) {
//             this.minPrime = minPrime;
//         }
//
//         public void run() {
//             // compute primes larger than minPrime
//              . . .
//         }
//     }
// 
// 
// The following code would then create a thread and start it running:
// 
//     PrimeRun p = new PrimeRun(143);
//     new Thread(p).start();
// 
// 
// Every thread has a name for identification purposes. More than
// one thread may have the same name. If a name is not specified when
// a thread is created, a new name is generated for it.
// 
// Unless otherwise noted, passing a null argument to a constructor
// or method in this class will cause a NullPointerException to be
// thrown.
class Thread extends Object with Runnable {

    @stub
    // Allocates a new Thread object.
    def this() = ???

    @stub
    // Allocates a new Thread object.
    def this(target: Runnable) = ???

    @stub
    // Allocates a new Thread object.
    def this(target: Runnable, name: String) = ???

    @stub
    // Allocates a new Thread object.
    def this(name: String) = ???

    @stub
    // Allocates a new Thread object.
    def this(group: ThreadGroup, target: Runnable) = ???

    @stub
    // Allocates a new Thread object so that it has target
    // as its run object, has the specified name as its name,
    // and belongs to the thread group referred to by group.
    def this(group: ThreadGroup, target: Runnable, name: String) = ???

    @stub
    // Allocates a new Thread object so that it has target
    // as its run object, has the specified name as its name,
    // and belongs to the thread group referred to by group, and has
    // the specified stack size.
    def this(group: ThreadGroup, target: Runnable, name: String, stackSize: Long) = ???

    @stub
    // Determines if the currently running thread has permission to
    // modify this thread.
    def checkAccess(): Unit = ???

    @stub
    // Throws CloneNotSupportedException as a Thread can not be meaningfully
    // cloned.
    protected def clone(): Object = ???

    @stub
    // Deprecated. 
    //The definition of this call depends on suspend(),
    //             which is deprecated.  Further, the results of this call
    //             were never well-defined.
    //
    def countStackFrames(): Int = ???

    @stub
    // Deprecated. 
    //This method was originally designed to destroy this
    //     thread without any cleanup. Any monitors it held would have
    //     remained locked. However, the method was never implemented.
    //     If if were to be implemented, it would be deadlock-prone in
    //     much the manner of suspend(). If the target thread held
    //     a lock protecting a critical system resource when it was
    //     destroyed, no thread could ever access this resource again.
    //     If another thread ever attempted to lock this resource, deadlock
    //     would result. Such deadlocks typically manifest themselves as
    //     "frozen" processes. For more information, see
    //     
    //     Why are Thread.stop, Thread.suspend and Thread.resume Deprecated?.
    //
    def destroy(): Unit = ???

    @stub
    // Returns the context ClassLoader for this Thread.
    def getContextClassLoader(): ClassLoader = ???

    @stub
    // Returns the identifier of this Thread.
    def getId(): Long = ???

    @stub
    // Returns this thread's name.
    def getName(): String = ???

    @stub
    // Returns this thread's priority.
    def getPriority(): Int = ???

    @stub
    // Returns an array of stack trace elements representing the stack dump
    // of this thread.
    def getStackTrace(): Array[StackTraceElement] = ???

    @stub
    // Returns the state of this thread.
    def getState(): Thread.State = ???

    @stub
    // Returns the thread group to which this thread belongs.
    def getThreadGroup(): ThreadGroup = ???

    @stub
    // Returns the handler invoked when this thread abruptly terminates
    // due to an uncaught exception.
    def getUncaughtExceptionHandler(): Thread.UncaughtExceptionHandler = ???

    @stub
    // Interrupts this thread.
    def interrupt(): Unit = ???

    @stub
    // Tests if this thread is alive.
    def isAlive(): Boolean = ???

    @stub
    // Tests if this thread is a daemon thread.
    def isDaemon(): Boolean = ???

    @stub
    // Tests whether this thread has been interrupted.
    def isInterrupted(): Boolean = ???

    @stub
    // Waits for this thread to die.
    def join(): Unit = ???

    @stub
    // Waits at most millis milliseconds for this thread to
    // die.
    def join(millis: Long): Unit = ???

    @stub
    // Waits at most millis milliseconds plus
    // nanos nanoseconds for this thread to die.
    def join(millis: Long, nanos: Int): Unit = ???

    @stub
    // Deprecated. 
    //This method exists solely for use with suspend(),
    //     which has been deprecated because it is deadlock-prone.
    //     For more information, see
    //     Why
    //     are Thread.stop, Thread.suspend and Thread.resume Deprecated?.
    //
    def resume(): Unit = ???

    @stub
    // If this thread was constructed using a separate
    // Runnable run object, then that
    // Runnable object's run method is called;
    // otherwise, this method does nothing and returns.
    def run(): Unit = ???

    @stub
    // Sets the context ClassLoader for this Thread.
    def setContextClassLoader(cl: ClassLoader): Unit = ???

    @stub
    // Marks this thread as either a daemon thread
    // or a user thread.
    def setDaemon(on: Boolean): Unit = ???

    @stub
    // Changes the name of this thread to be equal to the argument
    // name.
    def setName(name: String): Unit = ???

    @stub
    // Changes the priority of this thread.
    def setPriority(newPriority: Int): Unit = ???

    @stub
    // Set the handler invoked when this thread abruptly terminates
    // due to an uncaught exception.
    def setUncaughtExceptionHandler(eh: Thread.UncaughtExceptionHandler): Unit = ???

    @stub
    // Causes this thread to begin execution; the Java Virtual Machine
    // calls the run method of this thread.
    def start(): Unit = ???

    @stub
    // Deprecated. 
    //This method is inherently unsafe.  Stopping a thread with
    //       Thread.stop causes it to unlock all of the monitors that it
    //       has locked (as a natural consequence of the unchecked
    //       ThreadDeath exception propagating up the stack).  If
    //       any of the objects previously protected by these monitors were in
    //       an inconsistent state, the damaged objects become visible to
    //       other threads, potentially resulting in arbitrary behavior.  Many
    //       uses of stop should be replaced by code that simply
    //       modifies some variable to indicate that the target thread should
    //       stop running.  The target thread should check this variable
    //       regularly, and return from its run method in an orderly fashion
    //       if the variable indicates that it is to stop running.  If the
    //       target thread waits for long periods (on a condition variable,
    //       for example), the interrupt method should be used to
    //       interrupt the wait.
    //       For more information, see
    //       Why
    //       are Thread.stop, Thread.suspend and Thread.resume Deprecated?.
    //
    def stop(): Unit = ???

    @stub
    // Deprecated. 
    //This method was originally designed to force a thread to stop
    //        and throw a given Throwable as an exception. It was
    //        inherently unsafe (see stop() for details), and furthermore
    //        could be used to generate exceptions that the target thread was
    //        not prepared to handle.
    //        For more information, see
    //        Why
    //        are Thread.stop, Thread.suspend and Thread.resume Deprecated?.
    //
    def stop(obj: Throwable): Unit = ???

    @stub
    // Deprecated. 
    //This method has been deprecated, as it is
    //   inherently deadlock-prone.  If the target thread holds a lock on the
    //   monitor protecting a critical system resource when it is suspended, no
    //   thread can access this resource until the target thread is resumed. If
    //   the thread that would resume the target thread attempts to lock this
    //   monitor prior to calling resume, deadlock results.  Such
    //   deadlocks typically manifest themselves as "frozen" processes.
    //   For more information, see
    //   Why
    //   are Thread.stop, Thread.suspend and Thread.resume Deprecated?.
    //
    def suspend(): Unit = ???

    @stub
    // Returns a string representation of this thread, including the
    // thread's name, priority, and thread group.
    def toString(): String = ???
}

object Thread {
    @stub
    // A thread state.
    def Thread.State: class = ???

    @stub
    // The maximum priority that a thread can have.
    def MAX_PRIORITY: Int = ???

    @stub
    // The minimum priority that a thread can have.
    def MIN_PRIORITY: Int = ???

    @stub
    // Returns an estimate of the number of active threads in the current
    // thread's thread group and its
    // subgroups.
    def activeCount(): Int = ???

    @stub
    // Returns a reference to the currently executing thread object.
    def currentThread(): Thread = ???

    @stub
    // Prints a stack trace of the current thread to the standard error stream.
    def dumpStack(): Unit = ???

    @stub
    // Copies into the specified array every active thread in the current
    // thread's thread group and its subgroups.
    def enumerate(tarray: Array[Thread]): Int = ???

    @stub
    // Returns a map of stack traces for all live threads.
    def getAllStackTraces(): Map[Thread, Array[StackTraceElement]] = ???

    @stub
    // Returns the default handler invoked when a thread abruptly terminates
    // due to an uncaught exception.
    def getDefaultUncaughtExceptionHandler(): Thread.UncaughtExceptionHandler = ???

    @stub
    // Returns true if and only if the current thread holds the
    // monitor lock on the specified object.
    def holdsLock(obj: Object): Boolean = ???

    @stub
    // Tests whether the current thread has been interrupted.
    def interrupted(): Boolean = ???

    @stub
    // Set the default handler invoked when a thread abruptly terminates
    // due to an uncaught exception, and no other handler has been defined
    // for that thread.
    def setDefaultUncaughtExceptionHandler(eh: Thread.UncaughtExceptionHandler): Unit = ???

    @stub
    // Causes the currently executing thread to sleep (temporarily cease
    // execution) for the specified number of milliseconds, subject to
    // the precision and accuracy of system timers and schedulers.
    def sleep(millis: Long): Unit = ???

    @stub
    // Causes the currently executing thread to sleep (temporarily cease
    // execution) for the specified number of milliseconds plus the specified
    // number of nanoseconds, subject to the precision and accuracy of system
    // timers and schedulers.
    def sleep(millis: Long, nanos: Int): Unit = ???
}