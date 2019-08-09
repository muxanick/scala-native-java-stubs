package java.util

import java.lang.Object
import scala.scalanative.annotation.stub

/** An abstract wrapper class for an EventListener class
 *  which associates a set of additional parameters with the listener.
 *  Subclasses must provide the storage and accessor methods
 *  for the additional arguments or parameters.
 *  
 *  For example, a bean which supports named properties
 *  would have a two argument method signature for adding
 *  a PropertyChangeListener for a property:
 *  
 *  public void addPropertyChangeListener(String propertyName,
 *                                        PropertyChangeListener listener)
 *  
 *  If the bean also implemented the zero argument get listener method:
 *  
 *  public PropertyChangeListener[] getPropertyChangeListeners()
 *  
 *  then the array may contain inner PropertyChangeListeners
 *  which are also PropertyChangeListenerProxy objects.
 *  
 *  If the calling method is interested in retrieving the named property
 *  then it would have to test the element to see if it is a proxy class.
 */
abstract class EventListenerProxy[T <: EventListener] extends Object with EventListener {

    /** Creates a proxy for the specified listener. */
    @stub
    def this(listener: T) = ???

    /** Returns the listener associated with the proxy. */
    def getListener(): T
}
