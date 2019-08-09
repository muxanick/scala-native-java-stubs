package javax.sound.sampled

import java.lang.{Class, Object, String}
import scala.scalanative.annotation.stub

/** The Port.Info class extends Line.Info
 *  with additional information specific to ports, including the port's name
 *  and whether it is a source or a target for its mixer.
 *  By definition, a port acts as either a source or a target to its mixer,
 *  but not both.  (Audio input ports are sources; audio output ports are targets.)
 *  
 *  To learn what ports are available, you can retrieve port info objects through the
 *  getSourceLineInfo and
 *  getTargetLineInfo
 *  methods of the Mixer interface.  Instances of the
 *  Port.Info class may also be constructed and used to obtain
 *  lines matching the parameters specified in the Port.Info object.
 */
object Port.Info extends Line.Info {

    /** Constructs a port's info object from the information given. */
    @stub
    def Info(lineClass: Class[_], name: String, isSource: Boolean) = ???

    /** A type of port that gets audio from a CD-ROM drive. */
    @stub
    val COMPACT_DISC: Port.Info = ???

    /** A type of port that sends audio to a headphone jack. */
    @stub
    val HEADPHONE: Port.Info = ???

    /** A type of port that gets audio from a line-level audio input jack. */
    @stub
    val LINE_IN: Port.Info = ???

    /** A type of port that sends audio to a line-level audio output jack. */
    @stub
    val LINE_OUT: Port.Info = ???

    /** A type of port that gets audio from a built-in microphone or a microphone jack. */
    @stub
    val MICROPHONE: Port.Info = ???

    /** A type of port that sends audio to a built-in speaker or a speaker jack. */
    @stub
    val SPEAKER: Port.Info = ???

    /** Finalizes the equals method */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Obtains the name of the port. */
    @stub
    def getName(): String = ???

    /** Finalizes the hashCode method */
    @stub
    def hashCode(): Int = ???

    /** Indicates whether the port is a source or a target for its mixer. */
    @stub
    def isSource(): Boolean = ???

    /** Indicates whether this info object specified matches this one. */
    @stub
    def matches(info: Line.Info): Boolean = ???

    /** Provides a String representation
     *  of the port.
     */
    @stub
    def toString(): String = ???
}
