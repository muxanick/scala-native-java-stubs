package javax.xml.stream.events

import java.io.Writer
import javax.xml.namespace.QName
import javax.xml.stream.{Location, XMLStreamConstants}
import scala.scalanative.annotation.stub

/** This is the base event interface for handling markup events.
 *  Events are value objects that are used to communicate the
 *  XML 1.0 InfoSet to the Application.  Events may be cached
 *  and referenced after the parse has completed.
 */
trait XMLEvent extends XMLStreamConstants {

    /** Returns this event as Characters, may result in
     *  a class cast exception if this event is not Characters.
     */
    @stub
    def asCharacters(): Characters = ???

    /** Returns this event as an end  element event, may result in
     *  a class cast exception if this event is not a end element.
     */
    @stub
    def asEndElement(): EndElement = ???

    /** Returns this event as a start element event, may result in
     *  a class cast exception if this event is not a start element.
     */
    @stub
    def asStartElement(): StartElement = ???

    /** Returns an integer code for this event. */
    @stub
    def getEventType(): Int = ???

    /** Return the location of this event. */
    @stub
    def getLocation(): Location = ???

    /** This method is provided for implementations to provide
     *  optional type information about the associated event.
     */
    @stub
    def getSchemaType(): QName = ???

    /** A utility function to check if this event is an Attribute. */
    @stub
    def isAttribute(): Boolean = ???

    /** A utility function to check if this event is Characters. */
    @stub
    def isCharacters(): Boolean = ???

    /** A utility function to check if this event is an EndDocument. */
    @stub
    def isEndDocument(): Boolean = ???

    /** A utility function to check if this event is a EndElement. */
    @stub
    def isEndElement(): Boolean = ???

    /** A utility function to check if this event is an EntityReference. */
    @stub
    def isEntityReference(): Boolean = ???

    /** A utility function to check if this event is a Namespace. */
    @stub
    def isNamespace(): Boolean = ???

    /** A utility function to check if this event is a ProcessingInstruction. */
    @stub
    def isProcessingInstruction(): Boolean = ???

    /** A utility function to check if this event is a StartDocument. */
    @stub
    def isStartDocument(): Boolean = ???

    /** A utility function to check if this event is a StartElement. */
    @stub
    def isStartElement(): Boolean = ???

    /** This method will write the XMLEvent as per the XML 1.0 specification as Unicode characters. */
    @stub
    def writeAsEncodedUnicode(writer: Writer): Unit = ???
}
