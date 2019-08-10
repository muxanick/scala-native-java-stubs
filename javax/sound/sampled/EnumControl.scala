package javax.sound.sampled

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** A EnumControl provides control over a set of
 *  discrete possible values, each represented by an object.  In a
 *  graphical user interface, such a control might be represented
 *  by a set of buttons, each of which chooses one value or setting.  For
 *  example, a reverb control might provide several preset reverberation
 *  settings, instead of providing continuously adjustable parameters
 *  of the sort that would be represented by FloatControl
 *  objects.
 *  
 *  Controls that provide a choice between only two settings can often be implemented
 *  instead as a BooleanControl, and controls that provide
 *  a set of values along some quantifiable dimension might be implemented
 *  instead as a FloatControl with a coarse resolution.
 *  However, a key feature of EnumControl is that the returned values
 *  are arbitrary objects, rather than numerical or boolean values.  This means that each
 *  returned object can provide further information.  As an example, the settings
 *  of a REVERB control are instances of
 *  ReverbType that can be queried for the parameter values
 *  used for each setting.
 */
abstract class EnumControl extends Control {

    /** Constructs a new enumerated control object with the given parameters. */
    @stub
    protected def this(type: EnumControl.Type, values: Array[Object], value: Any) = ???

    /** Obtains this control's current value. */
    def getValue(): Any

    /** Returns the set of possible values for this control. */
    def getValues(): Array[Object]

    /** Sets the current value for the control. */
    def setValue(value: Any): Unit

    /** Provides a string representation of the control. */
    def toString(): String
}

object EnumControl {
    /** An instance of the EnumControl.Type inner class identifies one kind of
     *  enumerated control.
     */
    type Type = EnumControl_Type
}
