package javax.sound.sampled

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** A BooleanControl provides the ability to switch between
 *  two possible settings that affect a line's audio.  The settings are boolean
 *  values (true and false).  A graphical user interface
 *  might represent the control by a two-state button, an on/off switch, two
 *  mutually exclusive buttons, or a checkbox (among other possibilities).
 *  For example, depressing a button might activate a
 *  MUTE control to silence
 *  the line's audio.
 *  
 *  As with other Control subclasses, a method is
 *  provided that returns string labels for the values, suitable for
 *  display in the user interface.
 */
abstract class BooleanControl extends Control {

    /** Constructs a new boolean control object with the given parameters. */
    @stub
    protected def this(type: BooleanControl.Type, initialValue: Boolean) = ???

    /** Constructs a new boolean control object with the given parameters. */
    @stub
    protected def this(type: BooleanControl.Type, initialValue: Boolean, trueStateLabel: String, falseStateLabel: String) = ???

    /** Obtains the label for the specified state. */
    def getStateLabel(state: Boolean): String

    /** Obtains this control's current value. */
    def getValue(): Boolean

    /** Sets the current value for the control. */
    def setValue(value: Boolean): Unit

    /** Provides a string representation of the control */
    def toString(): String
}

object BooleanControl {
    /** An instance of the BooleanControl.Type class identifies one kind of
     *  boolean control.  Static instances are provided for the
     *  common types.
     */
    object Type extends Control.Type {

        /** Constructs a new boolean control type. */
        @stub
        protected def apply(name: String) = ???

        /** Represents a control for whether reverberation is applied
         *  to a line.
         */
        @stub
        val APPLY_REVERB: Type = ???

        /** Represents a control for the mute status of a line. */
        @stub
        val MUTE: Type = ???
    }

}
