package java.beans

import java.util.EventListener

// A VetoableChange event gets fired whenever a bean changes a "constrained"
// property.  You can register a VetoableChangeListener with a source bean
// so as to be notified of any constrained property updates.
trait VetoableChangeListener extends EventListener {
}
