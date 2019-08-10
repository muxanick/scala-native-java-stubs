package javax.print.attribute

import java.io.Serializable
import java.lang.{Cloneable, Object, String}
import java.net.URI
import scala.scalanative.annotation.stub

/** Class URISyntax is an abstract base class providing the common
 *  implementation of all attributes whose value is a Uniform Resource
 *  Identifier (URI). Once constructed, a URI attribute's value is immutable.
 *  
 */
abstract class URISyntax extends Object with Serializable with Cloneable {

    /** Constructs a URI attribute with the specified URI. */
    @stub
    protected def this(uri: URI) = ???

    /** Returns whether this URI attribute is equivalent to the passed in
     *  object.
     */
    def equals(object: Any): Boolean

    /** Returns this URI attribute's URI value. */
    def getURI(): URI

    /** Returns a hashcode for this URI attribute. */
    def hashCode(): Int

    /** Returns a String identifying this URI attribute. */
    def toString(): String
}
