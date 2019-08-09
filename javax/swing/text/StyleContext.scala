package javax.swing.text

import java.awt.{Color, Font, FontMetrics}
import java.io.{ObjectInputStream, ObjectOutputStream, Serializable}
import java.lang.{Object, String}
import java.util.Enumeration
import javax.swing.event.ChangeListener

// A pool of styles and their associated resources.  This class determines
// the lifetime of a group of resources by being a container that holds
// caches for various resources such as font and color that get reused
// by the various style definitions.  This can be shared by multiple
// documents if desired to maximize the sharing of related resources.
// 
// This class also provides efficient support for small sets of attributes
// and compresses them by sharing across uses and taking advantage of
// their immutable nature.  Since many styles are replicated, the potential
// for sharing is significant, and copies can be extremely cheap.
// Larger sets reduce the possibility of sharing, and therefore revert
// automatically to a less space-efficient implementation.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class StyleContext extends Object with Serializable, with AbstractDocument.AttributeContext {

    @stub
    // A collection of attributes, typically used to represent
    // character and paragraph styles.
    def StyleContext.NamedStyle: class = ???

    @stub
    // Adds an attribute to the given set, and returns
    // the new representative set.
    def addAttribute(old: AttributeSet, name: Object, value: Object): AttributeSet = ???

    @stub
    // Adds a set of attributes to the element.
    def addAttributes(old: AttributeSet, attr: AttributeSet): AttributeSet = ???

    @stub
    // Adds a listener to track when styles are added
    // or removed.
    def addChangeListener(l: ChangeListener): Unit = ???

    @stub
    // Adds a new style into the style hierarchy.
    def addStyle(nm: String, parent: Style): Style = ???

    @stub
    // Create a large set of attributes that should trade off
    // space for time.
    protected def createLargeAttributeSet(a: AttributeSet): MutableAttributeSet = ???

    @stub
    // Create a compact set of attributes that might be shared.
    protected def createSmallAttributeSet(a: AttributeSet): StyleContext.SmallAttributeSet = ???

    @stub
    // Takes a set of attributes and turn it into a background color
    // specification.
    def getBackground(attr: AttributeSet): Color = ???

    @stub
    // Returns an array of all the ChangeListeners added
    // to this StyleContext with addChangeListener().
    def getChangeListeners(): Array[ChangeListener] = ???

    @stub
    // Returns the maximum number of key/value pairs to try and
    // compress into unique/immutable sets.
    protected def getCompressionThreshold(): Int = ???

    @stub
    // Fetches an empty AttributeSet.
    def getEmptySet(): AttributeSet = ???

    @stub
    // Gets the font from an attribute set.
    def getFont(attr: AttributeSet): Font = ???

    @stub
    // Gets a new font.
    def getFont(family: String, style: Int, size: Int): Font = ???

    @stub
    // Returns font metrics for a font.
    def getFontMetrics(f: Font): FontMetrics = ???

    @stub
    // Takes a set of attributes and turn it into a foreground color
    // specification.
    def getForeground(attr: AttributeSet): Color = ???

    @stub
    // Fetches a named style previously added to the document
    def getStyle(nm: String): Style = ???

    @stub
    // Fetches the names of the styles defined.
    def getStyleNames(): Enumeration[_] = ???

    @stub
    // Context-specific handling of reading in attributes
    def readAttributes(in: ObjectInputStream, a: MutableAttributeSet): Unit = ???

    @stub
    // Returns a set no longer needed by the MutableAttributeSet implementation.
    def reclaim(a: AttributeSet): Unit = ???

    @stub
    // Removes an attribute from the set.
    def removeAttribute(old: AttributeSet, name: Object): AttributeSet = ???

    @stub
    // Removes a set of attributes for the element.
    def removeAttributes(old: AttributeSet, attrs: AttributeSet): AttributeSet = ???

    @stub
    // Removes a set of attributes for the element.
    def removeAttributes(old: AttributeSet, names: Enumeration[_]): AttributeSet = ???

    @stub
    // Removes a listener that was tracking styles being
    // added or removed.
    def removeChangeListener(l: ChangeListener): Unit = ???

    @stub
    // Removes a named style previously added to the document.
    def removeStyle(nm: String): Unit = ???

    @stub
    // Converts a StyleContext to a String.
    def toString(): String = ???

    @stub
    // Context-specific handling of writing out attributes
    def writeAttributes(out: ObjectOutputStream, a: AttributeSet): Unit = ???
}

object StyleContext {
    @stub
    // Returns default AttributeContext shared by all documents that
    // don't bother to define/supply their own context.
    def getDefaultStyleContext(): StyleContext = ???

    @stub
    // Returns the object previously registered with
    // registerStaticAttributeKey.
    def getStaticAttribute(key: Object): Object = ???

    @stub
    // Returns the String that key will be registered with
    def getStaticAttributeKey(key: Object): Object = ???

    @stub
    // Reads a set of attributes from the given object input
    // stream that have been previously written out with
    // writeAttributeSet.
    def readAttributeSet(in: ObjectInputStream, a: MutableAttributeSet): Unit = ???

    @stub
    // Registers an object as a static object that is being
    // used as a key in attribute sets.
    def registerStaticAttributeKey(key: Object): Unit = ???
}
