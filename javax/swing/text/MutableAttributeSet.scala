package javax.swing.text

import java.lang.Object
import java.util.Enumeration

// A generic interface for a mutable collection of unique attributes.
//
// Implementations will probably want to provide a constructor of the
// form:
// public XXXAttributeSet(ConstAttributeSet source);
trait MutableAttributeSet extends AttributeSet {

    @stub
    // Creates a new attribute set similar to this one except that it contains
    // an attribute with the given name and value.
    def addAttribute(name: Object, value: Object): Unit = ???

    @stub
    // Creates a new attribute set similar to this one except that it contains
    // the given attributes and values.
    def addAttributes(attributes: AttributeSet): Unit = ???

    @stub
    // Removes an attribute with the given name.
    def removeAttribute(name: Object): Unit = ???

    @stub
    // Removes a set of attributes with the given name.
    def removeAttributes(attributes: AttributeSet): Unit = ???

    @stub
    // Removes an attribute set with the given names.
    def removeAttributes(names: Enumeration[_]): Unit = ???
}
