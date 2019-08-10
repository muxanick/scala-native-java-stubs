package javax.sound.sampled

import java.lang.{Object, String}
import java.util.EventObject
import scala.scalanative.annotation.stub

/** The LineEvent class encapsulates information that a line
 *  sends its listeners whenever the line opens, closes, starts, or stops.
 *  Each of these four state changes is represented by a corresponding
 *  type of event.  A listener receives the event as a parameter to its
 *  update method.  By querying the event,
 *  the listener can learn the type of event, the line responsible for
 *  the event, and how much data the line had processed when the event occurred.
 * 
 *  Although this class implements Serializable, attempts to
 *  serialize a LineEvent object will fail.
 */
class LineEvent extends EventObject {

    /** Constructs a new event of the specified type, originating from the specified line. */
    @stub
    def this(line: Line, type: LineEvent.Type, position: Long) = ???

    /** Obtains the position in the line's audio data when the event occurred, expressed in sample frames. */
    @stub
    def getFramePosition(): Long = ???

    /** Obtains the audio line that is the source of this event. */
    @stub
    def getLine(): Line = ???

    /** Obtains the event's type. */
    @stub
    def getType(): LineEvent.Type = ???

    /** Obtains a string representation of the event. */
    @stub
    def toString(): String = ???
}

object LineEvent {
    /** The LineEvent.Type inner class identifies what kind of event occurred on a line.
     *  Static instances are provided for the common types (OPEN, CLOSE, START, and STOP).
     */
    object Type extends Object {

        /** Constructs a new event type. */
        @stub
        protected def apply(name: String) = ???

        /** A type of event that is sent when a line closes, freeing the system
         *  resources it had obtained when it was opened.
         */
        @stub
        val CLOSE: Type = ???

        /** A type of event that is sent when a line opens, reserving system
         *  resources for itself.
         */
        @stub
        val OPEN: Type = ???

        /** A type of event that is sent when a line begins to engage in active
         *  input or output of audio data in response to a
         *  start request.
         */
        @stub
        val START: Type = ???

        /** A type of event that is sent when a line ceases active input or output
         *  of audio data in response to a stop request,
         *  or because the end of media has been reached.
         */
        @stub
        val STOP: Type = ???

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

}
