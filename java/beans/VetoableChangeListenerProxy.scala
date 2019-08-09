package java.beans

import java.lang.{Object, String}
import java.util.EventListenerProxy

/** A class which extends the EventListenerProxy
 *  specifically for adding a VetoableChangeListener
 *  with a "constrained" property.
 *  Instances of this class can be added
 *  as VetoableChangeListeners to a bean
 *  which supports firing vetoable change events.
 *  
 *  If the object has a getVetoableChangeListeners method
 *  then the array returned could be a mixture of VetoableChangeListener
 *  and VetoableChangeListenerProxy objects.
 */
class VetoableChangeListenerProxy extends EventListenerProxy[VetoableChangeListener] with VetoableChangeListener {

    /** Returns the name of the named property associated with the listener. */
    @stub
    def getPropertyName(): String = ???
}
