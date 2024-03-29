package javax.xml.stream.events

import java.lang.String
import scala.scalanative.annotation.stub

/** An interface that contains information about a namespace.
 *  Namespaces are accessed from a StartElement.
 */
trait Namespace extends Attribute {

    /** Gets the uri bound to the prefix of this namespace */
    @stub
    def getNamespaceURI(): String = ???

    /** Gets the prefix, returns "" if this is a default
     *  namespace declaration.
     */
    @stub
    def getPrefix(): String = ???

    /** returns true if this attribute declares the default namespace */
    @stub
    def isDefaultNamespaceDeclaration(): Boolean = ???
}
