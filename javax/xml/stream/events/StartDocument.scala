package javax.xml.stream.events

import java.lang.String
import scala.scalanative.annotation.stub

/** An interface for the start document event */
trait StartDocument extends XMLEvent {

    /** Returns true if CharacterEncodingScheme was set in
     *  the encoding declaration of the document
     */
    @stub
    def encodingSet(): Boolean = ???

    /** Returns the encoding style of the XML data */
    @stub
    def getCharacterEncodingScheme(): String = ???

    /** Returns the system ID of the XML data */
    @stub
    def getSystemId(): String = ???

    /** Returns the version of XML of this XML stream */
    @stub
    def getVersion(): String = ???

    /** Returns if this XML is standalone */
    @stub
    def isStandalone(): Boolean = ???

    /** Returns true if the standalone attribute was set in
     *  the encoding declaration of the document.
     */
    @stub
    def standaloneSet(): Boolean = ???
}
