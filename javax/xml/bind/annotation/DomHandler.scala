package javax.xml.bind.annotation

import javax.xml.bind.ValidationEventHandler
import javax.xml.transform.{Result, Source}
import scala.scalanative.annotation.stub

/** Converts an element (and its descendants)
 *  from/to DOM (or similar) representation.
 * 
 *  
 *  Implementations of this interface will be used in conjunction with
 *  XmlAnyElement annotation to map an element of XML into a representation
 *  of infoset such as W3C DOM.
 * 
 *  
 *  Implementations hide how a portion of XML is converted into/from such
 *  DOM-like representation, allowing JAXB providers to work with arbitrary
 *  such library.
 * 
 *  
 *  This interface is intended to be implemented by library writers
 *  and consumed by JAXB providers. None of those methods are intended to
 *  be called from applications.
 */
trait DomHandler[ElementT, ResultT <: Result] {

    /** When a JAXB provider needs to unmarshal a part of a document into an
     *  infoset representation, it first calls this method to create a
     *  Result object.
     */
    @stub
    def createUnmarshaller(errorHandler: ValidationEventHandler): ResultT = ???

    /** Once the portion is sent to the Result. */
    @stub
    def getElement(rt: ResultT): ElementT = ???

    /** This method is called when a JAXB provider needs to marshal an element
     *  to XML.
     */
    @stub
    def marshal(n: ElementT, errorHandler: ValidationEventHandler): Source = ???
}
