package javax.sound.sampled

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Lines often have a set of controls, such as gain and pan, that affect
 *  the audio signal passing through the line.  Java Sound's Line objects
 *  let you obtain a particular control object by passing its class as the
 *  argument to a getControl method.
 *  
 *  Because the various types of controls have different purposes and features,
 *  all of their functionality is accessed from the subclasses that define
 *  each kind of control.
 */
abstract class Control extends Object {

    /** Constructs a Control with the specified type. */
    @stub
    protected def this(type: Control.Type) = ???

    /** Obtains the control's type. */
    def getType(): Control.Type

    /** Obtains a String describing the control type and its current state. */
    def toString(): String
}

object Control {
    /** An instance of the Type class represents the type of
     *  the control.  Static instances are provided for the
     *  common types.
     */
    object Type extends Object {

        /** Constructs a new control type with the name specified. */
        @stub
        protected def apply(name: String) = ???

        /** Finalizes the equals method */
        @stub
        def equals(obj: Any): Boolean = ???

        /** Finalizes the hashCode method */
        @stub
        def hashCode(): Int = ???

        /** Provides the String representation of the control type. */
        @stub
        def toString(): String = ???
    }

}
