package javax.xml.bind

import java.lang.Object
import javax.xml.namespace.QName
import scala.scalanative.annotation.stub

/** Provide access to JAXB xml binding data for a JAXB object.
 * 
 *  
 *  Intially, the intent of this class is to just conceptualize how
 *  a JAXB application developer can access xml binding information,
 *  independent if binding model is java to schema or schema to java.
 *  Since accessing the XML element name related to a JAXB element is
 *  a highly requested feature, demonstrate access to this
 *  binding information.
 * 
 *  The factory method to get a JAXBIntrospector instance is
 *  JAXBContext.createJAXBIntrospector().
 */
abstract class JAXBIntrospector extends Object {

    /**  */
    @stub
    def this() = ???

    /** Get xml element qname for jaxbElement. */
    def getElementName(jaxbElement: Any): QName

    /** Return true if object represents a JAXB element. */
    def isElement(object: Any): Boolean
}

object JAXBIntrospector {
    /** Get the element value of a JAXB element. */
    @stub
    def getValue(jaxbElement: Any): Any = ???
}
