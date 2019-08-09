package javax.swing.text

import java.lang.Object
import java.util.Enumeration
import scala.scalanative.annotation.stub

/** An interface that can be used to allow MutableAttributeSet
 *  implementations to use pluggable attribute compression
 *  techniques.  Each mutation of the attribute set can be
 *  used to exchange a previous AttributeSet instance with
 *  another, preserving the possibility of the AttributeSet
 *  remaining immutable.  An implementation is provided by
 *  the StyleContext class.
 * 
 *  The Element implementations provided by this class use
 *  this interface to provide their MutableAttributeSet
 *  implementations, so that different AttributeSet compression
 *  techniques can be employed.  The method
 *  getAttributeContext should be implemented to
 *  return the object responsible for implementing the desired
 *  compression technique.
 */
object trait AbstractDocument.AttributeContext {

    /** Adds an attribute to the given set, and returns
     *  the new representative set.
     */
    @stub
    def addAttribute(old: AttributeSet, name: Object, value: Object): AttributeSet = ???

    /** Adds a set of attributes to the element. */
    @stub
    def addAttributes(old: AttributeSet, attr: AttributeSet): AttributeSet = ???

    /** Fetches an empty AttributeSet. */
    @stub
    def getEmptySet(): AttributeSet = ???

    /** Reclaims an attribute set. */
    @stub
    def reclaim(a: AttributeSet): Unit = ???

    /** Removes an attribute from the set. */
    @stub
    def removeAttribute(old: AttributeSet, name: Object): AttributeSet = ???

    /** Removes a set of attributes for the element. */
    @stub
    def removeAttributes(old: AttributeSet, attrs: AttributeSet): AttributeSet = ???

    /** Removes a set of attributes for the element. */
    @stub
    def removeAttributes(old: AttributeSet, names: Enumeration[_]): AttributeSet = ???
}
