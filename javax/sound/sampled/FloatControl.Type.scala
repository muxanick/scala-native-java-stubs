package javax.sound.sampled

import java.lang.Object

// An instance of the FloatControl.Type inner class identifies one kind of
// float control.  Static instances are provided for the
// common types.
object FloatControl.Type extends Control.Type {

    @stub
    // Represents a control for the auxiliary return gain on a line.
    def AUX_RETURN: FloatControl.Type = ???

    @stub
    // Represents a control for the auxiliary send gain on a line.
    def AUX_SEND: FloatControl.Type = ???

    @stub
    // Represents a control for the relative balance of a stereo signal
    // between two stereo speakers.
    def BALANCE: FloatControl.Type = ???

    @stub
    // Represents a control for the overall gain on a line.
    def MASTER_GAIN: FloatControl.Type = ???

    @stub
    // Represents a control for the relative pan (left-right positioning)
    // of the signal.
    def PAN: FloatControl.Type = ???

    @stub
    // Represents a control for the post-reverb gain on a line.
    def REVERB_RETURN: FloatControl.Type = ???

    @stub
    // Represents a control for the pre-reverb gain on a line.
    def REVERB_SEND: FloatControl.Type = ???

    @stub
    // Represents a control that changes the sample rate of audio playback.
    def SAMPLE_RATE: FloatControl.Type = ???
}
