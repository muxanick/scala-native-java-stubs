package java.text

import java.lang.{Cloneable, Object, String}
import java.util.{Comparator, Locale}
import scala.scalanative.annotation.stub

/** The Collator class performs locale-sensitive
 *  String comparison. You use this class to build
 *  searching and sorting routines for natural language text.
 * 
 *  
 *  Collator is an abstract base class. Subclasses
 *  implement specific collation strategies. One subclass,
 *  RuleBasedCollator, is currently provided with
 *  the Java Platform and is applicable to a wide set of languages. Other
 *  subclasses may be created to handle more specialized needs.
 * 
 *  
 *  Like other locale-sensitive classes, you can use the static
 *  factory method, getInstance, to obtain the appropriate
 *  Collator object for a given locale. You will only need
 *  to look at the subclasses of Collator if you need
 *  to understand the details of a particular collation strategy or
 *  if you need to modify that strategy.
 * 
 *  
 *  The following example shows how to compare two strings using
 *  the Collator for the default locale.
 *  
 *  
 *  // Compare two strings in the default locale
 *  Collator myCollator = Collator.getInstance();
 *  if( myCollator.compare("abc", "ABC") < 0 )
 *      System.out.println("abc is less than ABC");
 *  else
 *      System.out.println("abc is greater than or equal to ABC");
 *  
 *  
 * 
 *  
 *  You can set a Collator's strength property
 *  to determine the level of difference considered significant in
 *  comparisons. Four strengths are provided: PRIMARY,
 *  SECONDARY, TERTIARY, and IDENTICAL.
 *  The exact assignment of strengths to language features is
 *  locale dependant.  For example, in Czech, "e" and "f" are considered
 *  primary differences, while "e" and "ě" are secondary differences,
 *  "e" and "E" are tertiary differences and "e" and "e" are identical.
 *  The following shows how both case and accents could be ignored for
 *  US English.
 *  
 *  
 *  //Get the Collator for US English and set its strength to PRIMARY
 *  Collator usCollator = Collator.getInstance(Locale.US);
 *  usCollator.setStrength(Collator.PRIMARY);
 *  if( usCollator.compare("abc", "ABC") == 0 ) {
 *      System.out.println("Strings are equivalent");
 *  }
 *  
 *  
 *  
 *  For comparing Strings exactly once, the compare
 *  method provides the best performance. When sorting a list of
 *  Strings however, it is generally necessary to compare each
 *  String multiple times. In this case, CollationKeys
 *  provide better performance. The CollationKey class converts
 *  a String to a series of bits that can be compared bitwise
 *  against other CollationKeys. A CollationKey is
 *  created by a Collator object for a given String.
 *  
 *  Note: CollationKeys from different
 *  Collators can not be compared. See the class description
 *  for CollationKey
 *  for an example using CollationKeys.
 */
abstract class Collator extends Object with Comparator[Object] with Cloneable {

    /** Default constructor. */
    @stub
    protected def this() = ???

    /** Overrides Cloneable */
    def clone(): Any

    /** Compares its two arguments for order. */
    def compare(o1: Any, o2: Any): Int

    /** Compares the source string to the target string according to the
     *  collation rules for this Collator.
     */
    def compare(source: String, target: String): Int

    /** Compares the equality of two Collators. */
    def equals(that: Any): Boolean

    /** Convenience method for comparing the equality of two strings based on
     *  this Collator's collation rules.
     */
    def equals(source: String, target: String): Boolean

    /** Transforms the String into a series of bits that can be compared bitwise
     *  to other CollationKeys.
     */
    def getCollationKey(source: String): CollationKey

    /** Get the decomposition mode of this Collator. */
    def getDecomposition(): Int

    /** Returns this Collator's strength property. */
    def getStrength(): Int

    /** Generates the hash code for this Collator. */
    def hashCode(): Int

    /** Set the decomposition mode of this Collator. */
    def setDecomposition(decompositionMode: Int): Unit

    /** Sets this Collator's strength property. */
    def setStrength(newStrength: Int): Unit
}

object Collator {
    /** Decomposition mode value. */
    @stub
    val CANONICAL_DECOMPOSITION: Int = ???

    /** Decomposition mode value. */
    @stub
    val FULL_DECOMPOSITION: Int = ???

    /** Collator strength value. */
    @stub
    val IDENTICAL: Int = ???

    /** Decomposition mode value. */
    @stub
    val NO_DECOMPOSITION: Int = ???

    /** Collator strength value. */
    @stub
    val PRIMARY: Int = ???

    /** Collator strength value. */
    @stub
    val SECONDARY: Int = ???

    /** Collator strength value. */
    @stub
    val TERTIARY: Int = ???

    /** Returns an array of all locales for which the
     *  getInstance methods of this class can return
     *  localized instances.
     */
    @stub
    def getAvailableLocales(): Array[Locale] = ???

    /** Gets the Collator for the current default locale. */
    @stub
    def getInstance(): Collator = ???

    /** Gets the Collator for the desired locale. */
    @stub
    def getInstance(desiredLocale: Locale): Collator = ???
}
