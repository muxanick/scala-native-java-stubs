package java.nio.channels

import java.io.IOException
import java.lang.{Exception, Object, Throwable}

// Checked exception received by a thread when a timeout elapses before an
// asynchronous operation completes.
class InterruptedByTimeoutException extends IOException {
}
