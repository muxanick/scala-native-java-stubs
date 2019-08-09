package javax.swing.text

import java.io.Serializable
import java.lang.{Class, Object, String}
import java.util.{Enumeration, EventListener}
import javax.swing.event.{ChangeEvent, ChangeListener}

// A collection of attributes, typically used to represent
// character and paragraph styles.  This is an implementation
// of MutableAttributeSet that can be observed if desired.
// These styles will take advantage of immutability while
// the sets are small enough, and may be substantially more
// efficient than something like SimpleAttributeSet.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class StyleContext.NamedStyle extends Object with Style, with Serializable {

    @stub
    // Creates a new named style, with a null name and parent.
    def NamedStyle() = ???

    @stub
    // Creates a new named style.
    def NamedStyle(name: String, parent: Style) = ???

    @stub
    // Only one ChangeEvent is needed per model instance since the
    // event's only (read-only) state is the source property.
    protected def changeEvent: ChangeEvent = ???

    @stub
    // Adds an attribute.
    def addAttribute(name: Object, value: Object): Unit = ???

    @stub
    // Adds a set of attributes to the element.
    def addAttributes(attr: AttributeSet): Unit = ???

    @stub
    // Adds a change listener.
    def addChangeListener(l: ChangeListener): Unit = ???

    @stub
    // Checks whether a given attribute name/value is defined.
    def containsAttribute(name: Object, value: Object): Boolean = ???

    @stub
    // Checks whether the element contains all the attributes.
    def containsAttributes(attrs: AttributeSet): Boolean = ???

    @stub
    // Copies a set of attributes.
    def copyAttributes(): AttributeSet = ???

    @stub
    // Notifies all listeners that have registered interest for
    // notification on this event type.
    protected def fireStateChanged(): Unit = ???

    @stub
    // Gets the value of an attribute.
    def getAttribute(attrName: Object): Object = ???

    @stub
    // Gets the number of attributes that are defined.
    def getAttributeCount(): Int = ???

    @stub
    // Gets the names of all attributes.
    def getAttributeNames(): Enumeration[_] = ???

    @stub
    // Returns an array of all the ChangeListeners added
    // to this NamedStyle with addChangeListener().
    def getChangeListeners(): Array[ChangeListener] = ???

    @stub
    // Return an array of all the listeners of the given type that
    // were added to this model.
    def Array[T]: [T <: EventListener] = ???

    @stub
    // Fetches the name of the style.
    def getName(): String = ???

    @stub
    // Gets attributes from the parent.
    def getResolveParent(): AttributeSet = ???

    @stub
    // Checks whether a given attribute is defined.
    def isDefined(attrName: Object): Boolean = ???

    @stub
    // Checks whether two attribute sets are equal.
    def isEqual(attr: AttributeSet): Boolean = ???

    @stub
    // Removes an attribute from the set.
    def removeAttribute(name: Object): Unit = ???

    @stub
    // Removes a set of attributes for the element.
    def removeAttributes(attrs: AttributeSet): Unit = ???

    @stub
    // Removes a set of attributes for the element.
    def removeAttributes(names: Enumeration[_]): Unit = ???

    @stub
    // Removes a change listener.
    def removeChangeListener(l: ChangeListener): Unit = ???

    @stub
    // Changes the name of the style.
    def setName(name: String): Unit = ???

    @stub
    // Sets the resolving parent.
    def setResolveParent(parent: AttributeSet): Unit = ???
}
