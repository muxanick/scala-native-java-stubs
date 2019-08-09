package java.nio.channels

import java.io.IOException
import java.lang.{Exception, Object, Throwable}

// Checked exception received by a thread when another thread interrupts it
// while it is waiting to acquire a file lock.  Before this exception is thrown
// the interrupt status of the previously-blocked thread will have been set.
class FileLockInterruptionException extends IOException {
}
