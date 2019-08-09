package javax.xml.stream

import java.lang.{Object, String}
import javax.xml.namespace.NamespaceContext

// The XMLStreamWriter interface specifies how to write XML.  The XMLStreamWriter  does
// not perform well formedness checking on its input.  However
// the writeCharacters method is required to escape & , < and >
// For attribute values the writeAttribute method will escape the
// above characters plus " to ensure that all character content
// and attribute values are well formed.
//
// Each NAMESPACE
// and ATTRIBUTE must be individually written.
//
// 
//     
//         
//             XML Namespaces, javax.xml.stream.isRepairingNamespaces and write method behaviour
//         
//         
//             Method <!--  method  -->
//             isRepairingNamespaces == true
//             isRepairingNamespaces == false
//         
//         
//              <!--  method  -->
//             namespaceURI bound
//             namespaceURI unbound
//             namespaceURI bound
//             namespaceURI unbound
//         
//     
//
//     
//         
//             writeAttribute(namespaceURI, localName, value)
//             <!--  isRepairingNamespaces == true  -->
//             
//                 <!--  namespaceURI bound  -->
//                 prefix:localName="value" [1]
//             
//             
//                 <!--  namespaceURI unbound  -->
//                 xmlns:{generated}="namespaceURI" {generated}:localName="value"
//             
//             <!--  isRepairingNamespaces == false  -->
//             
//                 <!--  namespaceURI bound  -->
//                 prefix:localName="value" [1]
//             
//             
//                 <!--  namespaceURI unbound  -->
//                 XMLStreamException
//             
//         
//
//         
//             writeAttribute(prefix, namespaceURI, localName, value)
//             <!--  isRepairingNamespaces == true  -->
//             
//                 <!--  namespaceURI bound  -->
//                 bound to same prefix:
//                 prefix:localName="value" [1]
//                 
//                 bound to different prefix:
//                 xmlns:{generated}="namespaceURI" {generated}:localName="value"
//             
//             
//                 <!--  namespaceURI unbound  -->
//                 xmlns:prefix="namespaceURI" prefix:localName="value" [3]
//             
//             <!--  isRepairingNamespaces == false  -->
//             
//                 <!--  namespaceURI bound  -->
//                 bound to same prefix:
//                 prefix:localName="value" [1][2]
//                 
//                 bound to different prefix:
//                 XMLStreamException[2]
//             
//             
//                 <!--  namespaceURI unbound  -->
//                 xmlns:prefix="namespaceURI" prefix:localName="value" [2][5]
//             
//         
//
//         
//             writeStartElement(namespaceURI, localName)
//                 
//                 writeEmptyElement(namespaceURI, localName)
//             <!--  isRepairingNamespaces == true  -->
//             
//                 <!--  namespaceURI bound  -->
//                 <prefix:localName> [1]
//             
//             
//                 <!--  namespaceURI unbound  -->
//                 <{generated}:localName xmlns:{generated}="namespaceURI">
//             
//             <!--  isRepairingNamespaces == false  -->
//             
//                 <!--  namespaceURI bound  -->
//                 <prefix:localName> [1]
//             
//             
//                 <!--  namespaceURI unbound  -->
//                 XMLStreamException
//             
//         
//
//         
//             writeStartElement(prefix, localName, namespaceURI)
//                 
//                 writeEmptyElement(prefix, localName, namespaceURI)
//             <!--  isRepairingNamespaces == true  -->
//             
//                 <!--  namespaceURI bound  -->
//                 bound to same prefix:
//                 <prefix:localName> [1]
//                 
//                 bound to different prefix:
//                 <{generated}:localName xmlns:{generated}="namespaceURI">
//             
//             
//                 <!--  namespaceURI unbound  -->
//                 <prefix:localName xmlns:prefix="namespaceURI"> [4]
//             
//             <!--  isRepairingNamespaces == false  -->
//             
//                 <!--  namespaceURI bound  -->
//                 bound to same prefix:
//                 <prefix:localName> [1]
//                 
//                 bound to different prefix:
//                 XMLStreamException
//             
//             
//                 <!--  namespaceURI unbound  -->
//                 <prefix:localName> 
//             
//         
//     
//     
//         
//             
//                 Notes:
//                 
//                     [1] if namespaceURI == default Namespace URI, then no prefix is written
//                     [2] if prefix == "" || null && namespaceURI == "", then no prefix or Namespace declaration is generated or written
//                     [3] if prefix == "" || null, then a prefix is randomly generated
//                     [4] if prefix == "" || null, then it is treated as the default Namespace and no prefix is generated or written, an xmlns declaration is generated and written if the namespaceURI is unbound
//                     [5] if prefix == "" || null, then it is treated as an invalid attempt to define the default Namespace and an XMLStreamException is thrown
//                 
//             
//         
//     
// 
trait XMLStreamWriter {

