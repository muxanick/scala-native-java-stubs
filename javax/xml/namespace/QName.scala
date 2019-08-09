package javax.xml.namespace

import java.io.Serializable
import java.lang.{Object, String}

// QName represents a qualified name
// as defined in the XML specifications: XML Schema Part2:
// Datatypes specification, Namespaces
// in XML, Namespaces
// in XML Errata.
//
// The value of a QName contains a Namespace
// URI, local part and
// prefix.
//
// The prefix is included in QName to retain lexical
// information when present in an XML input source. The prefix is
// NOT used in QName.equals(Object) or to compute the QName.hashCode().  Equality and the hash code are defined using
// only the Namespace URI and local part.
//
// If not specified, the Namespace URI is set to XMLConstants.NULL_NS_URI.
// If not specified, the prefix is set to XMLConstants.DEFAULT_NS_PREFIX.
//
// QName is immutable.
class QName extends Object with Serializable {

    @stub
    // QName constructor specifying the local part.
    def this(localPart: String) = ???

    @stub
    // QName constructor specifying the Namespace URI
    // and local part.
    def this(namespaceURI: String, localPart: String) = ???

    @stub
    // Test this QName for equality with another
    // Object.
    def equals(objectToTest: Object): Boolean = ???

    @stub
    // Get the local part of this QName.
    def getLocalPart(): String = ???

    @stub
    // Get the Namespace URI of this QName.
    def getNamespaceURI(): String = ???

    @stub
    // Get the prefix of this QName.
    def getPrefix(): String = ???

    @stub
    // Generate the hash code for this QName.
    def hashCode(): Int = ???

    @stub
    // String representation of this
    // QName.
    def toString(): String = ???
}
