package javax.xml.bind

import java.io.Serializable
import java.lang.{Class, Object}
import javax.xml.namespace.QName
import scala.scalanative.annotation.stub

/** JAXB representation of an Xml Element.
 * 
 *  This class represents information about an Xml Element from both the element
 *  declaration within a schema and the element instance value within an xml document
 *  with the following properties
 *  
 *    element's xml tag name
 *    value represents the element instance's atttribute(s) and content model
 *    element declaration's declaredType (xs:element @type attribute)
 *    scope of element declaration
 *    boolean nil property. (element instance's xsi:nil attribute)
 *  
 * 
 *  The declaredType and scope property are the
 *  JAXB class binding for the xml type definition.
 *  
 * 
 *  Scope is either JAXBElement.GlobalScope or the Java class representing the
 *  complex type definition containing the schema element declaration.
 *  
 * 
 *  There is a property constraint that if value is null,
 *  then nil must be true. The converse is not true to enable
 *  representing a nil element with attribute(s). If nil is true, it is possible
 *  that value is non-null so it can hold the value of the attributes
 *  associated with a nil element.
 *  
 */
class JAXBElement[T] extends Object with Serializable {

    /** Construct an xml element instance. */
    @stub
    def this(name: QName, declaredType: Class[T], scope: Class, value: T) = ???

    /** Construct an xml element instance. */
    @stub
    def this(name: QName, declaredType: Class[T], value: T) = ???

    /** Java datatype binding for xml element declaration's type. */
    @stub
    protected val declaredType: Class[T] = ???

    /** xml element tag name */
    @stub
    protected val name: QName = ???

    /** true iff the xml element instance has xsi:nil="true". */
    @stub
    protected val nil: Boolean = ???

    /** Scope of xml element declaration representing this xml element instance. */
    @stub
    protected val scope: Class = ???

    /** xml element value. */
    @stub
    protected val value: T = ???

    /** Returns the Java binding of the xml element declaration's type attribute. */
    @stub
    def getDeclaredType(): Class[T] = ???

    /** Returns the xml element tag name. */
    @stub
    def getName(): QName = ???

    /** Returns scope of xml element declaration. */
    @stub
    def getScope(): Class = ???

    /** Return the content model and attribute values for this element. */
    @stub
    def getValue(): T = ???

    /** Returns true iff this xml element declaration is global. */
    @stub
    def isGlobalScope(): Boolean = ???

    /** Returns true iff this element instance content model
     *  is nil.
     */
    @stub
    def isNil(): Boolean = ???

    /** Returns true iff this xml element instance's value has a different
     *  type than xml element declaration's declared type.
     */
    @stub
    def isTypeSubstituted(): Boolean = ???

    /** Set whether this element has nil content. */
    @stub
    def setNil(value: Boolean): Unit = ???

    /** Set the content model and attributes of this xml element. */
    @stub
    def setValue(t: T): Unit = ???
}

object JAXBElement {
    /** Designates global scope for an xml element. */
    final object GlobalScope extends Object {

        /**  */
        @stub
        def apply() = ???

}
