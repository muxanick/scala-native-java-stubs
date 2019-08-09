package javax.xml.stream.events

import java.lang.String

// An interface for handling Entity Declarations
//
// This interface is used to record and report unparsed entity declarations.
trait EntityDeclaration extends XMLEvent {

    @stub
    // Get the base URI for this reference
    // or null if this information is not available
    def getBaseURI(): String = ???

    @stub
    // The entity's name
    def getName(): String = ???

    @stub
    // The name of the associated notation.
    def getNotationName(): String = ???

    @stub
    // The entity's public identifier, or null if none was given
    def getPublicId(): String = ???

    @stub
    // The replacement text of the entity.
    def getReplacementText(): String = ???
}
