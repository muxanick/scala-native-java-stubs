package javax.sound.sampled

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** An instance of the EnumControl.Type inner class identifies one kind of
 *  enumerated control.  Static instances are provided for the
 *  common types.
 */
object EnumControl.Type extends Control.Type {

    /** Constructs a new enumerated control type. */
    @stub
    protected def Type(name: String) = ???

    /** Represents a control over a set of possible reverberation settings. */
    @stub
    val REVERB: EnumControl.Type = ???
}
