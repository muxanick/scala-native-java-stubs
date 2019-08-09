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
    /** The LineEvent.Type inner class identifies what kind of event occurred on a line. */
    @stub
    object Type extends LineEvent.Type
}
