package javax.xml.stream

// This interface declares the constants used in this API.
// Numbers in the range 0 to 256 are reserved for the specification,
// user defined events must use event codes outside that range.
trait XMLStreamConstants {
}

object XMLStreamConstants {
    @stub
    // Indicates an event is an attribute
    def ATTRIBUTE: Int = ???

    @stub
    // Indicates an event is a CDATA section
    def CDATA: Int = ???

    @stub
    // Indicates an event is characters
    def CHARACTERS: Int = ???

    @stub
    // Indicates an event is a comment
    def COMMENT: Int = ???

    @stub
    // Indicates an event is a DTD
    def DTD: Int = ???

    @stub
    // Indicates an event is an end document
    def END_DOCUMENT: Int = ???

    @stub
    // Indicates an event is an end element
    def END_ELEMENT: Int = ???

    @stub
    // Indicates a Entity Declaration
    def ENTITY_DECLARATION: Int = ???

    @stub
    // Indicates an event is an entity reference
    def ENTITY_REFERENCE: Int = ???

    @stub
    // Indicates the event is a namespace declaration
    def NAMESPACE: Int = ???

    @stub
    // Indicates a Notation
    def NOTATION_DECLARATION: Int = ???

    @stub
    // Indicates an event is a processing instruction
    def PROCESSING_INSTRUCTION: Int = ???

    @stub
    // The characters are white space
    // (see [XML], 2.10 "White Space Handling").
    def SPACE: Int = ???

    @stub
    // Indicates an event is a start document
    def START_DOCUMENT: Int = ???
}
