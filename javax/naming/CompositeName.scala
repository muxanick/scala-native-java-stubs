package javax.naming

import java.lang.{Object, String}
import java.util.Enumeration

// This class represents a composite name -- a sequence of
// component names spanning multiple namespaces.
// Each component is a string name from the namespace of a
// naming system. If the component comes from a hierarchical
// namespace, that component can be further parsed into
// its atomic parts by using the CompoundName class.
//
// The components of a composite name are numbered.  The indexes of a
// composite name with N components range from 0 up to, but not including, N.
// This range may be written as [0,N).
// The most significant component is at index 0.
// An empty composite name has no components.
//
// JNDI Composite Name Syntax
// JNDI defines a standard string representation for composite names. This
// representation is the concatenation of the components of a composite name
// from left to right using the component separator (a forward
// slash character (/)) to separate each component.
// The JNDI syntax defines the following meta characters:
// 
// escape (backward slash \),
// quote characters  (single (') and double quotes (")), and
// component separator (forward slash character (/)).
// 
// Any occurrence of a leading quote, an escape preceding any meta character,
// an escape at the end of a component, or a component separator character
// in an unquoted component must be preceded by an escape character when
// that component is being composed into a composite name string.
// Alternatively, to avoid adding escape characters as described,
// the entire component can be quoted using matching single quotes
// or matching double quotes. A single quote occurring within a double-quoted
// component is not considered a meta character (and need not be escaped),
// and vice versa.
//
// When two composite names are compared, the case of the characters
// is significant.
//
// A leading component separator (the composite name string begins with
// a separator) denotes a leading empty component (a component consisting
// of an empty string).
// A trailing component separator (the composite name string ends with
// a separator) denotes a trailing empty component.
// Adjacent component separators denote an empty component.
//
//Composite Name Examples
//This table shows examples of some composite names. Each row shows
//the string form of a composite name and its corresponding structural form
//(CompositeName).
//
//
//
//
//String Name
//CompositeName
//
//
//
//
//""
//
//{} (the empty name == new CompositeName("") == new CompositeName())
//
//
//
//
//
//"x"
//
//{"x"}
//
//
//
//
//
//"x/y"
//
//{"x", "y"}
//
//
//
//"x/"
//{"x", ""}
//
//
//
//"/x"
//{"", "x"}
//
//
//
//"/"
//{""}
//
//
//
//"//"
//{"", ""}
//
//
//"/x/"
//{"", "x", ""}
//
//
//"x//y"
//{"x", "", "y"}
//
//
//
//Composition Examples
// Here are some composition examples.  The right column shows composing
// string composite names while the left column shows composing the
// corresponding CompositeNames.  Notice that composing the
// string forms of two composite names simply involves concatenating
// their string forms together.
//
//
//
//
//String Names
//CompositeNames
//
//
//
//
//"x/y"           + "/"   = x/y/
//
//
//{"x", "y"}      + {""}  = {"x", "y", ""}
//
//
//
//
//
//""              + "x"   = "x"
//
//
//{}              + {"x"} = {"x"}
//
//
//
//
//
//"/"             + "x"   = "/x"
//
//
//{""}            + {"x"} = {"", "x"}
//
//
//
//
//
//"x"   + ""      + ""    = "x"
//
//
//{"x"} + {}      + {}    = {"x"}
//
//
//
//
//
//Multithreaded Access
// A CompositeName instance is not synchronized against concurrent
// multithreaded access. Multiple threads trying to access and modify a
// CompositeName should lock the object.
class CompositeName extends Object with Name {

    @stub
    // Constructs a new empty composite name.
    def this() = ???

    @stub
    // Constructs a new composite name instance using the components
    // specified by 'comps'.
    protected def this(comps: Enumeration[String]) = ???

    @stub
    // Adds a single component at a specified position within this
    // composite name.
    def add(posn: Int, comp: String): Name = ???

    @stub
    // Adds a single component to the end of this composite name.
    def add(comp: String): Name = ???

    @stub
    // Adds the components of a composite name -- in order -- at a specified
    // position within this composite name.
    def addAll(posn: Int, n: Name): Name = ???

    @stub
    // Adds the components of a composite name -- in order -- to the end of
    // this composite name.
    def addAll(suffix: Name): Name = ???

    @stub
    // Generates a copy of this composite name.
    def clone(): Object = ???

    @stub
    // Compares this CompositeName with the specified Object for order.
    def compareTo(obj: Object): Int = ???

    @stub
    // Determines whether a composite name is a suffix of this composite name.
    def endsWith(n: Name): Boolean = ???

    @stub
    // Determines whether two composite names are equal.
    def equals(obj: Object): Boolean = ???

    @stub
    // Retrieves a component of this composite name.
    def get(posn: Int): String = ???

    @stub
    // Retrieves the components of this composite name as an enumeration
    // of strings.
    def getAll(): Enumeration[String] = ???

    @stub
    // Creates a composite name whose components consist of a prefix of the
    // components in this composite name.
    def getPrefix(posn: Int): Name = ???

    @stub
    // Creates a composite name whose components consist of a suffix of the
    // components in this composite name.
    def getSuffix(posn: Int): Name = ???

    @stub
    // Computes the hash code of this composite name.
    def hashCode(): Int = ???

    @stub
    // Determines whether this composite name is empty.
    def isEmpty(): Boolean = ???

    @stub
    // Deletes a component from this composite name.
    def remove(posn: Int): Object = ???

    @stub
    // Retrieves the number of components in this composite name.
    def size(): Int = ???

    @stub
    // Determines whether a composite name is a prefix of this composite name.
    def startsWith(n: Name): Boolean = ???
}
