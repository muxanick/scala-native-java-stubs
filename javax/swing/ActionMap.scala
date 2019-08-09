package javax.swing

import java.io.Serializable
import java.lang.Object

// ActionMap provides mappings from
// Objects
// (called keys or Action names)
// to Actions.
// An ActionMap is usually used with an InputMap
// to locate a particular action
// when a key is pressed. As with InputMap,
// an ActionMap can have a parent
// that is searched for keys not defined in the ActionMap.
// As with InputMap if you create a cycle, eg:
// 
//   ActionMap am = new ActionMap();
//   ActionMap bm = new ActionMap():
//   am.setParent(bm);
//   bm.setParent(am);
// 
// some of the methods will cause a StackOverflowError to be thrown.
class ActionMap extends Object with Serializable {

    @stub
    // Returns an array of the keys defined in this ActionMap and
    // its parent.
    def allKeys(): Array[Object] = ???

    @stub
    // Removes all the mappings from this ActionMap.
    def clear(): Unit = ???

    @stub
    // Returns the binding for key, messaging the
    // parent ActionMap if the binding is not locally defined.
    def get(key: Object): Action = ???

    @stub
    // Returns this ActionMap's parent.
    def getParent(): ActionMap = ???

    @stub
    // Returns the Action names that are bound in this ActionMap.
    def keys(): Array[Object] = ???

    @stub
    // Adds a binding for key to action.
    def put(key: Object, action: Action): Unit = ???

    @stub
    // Removes the binding for key from this ActionMap.
    def remove(key: Object): Unit = ???

    @stub
    // Sets this ActionMap's parent.
    def setParent(map: ActionMap): Unit = ???
}
