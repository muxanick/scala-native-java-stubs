package javax.swing.event

import java.awt.event.MouseAdapter
import java.lang.Object
import scala.scalanative.annotation.stub

/** An empty implementation of the MouseInputListener interface, provided
 *  as a convenience to simplify the task of creating listeners, by extending
 *  and implementing only the methods of interest. This class also provides an
 *  empty implementation of the MouseWheelListener interface, through
 *  its extension from AWT's MouseAdapter.
 */
abstract class MouseInputAdapter extends MouseAdapter with MouseInputListener {

    /**  */
    @stub
    def this() = ???
}
