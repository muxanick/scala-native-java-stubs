package javax.management.openmbean

import java.lang.{Object, String}
import java.util.List

/** The TabularType class is the  open type class
 *  whose instances describe the types of TabularData values.
 */
class TabularType extends OpenType[TabularData] {

    /** Compares the specified obj parameter with this TabularType instance for equality. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns, in the same order as was given to this instance's
     *  constructor, an unmodifiable List of the names of the items the
     *  values of which are used to uniquely index each row element of
     *  tabular data values described by this TabularType
     *  instance.
     */
    @stub
    def getIndexNames(): List[String] = ???

    /** Returns the type of the row elements of tabular data values
     *  described by this TabularType instance.
     */
    @stub
    def getRowType(): CompositeType = ???

    /** Returns the hash code value for this TabularType instance. */
    @stub
    def hashCode(): Int = ???

    /** Tests whether obj is a value which could be
     *  described by this TabularType instance.
     */
    @stub
    def isValue(obj: Object): Boolean = ???
}
