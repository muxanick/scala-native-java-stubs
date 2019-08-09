package javax.sound.sampled

import java.lang.Object

// A CompoundControl, such as a graphic equalizer, provides control
// over two or more related properties, each of which is itself represented as
// a Control.
abstract class CompoundControl extends Control {

    // Returns the set of member controls that comprise the compound control.
    def getMemberControls(): Array[Control]
}
