package javax.xml.stream.events

import java.util.Iterator
import javax.xml.namespace.{NamespaceContext, QName}

// The StartElement interface provides access to information about
// start elements.  A StartElement is reported for each Start Tag
// in the document.
trait StartElement extends XMLEvent {

    @stub
    // Returns the attribute referred to by this name
    def getAttributeByName(name: QName): Attribute = ???

    @stub
    // Returns an Iterator of non-namespace declared attributes declared on
    // this START_ELEMENT,
    // returns an empty iterator if there are no attributes.
    def getAttributes(): Iterator = ???

    @stub
    // Get the name of this event
    def getName(): QName = ???

    @stub
    // Gets a read-only namespace context.
    def getNamespaceContext(): NamespaceContext = ???

    @stub
    // Returns an Iterator of namespaces declared on this element.
    def getNamespaces(): Iterator = ???
}
