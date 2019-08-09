package javax.xml.stream.events

import java.lang.String

// An interface for the start document event
trait StartDocument extends XMLEvent {

    @stub
    // Returns true if CharacterEncodingScheme was set in
    // the encoding declaration of the document
    def encodingSet(): Boolean = ???

    @stub
    // Returns the encoding style of the XML data
    def getCharacterEncodingScheme(): String = ???

    @stub
    // Returns the system ID of the XML data
    def getSystemId(): String = ???

    @stub
    // Returns the version of XML of this XML stream
    def getVersion(): String = ???

    @stub
    // Returns if this XML is standalone
    def isStandalone(): Boolean = ???
}
