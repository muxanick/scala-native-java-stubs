package javax.xml.stream

import java.lang.{Object, String}
import javax.xml.namespace.NamespaceContext

/** The XMLStreamWriter interface specifies how to write XML.  The XMLStreamWriter  does
 *  not perform well formedness checking on its input.  However
 *  the writeCharacters method is required to escape & , < and >
 *  For attribute values the writeAttribute method will escape the
 *  above characters plus " to ensure that all character content
 *  and attribute values are well formed.
 * 
 *  Each NAMESPACE
 *  and ATTRIBUTE must be individually written.
 * 
 *  
 *      
 *          
 *              XML Namespaces, javax.xml.stream.isRepairingNamespaces and write method behaviour
 *          
 *          
 *              Method <!--  method  -->
 *              isRepairingNamespaces == true
 *              isRepairingNamespaces == false
 *          
 *          
 *               <!--  method  -->
 *              namespaceURI bound
 *              namespaceURI unbound
 *              namespaceURI bound
 *              namespaceURI unbound
 *          
 *      
 * 
 *      
 *          
 *              writeAttribute(namespaceURI, localName, value)
 *              <!--  isRepairingNamespaces == true  -->
 *              
 *                  <!--  namespaceURI bound  -->
 *                  prefix:localName="value" [1]
 *              
 *              
 *                  <!--  namespaceURI unbound  -->
 *                  xmlns:{generated}="namespaceURI" {generated}:localName="value"
 *              
 *              <!--  isRepairingNamespaces == false  -->
 *              
 *                  <!--  namespaceURI bound  -->
 *                  prefix:localName="value" [1]
 *              
 *              
 *                  <!--  namespaceURI unbound  -->
 *                  XMLStreamException
 *              
 *          
 * 
 *          
 *              writeAttribute(prefix, namespaceURI, localName, value)
 *              <!--  isRepairingNamespaces == true  -->
 *              
 *                  <!--  namespaceURI bound  -->
 *                  bound to same prefix:
 *                  prefix:localName="value" [1]
 *                  
 *                  bound to different prefix:
 *                  xmlns:{generated}="namespaceURI" {generated}:localName="value"
 *              
 *              
 *                  <!--  namespaceURI unbound  -->
 *                  xmlns:prefix="namespaceURI" prefix:localName="value" [3]
 *              
 *              <!--  isRepairingNamespaces == false  -->
 *              
 *                  <!--  namespaceURI bound  -->
 *                  bound to same prefix:
 *                  prefix:localName="value" [1][2]
 *                  
 *                  bound to different prefix:
 *                  XMLStreamException[2]
 *              
 *              
 *                  <!--  namespaceURI unbound  -->
 *                  xmlns:prefix="namespaceURI" prefix:localName="value" [2][5]
 *              
 *          
 * 
 *          
 *              writeStartElement(namespaceURI, localName)
 *                  
 *                  writeEmptyElement(namespaceURI, localName)
 *              <!--  isRepairingNamespaces == true  -->
 *              
 *                  <!--  namespaceURI bound  -->
 *                  <prefix:localName> [1]
 *              
 *              
 *                  <!--  namespaceURI unbound  -->
 *                  <{generated}:localName xmlns:{generated}="namespaceURI">
 *              
 *              <!--  isRepairingNamespaces == false  -->
 *              
 *                  <!--  namespaceURI bound  -->
 *                  <prefix:localName> [1]
 *              
 *              
 *                  <!--  namespaceURI unbound  -->
 *                  XMLStreamException
 *              
 *          
 * 
 *          
 *              writeStartElement(prefix, localName, namespaceURI)
 *                  
 *                  writeEmptyElement(prefix, localName, namespaceURI)
 *              <!--  isRepairingNamespaces == true  -->
 *              
 *                  <!--  namespaceURI bound  -->
 *                  bound to same prefix:
 *                  <prefix:localName> [1]
 *                  
 *                  bound to different prefix:
 *                  <{generated}:localName xmlns:{generated}="namespaceURI">
 *              
 *              
 *                  <!--  namespaceURI unbound  -->
 *                  <prefix:localName xmlns:prefix="namespaceURI"> [4]
 *              
 *              <!--  isRepairingNamespaces == false  -->
 *              
 *                  <!--  namespaceURI bound  -->
 *                  bound to same prefix:
 *                  <prefix:localName> [1]
 *                  
 *                  bound to different prefix:
 *                  XMLStreamException
 *              
 *              
 *                  <!--  namespaceURI unbound  -->
 *                  <prefix:localName> 
 *              
 *          
 *      
 *      
 *          
 *              
 *                  Notes:
 *                  
 *                      [1] if namespaceURI == default Namespace URI, then no prefix is written
 *                      [2] if prefix == "" || null && namespaceURI == "", then no prefix or Namespace declaration is generated or written
 *                      [3] if prefix == "" || null, then a prefix is randomly generated
 *                      [4] if prefix == "" || null, then it is treated as the default Namespace and no prefix is generated or written, an xmlns declaration is generated and written if the namespaceURI is unbound
 *                      [5] if prefix == "" || null, then it is treated as an invalid attempt to define the default Namespace and an XMLStreamException is thrown
 *                  
 *              
 *          
 *      
 *  
 */
