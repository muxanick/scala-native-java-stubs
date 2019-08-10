package javax.print.attribute

import java.lang.{Class, Object}
import scala.scalanative.annotation.stub

/** Class AttributeSetUtilities provides static methods for manipulating
 *  AttributeSets.
 *  
 *  Methods for creating unmodifiable and synchronized views of attribute
 *  sets.
 *  operations useful for building
 *  implementations of interface AttributeSet
 *  
 *  
 *  An unmodifiable view U of an AttributeSet S provides a
 *  client with "read-only" access to S. Query operations on U
 *  "read through" to S; thus, changes in S are reflected in
 *  U. However, any attempt to modify U,
 *   results in an UnmodifiableSetException.
 *  The unmodifiable view object U will be serializable if the
 *  attribute set object S is serializable.
 *  
 *  A synchronized view V of an attribute set S provides a
 *  client with synchronized (multiple thread safe) access to S. Each
 *  operation of V is synchronized using V itself as the lock
 *  object and then merely invokes the corresponding operation of S. In
 *  order to guarantee mutually exclusive access, it is critical that all
 *  access to S is accomplished through V. The synchronized view
 *  object V will be serializable if the attribute set object S
 *  is serializable.
 *  
 *  As mentioned in the package description of javax.print, a null reference
 *  parameter to methods is
 *  incorrect unless explicitly documented on the method as having a meaningful
 *  interpretation.  Usage to the contrary is incorrect coding and may result in
 *  a run time exception either immediately
 *  or at some later time. IllegalArgumentException and NullPointerException
 *  are examples of typical and acceptable run time exceptions for such cases.
 */
final class AttributeSetUtilities extends Object {
}

object AttributeSetUtilities {
    /** Creates a synchronized view of the given attribute set. */
    @stub
    def synchronizedView(attributeSet: AttributeSet): AttributeSet = ???

    /** Creates a synchronized view of the given doc attribute set. */
    @stub
    def synchronizedView(attributeSet: DocAttributeSet): DocAttributeSet = ???

    /** Creates a synchronized view of the given print job attribute set. */
    @stub
    def synchronizedView(attributeSet: PrintJobAttributeSet): PrintJobAttributeSet = ???

    /** Creates a synchronized view of the given print request attribute set. */
    @stub
    def synchronizedView(attributeSet: PrintRequestAttributeSet): PrintRequestAttributeSet = ???

    /** Creates a synchronized view of the given print service attribute set. */
    @stub
    def synchronizedView(attributeSet: PrintServiceAttributeSet): PrintServiceAttributeSet = ???

    /** Creates an unmodifiable view of the given attribute set. */
    @stub
    def unmodifiableView(attributeSet: AttributeSet): AttributeSet = ???

    /** Creates an unmodifiable view of the given doc attribute set. */
    @stub
    def unmodifiableView(attributeSet: DocAttributeSet): DocAttributeSet = ???

    /** Creates an unmodifiable view of the given print job attribute set. */
    @stub
    def unmodifiableView(attributeSet: PrintJobAttributeSet): PrintJobAttributeSet = ???

    /** Creates an unmodifiable view of the given print request attribute set. */
    @stub
    def unmodifiableView(attributeSet: PrintRequestAttributeSet): PrintRequestAttributeSet = ???

    /** Creates an unmodifiable view of the given print service attribute set. */
    @stub
    def unmodifiableView(attributeSet: PrintServiceAttributeSet): PrintServiceAttributeSet = ???

    /** Verify that the given object is a Class that
     *  implements the given interface, which is assumed to be interface Attribute or a subinterface thereof.
     */
    @stub
    def verifyAttributeCategory(object: Any, interfaceName: Class[_]): Class[_] = ???

    /** Verify that the given object is an instance of the given interface, which
     *  is assumed to be interface Attribute or a subinterface
     *  thereof.
     */
    @stub
    def verifyAttributeValue(object: Any, interfaceName: Class[_]): Attribute = ???

    /** Verify that the given attribute category object is equal to the
     *  category of the given attribute value object.
     */
    @stub
    def verifyCategoryForValue(category: Class[_], attribute: Attribute): Unit = ???
}
