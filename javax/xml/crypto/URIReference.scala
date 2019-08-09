package javax.xml.crypto

import java.lang.String

// Identifies a data object via a URI-Reference, as specified by
// RFC 2396.
//
// Note that some subclasses may not have a type attribute
// and for objects of those types, the getType() method always returns
// null.
trait URIReference {

    @stub
    // Returns the type of data referenced by this URI.
    def getType(): String = ???
}
