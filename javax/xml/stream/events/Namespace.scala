package javax.xml.stream.events

import java.lang.String

// An interface that contains information about a namespace.
// Namespaces are accessed from a StartElement.
trait Namespace extends Attribute {

    @stub
    // Gets the uri bound to the prefix of this namespace
    def getNamespaceURI(): String = ???

    @stub
    // Gets the prefix, returns "" if this is a default
    // namespace declaration.
    def getPrefix(): String = ???
}
