package javax.sound.sampled

import java.lang.Object

// The LineEvent.Type inner class identifies what kind of event occurred on a line.
// Static instances are provided for the common types (OPEN, CLOSE, START, and STOP).
object LineEvent.Type extends Object {

    @stub
    // A type of event that is sent when a line closes, freeing the system
    // resources it had obtained when it was opened.
    def CLOSE: LineEvent.Type = ???

    @stub
    // A type of event that is sent when a line opens, reserving system
    // resources for itself.
    def OPEN: LineEvent.Type = ???

    @stub
    // A type of event that is sent when a line begins to engage in active
    // input or output of audio data in response to a
    // start request.
    def START: LineEvent.Type = ???

    @stub
    // Indicates whether the specified object is equal to this event type,
    // returning true if the objects are identical.
    def equals(obj: Object): Boolean = ???

    @stub
    // Finalizes the hashcode method.
    def hashCode(): Int = ???
}
