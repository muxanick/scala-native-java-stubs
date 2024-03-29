package javax.swing.event

import java.io.Serializable
import java.lang.{Class, Object, String}
import java.util.EventListener
import scala.scalanative.annotation.stub

/** A class that holds a list of EventListeners.  A single instance
 *  can be used to hold all listeners (of all types) for the instance
 *  using the list.  It is the responsiblity of the class using the
 *  EventListenerList to provide type-safe API (preferably conforming
 *  to the JavaBeans spec) and methods which dispatch event notification
 *  methods to appropriate Event Listeners on the list.
 * 
 *  The main benefits that this class provides are that it is relatively
 *  cheap in the case of no listeners, and it provides serialization for
 *  event-listener lists in a single place, as well as a degree of MT safety
 *  (when used correctly).
 * 
 *  Usage example:
 *     Say one is defining a class that sends out FooEvents, and one wants
 *  to allow users of the class to register FooListeners and receive
 *  notification when FooEvents occur.  The following should be added
 *  to the class definition:
 *  
 *  EventListenerList listenerList = new EventListenerList();
 *  FooEvent fooEvent = null;
 * 
 *  public void addFooListener(FooListener l) {
 *      listenerList.add(FooListener.class, l);
 *  }
 * 
 *  public void removeFooListener(FooListener l) {
 *      listenerList.remove(FooListener.class, l);
 *  }
 * 
 * 
 *  // Notify all listeners that have registered interest for
 *  // notification on this event type.  The event instance
 *  // is lazily created using the parameters passed into
 *  // the fire method.
 * 
 *  protected void fireFooXXX() {
 *      // Guaranteed to return a non-null array
 *      Object[] listeners = listenerList.getListenerList();
 *      // Process the listeners last to first, notifying
 *      // those that are interested in this event
 *      for (int i = listeners.length-2; i>=0; i-=2) {
 *          if (listeners[i]==FooListener.class) {
 *              // Lazily create the event:
 *              if (fooEvent == null)
 *                  fooEvent = new FooEvent(this);
 *              ((FooListener)listeners[i+1]).fooXXX(fooEvent);
 *          }
 *      }
 *  }
 *  
 *  foo should be changed to the appropriate name, and fireFooXxx to the
 *  appropriate method name.  One fire method should exist for each
 *  notification method in the FooListener interface.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class EventListenerList extends Object with Serializable {

    /**  */
    @stub
    def this() = ???

    /**  */
    @stub
    protected val listenerList: Array[Object] = ???

    /** Adds the listener as a listener of the specified type. */
    @stub
    def add[T <: EventListener](t: Class[T], l: T): Unit = ???

    /** Returns the total number of listeners for this listener list. */
    @stub
    def getListenerCount(): Int = ???

    /** Returns the total number of listeners of the supplied type
     *  for this listener list.
     */
    @stub
    def getListenerCount(t: Class[_]): Int = ???

    /** Passes back the event listener list as an array
     *  of ListenerType-listener pairs.
     */
    @stub
    def getListenerList(): Array[Object] = ???

    /** Return an array of all the listeners of the given type. */
    @stub
    def getListeners[T <: EventListener](t: Class[T]): Array[T] = ???

    /** Removes the listener as a listener of the specified type. */
    @stub
    def remove[T <: EventListener](t: Class[T], l: T): Unit = ???

    /** Returns a string representation of the EventListenerList. */
    @stub
    def toString(): String = ???
}
