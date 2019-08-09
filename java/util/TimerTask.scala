package java.util

import java.lang.{Object, Runnable}
import scala.scalanative.annotation.stub

/** A task that can be scheduled for one-time or repeated execution by a Timer. */
abstract class TimerTask extends Object with Runnable {

    /** Creates a new timer task. */
    @stub
    protected def this() = ???

    /** Cancels this timer task. */
    def cancel(): Boolean

    /** The action to be performed by this timer task. */
    def run(): Unit

    /** Returns the scheduled execution time of the most recent
     *  actual execution of this task.
     */
    def scheduledExecutionTime(): Long
}
