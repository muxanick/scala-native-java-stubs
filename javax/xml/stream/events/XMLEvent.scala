package javax.xml.stream.events

import javax.xml.namespace.QName
import javax.xml.stream.{Location, XMLStreamConstants}

// This is the base event interface for handling markup events.
// Events are value objects that are used to communicate the
// XML 1.0 InfoSet to the Application.  Events may be cached
// and referenced after the parse has completed.
trait XMLEvent extends XMLStreamConstants {

    @stub
    // Returns this event as Characters, may result in
    // a class cast exception if this event is not Characters.
    def asCharacters(): Characters = ???

    @stub
    // Returns this event as an end  element event, may result in
    // a class cast exception if this event is not a end element.
    def asEndElement(): EndElement = ???

    @stub
    // Returns this event as a start element event, may result in
    // a class cast exception if this event is not a start element.
    def asStartElement(): StartElement = ???

    @stub
    // Returns an integer code for this event.
    def getEventType(): Int = ???

    @stub
    // Return the location of this event.
    def getLocation(): Location = ???

    @stub
    // This method is provided for implementations to provide
    // optional type information about the associated event.
    def getSchemaType(): QName = ???

    @stub
    // A utility function to check if this event is an Attribute.
    def isAttribute(): Boolean = ???

    @stub
    // A utility function to check if this event is Characters.
    def isCharacters(): Boolean = ???

    @stub
    // A utility function to check if this event is an EndDocument.
    def isEndDocument(): Boolean = ???

    @stub
    // A utility function to check if this event is a EndElement.
    def isEndElement(): Boolean = ???

    @stub
    // A utility function to check if this event is an EntityReference.
    def isEntityReference(): Boolean = ???

    @stub
    // A utility function to check if this event is a Namespace.
    def isNamespace(): Boolean = ???

    @stub
    // A utility function to check if this event is a ProcessingInstruction.
    def isProcessingInstruction(): Boolean = ???

    @stub
    // A utility function to check if this event is a StartDocument.
    def isStartDocument(): Boolean = ???

    @stub
    // A utility function to check if this event is a StartElement.
    def isStartElement(): Boolean = ???
}
