package javax.swing

import java.io.Serializable
import java.lang.Object

// InputMap provides a binding between an input event
// (currently only KeyStrokes are used)
// and an Object. InputMaps
// are usually used with an ActionMap,
// to determine an Action to perform
// when a key is pressed.
// An InputMap can have a parent
// that is searched for bindings not defined in the InputMap.
// As with ActionMap if you create a cycle, eg:
// 
//   InputMap am = new InputMap();
//   InputMap bm = new InputMap():
//   am.setParent(bm);
//   bm.setParent(am);
// 
// some of the methods will cause a StackOverflowError to be thrown.
class InputMap extends Object with Serializable {

    @stub
    // Returns an array of the KeyStrokes defined in this
    // InputMap and its parent.
    def allKeys(): Array[KeyStroke] = ???

    @stub
    // Removes all the mappings from this InputMap.
    def clear(): Unit = ???

    @stub
    // Returns the binding for keyStroke, messaging the
    // parent InputMap if the binding is not locally defined.
    def get(keyStroke: KeyStroke): Object = ???

    @stub
    // Gets this InputMap's parent.
    def getParent(): InputMap = ???

    @stub
    // Returns the KeyStrokes that are bound in this InputMap.
    def keys(): Array[KeyStroke] = ???

    @stub
    // Adds a binding for keyStroke to actionMapKey.
    def put(keyStroke: KeyStroke, actionMapKey: Object): Unit = ???

    @stub
    // Removes the binding for key from this
    // InputMap.
    def remove(key: KeyStroke): Unit = ???

    @stub
    // Sets this InputMap's parent.
    def setParent(map: InputMap): Unit = ???
}
