package java.beans.beancontext

import java.util.EventListener

// The listener interface for receiving
// BeanContextServiceRevokedEvent objects. A class that is
// interested in processing a BeanContextServiceRevokedEvent
// implements this interface.
trait BeanContextServiceRevokedListener extends EventListener {
}
