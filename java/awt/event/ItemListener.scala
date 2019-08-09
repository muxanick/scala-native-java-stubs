package java.awt.event

import java.util.EventListener
import scala.scalanative.annotation.stub

/** The listener interface for receiving item events.
 *  The class that is interested in processing an item event
 *  implements this interface. The object created with that
 *  class is then registered with a component using the
 *  component's addItemListener method. When an
 *  item-selection event occurs, the listener object's
 *  itemStateChanged method is invoked.
 */
trait ItemListener extends EventListener {

    /** Invoked when an item has been selected or deselected by the user. */
    @stub
    def itemStateChanged(e: ItemEvent): Unit = ???
}
