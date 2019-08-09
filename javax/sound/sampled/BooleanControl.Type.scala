package javax.sound.sampled

import java.lang.Object

// An instance of the BooleanControl.Type class identifies one kind of
// boolean control.  Static instances are provided for the
// common types.
object BooleanControl.Type extends Control.Type {

    @stub
    // Represents a control for whether reverberation is applied
    // to a line.
    def APPLY_REVERB: BooleanControl.Type = ???
}
