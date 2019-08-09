package javax.xml.stream.events

import java.lang.String
import java.util.List

/** This is the top level interface for events dealing with DTDs */
trait DTD extends XMLEvent {

    /** Returns the entire Document Type Declaration as a string, including
     *  the internal DTD subset.
     */
    @stub
    def getDocumentTypeDeclaration(): String = ???

    /** Return a List containing the general entities,
     *  both external and internal, declared in the DTD.
     */
    @stub
    def getEntities(): List = ???

    /** Return a List containing the notations declared in the DTD. */
    @stub
    def getNotations(): List = ???
}
