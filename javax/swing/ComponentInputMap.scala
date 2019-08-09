package javax.swing

import java.lang.Object

// A ComponentInputMap is an InputMap
// associated with a particular JComponent.
// The component is automatically notified whenever
// the ComponentInputMap changes.
// ComponentInputMaps are used for
// WHEN_IN_FOCUSED_WINDOW bindings.
class ComponentInputMap extends InputMap {

    @stub
    // Removes all the mappings from this object.
    def clear(): Unit = ???

    @stub
    // Returns the component the InputMap was created for.
    def getComponent(): JComponent = ???

    @stub
    // Adds a binding for keyStroke to actionMapKey.
    def put(keyStroke: KeyStroke, actionMapKey: Object): Unit = ???

    @stub
    // Removes the binding for key from this object.
    def remove(key: KeyStroke): Unit = ???
}
