package javax.xml.namespace

import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** QName represents a qualified name
 *  as defined in the XML specifications: XML Schema Part2:
 *  Datatypes specification, Namespaces
 *  in XML, Namespaces
 *  in XML Errata.
 * 
 *  The value of a QName contains a Namespace
 *  URI, local part and
 *  prefix.
 * 
 *  The prefix is included in QName to retain lexical
 *  information when present in an XML input source. The prefix is
 *  NOT used in QName.equals(Object) or to compute the QName.hashCode().  Equality and the hash code are defined using
 *  only the Namespace URI and local part.
 * 
 *  If not specified, the Namespace URI is set to XMLConstants.NULL_NS_URI.
 *  If not specified, the prefix is set to XMLConstants.DEFAULT_NS_PREFIX.
 * 
 *  QName is immutable.
 */
class QName extends Object with Serializable {

    /** QName constructor specifying the local part. */
    @stub
    def this(localPart: String) = ???

    /** QName constructor specifying the Namespace URI
     *  and local part.
     */
    @stub
    def this(namespaceURI: String, localPart: String) = ???

    /** QName constructor specifying the Namespace URI,
     *  local part and prefix.
     */
    @stub
    def this(namespaceURI: String, localPart: String, prefix: String) = ???

    /** Test this QName for equality with another
     *  Object.
     */
    @stub
    def equals(objectToTest: Object): Boolean = ???

    /** Get the local part of this QName. */
    @stub
    def getLocalPart(): String = ???

    /** Get the Namespace URI of this QName. */
    @stub
    def getNamespaceURI(): String = ???

    /** Get the prefix of this QName. */
    @stub
    def getPrefix(): String = ???

    /** Generate the hash code for this QName. */
    @stub
    def hashCode(): Int = ???

    /** String representation of this
     *  QName.
     */
    @stub
    def toString(): String = ???
}

object QName {
    /** QName derived from parsing the formatted
     *  String.
     */
    @stub
    def valueOf(qNameAsString: String): QName = ???
}
