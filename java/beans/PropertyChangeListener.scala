package java.beans

import java.util.EventListener

// A "PropertyChange" event gets fired whenever a bean changes a "bound"
// property.  You can register a PropertyChangeListener with a source
// bean so as to be notified of any bound property updates.
trait PropertyChangeListener extends EventListener {
}
