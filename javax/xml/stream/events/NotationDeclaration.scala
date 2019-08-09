package javax.xml.stream.events

import java.lang.String

// An interface for handling Notation Declarations
//
// Receive notification of a notation declaration event.
// It is up to the application to record the notation for later reference,
// At least one of publicId and systemId must be non-null.
// There is no guarantee that the notation declaration
// will be reported before any unparsed entities that use it.
trait NotationDeclaration extends XMLEvent {

    @stub
    // The notation name.
    def getName(): String = ???

    @stub
    // The notation's public identifier, or null if none was given.
    def getPublicId(): String = ???
}
