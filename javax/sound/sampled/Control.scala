package javax.sound.sampled

import java.lang.Object

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

    /** Obtains the control's type. */
    def getType(): Control.Type
}
