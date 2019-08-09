package javax.xml.stream

import scala.scalanative.annotation.stub

/** This interface declares the constants used in this API.
 *  Numbers in the range 0 to 256 are reserved for the specification,
 *  user defined events must use event codes outside that range.
 */
trait XMLStreamConstants {
}

object XMLStreamConstants {
    /** Indicates an event is an attribute */
    @stub
    val ATTRIBUTE: Int = ???

    /** Indicates an event is a CDATA section */
    @stub
    val CDATA: Int = ???

    /** Indicates an event is characters */
    @stub
    val CHARACTERS: Int = ???

    /** Indicates an event is a comment */
    @stub
    val COMMENT: Int = ???

    /** Indicates an event is a DTD */
    @stub
    val DTD: Int = ???

    /** Indicates an event is an end document */
    @stub
    val END_DOCUMENT: Int = ???

    /** Indicates an event is an end element */
    @stub
    val END_ELEMENT: Int = ???

    /** Indicates a Entity Declaration */
    @stub
    val ENTITY_DECLARATION: Int = ???

    /** Indicates an event is an entity reference */
    @stub
    val ENTITY_REFERENCE: Int = ???

    /** Indicates the event is a namespace declaration */
    @stub
    val NAMESPACE: Int = ???

    /** Indicates a Notation */
    @stub
    val NOTATION_DECLARATION: Int = ???

    /** Indicates an event is a processing instruction */
    @stub
    val PROCESSING_INSTRUCTION: Int = ???

    /** The characters are white space
     *  (see [XML], 2.10 "White Space Handling").
     */
    @stub
    val SPACE: Int = ???

    /** Indicates an event is a start document */
    @stub
    val START_DOCUMENT: Int = ???

    /** Indicates an event is a start element */
    @stub
    val START_ELEMENT: Int = ???
}
