package java.lang

// A thread group represents a set of threads. In addition, a thread
// group can also include other thread groups. The thread groups form
// a tree in which every thread group except the initial thread group
// has a parent.
// 
// A thread is allowed to access information about its own thread
// group, but not to access information about its thread group's
// parent thread group or any other thread groups.
class ThreadGroup extends Object with Thread.UncaughtExceptionHandler {

    @stub
    // Constructs a new thread group.
    def this(name: String) = ???

    @stub
    // Returns an estimate of the number of active threads in this thread
    // group and its subgroups.
    def activeCount(): Int = ???

    @stub
    // Returns an estimate of the number of active groups in this
    // thread group and its subgroups.
    def activeGroupCount(): Int = ???

    @stub
    // Deprecated. 
    //The definition of this call depends on suspend(),
    //             which is deprecated.  Further, the behavior of this call
    //             was never specified.
    //
    def allowThreadSuspension(b: Boolean): Boolean = ???

    @stub
    // Determines if the currently running thread has permission to
    // modify this thread group.
    def checkAccess(): Unit = ???

    @stub
    // Destroys this thread group and all of its subgroups.
    def destroy(): Unit = ???

    @stub
    // Copies into the specified array every active thread in this
    // thread group and its subgroups.
    def enumerate(list: Array[Thread]): Int = ???

    @stub
    // Copies into the specified array every active thread in this
    // thread group.
    def enumerate(list: Array[Thread], recurse: Boolean): Int = ???

    @stub
    // Copies into the specified array references to every active
    // subgroup in this thread group and its subgroups.
    def enumerate(list: Array[ThreadGroup]): Int = ???

    @stub
    // Copies into the specified array references to every active
    // subgroup in this thread group.
    def enumerate(list: Array[ThreadGroup], recurse: Boolean): Int = ???

    @stub
    // Returns the maximum priority of this thread group.
    def getMaxPriority(): Int = ???

    @stub
    // Returns the name of this thread group.
    def getName(): String = ???

    @stub
    // Returns the parent of this thread group.
    def getParent(): ThreadGroup = ???

    @stub
    // Interrupts all threads in this thread group.
    def interrupt(): Unit = ???

    @stub
    // Tests if this thread group is a daemon thread group.
    def isDaemon(): Boolean = ???

    @stub
    // Tests if this thread group has been destroyed.
    def isDestroyed(): Boolean = ???

    @stub
    // Prints information about this thread group to the standard
    // output.
    def list(): Unit = ???

    @stub
    // Tests if this thread group is either the thread group
    // argument or one of its ancestor thread groups.
    def parentOf(g: ThreadGroup): Boolean = ???

    @stub
    // Deprecated. 
    //This method is used solely in conjunction with
    //      Thread.suspend and ThreadGroup.suspend,
    //       both of which have been deprecated, as they are inherently
    //       deadlock-prone.  See Thread.suspend() for details.
    //
    def resume(): Unit = ???

    @stub
    // Changes the daemon status of this thread group.
    def setDaemon(daemon: Boolean): Unit = ???

    @stub
    // Sets the maximum priority of the group.
    def setMaxPriority(pri: Int): Unit = ???

    @stub
    // Deprecated. 
    //This method is inherently unsafe.  See
    //     Thread.stop() for details.
    //
    def stop(): Unit = ???

    @stub
    // Deprecated. 
    //This method is inherently deadlock-prone.  See
    //     Thread.suspend() for details.
    //
    def suspend(): Unit = ???

    @stub
    // Returns a string representation of this Thread group.
    def toString(): String = ???
}
