package java.util.prefs

import java.util.EventListener

// A listener for receiving preference node change events.
trait NodeChangeListener extends EventListener {

    @stub
    // This method gets called when a child node is added.
    def childAdded(evt: NodeChangeEvent): Unit = ???
}
