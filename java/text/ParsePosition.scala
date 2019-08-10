package java.text

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** ParsePosition is a simple class used by Format
 *  and its subclasses to keep track of the current position during parsing.
 *  The parseObject method in the various Format
 *  classes requires a ParsePosition object as an argument.
 * 
 *  
 *  By design, as you parse through a string with different formats,
 *  you can use the same ParsePosition, since the index parameter
 *  records the current position.
 */
class ParsePosition extends Object {

    /** Create a new ParsePosition with the given initial index. */
    @stub
    def this(index: Int) = ???

    /** Overrides equals */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Retrieve the index at which an error occurred, or -1 if the
     *  error index has not been set.
     */
    @stub
    def getErrorIndex(): Int = ???

    /** Retrieve the current parse position. */
    @stub
    def getIndex(): Int = ???

    /** Returns a hash code for this ParsePosition. */
    @stub
    def hashCode(): Int = ???

    /** Set the index at which a parse error occurred. */
    @stub
    def setErrorIndex(ei: Int): Unit = ???

    /** Set the current parse position. */
    @stub
    def setIndex(index: Int): Unit = ???

    /** Return a string representation of this ParsePosition. */
    @stub
    def toString(): String = ???
}
