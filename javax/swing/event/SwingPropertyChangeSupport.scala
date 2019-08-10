package javax.swing.event

import java.beans.{PropertyChangeEvent, PropertyChangeSupport}
import java.lang.Object
import scala.scalanative.annotation.stub

/** This subclass of java.beans.PropertyChangeSupport is almost
 *  identical in functionality. The only difference is if constructed with
 *  SwingPropertyChangeSupport(sourceBean, true) it ensures
 *  listeners are only ever notified on the Event Dispatch Thread.
 */
final class SwingPropertyChangeSupport extends PropertyChangeSupport {

    /** Constructs a SwingPropertyChangeSupport object. */
    @stub
    def this(sourceBean: Any) = ???

    /** Constructs a SwingPropertyChangeSupport object. */
    @stub
    def this(sourceBean: Any, notifyOnEDT: Boolean) = ???

    /** Fires a property change event to listeners
     *  that have been registered to track updates of
     *  all properties or a property with the specified name.
     */
    @stub
    def firePropertyChange(evt: PropertyChangeEvent): Unit = ???

    /** Returns notifyOnEDT property. */
    @stub
    def isNotifyOnEDT(): Boolean = ???
}
