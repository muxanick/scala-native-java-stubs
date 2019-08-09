package java.util.concurrent

import java.lang.{Exception, Object, Throwable}

// Exception thrown when a thread tries to wait upon a barrier that is
// in a broken state, or which enters the broken state while the thread
// is waiting.
class BrokenBarrierException extends Exception {

    @stub
    // Constructs a BrokenBarrierException with no specified detail
    // message.
    def this() = ???
}
