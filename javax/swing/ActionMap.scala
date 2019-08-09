package javax.swing

import java.io.Serializable
import java.lang.Object
import scala.scalanative.annotation.stub

/** ActionMap provides mappings from
 *  Objects
 *  (called keys or Action names)
 *  to Actions.
 *  An ActionMap is usually used with an InputMap
 *  to locate a particular action
 *  when a key is pressed. As with InputMap,
 *  an ActionMap can have a parent
 *  that is searched for keys not defined in the ActionMap.
 *  As with InputMap if you create a cycle, eg:
 *  
 *    ActionMap am = new ActionMap();
 *    ActionMap bm = new ActionMap():
 *    am.setParent(bm);
 *    bm.setParent(am);
 *  
 *  some of the methods will cause a StackOverflowError to be thrown.
 */
class ActionMap extends Object with Serializable {

    /** Creates an ActionMap with no parent and no mappings. */
    @stub
    def this() = ???

    /** Returns an array of the keys defined in this ActionMap and
     *  its parent.
     */
    @stub
    def allKeys(): Array[Object] = ???

    /** Removes all the mappings from this ActionMap. */
    @stub
    def clear(): Unit = ???

    /** Returns the binding for key, messaging the
     *  parent ActionMap if the binding is not locally defined.
     */
    @stub
    def get(key: Object): Action = ???

    /** Returns this ActionMap's parent. */
    @stub
    def getParent(): ActionMap = ???

    /** Returns the Action names that are bound in this ActionMap. */
    @stub
    def keys(): Array[Object] = ???

    /** Adds a binding for key to action. */
    @stub
    def put(key: Object, action: Action): Unit = ???

    /** Removes the binding for key from this ActionMap. */
    @stub
    def remove(key: Object): Unit = ???

    /** Sets this ActionMap's parent. */
    @stub
    def setParent(map: ActionMap): Unit = ???

    /** Returns the number of bindings in this ActionMap. */
    @stub
    def size(): Int = ???
}
