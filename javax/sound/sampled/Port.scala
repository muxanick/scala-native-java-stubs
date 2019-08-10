package javax.sound.sampled

import java.lang.{Class, Object, String}
import scala.scalanative.annotation.stub

/** Ports are simple lines for input or output of audio to or from audio devices.
 *  Common examples of ports that act as source lines (mixer inputs) include the microphone,
 *  line input, and CD-ROM drive.  Ports that act as target lines (mixer outputs) include the
 *  speaker, headphone, and line output.  You can access port using a Port.Info
 *  object.
 */
trait Port extends Line {
}

object Port {
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
    object Info extends Line.Info {

        /** Constructs a port's info object from the information given. */
        @stub
        def apply(lineClass: Class[_], name: String, isSource: Boolean) = ???

        /** A type of port that gets audio from a CD-ROM drive. */
        @stub
        val COMPACT_DISC: Info = ???

        /** A type of port that sends audio to a headphone jack. */
        @stub
        val HEADPHONE: Info = ???

        /** A type of port that gets audio from a line-level audio input jack. */
        @stub
        val LINE_IN: Info = ???

        /** A type of port that sends audio to a line-level audio output jack. */
        @stub
        val LINE_OUT: Info = ???

        /** A type of port that gets audio from a built-in microphone or a microphone jack. */
        @stub
        val MICROPHONE: Info = ???

        /** A type of port that sends audio to a built-in speaker or a speaker jack. */
        @stub
        val SPEAKER: Info = ???

        /** Finalizes the equals method */
        @stub
        def equals(obj: Any): Boolean = ???

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

}
