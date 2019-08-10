package javax.print.attribute

import java.io.Serializable
import java.lang.{Cloneable, Object, String}
import scala.scalanative.annotation.stub

/** Class EnumSyntax is an abstract base class providing the common
 *  implementation of all "type safe enumeration" objects. An enumeration class
 *  (which extends class EnumSyntax) provides a group of enumeration values
 *  (objects) that are singleton instances of the enumeration class; for example:
 *  
 *      public class Bach extends EnumSyntax {
 *          public static final Bach JOHANN_SEBASTIAN     = new Bach(0);
 *          public static final Bach WILHELM_FRIEDEMANN   = new Bach(1);
 *          public static final Bach CARL_PHILIP_EMMANUEL = new Bach(2);
 *          public static final Bach JOHANN_CHRISTIAN     = new Bach(3);
 *          public static final Bach P_D_Q                = new Bach(4);
 * 
 *          private static final String[] stringTable = {
 *              "Johann Sebastian Bach",
 *               "Wilhelm Friedemann Bach",
 *               "Carl Philip Emmanuel Bach",
 *               "Johann Christian Bach",
 *               "P.D.Q. Bach"
 *          };
 * 
 *          protected String[] getStringTable() {
 *              return stringTable;
 *          }
 * 
 *          private static final Bach[] enumValueTable = {
 *              JOHANN_SEBASTIAN,
 *               WILHELM_FRIEDEMANN,
 *               CARL_PHILIP_EMMANUEL,
 *               JOHANN_CHRISTIAN,
 *               P_D_Q
 *          };
 * 
 *          protected EnumSyntax[] getEnumValueTable() {
 *              return enumValueTable;
 *          }
 *      }
 *  
 *  You can then write code that uses the == and !=
 *  operators to test enumeration values; for example:
 *  
 *      Bach theComposer;
 *      . . .
 *      if (theComposer == Bach.JOHANN_SEBASTIAN) {
 *          System.out.println ("The greatest composer of all time!");
 *      }
 *  
 *  The equals() method for an enumeration class just does a test
 *  for identical objects (==).
 *  
 *  You can convert an enumeration value to a string by calling toString(). The string is obtained from a table
 *  supplied by the enumeration class.
 *  
 *  Under the hood, an enumeration value is just an integer, a different integer
 *  for each enumeration value within an enumeration class. You can get an
 *  enumeration value's integer value by calling getValue(). An enumeration value's integer value is established
 *  when it is constructed (see EnumSyntax(int)). Since the constructor is protected, the only
 *  possible enumeration values are the singleton objects declared in the
 *  enumeration class; additional enumeration values cannot be created at run
 *  time.
 *  
 *  You can define a subclass of an enumeration class that extends it with
 *  additional enumeration values. The subclass's enumeration values' integer
 *  values need not be distinct from the superclass's enumeration values' integer
 *  values; the ==, !=, equals(), and
 *  toString() methods will still work properly even if the subclass
 *  uses some of the same integer values as the superclass. However, the
 *  application in which the enumeration class and subclass are used may need to
 *  have distinct integer values in the superclass and subclass.
 *  
 */
abstract class EnumSyntax extends Object with Serializable with Cloneable {

    /** Construct a new enumeration value with the given integer value. */
    @stub
    protected def this(value: Int) = ???

    /** Returns a clone of this enumeration value, which to preserve the
     *  semantics of enumeration values is the same object as this enumeration
     *  value.
     */
    def clone(): Any

    /** Returns the enumeration value table for this enumeration value's
     *  enumeration class.
     */
    protected def getEnumValueTable(): Array[EnumSyntax]

    /** Returns the lowest integer value used by this enumeration value's
     *  enumeration class.
     */
    protected def getOffset(): Int

    /** Returns the string table for this enumeration value's enumeration class. */
    protected def getStringTable(): Array[String]

    /** Returns this enumeration value's integer value. */
    def getValue(): Int

    /** Returns a hash code value for this enumeration value. */
    def hashCode(): Int

    /** During object input, convert this deserialized enumeration instance to
     *  the proper enumeration value defined in the enumeration attribute class.
     */
    protected def readResolve(): Any

    /** Returns a string value corresponding to this enumeration value. */
    def toString(): String
}
