package javax.xml.stream

import java.lang.{Object, String}
import javax.xml.namespace.{NamespaceContext, QName}
import scala.scalanative.annotation.stub

/** The XMLStreamReader interface allows forward, read-only access to XML.
 *   It is designed to be the lowest level and most efficient way to
 *   read XML data.
 * 
 *   The XMLStreamReader is designed to iterate over XML using
 *  next() and hasNext().  The data can be accessed using methods such as getEventType(),
 *  getNamespaceURI(), getLocalName() and getText();
 * 
 *   The next() method causes the reader to read the next parse event.
 *  The next() method returns an integer which identifies the type of event just read.
 *   The event type can be determined using getEventType().
 *   Parsing events are defined as the XML Declaration, a DTD,
 *  start tag, character data, white space, end tag, comment,
 *  or processing instruction.  An attribute or namespace event may be encountered
 *  at the root level of a document as the result of a query operation.
 * 
 *  For XML 1.0 compliance an XML processor must pass the
 *  identifiers of declared unparsed entities, notation declarations and their
 *  associated identifiers to the application.  This information is
 *  provided through the property API on this interface.
 *  The following two properties allow access to this information:
 *  javax.xml.stream.notations and javax.xml.stream.entities.
 *  When the current event is a DTD the following call will return a
 *  list of Notations
 *   List l = (List) getProperty("javax.xml.stream.notations");
 *  The following call will return a list of entity declarations:
 *  List l = (List) getProperty("javax.xml.stream.entities");
 *  These properties can only be accessed during a DTD event and
 *  are defined to return null if the information is not available.
 * 
 *  The following table describes which methods are valid in what state.
 *  If a method is called in an invalid state the method will throw a
 *  java.lang.IllegalStateException.
 * 
 *  
 *    
 *      
 *        
 *          Valid methods for each state
 *        
 *      
 *    
 *    
 *      
 *        Event Type
 *        Valid Methods
 *      
 *      
 *         All States  
 *         getProperty(), hasNext(), require(), close(),
 *             getNamespaceURI(), isStartElement(),
 *             isEndElement(), isCharacters(), isWhiteSpace(),
 *             getNamespaceContext(), getEventType(),getLocation(),
 *             hasText(), hasName()
 *        
 *      
 *      
 *         START_ELEMENT  
 *         next(), getName(), getLocalName(), hasName(), getPrefix(),
 *             getAttributeXXX(), isAttributeSpecified(),
 *             getNamespaceXXX(),
 *             getElementText(), nextTag()
 *        
 *      
 *         ATTRIBUTE  
 *         next(), nextTag()
 *             getAttributeXXX(), isAttributeSpecified(),
 *        
 *      
 *      
 *         NAMESPACE  
 *         next(), nextTag()
 *             getNamespaceXXX()
 *        
 *      
 *      
 *         END_ELEMENT  
 *         next(), getName(), getLocalName(), hasName(), getPrefix(),
 *             getNamespaceXXX(), nextTag()
 *       
 *      
 *      
 *         CHARACTERS  
 *         next(), getTextXXX(), nextTag() 
 *      
 *      
 *         CDATA  
 *         next(), getTextXXX(), nextTag() 
 *      
 *      
 *         COMMENT  
 *         next(), getTextXXX(), nextTag() 
 *      
 *      
 *         SPACE  
 *         next(), getTextXXX(), nextTag() 
 *      
 *      
 *         START_DOCUMENT  
 *         next(), getEncoding(), getVersion(), isStandalone(), standaloneSet(),
 *             getCharacterEncodingScheme(), nextTag()
 *      
 *      
 *         END_DOCUMENT  
 *         close()
 *      
 *      
 *         PROCESSING_INSTRUCTION  
 *         next(), getPITarget(), getPIData(), nextTag() 
 *      
 *      
 *         ENTITY_REFERENCE  
 *         next(), getLocalName(), getText(), nextTag() 
 *      
 *      
 *         DTD  
 *         next(), getText(), nextTag() 
 *      
 *    
 *   
 */
trait XMLStreamReader extends XMLStreamConstants {

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
    def getAttributeValue(namespaceURI: String, localName: String): String = ???

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
    def getProperty(name: String): Any = ???

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

    /** Checks if standalone was set in the document */
    @stub
    def standaloneSet(): Boolean = ???
}
