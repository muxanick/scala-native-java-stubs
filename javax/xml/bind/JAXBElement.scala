package javax.xml.bind

import java.io.Serializable
import java.lang.{Class, Object}
import javax.xml.namespace.QName

// JAXB representation of an Xml Element.
//
// This class represents information about an Xml Element from both the element
// declaration within a schema and the element instance value within an xml document
// with the following properties
// 
//   element's xml tag name
//   value represents the element instance's atttribute(s) and content model
//   element declaration's declaredType (xs:element @type attribute)
//   scope of element declaration
//   boolean nil property. (element instance's xsi:nil attribute)
// 
//
// The declaredType and scope property are the
// JAXB class binding for the xml type definition.
// 
//
// Scope is either JAXBElement.GlobalScope or the Java class representing the
// complex type definition containing the schema element declaration.
// 
//
// There is a property constraint that if value is null,
// then nil must be true. The converse is not true to enable
// representing a nil element with attribute(s). If nil is true, it is possible
// that value is non-null so it can hold the value of the attributes
// associated with a nil element.
// 
class JAXBElement[T] extends Object with Serializable {

    @stub
    // Construct an xml element instance.
    def this(name: QName, declaredType: Class[T], scope: Class, value: T) = ???

    @stub
    // Java datatype binding for xml element declaration's type.
    protected def declaredType: Class[T] = ???

    @stub
    // xml element tag name
    protected def name: QName = ???

    @stub
    // true iff the xml element instance has xsi:nil="true".
    protected def nil: Boolean = ???

    @stub
    // Scope of xml element declaration representing this xml element instance.
    protected def scope: Class = ???

    @stub
    // Returns the Java binding of the xml element declaration's type attribute.
    def getDeclaredType(): Class[T] = ???

    @stub
    // Returns the xml element tag name.
    def getName(): QName = ???

    @stub
    // Returns scope of xml element declaration.
    def getScope(): Class = ???

    @stub
    // Return the content model and attribute values for this element.
    def getValue(): T = ???

    @stub
    // Returns true iff this xml element declaration is global.
    def isGlobalScope(): Boolean = ???

    @stub
    // Returns true iff this element instance content model
    // is nil.
    def isNil(): Boolean = ???

    @stub
    // Returns true iff this xml element instance's value has a different
    // type than xml element declaration's declared type.
    def isTypeSubstituted(): Boolean = ???

    @stub
    // Set whether this element has nil content.
    def setNil(value: Boolean): Unit = ???
}
