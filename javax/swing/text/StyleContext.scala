package javax.swing.text

import java.awt.{Color, Font, FontMetrics}
import java.io.{ObjectInputStream, ObjectOutputStream, Serializable}
import java.lang.{Class, Object, String}
import java.util.{Enumeration, EventListener}
import javax.swing.event.{ChangeEvent, ChangeListener, EventListenerList}
import scala.scalanative.annotation.stub

/** A pool of styles and their associated resources.  This class determines
 *  the lifetime of a group of resources by being a container that holds
 *  caches for various resources such as font and color that get reused
 *  by the various style definitions.  This can be shared by multiple
 *  documents if desired to maximize the sharing of related resources.
 *  
 *  This class also provides efficient support for small sets of attributes
 *  and compresses them by sharing across uses and taking advantage of
 *  their immutable nature.  Since many styles are replicated, the potential
 *  for sharing is significant, and copies can be extremely cheap.
 *  Larger sets reduce the possibility of sharing, and therefore revert
 *  automatically to a less space-efficient implementation.
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
class StyleContext extends Object with Serializable with AbstractDocument.AttributeContext {

    /** Creates a new StyleContext object. */
    @stub
    def this() = ???

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
    class NamedStyle extends Object with Style with Serializable {

        /** Creates a new named style, with a null name and parent. */
        @stub
        def this() = ???

        /** Creates a new named style. */
        @stub
        def this(name: String, parent: Style) = ???

        /** Creates a new named style. */
        @stub
        def this(parent: Style) = ???

        /** Only one ChangeEvent is needed per model instance since the
         *  event's only (read-only) state is the source property.
         */
        @stub
        protected val changeEvent: ChangeEvent = ???

        /** The change listeners for the model. */
        @stub
        protected val listenerList: EventListenerList = ???

        /** Adds an attribute. */
        @stub
        def addAttribute(name: Any, value: Any): Unit = ???

        /** Adds a set of attributes to the element. */
        @stub
        def addAttributes(attr: AttributeSet): Unit = ???

        /** Adds a change listener. */
        @stub
        def addChangeListener(l: ChangeListener): Unit = ???

        /** Checks whether a given attribute name/value is defined. */
        @stub
        def containsAttribute(name: Any, value: Any): Boolean = ???

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
        def getAttribute(attrName: Any): Any = ???

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
        def isDefined(attrName: Any): Boolean = ???

        /** Checks whether two attribute sets are equal. */
        @stub
        def isEqual(attr: AttributeSet): Boolean = ???

        /** Removes an attribute from the set. */
        @stub
        def removeAttribute(name: Any): Unit = ???

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

        /** Converts the style to a string. */
        @stub
        def toString(): String = ???
    }


    /** This class holds a small number of attributes in an array.
     *  The storage format is key, value, key, value, etc.  The size
     *  of the set is the length of the array divided by two.  By
     *  default, this is the class that will be used to store attributes
     *  when held in the compact sharable form.
     */
    class SmallAttributeSet extends Object with AttributeSet {

        /**  */
        @stub
        def this(attrs: AttributeSet) = ???

        /**  */
        @stub
        def this(attributes: Array[Object]) = ???

        /** Clones a set of attributes. */
        @stub
        def clone(): Any = ???

        /** Checks whether a given attribute name/value is defined. */
        @stub
        def containsAttribute(name: Any, value: Any): Boolean = ???

        /** Checks whether the attribute set contains all of
         *  the given attributes.
         */
        @stub
        def containsAttributes(attrs: AttributeSet): Boolean = ???

        /** Copies a set of attributes. */
        @stub
        def copyAttributes(): AttributeSet = ???

        /** Compares this object to the specified object. */
        @stub
        def equals(obj: Any): Boolean = ???

        /** Gets the value of an attribute. */
        @stub
        def getAttribute(key: Any): Any = ???

        /** Gets the number of attributes that are defined. */
        @stub
        def getAttributeCount(): Int = ???

        /** Gets the names of all attributes. */
        @stub
        def getAttributeNames(): Enumeration[_] = ???

        /** If not overriden, the resolving parent defaults to
         *  the parent element.
         */
        @stub
        def getResolveParent(): AttributeSet = ???

        /** Returns a hashcode for this set of attributes. */
        @stub
        def hashCode(): Int = ???

        /** Checks whether a given attribute is defined. */
        @stub
        def isDefined(key: Any): Boolean = ???

        /** Checks whether two attribute sets are equal. */
        @stub
        def isEqual(attr: AttributeSet): Boolean = ???

        /** Returns a string showing the key/value pairs */
        @stub
        def toString(): String = ???
    }


    /** Adds an attribute to the given set, and returns
     *  the new representative set.
     */
    @stub
    def addAttribute(old: AttributeSet, name: Any, value: Any): AttributeSet = ???

    /** Adds a set of attributes to the element. */
    @stub
    def addAttributes(old: AttributeSet, attr: AttributeSet): AttributeSet = ???

    /** Adds a listener to track when styles are added
     *  or removed.
     */
    @stub
    def addChangeListener(l: ChangeListener): Unit = ???

    /** Adds a new style into the style hierarchy. */
    @stub
    def addStyle(nm: String, parent: Style): Style = ???

    /** Create a large set of attributes that should trade off
     *  space for time.
     */
    @stub
    protected def createLargeAttributeSet(a: AttributeSet): MutableAttributeSet = ???

    /** Create a compact set of attributes that might be shared. */
    @stub
    protected def createSmallAttributeSet(a: AttributeSet): StyleContext.SmallAttributeSet = ???

    /** Takes a set of attributes and turn it into a background color
     *  specification.
     */
    @stub
    def getBackground(attr: AttributeSet): Color = ???

    /** Returns an array of all the ChangeListeners added
     *  to this StyleContext with addChangeListener().
     */
    @stub
    def getChangeListeners(): Array[ChangeListener] = ???

    /** Returns the maximum number of key/value pairs to try and
     *  compress into unique/immutable sets.
     */
    @stub
    protected def getCompressionThreshold(): Int = ???

    /** Fetches an empty AttributeSet. */
    @stub
    def getEmptySet(): AttributeSet = ???

    /** Gets the font from an attribute set. */
    @stub
    def getFont(attr: AttributeSet): Font = ???

    /** Gets a new font. */
    @stub
    def getFont(family: String, style: Int, size: Int): Font = ???

    /** Returns font metrics for a font. */
    @stub
    def getFontMetrics(f: Font): FontMetrics = ???

    /** Takes a set of attributes and turn it into a foreground color
     *  specification.
     */
    @stub
    def getForeground(attr: AttributeSet): Color = ???

    /** Fetches a named style previously added to the document */
    @stub
    def getStyle(nm: String): Style = ???

    /** Fetches the names of the styles defined. */
    @stub
    def getStyleNames(): Enumeration[_] = ???

    /** Context-specific handling of reading in attributes */
    @stub
    def readAttributes(in: ObjectInputStream, a: MutableAttributeSet): Unit = ???

    /** Returns a set no longer needed by the MutableAttributeSet implementation. */
    @stub
    def reclaim(a: AttributeSet): Unit = ???

    /** Removes an attribute from the set. */
    @stub
    def removeAttribute(old: AttributeSet, name: Any): AttributeSet = ???

    /** Removes a set of attributes for the element. */
    @stub
    def removeAttributes(old: AttributeSet, attrs: AttributeSet): AttributeSet = ???

    /** Removes a set of attributes for the element. */
    @stub
    def removeAttributes(old: AttributeSet, names: Enumeration[_]): AttributeSet = ???

    /** Removes a listener that was tracking styles being
     *  added or removed.
     */
    @stub
    def removeChangeListener(l: ChangeListener): Unit = ???

    /** Removes a named style previously added to the document. */
    @stub
    def removeStyle(nm: String): Unit = ???

    /** Converts a StyleContext to a String. */
    @stub
    def toString(): String = ???

    /** Context-specific handling of writing out attributes */
    @stub
    def writeAttributes(out: ObjectOutputStream, a: AttributeSet): Unit = ???
}

object StyleContext {
    /** The name given to the default logical style attached
     *  to paragraphs.
     */
    @stub
    val DEFAULT_STYLE: String = ???

    /** Returns default AttributeContext shared by all documents that
     *  don't bother to define/supply their own context.
     */
    @stub
    def getDefaultStyleContext(): StyleContext = ???

    /** Returns the object previously registered with
     *  registerStaticAttributeKey.
     */
    @stub
    def getStaticAttribute(key: Any): Any = ???

    /** Returns the String that key will be registered with */
    @stub
    def getStaticAttributeKey(key: Any): Any = ???

    /** Reads a set of attributes from the given object input
     *  stream that have been previously written out with
     *  writeAttributeSet.
     */
    @stub
    def readAttributeSet(in: ObjectInputStream, a: MutableAttributeSet): Unit = ???

    /** Registers an object as a static object that is being
     *  used as a key in attribute sets.
     */
    @stub
    def registerStaticAttributeKey(key: Any): Unit = ???

    /** Writes a set of attributes to the given object stream
     *  for the purpose of serialization.
     */
    @stub
    def writeAttributeSet(out: ObjectOutputStream, a: AttributeSet): Unit = ???
}
