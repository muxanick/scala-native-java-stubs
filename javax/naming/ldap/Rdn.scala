package javax.naming.ldap

import java.io.Serializable
import java.lang.{Comparable, Object, String}
import javax.naming.directory.Attributes

// This class represents a relative distinguished name, or RDN, which is a
// component of a distinguished name as specified by
// RFC 2253.
// An example of an RDN is "OU=Sales+CN=J.Smith". In this example,
// the RDN consist of multiple attribute type/value pairs. The
// RDN is parsed as described in the class description for
// LdapName.
// 
// The Rdn class represents an RDN as attribute type/value mappings,
// which can be viewed using
// Attributes.
// In addition, it contains convenience methods that allow easy retrieval
// of type and value when the Rdn consist of a single type/value pair,
// which is how it appears in a typical usage.
// It also contains helper methods that allow escaping of the unformatted
// attribute value and unescaping of the value formatted according to the
// escaping syntax defined in RFC2253. For methods that take or return
// attribute value as an Object, the value is either a String
// (in unescaped form) or a byte array.
// 
// Rdn will properly parse all valid RDNs, but
// does not attempt to detect all possible violations when parsing
// invalid RDNs. It is "generous" in accepting invalid RDNs.
// The "validity" of a name is determined ultimately when it
// is supplied to an LDAP server, which may accept or
// reject the name based on factors such as its schema information
// and interoperability considerations.
//
// 
// The following code example shows how to construct an Rdn using the
// constructor that takes type and value as arguments:
// 
//      Rdn rdn = new Rdn("cn", "Juicy, Fruit");
//      System.out.println(rdn.toString());
// 
// The last line will print cn=Juicy\, Fruit. The
// unescapeValue() method can be
// used to unescape the escaped comma resulting in the original
// value "Juicy, Fruit". The escapeValue() method adds the escape back preceding the comma.
// 
// This class can be instantiated by a string representation
// of the RDN defined in RFC 2253 as shown in the following code example:
// 
//      Rdn rdn = new Rdn("cn=Juicy\\, Fruit");
//      System.out.println(rdn.toString());
// 
// The last line will print cn=Juicy\, Fruit.
// 
// Concurrent multithreaded read-only access of an instance of
// Rdn need not be synchronized.
// 
// Unless otherwise noted, the behavior of passing a null argument
// to a constructor or method in this class will cause NullPointerException
// to be thrown.
class Rdn extends Object with Serializable, with Comparable[Object] {

    @stub
    // Constructs an Rdn from the given attribute set.
    def this(attrSet: Attributes) = ???

    @stub
    // Constructs an Rdn from the given rdn.
    def this(rdn: Rdn) = ???

    @stub
    // Constructs an Rdn from the given string.
    def this(rdnString: String) = ???

    @stub
    // Compares this Rdn with the specified Object for order.
    def compareTo(obj: Object): Int = ???

    @stub
    // Compares the specified Object with this Rdn for equality.
    def equals(obj: Object): Boolean = ???

    @stub
    // Retrieves one of this Rdn's type.
    def getType(): String = ???

    @stub
    // Retrieves one of this Rdn's value.
    def getValue(): Object = ???

    @stub
    // Returns the hash code of this RDN.
    def hashCode(): Int = ???

    @stub
    // Retrieves the number of attribute type/value pairs in this Rdn.
    def size(): Int = ???

    @stub
    // Retrieves the Attributes
    // view of the type/value mappings contained in this Rdn.
    def toAttributes(): Attributes = ???

    @stub
    // Returns this Rdn as a string represented in a format defined by
    // RFC 2253 and described
    // in the class description for LdapName.
    def toString(): String = ???
}

object Rdn {
    @stub
    // Given the value of an attribute, returns a string escaped according
    // to the rules specified in
    // RFC 2253.
    def escapeValue(val: Object): String = ???
}
