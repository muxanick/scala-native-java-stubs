package javax.xml.stream.events

import java.lang.String
import java.util.List

// This is the top level interface for events dealing with DTDs
trait DTD extends XMLEvent {

    @stub
    // Returns the entire Document Type Declaration as a string, including
    // the internal DTD subset.
    def getDocumentTypeDeclaration(): String = ???

    @stub
    // Return a List containing the general entities,
    // both external and internal, declared in the DTD.
    def getEntities(): List = ???

    @stub
    // Return a List containing the notations declared in the DTD.
    def getNotations(): List = ???
}
