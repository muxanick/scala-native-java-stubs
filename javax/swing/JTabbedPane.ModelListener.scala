package javax.swing

import java.io.Serializable
import java.lang.Object
import javax.swing.event.{ChangeEvent, ChangeListener}
import scala.scalanative.annotation.stub

/** We pass ModelChanged events along to the listeners with
 *  the tabbedpane (instead of the model itself) as the event source.
 */
protected class JTabbedPane.ModelListener extends Object with ChangeListener with Serializable {

    /**  */
    @stub
    protected def ModelListener() = ???

    /** Invoked when the target of the listener has changed its state. */
    @stub
    def stateChanged(e: ChangeEvent): Unit = ???
}
