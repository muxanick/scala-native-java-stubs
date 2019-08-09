package javax.swing

import java.beans.PropertyChangeListener
import java.io.Serializable
import java.lang.{Cloneable, Object, String}
import javax.swing.event.SwingPropertyChangeSupport

/** This class provides default implementations for the JFC Action
 *  interface. Standard behaviors like the get and set methods for
 *  Action object properties (icon, text, and enabled) are defined
 *  here. The developer need only subclass this abstract class and
 *  define the actionPerformed method.
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
abstract class AbstractAction extends Object with Action with Cloneable with Serializable {

    /** Creates an Action. */
    @stub
    def this() = ???

    /** Creates an Action with the specified name. */
    @stub
    def this(name: String) = ???

    /** If any PropertyChangeListeners have been registered, the
     *  changeSupport field describes them.
     */
    protected val changeSupport: SwingPropertyChangeSupport

    /** Adds a PropertyChangeListener to the listener list. */
    def addPropertyChangeListener(listener: PropertyChangeListener): Unit

    /** Clones the abstract action. */
    protected def clone(): Object

    /** Supports reporting bound property changes. */
    protected def firePropertyChange(propertyName: String, oldValue: Object, newValue: Object): Unit

    /** Returns an array of Objects which are keys for
     *  which values have been set for this AbstractAction,
     *  or null if no keys have values set.
     */
    def getKeys(): Array[Object]

    /** Returns an array of all the PropertyChangeListeners added
     *  to this AbstractAction with addPropertyChangeListener().
     */
    def getPropertyChangeListeners(): Array[PropertyChangeListener]

    /** Gets the Object associated with the specified key. */
    def getValue(key: String): Object

    /** Returns true if the action is enabled. */
    def isEnabled(): Boolean

    /** Sets the Value associated with the specified key. */
    def putValue(key: String, newValue: Object): Unit

    /** Removes a PropertyChangeListener from the listener list. */
    def removePropertyChangeListener(listener: PropertyChangeListener): Unit
}
