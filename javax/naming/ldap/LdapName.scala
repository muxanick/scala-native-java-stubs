package javax.naming.ldap

import java.lang.{Object, String}
import java.util.{Enumeration, List}
import javax.naming.Name

// This class represents a distinguished name as specified by
// RFC 2253.
// A distinguished name, or DN, is composed of an ordered list of
// components called relative distinguished names, or RDNs.
// Details of a DN's syntax are described in RFC 2253.
//
// This class resolves a few ambiguities found in RFC 2253
// as follows:
// 
//  RFC 2253 leaves the term "whitespace" undefined. The
//      ASCII space character 0x20 (" ") is used in its place.
//  Whitespace is allowed on either side of ',', ';', '=', and '+'.
//      Such whitespace is accepted but not generated by this code,
//      and is ignored when comparing names.
//  AttributeValue strings containing '=' or non-leading '#'
//      characters (unescaped) are accepted.
// 
//
// String names passed to LdapName or returned by it
// use the full Unicode character set. They may also contain
// characters encoded into UTF-8 with each octet represented by a
// three-character substring such as "\\B4".
// They may not, however, contain characters encoded into UTF-8 with
// each octet represented by a single character in the string:  the
// meaning would be ambiguous.
//
// LdapName will properly parse all valid names, but
// does not attempt to detect all possible violations when parsing
// invalid names.  It is "generous" in accepting invalid names.
// The "validity" of a name is determined ultimately when it
// is supplied to an LDAP server, which may accept or
// reject the name based on factors such as its schema information
// and interoperability considerations.
//
// When names are tested for equality, attribute types, both binary
// and string values, are case-insensitive.
// String values with different but equivalent usage of quoting,
// escaping, or UTF8-hex-encoding are considered equal.  The order of
// components in multi-valued RDNs (such as "ou=Sales+cn=Bob") is not
// significant.
// 
// The components of a LDAP name, that is, RDNs, are numbered. The
// indexes of a LDAP name with n RDNs range from 0 to n-1.
// This range may be written as [0,n).
// The right most RDN is at index 0, and the left most RDN is at
// index n-1. For example, the distinguished name:
// "CN=Steve Kille, O=Isode Limited, C=GB" is numbered in the following
// sequence ranging from 0 to 2: {C=GB, O=Isode Limited, CN=Steve Kille}. An
// empty LDAP name is represented by an empty RDN list.
//
// Concurrent multithreaded read-only access of an instance of
// LdapName need not be synchronized.
//
// Unless otherwise noted, the behavior of passing a null argument
// to a constructor or method in this class will cause a
// NullPointerException to be thrown.
class LdapName extends Object with Name {

    @stub
    // Constructs an LDAP name given its parsed RDN components.
    def this(rdns: List[Rdn]) = ???

    @stub
    // Adds a single RDN at a specified position within this
    // LDAP name.
    def add(posn: Int, comp: Rdn): Name = ???

    @stub
    // Adds a single component at a specified position within this
    // LDAP name.
    def add(posn: Int, comp: String): Name = ???

    @stub
    // Adds a single RDN to the end of this LDAP name.
    def add(comp: Rdn): Name = ???

    @stub
    // Adds a single component to the end of this LDAP name.
    def add(comp: String): Name = ???

    @stub
    // Adds the RDNs of a name -- in order -- at a specified position
    // within this name.
    def addAll(posn: Int, suffixRdns: List[Rdn]): Name = ???

    @stub
    // Adds the components of a name -- in order -- at a specified position
    // within this name.
    def addAll(posn: Int, suffix: Name): Name = ???

    @stub
    // Adds the RDNs of a name -- in order -- to the end of this name.
    def addAll(suffixRdns: List[Rdn]): Name = ???

    @stub
    // Adds the components of a name -- in order -- to the end of this name.
    def addAll(suffix: Name): Name = ???

    @stub
    // Generates a new copy of this name.
    def clone(): Object = ???

    @stub
    // Compares this LdapName with the specified Object for order.
    def compareTo(obj: Object): Int = ???

    @stub
    // Determines whether the specified RDN sequence forms a suffix of this
    // LDAP name.
    def endsWith(rdns: List[Rdn]): Boolean = ???

    @stub
    // Determines whether this LDAP name ends with a specified
    // LDAP name suffix.
    def endsWith(n: Name): Boolean = ???

    @stub
    // Determines whether two LDAP names are equal.
    def equals(obj: Object): Boolean = ???

    @stub
    // Retrieves a component of this LDAP name as a string.
    def get(posn: Int): String = ???

    @stub
    // Retrieves the components of this name as an enumeration
    // of strings.
    def getAll(): Enumeration[String] = ???

    @stub
    // Creates a name whose components consist of a prefix of the
    // components of this LDAP name.
    def getPrefix(posn: Int): Name = ???

    @stub
    // Retrieves an RDN of this LDAP name as an Rdn.
    def getRdn(posn: Int): Rdn = ???

    @stub
    // Retrieves the list of relative distinguished names.
    def getRdns(): List[Rdn] = ???

    @stub
    // Creates a name whose components consist of a suffix of the
    // components in this LDAP name.
    def getSuffix(posn: Int): Name = ???

    @stub
    // Computes the hash code of this LDAP name.
    def hashCode(): Int = ???

    @stub
    // Determines whether this LDAP name is empty.
    def isEmpty(): Boolean = ???

    @stub
    // Removes a component from this LDAP name.
    def remove(posn: Int): Object = ???

    @stub
    // Retrieves the number of components in this LDAP name.
    def size(): Int = ???

    @stub
    // Determines whether the specified RDN sequence forms a prefix of this
    // LDAP name.
    def startsWith(rdns: List[Rdn]): Boolean = ???

    @stub
    // Determines whether this LDAP name starts with a specified LDAP name
    // prefix.
    def startsWith(n: Name): Boolean = ???
}
