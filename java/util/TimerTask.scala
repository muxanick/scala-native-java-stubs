package java.util

import java.lang.{Object, Runnable}

// A task that can be scheduled for one-time or repeated execution by a Timer.
abstract class TimerTask extends Object with Runnable {

    // Cancels this timer task.
    def cancel(): Boolean

    // The action to be performed by this timer task.
    def run(): Unit
}
