package javax.sound.sampled

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** The LineEvent.Type inner class identifies what kind of event occurred on a line.
 *  Static instances are provided for the common types (OPEN, CLOSE, START, and STOP).
 */
object LineEvent_Type extends Object {

    /** Constructs a new event type. */
    @stub
    protected def Type(name: String) = ???

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

    /** A type of event that is sent when a line ceases active input or output
     *  of audio data in response to a stop request,
     *  or because the end of media has been reached.
     */
    @stub
    val STOP: LineEvent.Type = ???

    /** Indicates whether the specified object is equal to this event type,
     *  returning true if the objects are identical.
     */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Finalizes the hashcode method. */
    @stub
    def hashCode(): Int = ???

    /** Returns the type name as the string representation. */
    @stub
    def toString(): String = ???
}
