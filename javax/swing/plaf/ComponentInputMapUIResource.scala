package javax.swing.plaf

import java.lang.Object
import javax.swing.{ComponentInputMap, InputMap, JComponent}
import scala.scalanative.annotation.stub

/** A subclass of javax.swing.ComponentInputMap that implements UIResource.
 *  UI classes which provide a ComponentInputMap should use this class.
 */
class ComponentInputMapUIResource extends ComponentInputMap with UIResource {

    /**  */
    @stub
    def this(component: JComponent) = ???
}
