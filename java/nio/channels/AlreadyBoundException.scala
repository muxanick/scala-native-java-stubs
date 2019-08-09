package java.nio.channels

import java.lang.{Exception, IllegalStateException, Object, RuntimeException, Throwable}

// Unchecked exception thrown when an attempt is made to bind the socket a
// network oriented channel that is already bound.
class AlreadyBoundException extends IllegalStateException {
}
