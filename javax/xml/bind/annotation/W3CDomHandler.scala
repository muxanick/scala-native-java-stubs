package javax.xml.bind.annotation

import java.lang.Object
import javax.xml.bind.ValidationEventHandler
import javax.xml.parsers.DocumentBuilder
import javax.xml.transform.Source
import javax.xml.transform.dom.DOMResult
import scala.scalanative.annotation.stub

/** DomHandler implementation for W3C DOM (org.w3c.dom package.) */
class W3CDomHandler extends Object with DomHandler[Element, DOMResult] {

    /** Default constructor. */
    @stub
    def this() = ???

    /** Constructor that allows applications to specify which DOM implementation
     *  to be used.
     */
    @stub
    def this(builder: DocumentBuilder) = ???

    /** When a JAXB provider needs to unmarshal a part of a document into an
     *  infoset representation, it first calls this method to create a
     *  Result object.
     */
    @stub
    def createUnmarshaller(errorHandler: ValidationEventHandler): DOMResult = ???

    /**  */
    @stub
    def getBuilder(): DocumentBuilder = ???

    /** Once the portion is sent to the Result. */
    @stub
    def getElement(r: DOMResult): Element = ???

    /** This method is called when a JAXB provider needs to marshal an element
     *  to XML.
     */
    @stub
    def marshal(element: Element, errorHandler: ValidationEventHandler): Source = ???

    /**  */
    @stub
    def setBuilder(builder: DocumentBuilder): Unit = ???
}
