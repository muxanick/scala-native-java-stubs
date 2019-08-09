package javax.xml.stream

import java.lang.{Object, String}
import javax.xml.namespace.{NamespaceContext, QName}

// The XMLStreamReader interface allows forward, read-only access to XML.
//  It is designed to be the lowest level and most efficient way to
//  read XML data.
//
//  The XMLStreamReader is designed to iterate over XML using
// next() and hasNext().  The data can be accessed using methods such as getEventType(),
// getNamespaceURI(), getLocalName() and getText();
//
//  The next() method causes the reader to read the next parse event.
// The next() method returns an integer which identifies the type of event just read.
//  The event type can be determined using getEventType().
//  Parsing events are defined as the XML Declaration, a DTD,
// start tag, character data, white space, end tag, comment,
// or processing instruction.  An attribute or namespace event may be encountered
// at the root level of a document as the result of a query operation.
//
// For XML 1.0 compliance an XML processor must pass the
// identifiers of declared unparsed entities, notation declarations and their
// associated identifiers to the application.  This information is
// provided through the property API on this interface.
// The following two properties allow access to this information:
// javax.xml.stream.notations and javax.xml.stream.entities.
// When the current event is a DTD the following call will return a
// list of Notations
//  List l = (List) getProperty("javax.xml.stream.notations");
// The following call will return a list of entity declarations:
// List l = (List) getProperty("javax.xml.stream.entities");
// These properties can only be accessed during a DTD event and
// are defined to return null if the information is not available.
//
// The following table describes which methods are valid in what state.
// If a method is called in an invalid state the method will throw a
// java.lang.IllegalStateException.
//
// 
//   
//     
//       
//         Valid methods for each state
//       
//     
//   
//   
//     
//       Event Type
//       Valid Methods
//     
//     
//        All States  
//        getProperty(), hasNext(), require(), close(),
//            getNamespaceURI(), isStartElement(),
//            isEndElement(), isCharacters(), isWhiteSpace(),
//            getNamespaceContext(), getEventType(),getLocation(),
//            hasText(), hasName()
//       
//     
//     
//        START_ELEMENT  
//        next(), getName(), getLocalName(), hasName(), getPrefix(),
//            getAttributeXXX(), isAttributeSpecified(),
//            getNamespaceXXX(),
//            getElementText(), nextTag()
//       
//     
//        ATTRIBUTE  
//        next(), nextTag()
//            getAttributeXXX(), isAttributeSpecified(),
//       
//     
//     
//        NAMESPACE  
//        next(), nextTag()
//            getNamespaceXXX()
//       
//     
//     
//        END_ELEMENT  
//        next(), getName(), getLocalName(), hasName(), getPrefix(),
//            getNamespaceXXX(), nextTag()
//      
//     
//     
//        CHARACTERS  
//        next(), getTextXXX(), nextTag() 
//     
//     
//        CDATA  
//        next(), getTextXXX(), nextTag() 
//     
//     
//        COMMENT  
//        next(), getTextXXX(), nextTag() 
//     
//     
//        SPACE  
//        next(), getTextXXX(), nextTag() 
//     
//     
//        START_DOCUMENT  
//        next(), getEncoding(), getVersion(), isStandalone(), standaloneSet(),
//            getCharacterEncodingScheme(), nextTag()
//     
//     
//        END_DOCUMENT  
//        close()
//     
//     
//        PROCESSING_INSTRUCTION  
//        next(), getPITarget(), getPIData(), nextTag() 
//     
//     
//        ENTITY_REFERENCE  
//        next(), getLocalName(), getText(), nextTag() 
//     
//     
//        DTD  
//        next(), getText(), nextTag() 
//     
//   
//  
trait XMLStreamReader extends XMLStreamConstants {

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
    def getAttributeValue(namespaceURI: String, localName: String): String = ???

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
}
