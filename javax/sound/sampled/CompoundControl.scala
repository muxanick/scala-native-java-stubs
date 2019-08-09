package javax.sound.sampled

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** A CompoundControl, such as a graphic equalizer, provides control
 *  over two or more related properties, each of which is itself represented as
 *  a Control.
 */
abstract class CompoundControl extends Control {

    /** Constructs a new compound control object with the given parameters. */
    @stub
    protected def this(type: CompoundControl.Type, memberControls: Array[Control]) = ???

    /** Returns the set of member controls that comprise the compound control. */
    def getMemberControls(): Array[Control]

    /** Provides a string representation of the control */
    def toString(): String
}

object CompoundControl {
    /** An instance of the CompoundControl.Type inner class identifies one kind of
     *  compound control.
     */
    @stub
    object Type extends CompoundControl.Type
}
