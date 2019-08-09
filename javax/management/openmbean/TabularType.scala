package javax.management.openmbean

import java.lang.{Object, String}
import java.util.List

// The TabularType class is the  open type class
// whose instances describe the types of TabularData values.
class TabularType extends OpenType[TabularData] {

    @stub
    // Compares the specified obj parameter with this TabularType instance for equality.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns, in the same order as was given to this instance's
    // constructor, an unmodifiable List of the names of the items the
    // values of which are used to uniquely index each row element of
    // tabular data values described by this TabularType
    // instance.
    def getIndexNames(): List[String] = ???

    @stub
    // Returns the type of the row elements of tabular data values
    // described by this TabularType instance.
    def getRowType(): CompositeType = ???

    @stub
    // Returns the hash code value for this TabularType instance.
    def hashCode(): Int = ???

    @stub
    // Tests whether obj is a value which could be
    // described by this TabularType instance.
    def isValue(obj: Object): Boolean = ???
}
