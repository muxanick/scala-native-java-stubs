package javax.management

import java.lang.{Comparable, Object, String}
import java.util.Hashtable
import scala.scalanative.annotation.stub

/** Represents the object name of an MBean, or a pattern that can
 *  match the names of several MBeans.  Instances of this class are
 *  immutable.
 * 
 *  An instance of this class can be used to represent:
 *  
 *  An object name
 *  An object name pattern, within the context of a query
 *  
 * 
 *  An object name consists of two parts, the domain and the key
 *  properties.
 * 
 *  The domain is a string of characters not including
 *  the character colon (:).  It is recommended that the domain
 *  should not contain the string "//", which is reserved for future use.
 * 
 *  If the domain includes at least one occurrence of the wildcard
 *  characters asterisk (*) or question mark
 *  (?), then the object name is a pattern.  The asterisk
 *  matches any sequence of zero or more characters, while the question
 *  mark matches any single character.
 * 
 *  If the domain is empty, it will be replaced in certain contexts
 *  by the default domain of the MBean server in which the
 *  ObjectName is used.
 * 
 *  The key properties are an unordered set of keys and
 *  associated values.
 * 
 *  Each key is a nonempty string of characters which may
 *  not contain any of the characters comma (,), equals
 *  (=), colon, asterisk, or question mark.  The same key
 *  may not occur twice in a given ObjectName.
 * 
 *  Each value associated with a key is a string of
 *  characters that is either unquoted or quoted.
 * 
 *  An unquoted value is a possibly empty string of
 *  characters which may not contain any of the characters comma,
 *  equals, colon, or quote.
 * 
 *  If the unquoted value contains at least one occurrence
 *  of the wildcard characters asterisk or question mark, then the object
 *  name is a property value pattern. The asterisk matches any
 *  sequence of zero or more characters, while the question mark matches
 *  any single character.
 * 
 *  A quoted value consists of a quote ("),
 *  followed by a possibly empty string of characters, followed by
 *  another quote.  Within the string of characters, the backslash
 *  (\) has a special meaning.  It must be followed by
 *  one of the following characters:
 * 
 *  
 *  Another backslash.  The second backslash has no special
 *  meaning and the two characters represent a single backslash.
 * 
 *  The character 'n'.  The two characters represent a newline
 *  ('\n' in Java).
 * 
 *  A quote.  The two characters represent a quote, and that quote
 *  is not considered to terminate the quoted value. An ending closing
 *  quote must be present for the quoted value to be valid.
 * 
 *  A question mark (?) or asterisk (*).  The two characters represent
 *  a question mark or asterisk respectively.
 *  
 * 
 *  A quote may not appear inside a quoted value except immediately
 *  after an odd number of consecutive backslashes.
 * 
 *  The quotes surrounding a quoted value, and any backslashes
 *  within that value, are considered to be part of the value.
 * 
 *  If the quoted value contains at least one occurrence of
 *  the characters asterisk or question mark and they are not preceded
 *  by a backslash, then they are considered as wildcard characters and
 *  the object name is a property value pattern. The asterisk
 *  matches any sequence of zero or more characters, while the question
 *  mark matches any single character.
 * 
 *  An ObjectName may be a property list pattern. In this
 *  case it may have zero or more keys and associated values. It matches
 *  a nonpattern ObjectName whose domain matches and that contains the
 *  same keys and associated values, as well as possibly other keys and
 *  values.
 * 
 *  An ObjectName is a property value pattern when at least
 *  one of its quoted or unquoted key property values
 *  contains the wildcard characters asterisk or question mark as described
 *  above. In this case it has one or more keys and associated values, with
 *  at least one of the values containing wildcard characters. It matches a
 *  nonpattern ObjectName whose domain matches and that contains the same
 *  keys whose values match; if the property value pattern is also a
 *  property list pattern then the nonpattern ObjectName can contain
 *  other keys and values.
 * 
 *  An ObjectName is a property pattern if it is either a
 *  property list pattern or a property value pattern
 *  or both.
 * 
 *  An ObjectName is a pattern if its domain contains a wildcard or
 *  if the ObjectName is a property pattern.
 * 
 *  If an ObjectName is not a pattern, it must contain at least one
 *  key with its associated value.
 * 
 *  Examples of ObjectName patterns are:
 * 
 *  
 *  *:type=Foo,name=Bar to match names in any domain whose
 *      exact set of keys is type=Foo,name=Bar.
 *  d:type=Foo,name=Bar,* to match names in the domain
 *      d that have the keys type=Foo,name=Bar plus
 *      zero or more other keys.
 *  *:type=Foo,name=Bar,* to match names in any domain
 *      that has the keys type=Foo,name=Bar plus zero or
 *      more other keys.
 *  d:type=F?o,name=Bar will match e.g.
 *      d:type=Foo,name=Bar and d:type=Fro,name=Bar.
 *  d:type=F*o,name=Bar will match e.g.
 *      d:type=Fo,name=Bar and d:type=Frodo,name=Bar.
 *  d:type=Foo,name="B*" will match e.g.
 *      d:type=Foo,name="Bling". Wildcards are recognized even
 *      inside quotes, and like other special characters can be escaped
 *      with \.
 *  
 * 
 *  An ObjectName can be written as a String with the following
 *  elements in order:
 * 
 *  
 *  The domain.
 *  A colon (:).
 *  A key property list as defined below.
 *  
 * 
 *  A key property list written as a String is a comma-separated
 *  list of elements.  Each element is either an asterisk or a key
 *  property.  A key property consists of a key, an equals
 *  (=), and the associated value.
 * 
 *  At most one element of a key property list may be an asterisk.
 *  If the key property list contains an asterisk element, the
 *  ObjectName is a property list pattern.
 * 
 *  Spaces have no special significance in a String representing an
 *  ObjectName.  For example, the String:
 *  
 *  domain: key1 = value1 , key2 = value2
 *  
 *  represents an ObjectName with two keys.  The name of each key
 *  contains six characters, of which the first and last are spaces.
 *  The value associated with the key " key1 "
 *  also begins and ends with a space.
 * 
 *  In addition to the restrictions on characters spelt out above,
 *  no part of an ObjectName may contain a newline character
 *  ('\n'), whether the domain, a key, or a value, whether
 *  quoted or unquoted.  The newline character can be represented in a
 *  quoted value with the sequence \n.
 * 
 *  The rules on special characters and quoting apply regardless of
 *  which constructor is used to make an ObjectName.
 * 
 *  To avoid collisions between MBeans supplied by different
 *  vendors, a useful convention is to begin the domain name with the
 *  reverse DNS name of the organization that specifies the MBeans,
 *  followed by a period and a string whose interpretation is
 *  determined by that organization.  For example, MBeans specified by
 *  example.com  would have
 *  domains such as com.example.MyDomain.  This is essentially
 *  the same convention as for Java-language package names.
 * 
 *  The serialVersionUID of this class is 1081892073854801359L.
 */
