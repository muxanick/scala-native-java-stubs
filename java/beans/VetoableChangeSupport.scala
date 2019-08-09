package java.beans

import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** This is a utility class that can be used by beans that support constrained
 *  properties.  It manages a list of listeners and dispatches
 *  PropertyChangeEvents to them.  You can use an instance of this class
 *  as a member field of your bean and delegate these types of work to it.
 *  The VetoableChangeListener can be registered for all properties
 *  or for a property specified by name.
 *  
 *  Here is an example of VetoableChangeSupport usage that follows
 *  the rules and recommendations laid out in the JavaBeans™ specification:
 *  
 *  public class MyBean {
 *      private final VetoableChangeSupport vcs = new VetoableChangeSupport(this);
 * 
 *      public void addVetoableChangeListener(VetoableChangeListener listener) {
 *          this.vcs.addVetoableChangeListener(listener);
 *      }
 * 
 *      public void removeVetoableChangeListener(VetoableChangeListener listener) {
 *          this.vcs.removeVetoableChangeListener(listener);
 *      }
 * 
 *      private String value;
 * 
 *      public String getValue() {
 *          return this.value;
 *      }
 * 
 *      public void setValue(String newValue) throws PropertyVetoException {
 *          String oldValue = this.value;
 *          this.vcs.fireVetoableChange("value", oldValue, newValue);
 *          this.value = newValue;
 *      }
 * 
 *      [...]
 *  }
 *  
 *  
 *  A VetoableChangeSupport instance is thread-safe.
 *  
 *  This class is serializable.  When it is serialized it will save
 *  (and restore) any listeners that are themselves serializable.  Any
 *  non-serializable listeners will be skipped during serialization.
 */
class VetoableChangeSupport extends Object with Serializable {

    /** Constructs a VetoableChangeSupport object. */
    @stub
    def this(sourceBean: Object) = ???

    /** Add a VetoableChangeListener for a specific property. */
    @stub
    def addVetoableChangeListener(propertyName: String, listener: VetoableChangeListener): Unit = ???

    /** Add a VetoableChangeListener to the listener list. */
    @stub
    def addVetoableChangeListener(listener: VetoableChangeListener): Unit = ???

    /** Fires a property change event to listeners
     *  that have been registered to track updates of
     *  all properties or a property with the specified name.
     */
    @stub
    def fireVetoableChange(event: PropertyChangeEvent): Unit = ???

    /** Reports a boolean constrained property update to listeners
     *  that have been registered to track updates of
     *  all properties or a property with the specified name.
     */
    @stub
    def fireVetoableChange(propertyName: String, oldValue: Boolean, newValue: Boolean): Unit = ???

    /** Reports an integer constrained property update to listeners
     *  that have been registered to track updates of
     *  all properties or a property with the specified name.
     */
    @stub
    def fireVetoableChange(propertyName: String, oldValue: Int, newValue: Int): Unit = ???

    /** Reports a constrained property update to listeners
     *  that have been registered to track updates of
     *  all properties or a property with the specified name.
     */
    @stub
    def fireVetoableChange(propertyName: String, oldValue: Object, newValue: Object): Unit = ???

    /** Returns an array of all the listeners that were added to the
     *  VetoableChangeSupport object with addVetoableChangeListener().
     */
    @stub
    def getVetoableChangeListeners(): Array[VetoableChangeListener] = ???

    /** Returns an array of all the listeners which have been associated
     *  with the named property.
     */
    @stub
    def getVetoableChangeListeners(propertyName: String): Array[VetoableChangeListener] = ???

    /** Check if there are any listeners for a specific property, including
     *  those registered on all properties.
     */
    @stub
    def hasListeners(propertyName: String): Boolean = ???

    /** Remove a VetoableChangeListener for a specific property. */
    @stub
    def removeVetoableChangeListener(propertyName: String, listener: VetoableChangeListener): Unit = ???

    /** Remove a VetoableChangeListener from the listener list. */
    @stub
    def removeVetoableChangeListener(listener: VetoableChangeListener): Unit = ???
}
