package java.lang

/** A thread group represents a set of threads. In addition, a thread
 *  group can also include other thread groups. The thread groups form
 *  a tree in which every thread group except the initial thread group
 *  has a parent.
 *  
 *  A thread is allowed to access information about its own thread
 *  group, but not to access information about its thread group's
 *  parent thread group or any other thread groups.
 */
class ThreadGroup extends Object with Thread.UncaughtExceptionHandler {

    /** Constructs a new thread group. */
    @stub
    def this(name: String) = ???

    /** Returns an estimate of the number of active threads in this thread
     *  group and its subgroups.
     */
    @stub
    def activeCount(): Int = ???

    /** Returns an estimate of the number of active groups in this
     *  thread group and its subgroups.
     */
    @stub
    def activeGroupCount(): Int = ???

    /** Deprecated. 
     * The definition of this call depends on suspend(),
     *              which is deprecated.  Further, the behavior of this call
     *              was never specified.
     * 
     */
    @stub
    def allowThreadSuspension(b: Boolean): Boolean = ???

    /** Determines if the currently running thread has permission to
     *  modify this thread group.
     */
    @stub
    def checkAccess(): Unit = ???

    /** Destroys this thread group and all of its subgroups. */
    @stub
    def destroy(): Unit = ???

    /** Copies into the specified array every active thread in this
     *  thread group and its subgroups.
     */
    @stub
    def enumerate(list: Array[Thread]): Int = ???

    /** Copies into the specified array every active thread in this
     *  thread group.
     */
    @stub
    def enumerate(list: Array[Thread], recurse: Boolean): Int = ???

    /** Copies into the specified array references to every active
     *  subgroup in this thread group and its subgroups.
     */
    @stub
    def enumerate(list: Array[ThreadGroup]): Int = ???

    /** Copies into the specified array references to every active
     *  subgroup in this thread group.
     */
    @stub
    def enumerate(list: Array[ThreadGroup], recurse: Boolean): Int = ???

    /** Returns the maximum priority of this thread group. */
    @stub
    def getMaxPriority(): Int = ???

    /** Returns the name of this thread group. */
    @stub
    def getName(): String = ???

    /** Returns the parent of this thread group. */
    @stub
    def getParent(): ThreadGroup = ???

    /** Interrupts all threads in this thread group. */
    @stub
    def interrupt(): Unit = ???

    /** Tests if this thread group is a daemon thread group. */
    @stub
    def isDaemon(): Boolean = ???

    /** Tests if this thread group has been destroyed. */
    @stub
    def isDestroyed(): Boolean = ???

    /** Prints information about this thread group to the standard
     *  output.
     */
    @stub
    def list(): Unit = ???

    /** Tests if this thread group is either the thread group
     *  argument or one of its ancestor thread groups.
     */
    @stub
    def parentOf(g: ThreadGroup): Boolean = ???

    /** Deprecated. 
     * This method is used solely in conjunction with
     *       Thread.suspend and ThreadGroup.suspend,
     *        both of which have been deprecated, as they are inherently
     *        deadlock-prone.  See Thread.suspend() for details.
     * 
     */
    @stub
    def resume(): Unit = ???

    /** Changes the daemon status of this thread group. */
    @stub
    def setDaemon(daemon: Boolean): Unit = ???

    /** Sets the maximum priority of the group. */
    @stub
    def setMaxPriority(pri: Int): Unit = ???

    /** Deprecated. 
     * This method is inherently unsafe.  See
     *      Thread.stop() for details.
     * 
     */
    @stub
    def stop(): Unit = ???

    /** Deprecated. 
     * This method is inherently deadlock-prone.  See
     *      Thread.suspend() for details.
     * 
     */
    @stub
    def suspend(): Unit = ???

    /** Returns a string representation of this Thread group. */
    @stub
    def toString(): String = ???
}
