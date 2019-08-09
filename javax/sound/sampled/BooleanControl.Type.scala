package javax.sound.sampled

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** An instance of the BooleanControl.Type class identifies one kind of
 *  boolean control.  Static instances are provided for the
 *  common types.
 */
object BooleanControl.Type extends Control.Type {

    /** Constructs a new boolean control type. */
    @stub
    protected def Type(name: String) = ???

    /** Represents a control for whether reverberation is applied
     *  to a line.
     */
    @stub
    val APPLY_REVERB: BooleanControl.Type = ???

    /** Represents a control for the mute status of a line. */
    @stub
    val MUTE: BooleanControl.Type = ???
}
