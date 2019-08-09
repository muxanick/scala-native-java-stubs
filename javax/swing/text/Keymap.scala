package javax.swing.text

import java.lang.String
import javax.swing.{Action, KeyStroke}

// A collection of bindings of KeyStrokes to actions.  The
// bindings are basically name-value pairs that potentially
// resolve in a hierarchy.
trait Keymap {

    @stub
    // Adds a binding to the keymap.
    def addActionForKeyStroke(key: KeyStroke, a: Action): Unit = ???

    @stub
    // Fetches the action appropriate for the given symbolic
    // event sequence.
    def getAction(key: KeyStroke): Action = ???

    @stub
    // Fetches all of the actions defined in this keymap.
    def getBoundActions(): Array[Action] = ???

    @stub
    // Fetches all of the keystrokes in this map that
    // are bound to some action.
    def getBoundKeyStrokes(): Array[KeyStroke] = ???

    @stub
    // Fetches the default action to fire if a
    // key is typed (i.e.
    def getDefaultAction(): Action = ???

    @stub
    // Fetches the keystrokes that will result in
    // the given action.
    def getKeyStrokesForAction(a: Action): Array[KeyStroke] = ???

    @stub
    // Fetches the name of the set of key-bindings.
    def getName(): String = ???

    @stub
    // Fetches the parent keymap used to resolve key-bindings.
    def getResolveParent(): Keymap = ???

    @stub
    // Determines if the given key sequence is locally defined.
    def isLocallyDefined(key: KeyStroke): Boolean = ???

    @stub
    // Removes all bindings from the keymap.
    def removeBindings(): Unit = ???

    @stub
    // Removes a binding from the keymap.
    def removeKeyStrokeBinding(keys: KeyStroke): Unit = ???

    @stub
    // Set the default action to fire if a key is typed.
    def setDefaultAction(a: Action): Unit = ???
}
