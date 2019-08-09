package javax.naming

import java.lang.{Object, String}
import java.util.{Enumeration, Properties}
import scala.scalanative.annotation.stub

/** This class represents a compound name -- a name from
 *  a hierarchical name space.
 *  Each component in a compound name is an atomic name.
 *  
 *  The components of a compound name are numbered.  The indexes of a
 *  compound name with N components range from 0 up to, but not including, N.
 *  This range may be written as [0,N).
 *  The most significant component is at index 0.
 *  An empty compound name has no components.
 * 
 *  Compound Name Syntax
 *  The syntax of a compound name is specified using a set of properties:
 * 
 *   jndi.syntax.direction
 *   Direction for parsing ("right_to_left", "left_to_right", "flat").
 *       If unspecified, defaults to "flat", which means the namespace is flat
 *       with no hierarchical structure.
 * 
 *   jndi.syntax.separator
 *   Separator between atomic name components.
 *       Required unless direction is "flat".
 * 
 *   jndi.syntax.ignorecase
 *   If present, "true" means ignore the case when comparing name
 *       components. If its value is not "true", or if the property is not
 *       present, case is considered when comparing name components.
 * 
 *   jndi.syntax.escape
 *   If present, specifies the escape string for overriding separator,
 *       escapes and quotes.
 * 
 *   jndi.syntax.beginquote
 *   If present, specifies the string delimiting start of a quoted string.
 * 
 *   jndi.syntax.endquote
 *   String delimiting end of quoted string.
 *       If present, specifies the string delimiting the end of a quoted string.
 *       If not present, use syntax.beginquote as end quote.
 *   jndi.syntax.beginquote2
 *   Alternative set of begin/end quotes.
 * 
 *   jndi.syntax.endquote2
 *   Alternative set of begin/end quotes.
 * 
 *   jndi.syntax.trimblanks
 *   If present, "true" means trim any leading and trailing whitespaces
 *       in a name component for comparison purposes. If its value is not
 *       "true", or if the property is not present, blanks are significant.
 *   jndi.syntax.separator.ava
 *   If present, specifies the string that separates
 *       attribute-value-assertions when specifying multiple attribute/value
 *       pairs. (e.g. ","  in age=65,gender=male).
 *   jndi.syntax.separator.typeval
 *   If present, specifies the string that separators attribute
 *               from value (e.g. "=" in "age=65")
 * 
 *  These properties are interpreted according to the following rules:
 * 
 * 
 *  In a string without quotes or escapes, any instance of the
 *  separator delimits two atomic names. Each atomic name is referred
 *  to as a component.
 * 
 *  A separator, quote or escape is escaped if preceded immediately
 *  (on the left) by the escape.
 * 
 *  If there are two sets of quotes, a specific begin-quote must be matched
 *  by its corresponding end-quote.
 * 
 *  A non-escaped begin-quote which precedes a component must be
 *  matched by a non-escaped end-quote at the end of the component.
 *  A component thus quoted is referred to as a
 *  quoted component. It is parsed by
 *  removing the being- and end- quotes, and by treating the intervening
 *  characters as ordinary characters unless one of the rules involving
 *  quoted components listed below applies.
 * 
 *  Quotes embedded in non-quoted components are treated as ordinary strings
 *  and need not be matched.
 * 
 *  A separator that is escaped or appears between non-escaped
 *  quotes is treated as an ordinary string and not a separator.
 * 
 *  An escape string within a quoted component acts as an escape only when
 *  followed by the corresponding end-quote string.
 *  This can be used to embed an escaped quote within a quoted component.
 * 
 *  An escaped escape string is not treated as an escape string.
 * 
 *  An escape string that does not precede a meta string (quotes or separator)
 *  and is not at the end of a component is treated as an ordinary string.
 * 
 *  A leading separator (the compound name string begins with
 *  a separator) denotes a leading empty atomic component (consisting
 *  of an empty string).
 *  A trailing separator (the compound name string ends with
 *  a separator) denotes a trailing empty atomic component.
 *  Adjacent separators denote an empty atomic component.
 * 
 *  
 *  The string form of the compound name follows the syntax described above.
 *  When the components of the compound name are turned into their
 *  string representation, the reserved syntax rules described above are
 *  applied (e.g. embedded separators are escaped or quoted)
 *  so that when the same string is parsed, it will yield the same components
 *  of the original compound name.
 * 
 * Multithreaded Access
 *  A CompoundName instance is not synchronized against concurrent
 *  multithreaded access. Multiple threads trying to access and modify a
 *  CompoundName should lock the object.
 */
class CompoundName extends Object with Name {

    /** Constructs a new compound name instance using the components
     *  specified in comps and syntax.
     */
    @stub
    protected def this(comps: Enumeration[String], syntax: Properties) = ???

    /** Constructs a new compound name instance by parsing the string n
     *  using the syntax specified by the syntax properties supplied.
     */
    @stub
    def this(n: String, syntax: Properties) = ???

    /** Implementation of this compound name. */
    @stub
    protected val impl: javax.naming.NameImpl = ???

    /** Syntax properties for this compound name. */
    @stub
    protected val mySyntax: Properties = ???

    /** Adds a single component at a specified position within this
     *  compound name.
     */
    @stub
    def add(posn: Int, comp: String): Name = ???

    /** Adds a single component to the end of this compound name. */
    @stub
    def add(comp: String): Name = ???

    /** Adds the components of a compound name -- in order -- at a specified
     *  position within this compound name.
     */
    @stub
    def addAll(posn: Int, n: Name): Name = ???

    /** Adds the components of a compound name -- in order -- to the end of
     *  this compound name.
     */
    @stub
    def addAll(suffix: Name): Name = ???

    /** Creates a copy of this compound name. */
    @stub
    def clone(): Object = ???

    /** Compares this CompoundName with the specified Object for order. */
    @stub
    def compareTo(obj: Object): Int = ???

    /** Determines whether a compound name is a suffix of this compound name. */
    @stub
    def endsWith(n: Name): Boolean = ???

    /** Determines whether obj is syntactically equal to this compound name. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Retrieves a component of this compound name. */
    @stub
    def get(posn: Int): String = ???

    /** Retrieves the components of this compound name as an enumeration
     *  of strings.
     */
    @stub
    def getAll(): Enumeration[String] = ???

    /** Creates a compound name whose components consist of a prefix of the
     *  components in this compound name.
     */
    @stub
    def getPrefix(posn: Int): Name = ???

    /** Creates a compound name whose components consist of a suffix of the
     *  components in this compound name.
     */
    @stub
    def getSuffix(posn: Int): Name = ???

    /** Computes the hash code of this compound name. */
    @stub
    def hashCode(): Int = ???

    /** Determines whether this compound name is empty. */
    @stub
    def isEmpty(): Boolean = ???

    /** Deletes a component from this compound name. */
    @stub
    def remove(posn: Int): Object = ???

    /** Retrieves the number of components in this compound name. */
    @stub
    def size(): Int = ???

    /** Determines whether a compound name is a prefix of this compound name. */
    @stub
    def startsWith(n: Name): Boolean = ???

    /** Generates the string representation of this compound name, using
     *  the syntax rules of the compound name.
     */
    @stub
    def toString(): String = ???
}
