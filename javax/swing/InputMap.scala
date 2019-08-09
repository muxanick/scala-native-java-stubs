package javax.swing

import java.io.Serializable
import java.lang.Object
import scala.scalanative.annotation.stub

/** InputMap provides a binding between an input event
 *  (currently only KeyStrokes are used)
 *  and an Object. InputMaps
 *  are usually used with an ActionMap,
 *  to determine an Action to perform
 *  when a key is pressed.
 *  An InputMap can have a parent
 *  that is searched for bindings not defined in the InputMap.
 *  As with ActionMap if you create a cycle, eg:
 *  
 *    InputMap am = new InputMap();
 *    InputMap bm = new InputMap():
 *    am.setParent(bm);
 *    bm.setParent(am);
 *  
 *  some of the methods will cause a StackOverflowError to be thrown.
 */
class InputMap extends Object with Serializable {

    /** Creates an InputMap with no parent and no mappings. */
    @stub
    def this() = ???

    /** Returns an array of the KeyStrokes defined in this
     *  InputMap and its parent.
     */
    @stub
    def allKeys(): Array[KeyStroke] = ???

    /** Removes all the mappings from this InputMap. */
    @stub
    def clear(): Unit = ???

    /** Returns the binding for keyStroke, messaging the
     *  parent InputMap if the binding is not locally defined.
     */
    @stub
    def get(keyStroke: KeyStroke): Object = ???

    /** Gets this InputMap's parent. */
    @stub
    def getParent(): InputMap = ???

    /** Returns the KeyStrokes that are bound in this InputMap. */
    @stub
    def keys(): Array[KeyStroke] = ???

    /** Adds a binding for keyStroke to actionMapKey. */
    @stub
    def put(keyStroke: KeyStroke, actionMapKey: Object): Unit = ???

    /** Removes the binding for key from this
     *  InputMap.
     */
    @stub
    def remove(key: KeyStroke): Unit = ???

    /** Sets this InputMap's parent. */
    @stub
    def setParent(map: InputMap): Unit = ???

    /** Returns the number of KeyStroke bindings. */
    @stub
    def size(): Int = ???
}
