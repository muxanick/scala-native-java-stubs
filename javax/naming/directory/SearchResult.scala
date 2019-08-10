package javax.naming.directory

import java.lang.{Object, String}
import javax.naming.{Binding, NameClassPair}
import scala.scalanative.annotation.stub

/** This class represents an item in the NamingEnumeration returned as a
 *  result of the DirContext.search() methods.
 * 
 *  A SearchResult instance is not synchronized against concurrent
 *  multithreaded access. Multiple threads trying to access and modify
 *  a single SearchResult instance should lock the object.
 */
class SearchResult extends Binding {

    /** Constructs a search result using the result's name, its bound object, and
     *  its attributes.
     */
    @stub
    def this(name: String, obj: Any, attrs: Attributes) = ???

    /** Constructs a search result using the result's name, its bound object, and
     *  its attributes, and whether the name is relative.
     */
    @stub
    def this(name: String, obj: Any, attrs: Attributes, isRelative: Boolean) = ???

    /** Constructs a search result using the result's name, its class name,
     *  its bound object, and its attributes.
     */
    @stub
    def this(name: String, className: String, obj: Any, attrs: Attributes) = ???

    /** Constructs a search result using the result's name, its class name,
     *  its bound object, its attributes, and whether the name is relative.
     */
    @stub
    def this(name: String, className: String, obj: Any, attrs: Attributes, isRelative: Boolean) = ???

    /** Retrieves the attributes in this search result. */
    @stub
    def getAttributes(): Attributes = ???

    /** Sets the attributes of this search result to attrs. */
    @stub
    def setAttributes(attrs: Attributes): Unit = ???

    /** Generates the string representation of this SearchResult. */
    @stub
    def toString(): String = ???
}
