package javax.xml.bind

import java.lang.Object
import javax.xml.namespace.QName

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

    /** Get xml element qname for jaxbElement. */
    def getElementName(jaxbElement: Object): QName
}

object JAXBIntrospector {
    /** Get the element value of a JAXB element. */
    @stub
    def getValue(jaxbElement: Object): Object = ???
}
