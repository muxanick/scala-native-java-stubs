package javax.swing.text

import java.io.Serializable
import java.lang.{Class, Object, String}
import java.util.{Enumeration, EventListener}
import javax.swing.event.{ChangeEvent, ChangeListener}

/** A collection of attributes, typically used to represent
 *  character and paragraph styles.  This is an implementation
 *  of MutableAttributeSet that can be observed if desired.
 *  These styles will take advantage of immutability while
 *  the sets are small enough, and may be substantially more
 *  efficient than something like SimpleAttributeSet.
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
class StyleContext.NamedStyle extends Object with Style with Serializable {

    /** Creates a new named style, with a null name and parent. */
    @stub
    def NamedStyle() = ???

    /** Creates a new named style. */
    @stub
    def NamedStyle(name: String, parent: Style) = ???

    /** Only one ChangeEvent is needed per model instance since the
     *  event's only (read-only) state is the source property.
     */
    @stub
    protected val changeEvent: ChangeEvent = ???

    /** Adds an attribute. */
    @stub
    def addAttribute(name: Object, value: Object): Unit = ???

    /** Adds a set of attributes to the element. */
    @stub
    def addAttributes(attr: AttributeSet): Unit = ???

    /** Adds a change listener. */
    @stub
    def addChangeListener(l: ChangeListener): Unit = ???

    /** Checks whether a given attribute name/value is defined. */
    @stub
    def containsAttribute(name: Object, value: Object): Boolean = ???

    /** Checks whether the element contains all the attributes. */
    @stub
    def containsAttributes(attrs: AttributeSet): Boolean = ???

    /** Copies a set of attributes. */
    @stub
    def copyAttributes(): AttributeSet = ???

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    @stub
    protected def fireStateChanged(): Unit = ???

    /** Gets the value of an attribute. */
    @stub
    def getAttribute(attrName: Object): Object = ???

    /** Gets the number of attributes that are defined. */
    @stub
    def getAttributeCount(): Int = ???

    /** Gets the names of all attributes. */
    @stub
    def getAttributeNames(): Enumeration[_] = ???

    /** Returns an array of all the ChangeListeners added
     *  to this NamedStyle with addChangeListener().
     */
    @stub
    def getChangeListeners(): Array[ChangeListener] = ???

    /** Return an array of all the listeners of the given type that
     *  were added to this model.
     */
    @stub
    def getListeners[T <: EventListener](listenerType: Class[T]): Array[T] = ???

    /** Fetches the name of the style. */
    @stub
    def getName(): String = ???

    /** Gets attributes from the parent. */
    @stub
    def getResolveParent(): AttributeSet = ???

    /** Checks whether a given attribute is defined. */
    @stub
    def isDefined(attrName: Object): Boolean = ???

    /** Checks whether two attribute sets are equal. */
    @stub
    def isEqual(attr: AttributeSet): Boolean = ???

    /** Removes an attribute from the set. */
    @stub
    def removeAttribute(name: Object): Unit = ???

    /** Removes a set of attributes for the element. */
    @stub
    def removeAttributes(attrs: AttributeSet): Unit = ???

    /** Removes a set of attributes for the element. */
    @stub
    def removeAttributes(names: Enumeration[_]): Unit = ???

    /** Removes a change listener. */
    @stub
    def removeChangeListener(l: ChangeListener): Unit = ???

    /** Changes the name of the style. */
    @stub
    def setName(name: String): Unit = ???

    /** Sets the resolving parent. */
    @stub
    def setResolveParent(parent: AttributeSet): Unit = ???
}
