package javax.swing.text

import java.lang.Object

// An interface that can be used to allow MutableAttributeSet
// implementations to use pluggable attribute compression
// techniques.  Each mutation of the attribute set can be
// used to exchange a previous AttributeSet instance with
// another, preserving the possibility of the AttributeSet
// remaining immutable.  An implementation is provided by
// the StyleContext class.
//
// The Element implementations provided by this class use
// this interface to provide their MutableAttributeSet
// implementations, so that different AttributeSet compression
// techniques can be employed.  The method
// getAttributeContext should be implemented to
// return the object responsible for implementing the desired
// compression technique.
object trait AbstractDocument.AttributeContext {

    @stub
    // Adds an attribute to the given set, and returns
    // the new representative set.
    def addAttribute(old: AttributeSet, name: Object, value: Object): AttributeSet = ???

    @stub
    // Adds a set of attributes to the element.
    def addAttributes(old: AttributeSet, attr: AttributeSet): AttributeSet = ???

    @stub
    // Fetches an empty AttributeSet.
    def getEmptySet(): AttributeSet = ???

    @stub
    // Reclaims an attribute set.
    def reclaim(a: AttributeSet): Unit = ???

    @stub
    // Removes an attribute from the set.
    def removeAttribute(old: AttributeSet, name: Object): AttributeSet = ???

    @stub
    // Removes a set of attributes for the element.
    def removeAttributes(old: AttributeSet, attrs: AttributeSet): AttributeSet = ???
}
