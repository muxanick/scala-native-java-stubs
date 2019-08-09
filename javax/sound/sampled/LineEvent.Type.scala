package javax.sound.sampled

import java.lang.Object

/** The LineEvent.Type inner class identifies what kind of event occurred on a line.
 *  Static instances are provided for the common types (OPEN, CLOSE, START, and STOP).
 */
object LineEvent.Type extends Object {

    /** A type of event that is sent when a line closes, freeing the system
     *  resources it had obtained when it was opened.
     */
    @stub
    val CLOSE: LineEvent.Type = ???

    /** A type of event that is sent when a line opens, reserving system
     *  resources for itself.
     */
    @stub
    val OPEN: LineEvent.Type = ???

    /** A type of event that is sent when a line begins to engage in active
     *  input or output of audio data in response to a
     *  start request.
     */
    @stub
    val START: LineEvent.Type = ???

    /** Indicates whether the specified object is equal to this event type,
     *  returning true if the objects are identical.
     */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Finalizes the hashcode method. */
    @stub
    def hashCode(): Int = ???
}
