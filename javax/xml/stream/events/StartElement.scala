package javax.xml.stream.events

import java.lang.String
import java.util.Iterator
import javax.xml.namespace.{NamespaceContext, QName}
import scala.scalanative.annotation.stub

/** The StartElement interface provides access to information about
 *  start elements.  A StartElement is reported for each Start Tag
 *  in the document.
 */
trait StartElement extends XMLEvent {

    /** Returns the attribute referred to by this name */
    @stub
    def getAttributeByName(name: QName): Attribute = ???

    /** Returns an Iterator of non-namespace declared attributes declared on
     *  this START_ELEMENT,
     *  returns an empty iterator if there are no attributes.
     */
    @stub
    def getAttributes(): Iterator = ???

    /** Get the name of this event */
    @stub
    def getName(): QName = ???

    /** Gets a read-only namespace context. */
    @stub
    def getNamespaceContext(): NamespaceContext = ???

    /** Returns an Iterator of namespaces declared on this element. */
    @stub
    def getNamespaces(): Iterator = ???

    /** Gets the value that the prefix is bound to in the
     *  context of this element.
     */
    @stub
    def getNamespaceURI(prefix: String): String = ???
}
