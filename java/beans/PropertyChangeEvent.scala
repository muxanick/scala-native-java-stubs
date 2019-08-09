package java.beans

import java.lang.{Object, String}
import java.util.EventObject
import scala.scalanative.annotation.stub

/** A "PropertyChange" event gets delivered whenever a bean changes a "bound"
 *  or "constrained" property.  A PropertyChangeEvent object is sent as an
 *  argument to the PropertyChangeListener and VetoableChangeListener methods.
 *  
 *  Normally PropertyChangeEvents are accompanied by the name and the old
 *  and new value of the changed property.  If the new value is a primitive
 *  type (such as int or boolean) it must be wrapped as the
 *  corresponding java.lang.* Object type (such as Integer or Boolean).
 *  
 *  Null values may be provided for the old and the new values if their
 *  true values are not known.
 *  
 *  An event source may send a null object as the name to indicate that an
 *  arbitrary set of if its properties have changed.  In this case the
 *  old and new values should also be null.
 */
class PropertyChangeEvent extends EventObject {

    /** Constructs a new PropertyChangeEvent. */
    @stub
    def this(source: Object, propertyName: String, oldValue: Object, newValue: Object) = ???

    /** Gets the new value for the property, expressed as an Object. */
    @stub
    def getNewValue(): Object = ???

    /** Gets the old value for the property, expressed as an Object. */
    @stub
    def getOldValue(): Object = ???

    /** The "propagationId" field is reserved for future use. */
    @stub
    def getPropagationId(): Object = ???

    /** Gets the programmatic name of the property that was changed. */
    @stub
    def getPropertyName(): String = ???

    /** Sets the propagationId object for the event. */
    @stub
    def setPropagationId(propagationId: Object): Unit = ???

    /** Returns a string representation of the object. */
    @stub
    def toString(): String = ???
}
