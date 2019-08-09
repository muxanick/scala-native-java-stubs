package java.util.prefs

import java.util.EventListener
import scala.scalanative.annotation.stub

/** A listener for receiving preference node change events. */
trait NodeChangeListener extends EventListener {

    /** This method gets called when a child node is added. */
    @stub
    def childAdded(evt: NodeChangeEvent): Unit = ???

    /** This method gets called when a child node is removed. */
    @stub
    def childRemoved(evt: NodeChangeEvent): Unit = ???
}
