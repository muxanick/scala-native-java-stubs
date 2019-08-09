package java.awt.event

import java.util.EventListener

// The listener interface for receiving item events.
// The class that is interested in processing an item event
// implements this interface. The object created with that
// class is then registered with a component using the
// component's addItemListener method. When an
// item-selection event occurs, the listener object's
// itemStateChanged method is invoked.
trait ItemListener extends EventListener {
}
