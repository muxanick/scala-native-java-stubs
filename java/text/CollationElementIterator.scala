package java.text

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** The CollationElementIterator class is used as an iterator
 *  to walk through each character of an international string. Use the iterator
 *  to return the ordering priority of the positioned character. The ordering
 *  priority of a character, which we refer to as a key, defines how a character
 *  is collated in the given collation object.
 * 
 *  
 *  For example, consider the following in Spanish:
 *  
 *  
 *  "ca" → the first key is key('c') and second key is key('a').
 *  "cha" → the first key is key('ch') and second key is key('a').
 *  
 *  
 *  And in German,
 *  
 *  
 *  "b" → the first key is key('a'), the second key is key('e'), and
 *  the third key is key('b').
 *  
 *  
 *  The key of a character is an integer composed of primary order(short),
 *  secondary order(byte), and tertiary order(byte). Java strictly defines
 *  the size and signedness of its primitive data types. Therefore, the static
 *  functions primaryOrder, secondaryOrder, and
 *  tertiaryOrder return int, short,
 *  and short respectively to ensure the correctness of the key
 *  value.
 * 
 *  
 *  Example of the iterator usage,
 *  
 *  
 * 
 *   String testString = "This is a test";
 *   Collator col = Collator.getInstance();
 *   if (col instanceof RuleBasedCollator) {
 *       RuleBasedCollator ruleBasedCollator = (RuleBasedCollator)col;
 *       CollationElementIterator collationElementIterator = ruleBasedCollator.getCollationElementIterator(testString);
 *       int primaryOrder = CollationElementIterator.primaryOrder(collationElementIterator.next());
 *           :
 *   }
 *  
 *  
 * 
 *  
 *  CollationElementIterator.next returns the collation order
 *  of the next character. A collation order consists of primary order,
 *  secondary order and tertiary order. The data type of the collation
 *  order is int. The first 16 bits of a collation order
 *  is its primary order; the next 8 bits is the secondary order and the
 *  last 8 bits is the tertiary order.
 * 
 *  Note: CollationElementIterator is a part of
 *  RuleBasedCollator implementation. It is only usable
 *  with RuleBasedCollator instances.
 */
final class CollationElementIterator extends Object {

    /** Return the maximum length of any expansion sequences that end
     *  with the specified comparison order.
     */
    @stub
    def getMaxExpansion(order: Int): Int = ???

    /** Returns the character offset in the original text corresponding to the next
     *  collation element.
     */
    @stub
    def getOffset(): Int = ???

    /** Get the next collation element in the string. */
    @stub
    def next(): Int = ???

    /** Get the previous collation element in the string. */
    @stub
    def previous(): Int = ???

    /** Resets the cursor to the beginning of the string. */
    @stub
    def reset(): Unit = ???

    /** Sets the iterator to point to the collation element corresponding to
     *  the specified character (the parameter is a CHARACTER offset in the
     *  original string, not an offset into its corresponding sequence of
     *  collation elements).
     */
    @stub
    def setOffset(newOffset: Int): Unit = ???

    /** Set a new string over which to iterate. */
    @stub
    def setText(source: CharacterIterator): Unit = ???

    /** Set a new string over which to iterate. */
    @stub
    def setText(source: String): Unit = ???
}

object CollationElementIterator {
    /** Null order which indicates the end of string is reached by the
     *  cursor.
     */
    @stub
    val NULLORDER: Int = ???

    /** Return the primary component of a collation element. */
    @stub
    def primaryOrder(order: Int): Int = ???

    /** Return the secondary component of a collation element. */
    @stub
    def secondaryOrder(order: Int): Short = ???

    /** Return the tertiary component of a collation element. */
    @stub
    def tertiaryOrder(order: Int): Short = ???
}
