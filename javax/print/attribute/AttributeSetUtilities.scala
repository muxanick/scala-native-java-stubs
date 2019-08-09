package javax.print.attribute

import java.lang.{Class, Object}

// Class AttributeSetUtilities provides static methods for manipulating
// AttributeSets.
// 
// Methods for creating unmodifiable and synchronized views of attribute
// sets.
// operations useful for building
// implementations of interface AttributeSet
// 
// 
// An unmodifiable view U of an AttributeSet S provides a
// client with "read-only" access to S. Query operations on U
// "read through" to S; thus, changes in S are reflected in
// U. However, any attempt to modify U,
//  results in an UnmodifiableSetException.
// The unmodifiable view object U will be serializable if the
// attribute set object S is serializable.
// 
// A synchronized view V of an attribute set S provides a
// client with synchronized (multiple thread safe) access to S. Each
// operation of V is synchronized using V itself as the lock
// object and then merely invokes the corresponding operation of S. In
// order to guarantee mutually exclusive access, it is critical that all
// access to S is accomplished through V. The synchronized view
// object V will be serializable if the attribute set object S
// is serializable.
// 
// As mentioned in the package description of javax.print, a null reference
// parameter to methods is
// incorrect unless explicitly documented on the method as having a meaningful
// interpretation.  Usage to the contrary is incorrect coding and may result in
// a run time exception either immediately
// or at some later time. IllegalArgumentException and NullPointerException
// are examples of typical and acceptable run time exceptions for such cases.
final class AttributeSetUtilities extends Object {
}

object AttributeSetUtilities {
    @stub
    // Creates a synchronized view of the given attribute set.
    def synchronizedView(attributeSet: AttributeSet): AttributeSet = ???

    @stub
    // Creates a synchronized view of the given doc attribute set.
    def synchronizedView(attributeSet: DocAttributeSet): DocAttributeSet = ???

    @stub
    // Creates a synchronized view of the given print job attribute set.
    def synchronizedView(attributeSet: PrintJobAttributeSet): PrintJobAttributeSet = ???

    @stub
    // Creates a synchronized view of the given print request attribute set.
    def synchronizedView(attributeSet: PrintRequestAttributeSet): PrintRequestAttributeSet = ???

    @stub
    // Creates a synchronized view of the given print service attribute set.
    def synchronizedView(attributeSet: PrintServiceAttributeSet): PrintServiceAttributeSet = ???

    @stub
    // Creates an unmodifiable view of the given attribute set.
    def unmodifiableView(attributeSet: AttributeSet): AttributeSet = ???

    @stub
    // Creates an unmodifiable view of the given doc attribute set.
    def unmodifiableView(attributeSet: DocAttributeSet): DocAttributeSet = ???

    @stub
    // Creates an unmodifiable view of the given print job attribute set.
    def unmodifiableView(attributeSet: PrintJobAttributeSet): PrintJobAttributeSet = ???

    @stub
    // Creates an unmodifiable view of the given print request attribute set.
    def unmodifiableView(attributeSet: PrintRequestAttributeSet): PrintRequestAttributeSet = ???

    @stub
    // Creates an unmodifiable view of the given print service attribute set.
    def unmodifiableView(attributeSet: PrintServiceAttributeSet): PrintServiceAttributeSet = ???

    @stub
    // Verify that the given object is a Class that
    // implements the given interface, which is assumed to be interface Attribute or a subinterface thereof.
    def verifyAttributeCategory(object: Object, interfaceName: Class[_]): Class[_] = ???

    @stub
    // Verify that the given object is an instance of the given interface, which
    // is assumed to be interface Attribute or a subinterface
    // thereof.
    def verifyAttributeValue(object: Object, interfaceName: Class[_]): Attribute = ???
}
