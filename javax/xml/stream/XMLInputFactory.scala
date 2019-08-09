package javax.xml.stream

import java.io.{InputStream, Reader}
import java.lang.{ClassLoader, Object, String}
import javax.xml.stream.util.XMLEventAllocator
import javax.xml.transform.Source

// Defines an abstract implementation of a factory for getting streams.
//
// The following table defines the standard properties of this specification.
// Each property varies in the level of support required by each implementation.
// The level of support required is described in the 'Required' column.
//
//   
//    
//      
//        
//          Configuration parameters
//        
//      
//    
//    
//      
//        Property Name
//        Behavior
//        Return type
//        Default Value
//        Required
//      
// javax.xml.stream.isValidatingTurns on/off implementation specific DTD validationBooleanFalseNo
// javax.xml.stream.isNamespaceAwareTurns on/off namespace processing for XML 1.0 supportBooleanTrueTrue (required) / False (optional)
// javax.xml.stream.isCoalescingRequires the processor to coalesce adjacent character dataBooleanFalseYes
// javax.xml.stream.isReplacingEntityReferencesreplace internal entity references with their replacement text and report them as charactersBooleanTrueYes
//javax.xml.stream.isSupportingExternalEntitiesResolve external parsed entitiesBooleanUnspecifiedYes
//javax.xml.stream.supportDTDUse this property to request processors that do not support DTDsBooleanTrueYes
//javax.xml.stream.reportersets/gets the impl of the XMLReporter javax.xml.stream.XMLReporterNullYes
//javax.xml.stream.resolversets/gets the impl of the XMLResolver interfacejavax.xml.stream.XMLResolverNullYes
//javax.xml.stream.allocatorsets/gets the impl of the XMLEventAllocator interfacejavax.xml.stream.util.XMLEventAllocatorNullYes
//    
//  
abstract class XMLInputFactory extends Object {

    // Create a filtered event reader that wraps the filter around the event reader
    def createFilteredReader(reader: XMLEventReader, filter: EventFilter): XMLEventReader

    // Create a filtered reader that wraps the filter around the reader
    def createFilteredReader(reader: XMLStreamReader, filter: StreamFilter): XMLStreamReader

    // Create a new XMLEventReader from a java.io.InputStream
    def createXMLEventReader(stream: InputStream): XMLEventReader

    // Create a new XMLEventReader from a java.io.InputStream
    def createXMLEventReader(stream: InputStream, encoding: String): XMLEventReader

    // Create a new XMLEventReader from a reader
    def createXMLEventReader(reader: Reader): XMLEventReader

    // Create a new XMLEventReader from a JAXP source.
    def createXMLEventReader(source: Source): XMLEventReader

    // Create a new XMLEventReader from a java.io.InputStream
    def createXMLEventReader(systemId: String, stream: InputStream): XMLEventReader

    // Create a new XMLEventReader from a reader
    def createXMLEventReader(systemId: String, reader: Reader): XMLEventReader

    // Create a new XMLEventReader from an XMLStreamReader.
    def createXMLEventReader(reader: XMLStreamReader): XMLEventReader

    // Create a new XMLStreamReader from a java.io.InputStream
    def createXMLStreamReader(stream: InputStream): XMLStreamReader

    // Create a new XMLStreamReader from a java.io.InputStream
    def createXMLStreamReader(stream: InputStream, encoding: String): XMLStreamReader

    // Create a new XMLStreamReader from a reader
    def createXMLStreamReader(reader: Reader): XMLStreamReader

    // Create a new XMLStreamReader from a JAXP source.
    def createXMLStreamReader(source: Source): XMLStreamReader

    // Create a new XMLStreamReader from a java.io.InputStream
    def createXMLStreamReader(systemId: String, stream: InputStream): XMLStreamReader

    // Create a new XMLStreamReader from a java.io.InputStream
    def createXMLStreamReader(systemId: String, reader: Reader): XMLStreamReader

    // Gets the allocator used by streams created with this factory
    def getEventAllocator(): XMLEventAllocator

    // Get the value of a feature/property from the underlying implementation
    def getProperty(name: String): Object

    // The reporter that will be set on any XMLStreamReader or XMLEventReader created
    // by this factory instance.
    def getXMLReporter(): XMLReporter

    // The resolver that will be set on any XMLStreamReader or XMLEventReader created
    // by this factory instance.
    def getXMLResolver(): XMLResolver

    // Query the set of properties that this factory supports.
    def isPropertySupported(name: String): Boolean

    // Set a user defined event allocator for events
    def setEventAllocator(allocator: XMLEventAllocator): Unit

    // Allows the user to set specific feature/property on the underlying
    // implementation.
    def setProperty(name: String, value: Object): Unit

    // The reporter that will be set on any XMLStreamReader or XMLEventReader created
    // by this factory instance.
    def setXMLReporter(reporter: XMLReporter): Unit
}

object XMLInputFactory {
    @stub
    // The property used to set/get the implementation of the allocator
    def ALLOCATOR: String = ???

    @stub
    // The property that requires the parser to coalesce adjacent character data sections
    def IS_COALESCING: String = ???

    @stub
    // The property used to turn on/off namespace support,
    // this is to support XML 1.0 documents,
    // only the true setting must be supported
    def IS_NAMESPACE_AWARE: String = ???

    @stub
    // Requires the parser to replace internal
    // entity references with their replacement
    // text and report them as characters
    def IS_REPLACING_ENTITY_REFERENCES: String = ???

    @stub
    // The property that requires the parser to resolve external parsed entities
    def IS_SUPPORTING_EXTERNAL_ENTITIES: String = ???

    @stub
    // The property used to turn on/off implementation specific validation
    def IS_VALIDATING: String = ???

    @stub
    // The property used to
    // set/get the implementation of the XMLReporter interface
    def REPORTER: String = ???

    @stub
    // The property used to set/get the implementation of the XMLResolver
    def RESOLVER: String = ???

    @stub
    // Create a new instance of the factory.
    def newFactory(): XMLInputFactory = ???

    @stub
    // Create a new instance of the factory.
    def newFactory(factoryId: String, classLoader: ClassLoader): XMLInputFactory = ???

    @stub
    // Creates a new instance of the factory in exactly the same manner as the
    // newFactory() method.
    def newInstance(): XMLInputFactory = ???

    @stub
    // Deprecated. 
    //This method has been deprecated to maintain API consistency.
    //              All newInstance methods have been replaced with corresponding
    //              newFactory methods. The replacement newFactory(java.lang.String, java.lang.ClassLoader) method
    //              defines no changes in behavior.
    //
    def newInstance(factoryId: String, classLoader: ClassLoader): XMLInputFactory = ???
}
