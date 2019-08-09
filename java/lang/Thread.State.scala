package java.lang

/** A thread state.  A thread can be in one of the following states:
 *  
 *  NEW
 *      A thread that has not yet started is in this state.
 *      
 *  RUNNABLE
 *      A thread executing in the Java virtual machine is in this state.
 *      
 *  BLOCKED
 *      A thread that is blocked waiting for a monitor lock
 *      is in this state.
 *      
 *  WAITING
 *      A thread that is waiting indefinitely for another thread to
 *      perform a particular action is in this state.
 *      
 *  TIMED_WAITING
 *      A thread that is waiting for another thread to perform an action
 *      for up to a specified waiting time is in this state.
 *      
 *  TERMINATED
 *      A thread that has exited is in this state.
 *      
 *  
 * 
 *  
 *  A thread can be in only one state at a given point in time.
 *  These states are virtual machine states which do not reflect
 *  any operating system thread states.
 */
class Thread.State private (name: String, ordinal: Int) extends Enum[Thread.State](name, ordinal) {
}

object Thread.State {
    /** Thread state for a thread blocked waiting for a monitor lock. */
    final val BLOCKED = new Thread.State(BLOCKED, 0)

    /** Thread state for a thread which has not yet started. */
    final val NEW = new Thread.State(NEW, 1)

    /** Thread state for a runnable thread. */
    final val RUNNABLE = new Thread.State(RUNNABLE, 2)

    /** Thread state for a terminated thread. */
    final val TERMINATED = new Thread.State(TERMINATED, 3)

    /** Thread state for a waiting thread with a specified waiting time. */
    final val TIMED_WAITING = new Thread.State(TIMED_WAITING, 4)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): Thread.State = ???
}
