package javax.xml.stream.util

import java.lang.{Object, String}
import javax.xml.namespace.{NamespaceContext, QName}
import javax.xml.stream.{Location, XMLStreamReader}

/** This is the base class for deriving an XMLStreamReader filter
 * 
 *  This class is designed to sit between an XMLStreamReader and an
 *  application's XMLStreamReader.   By default each method
 *  does nothing but call the corresponding method on the
 *  parent interface.
 */
class StreamReaderDelegate extends Object with XMLStreamReader {

    /** Construct an empty filter with no parent. */
    @stub
    def this() = ???

    /** Frees any resources associated with this Reader. */
    @stub
    def close(): Unit = ???

    /** Returns the count of attributes on this START_ELEMENT,
     *  this method is only valid on a START_ELEMENT or ATTRIBUTE.
     */
    @stub
    def getAttributeCount(): Int = ???

    /** Returns the localName of the attribute at the provided
     *  index
     */
    @stub
    def getAttributeLocalName(index: Int): String = ???

    /** Returns the qname of the attribute at the provided index */
    @stub
    def getAttributeName(index: Int): QName = ???

    /** Returns the namespace of the attribute at the provided
     *  index
     */
    @stub
    def getAttributeNamespace(index: Int): String = ???

    /** Returns the prefix of this attribute at the
     *  provided index
     */
    @stub
    def getAttributePrefix(index: Int): String = ???

    /** Returns the XML type of the attribute at the provided
     *  index
     */
    @stub
    def getAttributeType(index: Int): String = ???

    /** Returns the value of the attribute at the
     *  index
     */
    @stub
    def getAttributeValue(index: Int): String = ???

    /** Returns the normalized attribute value of the
     *  attribute with the namespace and localName
     *  If the namespaceURI is null the namespace
     *  is not checked for equality
     */
    @stub
    def getAttributeValue(namespaceUri: String, localName: String): String = ???

    /** Returns the character encoding declared on the xml declaration
     *  Returns null if none was declared
     */
    @stub
    def getCharacterEncodingScheme(): String = ???

    /** Reads the content of a text-only element, an exception is thrown if this is
     *  not a text-only element.
     */
    @stub
    def getElementText(): String = ???

    /** Return input encoding if known or null if unknown. */
    @stub
    def getEncoding(): String = ???

    /** Returns an integer code that indicates the type
     *  of the event the cursor is pointing to.
     */
    @stub
    def getEventType(): Int = ???

    /** Returns the (local) name of the current event. */
    @stub
    def getLocalName(): String = ???

    /** Return the current location of the processor. */
    @stub
    def getLocation(): Location = ???

    /** Returns a QName for the current START_ELEMENT or END_ELEMENT event */
    @stub
    def getName(): QName = ???

    /** Returns a read only namespace context for the current
     *  position.
     */
    @stub
    def getNamespaceContext(): NamespaceContext = ???

    /** Returns the count of namespaces declared on this START_ELEMENT or END_ELEMENT,
     *  this method is only valid on a START_ELEMENT, END_ELEMENT or NAMESPACE.
     */
    @stub
    def getNamespaceCount(): Int = ???

    /** Returns the prefix for the namespace declared at the
     *  index.
     */
    @stub
    def getNamespacePrefix(index: Int): String = ???

    /** If the current event is a START_ELEMENT or END_ELEMENT  this method
     *  returns the URI of the prefix or the default namespace.
     */
    @stub
    def getNamespaceURI(): String = ???

    /** Returns the uri for the namespace declared at the
     *  index.
     */
    @stub
    def getNamespaceURI(index: Int): String = ???

    /** Return the uri for the given prefix. */
    @stub
    def getNamespaceURI(prefix: String): String = ???

    /** Get the parent of this instance. */
    @stub
    def getParent(): XMLStreamReader = ???

    /** Get the data section of a processing instruction */
    @stub
    def getPIData(): String = ???

    /** Get the target of a processing instruction */
    @stub
    def getPITarget(): String = ???

    /** Returns the prefix of the current event or null if the event does not have a prefix */
    @stub
    def getPrefix(): String = ???

    /** Get the value of a feature/property from the underlying implementation */
    @stub
    def getProperty(name: String): Object = ???

    /** Returns the current value of the parse event as a string,
     *  this returns the string value of a CHARACTERS event,
     *  returns the value of a COMMENT, the replacement value
     *  for an ENTITY_REFERENCE, the string value of a CDATA section,
     *  the string value for a SPACE event,
     *  or the String value of the internal subset of the DTD.
     */
    @stub
    def getText(): String = ???

    /** Returns an array which contains the characters from this event. */
    @stub
    def getTextCharacters(): Array[Char] = ???

    /** Gets the the text associated with a CHARACTERS, SPACE or CDATA event. */
    @stub
    def getTextCharacters(sourceStart: Int, target: Array[Char], targetStart: Int, length: Int): Int = ???

    /** Returns the length of the sequence of characters for this
     *  Text event within the text character array.
     */
    @stub
    def getTextLength(): Int = ???

    /** Returns the offset into the text character array where the first
     *  character (of this text event) is stored.
     */
    @stub
    def getTextStart(): Int = ???

    /** Get the xml version declared on the xml declaration
     *  Returns null if none was declared
     */
    @stub
    def getVersion(): String = ???

    /** returns true if the current event has a name (is a START_ELEMENT or END_ELEMENT)
     *  returns false otherwise
     */
    @stub
    def hasName(): Boolean = ???

    /** Returns true if there are more parsing events and false
     *  if there are no more events.
     */
    @stub
    def hasNext(): Boolean = ???

    /** Return true if the current event has text, false otherwise
     *  The following events have text:
     *  CHARACTERS,DTD ,ENTITY_REFERENCE, COMMENT, SPACE
     */
    @stub
    def hasText(): Boolean = ???

    /** Returns a boolean which indicates if this
     *  attribute was created by default
     */
    @stub
    def isAttributeSpecified(index: Int): Boolean = ???

    /** Returns true if the cursor points to a character data event */
    @stub
    def isCharacters(): Boolean = ???

    /** Returns true if the cursor points to an end tag (otherwise false) */
    @stub
    def isEndElement(): Boolean = ???

    /** Get the standalone declaration from the xml declaration */
    @stub
    def isStandalone(): Boolean = ???

    /** Returns true if the cursor points to a start tag (otherwise false) */
    @stub
    def isStartElement(): Boolean = ???

    /** Returns true if the cursor points to a character data event
     *  that consists of all whitespace
     */
    @stub
    def isWhiteSpace(): Boolean = ???

    /** Get next parsing event - a processor may return all contiguous
     *  character data in a single chunk, or it may split it into several chunks.
     */
    @stub
    def next(): Int = ???

    /** Skips any white space (isWhiteSpace() returns true), COMMENT,
     *  or PROCESSING_INSTRUCTION,
     *  until a START_ELEMENT or END_ELEMENT is reached.
     */
    @stub
    def nextTag(): Int = ???

    /** Test if the current event is of the given type and if the namespace and name match the current
     *  namespace and name of the current event.
     */
    @stub
    def require(type: Int, namespaceURI: String, localName: String): Unit = ???

    /** Set the parent of this instance. */
    @stub
    def setParent(reader: XMLStreamReader): Unit = ???
}
