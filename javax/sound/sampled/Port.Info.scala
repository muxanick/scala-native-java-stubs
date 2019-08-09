package javax.sound.sampled

import java.lang.{Object, String}

// The Port.Info class extends Line.Info
// with additional information specific to ports, including the port's name
// and whether it is a source or a target for its mixer.
// By definition, a port acts as either a source or a target to its mixer,
// but not both.  (Audio input ports are sources; audio output ports are targets.)
// 
// To learn what ports are available, you can retrieve port info objects through the
// getSourceLineInfo and
// getTargetLineInfo
// methods of the Mixer interface.  Instances of the
// Port.Info class may also be constructed and used to obtain
// lines matching the parameters specified in the Port.Info object.
object Port.Info extends Line.Info {

    @stub
    // A type of port that gets audio from a CD-ROM drive.
    def COMPACT_DISC: Port.Info = ???

    @stub
    // A type of port that sends audio to a headphone jack.
    def HEADPHONE: Port.Info = ???

    @stub
    // A type of port that gets audio from a line-level audio input jack.
    def LINE_IN: Port.Info = ???

    @stub
    // A type of port that sends audio to a line-level audio output jack.
    def LINE_OUT: Port.Info = ???

    @stub
    // A type of port that gets audio from a built-in microphone or a microphone jack.
    def MICROPHONE: Port.Info = ???

    @stub
    // Finalizes the equals method
    def equals(obj: Object): Boolean = ???

    @stub
    // Obtains the name of the port.
    def getName(): String = ???

    @stub
    // Finalizes the hashCode method
    def hashCode(): Int = ???

    @stub
    // Indicates whether the port is a source or a target for its mixer.
    def isSource(): Boolean = ???

    @stub
    // Indicates whether this info object specified matches this one.
    def matches(info: Line.Info): Boolean = ???
}
