package javax.sound.sampled

import java.lang.{Exception, Object, Throwable}

// A LineUnavailableException is an exception indicating that a
// line cannot be opened because it is unavailable.  This situation
// arises most commonly when a requested line is already in use
// by another application.
class LineUnavailableException extends Exception {

    @stub
    // Constructs a LineUnavailableException that has
    // null as its error detail message.
    def this() = ???
}