class ObjectName extends Object with Comparable[ObjectName] with QueryExp {

    /** Construct an object name from the given string. */
    @stub
    def this(name: String) = ???

    /** Construct an object name with several key properties from a Hashtable. */
    @stub
    def this(domain: String, table: Hashtable[String, String]) = ???

    /** Construct an object name with exactly one key property. */
    @stub
    def this(domain: String, key: String, value: String) = ???

    /** Test whether this ObjectName, which may be a pattern,
     *  matches another ObjectName.
     */
    @stub
    def apply(name: ObjectName): Boolean = ???

    /** Compares two ObjectName instances. */
    @stub
    def compareTo(name: ObjectName): Int = ???

    /** Compares the current object name with another object name. */
    @stub
    def equals(object: Any): Boolean = ???

    /** Returns a string representation of the list of key properties,
     *  in which the key properties are sorted in lexical order.
     */
    @stub
    def getCanonicalKeyPropertyListString(): String = ???

    /** Returns the canonical form of the name; that is, a string
     *  representation where the properties are sorted in lexical
     *  order.
     */
    @stub
    def getCanonicalName(): String = ???

    /** Returns the domain part. */
    @stub
    def getDomain(): String = ???

    /** Obtains the value associated with a key in a key property. */
    @stub
    def getKeyProperty(property: String): String = ???

    /** Returns the key properties as a Hashtable. */
    @stub
    def getKeyPropertyList(): Hashtable[String, String] = ???

    /** Returns a string representation of the list of key
     *  properties specified at creation time.
     */
    @stub
    def getKeyPropertyListString(): String = ???

    /** Returns a hash code for this object name. */
    @stub
    def hashCode(): Int = ???

    /** Checks whether the object name is a pattern on the domain part. */
    @stub
    def isDomainPattern(): Boolean = ???

    /** Checks whether the object name is a pattern. */
    @stub
    def isPattern(): Boolean = ???

    /** Checks whether the object name is a pattern on the key property list. */
    @stub
    def isPropertyListPattern(): Boolean = ???

    /** Checks whether the object name is a pattern on the key properties. */
    @stub
    def isPropertyPattern(): Boolean = ???

    /** Checks whether the object name is a pattern on the value part
     *  of at least one of the key properties.
     */
    @stub
    def isPropertyValuePattern(): Boolean = ???

    /** Checks whether the value associated with a key in a key
     *  property is a pattern.
     */
    @stub
    def isPropertyValuePattern(property: String): Boolean = ???

    /** Sets the MBean server on which the query is to be performed. */
    @stub
    def setMBeanServer(mbs: MBeanServer): Unit = ???

    /** Returns a string representation of the object name. */
    @stub
    def toString(): String = ???
}

object ObjectName {
    /** Defines the wildcard "*:*" ObjectName. */
    @stub
    val WILDCARD: ObjectName = ???

    /** Return an instance of ObjectName that can be used anywhere
     *  the given object can be used.
     */
    @stub
    def getInstance(name: ObjectName): ObjectName = ???

    /** Return an instance of ObjectName that can be used anywhere
     *  an object obtained with new
     *  ObjectName(name) can be used.
     */
    @stub
    def getInstance(name: String): ObjectName = ???

    /** Return an instance of ObjectName that can be used anywhere
     *  an object obtained with new ObjectName(domain, table) can be used.
     */
    @stub
    def getInstance(domain: String, table: Hashtable[String, String]): ObjectName = ???

    /** Return an instance of ObjectName that can be used anywhere
     *  an object obtained with new ObjectName(domain, key, value) can be used.
     */
    @stub
    def getInstance(domain: String, key: String, value: String): ObjectName = ???

    /** Returns a quoted form of the given String, suitable for
     *  inclusion in an ObjectName.
     */
    @stub
    def quote(s: String): String = ???

    /** Returns an unquoted form of the given String. */
    @stub
    def unquote(q: String): String = ???
}
