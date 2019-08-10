package javax.sound.sampled

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** An instance of the FloatControl.Type inner class identifies one kind of
 *  float control.  Static instances are provided for the
 *  common types.
 */
object FloatControl_Type extends Control.Type {

    /** Constructs a new float control type. */
    @stub
    protected def Type(name: String) = ???

    /** Represents a control for the auxiliary return gain on a line. */
    @stub
    val AUX_RETURN: FloatControl.Type = ???

    /** Represents a control for the auxiliary send gain on a line. */
    @stub
    val AUX_SEND: FloatControl.Type = ???

    /** Represents a control for the relative balance of a stereo signal
     *  between two stereo speakers.
     */
    @stub
    val BALANCE: FloatControl.Type = ???

    /** Represents a control for the overall gain on a line. */
    @stub
    val MASTER_GAIN: FloatControl.Type = ???

    /** Represents a control for the relative pan (left-right positioning)
     *  of the signal.
     */
    @stub
    val PAN: FloatControl.Type = ???

    /** Represents a control for the post-reverb gain on a line. */
    @stub
    val REVERB_RETURN: FloatControl.Type = ???

    /** Represents a control for the pre-reverb gain on a line. */
    @stub
    val REVERB_SEND: FloatControl.Type = ???

    /** Represents a control that changes the sample rate of audio playback. */
    @stub
    val SAMPLE_RATE: FloatControl.Type = ???

    /** Represents a control for the volume on a line. */
    @stub
    val VOLUME: FloatControl.Type = ???
}
