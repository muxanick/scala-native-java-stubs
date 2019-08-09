package javax.swing

import java.lang.Object

/** A ComponentInputMap is an InputMap
 *  associated with a particular JComponent.
 *  The component is automatically notified whenever
 *  the ComponentInputMap changes.
 *  ComponentInputMaps are used for
 *  WHEN_IN_FOCUSED_WINDOW bindings.
 */
class ComponentInputMap extends InputMap {

    /** Removes all the mappings from this object. */
    @stub
    def clear(): Unit = ???

    /** Returns the component the InputMap was created for. */
    @stub
    def getComponent(): JComponent = ???

    /** Adds a binding for keyStroke to actionMapKey. */
    @stub
    def put(keyStroke: KeyStroke, actionMapKey: Object): Unit = ???

    /** Removes the binding for key from this object. */
    @stub
    def remove(key: KeyStroke): Unit = ???
}
