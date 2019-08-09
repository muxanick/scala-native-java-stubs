package javax.print.attribute

import java.io.Serializable
import java.lang.{Cloneable, Object}
import java.net.URI

// Class URISyntax is an abstract base class providing the common
// implementation of all attributes whose value is a Uniform Resource
// Identifier (URI). Once constructed, a URI attribute's value is immutable.
// 
abstract class URISyntax extends Object with Serializable, with Cloneable {

    // Returns whether this URI attribute is equivalent to the passed in
    // object.
    def equals(object: Object): Boolean

    // Returns this URI attribute's URI value.
    def getURI(): URI

    // Returns a hashcode for this URI attribute.
    def hashCode(): Int
}