    @stub
    // Close this writer and free any resources associated with the
    // writer.
    def close(): Unit = ???

    @stub
    // Write any cached data to the underlying output mechanism.
    def flush(): Unit = ???

    @stub
    // Returns the current namespace context.
    def getNamespaceContext(): NamespaceContext = ???

    @stub
    // Gets the prefix the uri is bound to
    def getPrefix(uri: String): String = ???

    @stub
    // Get the value of a feature/property from the underlying implementation
    def getProperty(name: String): Object = ???

    @stub
    // Binds a URI to the default namespace
    // This URI is bound
    // in the scope of the current START_ELEMENT / END_ELEMENT pair.
    def setDefaultNamespace(uri: String): Unit = ???

    @stub
    // Sets the current namespace context for prefix and uri bindings.
    def setNamespaceContext(context: NamespaceContext): Unit = ???

    @stub
    // Sets the prefix the uri is bound to.
    def setPrefix(prefix: String, uri: String): Unit = ???

    @stub
    // Writes an attribute to the output stream without
    // a prefix.
    def writeAttribute(localName: String, value: String): Unit = ???

    @stub
    // Writes an attribute to the output stream
    def writeAttribute(namespaceURI: String, localName: String, value: String): Unit = ???

    @stub
    // Writes an attribute to the output stream
    def writeAttribute(prefix: String, namespaceURI: String, localName: String, value: String): Unit = ???

    @stub
    // Writes a CData section
    def writeCData(data: String): Unit = ???

    @stub
    // Write text to the output
    def writeCharacters(text: Array[Char], start: Int, len: Int): Unit = ???

    @stub
    // Write text to the output
    def writeCharacters(text: String): Unit = ???

    @stub
    // Writes an xml comment with the data enclosed
    def writeComment(data: String): Unit = ???

    @stub
    // Writes the default namespace to the stream
    def writeDefaultNamespace(namespaceURI: String): Unit = ???

    @stub
    // Write a DTD section.
    def writeDTD(dtd: String): Unit = ???

    @stub
    // Writes an empty element tag to the output
    def writeEmptyElement(localName: String): Unit = ???

    @stub
    // Writes an empty element tag to the output
    def writeEmptyElement(namespaceURI: String, localName: String): Unit = ???

    @stub
    // Writes an empty element tag to the output
    def writeEmptyElement(prefix: String, localName: String, namespaceURI: String): Unit = ???

    @stub
    // Closes any start tags and writes corresponding end tags.
    def writeEndDocument(): Unit = ???

    @stub
    // Writes an end tag to the output relying on the internal
    // state of the writer to determine the prefix and local name
    // of the event.
    def writeEndElement(): Unit = ???

    @stub
    // Writes an entity reference
    def writeEntityRef(name: String): Unit = ???

    @stub
    // Writes a namespace to the output stream
    // If the prefix argument to this method is the empty string,
    // "xmlns", or null this method will delegate to writeDefaultNamespace
    def writeNamespace(prefix: String, namespaceURI: String): Unit = ???

    @stub
    // Writes a processing instruction
    def writeProcessingInstruction(target: String): Unit = ???

    @stub
    // Writes a processing instruction
    def writeProcessingInstruction(target: String, data: String): Unit = ???

    @stub
    // Write the XML Declaration.
    def writeStartDocument(): Unit = ???

    @stub
    // Write the XML Declaration.
    def writeStartDocument(version: String): Unit = ???

    @stub
    // Write the XML Declaration.
    def writeStartDocument(encoding: String, version: String): Unit = ???

    @stub
    // Writes a start tag to the output.
    def writeStartElement(localName: String): Unit = ???

    @stub
    // Writes a start tag to the output
    def writeStartElement(namespaceURI: String, localName: String): Unit = ???
}
