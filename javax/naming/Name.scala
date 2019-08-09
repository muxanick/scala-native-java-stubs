package javax.naming

import java.io.Serializable
import java.lang.{Cloneable, Comparable, Object, String}
import java.util.Enumeration

// The Name interface represents a generic name -- an ordered
// sequence of components.  It can be a composite name (names that
// span multiple namespaces), or a compound name (names that are
// used within individual hierarchical naming systems).
//
//  There can be different implementations of Name; for example,
// composite names, URLs, or namespace-specific compound names.
//
//  The components of a name are numbered.  The indexes of a name
// with N components range from 0 up to, but not including, N.  This
// range may be written as [0,N).
// The most significant component is at index 0.
// An empty name has no components.
//
//  None of the methods in this interface accept null as a valid
// value for a parameter that is a name or a name component.
// Likewise, methods that return a name or name component never return null.
//
//  An instance of a Name may not be synchronized against
// concurrent multithreaded access if that access is not read-only.
trait Name extends Cloneable , Serializable , Comparable[Object] {

    @stub
    // Adds a single component at a specified position within this name.
    def add(posn: Int, comp: String): Name = ???

    @stub
    // Adds a single component to the end of this name.
    def add(comp: String): Name = ???

    @stub
    // Adds the components of a name -- in order -- at a specified position
    // within this name.
    def addAll(posn: Int, n: Name): Name = ???

    @stub
    // Adds the components of a name -- in order -- to the end of this name.
    def addAll(suffix: Name): Name = ???

    @stub
    // Generates a new copy of this name.
    def clone(): Object = ???

    @stub
    // Compares this name with another name for order.
    def compareTo(obj: Object): Int = ???

    @stub
    // Determines whether this name ends with a specified suffix.
    def endsWith(n: Name): Boolean = ???

    @stub
    // Retrieves a component of this name.
    def get(posn: Int): String = ???

    @stub
    // Retrieves the components of this name as an enumeration
    // of strings.
    def getAll(): Enumeration[String] = ???

    @stub
    // Creates a name whose components consist of a prefix of the
    // components of this name.
    def getPrefix(posn: Int): Name = ???

    @stub
    // Creates a name whose components consist of a suffix of the
    // components in this name.
    def getSuffix(posn: Int): Name = ???

    @stub
    // Determines whether this name is empty.
    def isEmpty(): Boolean = ???

    @stub
    // Removes a component from this name.
    def remove(posn: Int): Object = ???

    @stub
    // Returns the number of components in this name.
    def size(): Int = ???
}
