package javax.xml.bind.annotation

import java.lang.Object
import javax.xml.bind.ValidationEventHandler
import javax.xml.parsers.DocumentBuilder
import javax.xml.transform.Source
import javax.xml.transform.dom.DOMResult
import org.w3c.dom.Element

// DomHandler implementation for W3C DOM (org.w3c.dom package.)
class W3CDomHandler extends Object with DomHandler[Element, DOMResult] {

    @stub
    // Default constructor.
    def this() = ???

    @stub
    // When a JAXB provider needs to unmarshal a part of a document into an
    // infoset representation, it first calls this method to create a
    // Result object.
    def createUnmarshaller(errorHandler: ValidationEventHandler): DOMResult = ???

    @stub
    // 
    def getBuilder(): DocumentBuilder = ???

    @stub
    // Once the portion is sent to the Result.
    def getElement(r: DOMResult): Element = ???

    @stub
    // This method is called when a JAXB provider needs to marshal an element
    // to XML.
    def marshal(element: Element, errorHandler: ValidationEventHandler): Source = ???
}
