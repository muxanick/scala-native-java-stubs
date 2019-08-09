package java.beans

import java.lang.{Object, String}
import java.util.EventListenerProxy

/** A class which extends the EventListenerProxy
 *  specifically for adding a PropertyChangeListener
 *  with a "bound" property.
 *  Instances of this class can be added
 *  as PropertyChangeListeners to a bean
 *  which supports firing property change events.
 *  
 *  If the object has a getPropertyChangeListeners method
 *  then the array returned could be a mixture of PropertyChangeListener
 *  and PropertyChangeListenerProxy objects.
 */
class PropertyChangeListenerProxy extends EventListenerProxy[PropertyChangeListener] with PropertyChangeListener {

    /** Returns the name of the named property associated with the listener. */
    @stub
    def getPropertyName(): String = ???
}
