package javax.swing.text

import java.lang.Object
import java.util.Enumeration

// A collection of unique attributes.  This is a read-only,
// immutable interface.  An attribute is basically a key and
// a value assigned to the key.  The collection may represent
// something like a style run, a logical style, etc.  These
// are generally used to describe features that will contribute
// to some graphical representation such as a font.  The
// set of possible keys is unbounded and can be anything.
// Typically View implementations will respond to attribute
// definitions and render something to represent the attributes.
// 
// Attributes can potentially resolve in a hierarchy.  If a
// key doesn't resolve locally, and a resolving parent
// exists, the key will be resolved through the parent.
trait AttributeSet {

    @stub
    // Returns true if this set defines an attribute with the same
    // name and an equal value.
    def containsAttribute(name: Object, value: Object): Boolean = ???

    @stub
    // Returns true if this set defines all the attributes from the
    // given set with equal values.
    def containsAttributes(attributes: AttributeSet): Boolean = ???

    @stub
    // Returns an attribute set that is guaranteed not
    // to change over time.
    def copyAttributes(): AttributeSet = ???

    @stub
    // Fetches the value of the given attribute.
    def getAttribute(key: Object): Object = ???

    @stub
    // Returns the number of attributes that are defined locally in this set.
    def getAttributeCount(): Int = ???

    @stub
    // Returns an enumeration over the names of the attributes that are
    // defined locally in the set.
    def getAttributeNames(): Enumeration[_] = ???

    @stub
    // Gets the resolving parent.
    def getResolveParent(): AttributeSet = ???

    @stub
    // Checks whether the named attribute has a value specified in
    // the set without resolving through another attribute
    // set.
    def isDefined(attrName: Object): Boolean = ???
}

object AttributeSet {
    @stub
    // This interface is the type signature that is expected
    // to be present on any attribute key that contributes to
    // character level presentation.
    def AttributeSet.CharacterAttribute: trait = ???

    @stub
    // This interface is the type signature that is expected
    // to be present on any attribute key that contributes to
    // presentation of color.
    def AttributeSet.ColorAttribute: trait = ???

    @stub
    // This interface is the type signature that is expected
    // to be present on any attribute key that contributes to
    // the determination of what font to use to render some
    // text.
    def AttributeSet.FontAttribute: trait = ???

    @stub
    // Attribute name used to name the collection of
    // attributes.
    def NameAttribute: Object = ???
}