trait XMLStreamWriter {

    /** Close this writer and free any resources associated with the
     *  writer.
     */
    @stub
    def close(): Unit = ???

    /** Write any cached data to the underlying output mechanism. */
    @stub
    def flush(): Unit = ???

    /** Returns the current namespace context. */
    @stub
    def getNamespaceContext(): NamespaceContext = ???

    /** Gets the prefix the uri is bound to */
    @stub
    def getPrefix(uri: String): String = ???

    /** Get the value of a feature/property from the underlying implementation */
    @stub
    def getProperty(name: String): Object = ???

    /** Binds a URI to the default namespace
     *  This URI is bound
     *  in the scope of the current START_ELEMENT / END_ELEMENT pair.
     */
    @stub
    def setDefaultNamespace(uri: String): Unit = ???

    /** Sets the current namespace context for prefix and uri bindings. */
    @stub
    def setNamespaceContext(context: NamespaceContext): Unit = ???

    /** Sets the prefix the uri is bound to. */
    @stub
    def setPrefix(prefix: String, uri: String): Unit = ???

    /** Writes an attribute to the output stream without
     *  a prefix.
     */
    @stub
    def writeAttribute(localName: String, value: String): Unit = ???

    /** Writes an attribute to the output stream */
    @stub
    def writeAttribute(namespaceURI: String, localName: String, value: String): Unit = ???

    /** Writes an attribute to the output stream */
    @stub
    def writeAttribute(prefix: String, namespaceURI: String, localName: String, value: String): Unit = ???

    /** Writes a CData section */
    @stub
    def writeCData(data: String): Unit = ???

    /** Write text to the output */
    @stub
    def writeCharacters(text: Array[Char], start: Int, len: Int): Unit = ???

    /** Write text to the output */
    @stub
    def writeCharacters(text: String): Unit = ???

    /** Writes an xml comment with the data enclosed */
    @stub
    def writeComment(data: String): Unit = ???

    /** Writes the default namespace to the stream */
    @stub
    def writeDefaultNamespace(namespaceURI: String): Unit = ???

    /** Write a DTD section. */
    @stub
    def writeDTD(dtd: String): Unit = ???

    /** Writes an empty element tag to the output */
    @stub
    def writeEmptyElement(localName: String): Unit = ???

    /** Writes an empty element tag to the output */
    @stub
    def writeEmptyElement(namespaceURI: String, localName: String): Unit = ???

    /** Writes an empty element tag to the output */
    @stub
    def writeEmptyElement(prefix: String, localName: String, namespaceURI: String): Unit = ???

    /** Closes any start tags and writes corresponding end tags. */
    @stub
    def writeEndDocument(): Unit = ???

    /** Writes an end tag to the output relying on the internal
     *  state of the writer to determine the prefix and local name
     *  of the event.
     */
    @stub
    def writeEndElement(): Unit = ???

    /** Writes an entity reference */
    @stub
    def writeEntityRef(name: String): Unit = ???

    /** Writes a namespace to the output stream
     *  If the prefix argument to this method is the empty string,
     *  "xmlns", or null this method will delegate to writeDefaultNamespace
     */
    @stub
    def writeNamespace(prefix: String, namespaceURI: String): Unit = ???

    /** Writes a processing instruction */
    @stub
    def writeProcessingInstruction(target: String): Unit = ???

    /** Writes a processing instruction */
    @stub
    def writeProcessingInstruction(target: String, data: String): Unit = ???

    /** Write the XML Declaration. */
    @stub
    def writeStartDocument(): Unit = ???

    /** Write the XML Declaration. */
    @stub
    def writeStartDocument(version: String): Unit = ???

    /** Write the XML Declaration. */
    @stub
    def writeStartDocument(encoding: String, version: String): Unit = ???

    /** Writes a start tag to the output. */
    @stub
    def writeStartElement(localName: String): Unit = ???

    /** Writes a start tag to the output */
    @stub
    def writeStartElement(namespaceURI: String, localName: String): Unit = ???
}
