package javax.swing.text

import java.lang.String
import javax.swing.{Action, KeyStroke}
import scala.scalanative.annotation.stub

/** A collection of bindings of KeyStrokes to actions.  The
 *  bindings are basically name-value pairs that potentially
 *  resolve in a hierarchy.
 */
trait Keymap {

    /** Adds a binding to the keymap. */
    @stub
    def addActionForKeyStroke(key: KeyStroke, a: Action): Unit = ???

    /** Fetches the action appropriate for the given symbolic
     *  event sequence.
     */
    @stub
    def getAction(key: KeyStroke): Action = ???

    /** Fetches all of the actions defined in this keymap. */
    @stub
    def getBoundActions(): Array[Action] = ???

    /** Fetches all of the keystrokes in this map that
     *  are bound to some action.
     */
    @stub
    def getBoundKeyStrokes(): Array[KeyStroke] = ???

    /** Fetches the default action to fire if a
     *  key is typed (i.e.
     */
    @stub
    def getDefaultAction(): Action = ???

    /** Fetches the keystrokes that will result in
     *  the given action.
     */
    @stub
    def getKeyStrokesForAction(a: Action): Array[KeyStroke] = ???

    /** Fetches the name of the set of key-bindings. */
    @stub
    def getName(): String = ???

    /** Fetches the parent keymap used to resolve key-bindings. */
    @stub
    def getResolveParent(): Keymap = ???

    /** Determines if the given key sequence is locally defined. */
    @stub
    def isLocallyDefined(key: KeyStroke): Boolean = ???

    /** Removes all bindings from the keymap. */
    @stub
    def removeBindings(): Unit = ???

    /** Removes a binding from the keymap. */
    @stub
    def removeKeyStrokeBinding(keys: KeyStroke): Unit = ???

    /** Set the default action to fire if a key is typed. */
    @stub
    def setDefaultAction(a: Action): Unit = ???

    /** Sets the parent keymap, which will be used to
     *  resolve key-bindings.
     */
    @stub
    def setResolveParent(parent: Keymap): Unit = ???
}
