package javax.swing

import java.lang.Object
import scala.scalanative.annotation.stub

/** A ComponentInputMap is an InputMap
 *  associated with a particular JComponent.
 *  The component is automatically notified whenever
 *  the ComponentInputMap changes.
 *  ComponentInputMaps are used for
 *  WHEN_IN_FOCUSED_WINDOW bindings.
 */
class ComponentInputMap extends InputMap {

    /** Creates a ComponentInputMap associated with the
     *  specified component.
     */
    @stub
    def this(component: JComponent) = ???

    /** Removes all the mappings from this object. */
    @stub
    def clear(): Unit = ???

    /** Returns the component the InputMap was created for. */
    @stub
    def getComponent(): JComponent = ???

    /** Adds a binding for keyStroke to actionMapKey. */
    @stub
    def put(keyStroke: KeyStroke, actionMapKey: Any): Unit = ???

    /** Removes the binding for key from this object. */
    @stub
    def remove(key: KeyStroke): Unit = ???

    /** Sets the parent, which must be a ComponentInputMap
     *  associated with the same component as this
     *  ComponentInputMap.
     */
    @stub
    def setParent(map: InputMap): Unit = ???
}
