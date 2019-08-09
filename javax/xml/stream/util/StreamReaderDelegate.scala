package javax.xml.stream.util

import java.lang.{Object, String}
import javax.xml.namespace.{NamespaceContext, QName}
import javax.xml.stream.{Location, XMLStreamReader}

// This is the base class for deriving an XMLStreamReader filter
//
// This class is designed to sit between an XMLStreamReader and an
// application's XMLStreamReader.   By default each method
// does nothing but call the corresponding method on the
// parent interface.
class StreamReaderDelegate extends Object with XMLStreamReader {

    @stub
    // Construct an empty filter with no parent.
    def this() = ???

    @stub
    // Frees any resources associated with this Reader.
    def close(): Unit = ???

    @stub
    // Returns the count of attributes on this START_ELEMENT,
    // this method is only valid on a START_ELEMENT or ATTRIBUTE.
    def getAttributeCount(): Int = ???

    @stub
    // Returns the localName of the attribute at the provided
    // index
    def getAttributeLocalName(index: Int): String = ???

    @stub
    // Returns the qname of the attribute at the provided index
    def getAttributeName(index: Int): QName = ???

    @stub
    // Returns the namespace of the attribute at the provided
    // index
    def getAttributeNamespace(index: Int): String = ???

    @stub
    // Returns the prefix of this attribute at the
    // provided index
    def getAttributePrefix(index: Int): String = ???

    @stub
    // Returns the XML type of the attribute at the provided
    // index
    def getAttributeType(index: Int): String = ???

    @stub
    // Returns the value of the attribute at the
    // index
    def getAttributeValue(index: Int): String = ???

    @stub
    // Returns the normalized attribute value of the
    // attribute with the namespace and localName
    // If the namespaceURI is null the namespace
    // is not checked for equality
    def getAttributeValue(namespaceUri: String, localName: String): String = ???

    @stub
    // Returns the character encoding declared on the xml declaration
    // Returns null if none was declared
    def getCharacterEncodingScheme(): String = ???

    @stub
    // Reads the content of a text-only element, an exception is thrown if this is
    // not a text-only element.
    def getElementText(): String = ???

    @stub
    // Return input encoding if known or null if unknown.
    def getEncoding(): String = ???

    @stub
    // Returns an integer code that indicates the type
    // of the event the cursor is pointing to.
    def getEventType(): Int = ???

    @stub
    // Returns the (local) name of the current event.
    def getLocalName(): String = ???

    @stub
    // Return the current location of the processor.
    def getLocation(): Location = ???

    @stub
    // Returns a QName for the current START_ELEMENT or END_ELEMENT event
    def getName(): QName = ???

    @stub
    // Returns a read only namespace context for the current
    // position.
    def getNamespaceContext(): NamespaceContext = ???

    @stub
    // Returns the count of namespaces declared on this START_ELEMENT or END_ELEMENT,
    // this method is only valid on a START_ELEMENT, END_ELEMENT or NAMESPACE.
    def getNamespaceCount(): Int = ???

    @stub
    // Returns the prefix for the namespace declared at the
    // index.
    def getNamespacePrefix(index: Int): String = ???

    @stub
    // If the current event is a START_ELEMENT or END_ELEMENT  this method
    // returns the URI of the prefix or the default namespace.
    def getNamespaceURI(): String = ???

    @stub
    // Returns the uri for the namespace declared at the
    // index.
    def getNamespaceURI(index: Int): String = ???

    @stub
    // Return the uri for the given prefix.
    def getNamespaceURI(prefix: String): String = ???

    @stub
    // Get the parent of this instance.
    def getParent(): XMLStreamReader = ???

    @stub
    // Get the data section of a processing instruction
    def getPIData(): String = ???

    @stub
    // Get the target of a processing instruction
    def getPITarget(): String = ???

    @stub
    // Returns the prefix of the current event or null if the event does not have a prefix
    def getPrefix(): String = ???

    @stub
    // Get the value of a feature/property from the underlying implementation
    def getProperty(name: String): Object = ???

    @stub
    // Returns the current value of the parse event as a string,
    // this returns the string value of a CHARACTERS event,
    // returns the value of a COMMENT, the replacement value
    // for an ENTITY_REFERENCE, the string value of a CDATA section,
    // the string value for a SPACE event,
    // or the String value of the internal subset of the DTD.
    def getText(): String = ???

    @stub
    // Returns an array which contains the characters from this event.
    def getTextCharacters(): Array[Char] = ???

    @stub
    // Gets the the text associated with a CHARACTERS, SPACE or CDATA event.
    def getTextCharacters(sourceStart: Int, target: Array[Char], targetStart: Int, length: Int): Int = ???

    @stub
    // Returns the length of the sequence of characters for this
    // Text event within the text character array.
    def getTextLength(): Int = ???

    @stub
    // Returns the offset into the text character array where the first
    // character (of this text event) is stored.
    def getTextStart(): Int = ???

    @stub
    // Get the xml version declared on the xml declaration
    // Returns null if none was declared
    def getVersion(): String = ???

    @stub
    // returns true if the current event has a name (is a START_ELEMENT or END_ELEMENT)
    // returns false otherwise
    def hasName(): Boolean = ???

    @stub
    // Returns true if there are more parsing events and false
    // if there are no more events.
    def hasNext(): Boolean = ???

    @stub
    // Return true if the current event has text, false otherwise
    // The following events have text:
    // CHARACTERS,DTD ,ENTITY_REFERENCE, COMMENT, SPACE
    def hasText(): Boolean = ???

    @stub
    // Returns a boolean which indicates if this
    // attribute was created by default
    def isAttributeSpecified(index: Int): Boolean = ???

    @stub
    // Returns true if the cursor points to a character data event
    def isCharacters(): Boolean = ???

    @stub
    // Returns true if the cursor points to an end tag (otherwise false)
    def isEndElement(): Boolean = ???

    @stub
    // Get the standalone declaration from the xml declaration
    def isStandalone(): Boolean = ???

    @stub
    // Returns true if the cursor points to a start tag (otherwise false)
    def isStartElement(): Boolean = ???

    @stub
    // Returns true if the cursor points to a character data event
    // that consists of all whitespace
    def isWhiteSpace(): Boolean = ???

    @stub
    // Get next parsing event - a processor may return all contiguous
    // character data in a single chunk, or it may split it into several chunks.
    def next(): Int = ???

    @stub
    // Skips any white space (isWhiteSpace() returns true), COMMENT,
    // or PROCESSING_INSTRUCTION,
    // until a START_ELEMENT or END_ELEMENT is reached.
    def nextTag(): Int = ???

    @stub
    // Test if the current event is of the given type and if the namespace and name match the current
    // namespace and name of the current event.
    def require(type: Int, namespaceURI: String, localName: String): Unit = ???

    @stub
    // Set the parent of this instance.
    def setParent(reader: XMLStreamReader): Unit = ???
}
