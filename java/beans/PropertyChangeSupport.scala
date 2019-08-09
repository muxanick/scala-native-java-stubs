package java.beans

import java.io.Serializable
import java.lang.{Object, String}

/** This is a utility class that can be used by beans that support bound
 *  properties.  It manages a list of listeners and dispatches
 *  PropertyChangeEvents to them.  You can use an instance of this class
 *  as a member field of your bean and delegate these types of work to it.
 *  The PropertyChangeListener can be registered for all properties
 *  or for a property specified by name.
 *  
 *  Here is an example of PropertyChangeSupport usage that follows
 *  the rules and recommendations laid out in the JavaBeans™ specification:
 *  
 *  public class MyBean {
 *      private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);
 * 
 *      public void addPropertyChangeListener(PropertyChangeListener listener) {
 *          this.pcs.addPropertyChangeListener(listener);
 *      }
 * 
 *      public void removePropertyChangeListener(PropertyChangeListener listener) {
 *          this.pcs.removePropertyChangeListener(listener);
 *      }
 * 
 *      private String value;
 * 
 *      public String getValue() {
 *          return this.value;
 *      }
 * 
 *      public void setValue(String newValue) {
 *          String oldValue = this.value;
 *          this.value = newValue;
 *          this.pcs.firePropertyChange("value", oldValue, newValue);
 *      }
 * 
 *      [...]
 *  }
 *  
 *  
 *  A PropertyChangeSupport instance is thread-safe.
 *  
 *  This class is serializable.  When it is serialized it will save
 *  (and restore) any listeners that are themselves serializable.  Any
 *  non-serializable listeners will be skipped during serialization.
 */
class PropertyChangeSupport extends Object with Serializable {

    /** Add a PropertyChangeListener to the listener list. */
    @stub
    def addPropertyChangeListener(listener: PropertyChangeListener): Unit = ???

    /** Add a PropertyChangeListener for a specific property. */
    @stub
    def addPropertyChangeListener(propertyName: String, listener: PropertyChangeListener): Unit = ???

    /** Reports a boolean bound indexed property update to listeners
     *  that have been registered to track updates of
     *  all properties or a property with the specified name.
     */
    @stub
    def fireIndexedPropertyChange(propertyName: String, index: Int, oldValue: Boolean, newValue: Boolean): Unit = ???

    /** Reports an integer bound indexed property update to listeners
     *  that have been registered to track updates of
     *  all properties or a property with the specified name.
     */
    @stub
    def fireIndexedPropertyChange(propertyName: String, index: Int, oldValue: Int, newValue: Int): Unit = ???

    /** Reports a bound indexed property update to listeners
     *  that have been registered to track updates of
     *  all properties or a property with the specified name.
     */
    @stub
    def fireIndexedPropertyChange(propertyName: String, index: Int, oldValue: Object, newValue: Object): Unit = ???

    /** Fires a property change event to listeners
     *  that have been registered to track updates of
     *  all properties or a property with the specified name.
     */
    @stub
    def firePropertyChange(event: PropertyChangeEvent): Unit = ???

    /** Reports a boolean bound property update to listeners
     *  that have been registered to track updates of
     *  all properties or a property with the specified name.
     */
    @stub
    def firePropertyChange(propertyName: String, oldValue: Boolean, newValue: Boolean): Unit = ???

    /** Reports an integer bound property update to listeners
     *  that have been registered to track updates of
     *  all properties or a property with the specified name.
     */
    @stub
    def firePropertyChange(propertyName: String, oldValue: Int, newValue: Int): Unit = ???

    /** Reports a bound property update to listeners
     *  that have been registered to track updates of
     *  all properties or a property with the specified name.
     */
    @stub
    def firePropertyChange(propertyName: String, oldValue: Object, newValue: Object): Unit = ???

    /** Returns an array of all the listeners that were added to the
     *  PropertyChangeSupport object with addPropertyChangeListener().
     */
    @stub
    def getPropertyChangeListeners(): Array[PropertyChangeListener] = ???

    /** Returns an array of all the listeners which have been associated
     *  with the named property.
     */
    @stub
    def getPropertyChangeListeners(propertyName: String): Array[PropertyChangeListener] = ???

    /** Check if there are any listeners for a specific property, including
     *  those registered on all properties.
     */
    @stub
    def hasListeners(propertyName: String): Boolean = ???

    /** Remove a PropertyChangeListener from the listener list. */
    @stub
    def removePropertyChangeListener(listener: PropertyChangeListener): Unit = ???
}
