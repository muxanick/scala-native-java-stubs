package javax.swing.text

import java.lang.Object
import java.util.Enumeration
import scala.scalanative.annotation.stub

/** A generic interface for a mutable collection of unique attributes.
 * 
 *  Implementations will probably want to provide a constructor of the
 *  form:
 *  public XXXAttributeSet(ConstAttributeSet source);
 */
trait MutableAttributeSet extends AttributeSet {

    /** Creates a new attribute set similar to this one except that it contains
     *  an attribute with the given name and value.
     */
    @stub
    def addAttribute(name: Any, value: Any): Unit = ???

    /** Creates a new attribute set similar to this one except that it contains
     *  the given attributes and values.
     */
    @stub
    def addAttributes(attributes: AttributeSet): Unit = ???

    /** Removes an attribute with the given name. */
    @stub
    def removeAttribute(name: Any): Unit = ???

    /** Removes a set of attributes with the given name. */
    @stub
    def removeAttributes(attributes: AttributeSet): Unit = ???

    /** Removes an attribute set with the given names. */
    @stub
    def removeAttributes(names: Enumeration[_]): Unit = ???

    /** Sets the resolving parent. */
    @stub
    def setResolveParent(parent: AttributeSet): Unit = ???
}
