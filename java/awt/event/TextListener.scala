package java.awt.event

import java.util.EventListener
import scala.scalanative.annotation.stub

/** The listener interface for receiving text events.
 * 
 *  The class that is interested in processing a text event
 *  implements this interface. The object created with that
 *  class is then registered with a component using the
 *  component's addTextListener method. When the
 *  component's text changes, the listener object's
 *  textValueChanged method is invoked.
 */
trait TextListener extends EventListener {

    /** Invoked when the value of the text has changed. */
    @stub
    def textValueChanged(e: TextEvent): Unit = ???
}
