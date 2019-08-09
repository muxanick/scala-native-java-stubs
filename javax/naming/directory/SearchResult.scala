package javax.naming.directory

import java.lang.{Object, String}
import javax.naming.{Binding, NameClassPair}

// This class represents an item in the NamingEnumeration returned as a
// result of the DirContext.search() methods.
//
// A SearchResult instance is not synchronized against concurrent
// multithreaded access. Multiple threads trying to access and modify
// a single SearchResult instance should lock the object.
class SearchResult extends Binding {

    @stub
    // Constructs a search result using the result's name, its bound object, and
    // its attributes.
    def this(name: String, obj: Object, attrs: Attributes) = ???

    @stub
    // Constructs a search result using the result's name, its bound object, and
    // its attributes, and whether the name is relative.
    def this(name: String, obj: Object, attrs: Attributes, isRelative: Boolean) = ???

    @stub
    // Constructs a search result using the result's name, its class name,
    // its bound object, and its attributes.
    def this(name: String, className: String, obj: Object, attrs: Attributes) = ???

    @stub
    // Retrieves the attributes in this search result.
    def getAttributes(): Attributes = ???

    @stub
    // Sets the attributes of this search result to attrs.
    def setAttributes(attrs: Attributes): Unit = ???
}
