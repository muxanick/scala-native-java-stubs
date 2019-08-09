package java.text

import java.lang.{Cloneable, Object, String}
import java.util.Locale
import scala.scalanative.annotation.stub

/** The BreakIterator class implements methods for finding
 *  the location of boundaries in text. Instances of BreakIterator
 *  maintain a current position and scan over text
 *  returning the index of characters where boundaries occur.
 *  Internally, BreakIterator scans text using a
 *  CharacterIterator, and is thus able to scan text held
 *  by any object implementing that protocol. A StringCharacterIterator
 *  is used to scan String objects passed to setText.
 * 
 *  
 *  You use the factory methods provided by this class to create
 *  instances of various types of break iterators. In particular,
 *  use getWordInstance, getLineInstance,
 *  getSentenceInstance, and getCharacterInstance
 *  to create BreakIterators that perform
 *  word, line, sentence, and character boundary analysis respectively.
 *  A single BreakIterator can work only on one unit
 *  (word, line, sentence, and so on). You must use a different iterator
 *  for each unit boundary analysis you wish to perform.
 * 
 *  
 *  Line boundary analysis determines where a text string can be
 *  broken when line-wrapping. The mechanism correctly handles
 *  punctuation and hyphenated words. Actual line breaking needs
 *  to also consider the available line width and is handled by
 *  higher-level software.
 * 
 *  
 *  Sentence boundary analysis allows selection with correct interpretation
 *  of periods within numbers and abbreviations, and trailing punctuation
 *  marks such as quotation marks and parentheses.
 * 
 *  
 *  Word boundary analysis is used by search and replace functions, as
 *  well as within text editing applications that allow the user to
 *  select words with a double click. Word selection provides correct
 *  interpretation of punctuation marks within and following
 *  words. Characters that are not part of a word, such as symbols
 *  or punctuation marks, have word-breaks on both sides.
 * 
 *  
 *  Character boundary analysis allows users to interact with characters
 *  as they expect to, for example, when moving the cursor through a text
 *  string. Character boundary analysis provides correct navigation
 *  through character strings, regardless of how the character is stored.
 *  The boundaries returned may be those of supplementary characters,
 *  combining character sequences, or ligature clusters.
 *  For example, an accented character might be stored as a base character
 *  and a diacritical mark. What users consider to be a character can
 *  differ between languages.
 * 
 *  
 *  The BreakIterator instances returned by the factory methods
 *  of this class are intended for use with natural languages only, not for
 *  programming language text. It is however possible to define subclasses
 *  that tokenize a programming language.
 * 
 *  
 *  Examples:
 *  Creating and using text boundaries:
 *  
 *  
 *  public static void main(String args[]) {
 *       if (args.length == 1) {
 *           String stringToExamine = args[0];
 *           //print each word in order
 *           BreakIterator boundary = BreakIterator.getWordInstance();
 *           boundary.setText(stringToExamine);
 *           printEachForward(boundary, stringToExamine);
 *           //print each sentence in reverse order
 *           boundary = BreakIterator.getSentenceInstance(Locale.US);
 *           boundary.setText(stringToExamine);
 *           printEachBackward(boundary, stringToExamine);
 *           printFirst(boundary, stringToExamine);
 *           printLast(boundary, stringToExamine);
 *       }
 *  }
 *  
 *  
 * 
 *  Print each element in order:
 *  
 *  
 *  public static void printEachForward(BreakIterator boundary, String source) {
 *      int start = boundary.first();
 *      for (int end = boundary.next();
 *           end != BreakIterator.DONE;
 *           start = end, end = boundary.next()) {
 *           System.out.println(source.substring(start,end));
 *      }
 *  }
 *  
 *  
 * 
 *  Print each element in reverse order:
 *  
 *  
 *  public static void printEachBackward(BreakIterator boundary, String source) {
 *      int end = boundary.last();
 *      for (int start = boundary.previous();
 *           start != BreakIterator.DONE;
 *           end = start, start = boundary.previous()) {
 *          System.out.println(source.substring(start,end));
 *      }
 *  }
 *  
 *  
 * 
 *  Print first element:
 *  
 *  
 *  public static void printFirst(BreakIterator boundary, String source) {
 *      int start = boundary.first();
 *      int end = boundary.next();
 *      System.out.println(source.substring(start,end));
 *  }
 *  
 *  
 * 
 *  Print last element:
 *  
 *  
 *  public static void printLast(BreakIterator boundary, String source) {
 *      int end = boundary.last();
 *      int start = boundary.previous();
 *      System.out.println(source.substring(start,end));
 *  }
 *  
 *  
 * 
 *  Print the element at a specified position:
 *  
 *  
 *  public static void printAt(BreakIterator boundary, int pos, String source) {
 *      int end = boundary.following(pos);
 *      int start = boundary.previous();
 *      System.out.println(source.substring(start,end));
 *  }
 *  
 *  
 * 
 *  Find the next word:
 *  
 *  
 *  public static int nextWordStartAfter(int pos, String text) {
 *      BreakIterator wb = BreakIterator.getWordInstance();
 *      wb.setText(text);
 *      int last = wb.following(pos);
 *      int current = wb.next();
 *      while (current != BreakIterator.DONE) {
 *          for (int p = last; p < current; p++) {
 *              if (Character.isLetter(text.codePointAt(p)))
 *                  return last;
 *          }
 *          last = current;
 *          current = wb.next();
 *      }
 *      return BreakIterator.DONE;
 *  }
 *  
 *  (The iterator returned by BreakIterator.getWordInstance() is unique in that
 *  the break positions it returns don't represent both the start and end of the
 *  thing being iterated over.  That is, a sentence-break iterator returns breaks
 *  that each represent the end of one sentence and the beginning of the next.
 *  With the word-break iterator, the characters between two boundaries might be a
 *  word, or they might be the punctuation or whitespace between two words.  The
 *  above code uses a simple heuristic to determine which boundary is the beginning
 *  of a word: If the characters between this boundary and the next boundary
 *  include at least one letter (this can be an alphabetical letter, a CJK ideograph,
 *  a Hangul syllable, a Kana character, etc.), then the text between this boundary
 *  and the next is a word; otherwise, it's the material between words.)
 *  
 */
abstract class BreakIterator extends Object with Cloneable {

    /** Constructor. */
    @stub
    protected def this() = ???

    /** Create a copy of this iterator */
    def clone(): Object

    /** Returns character index of the text boundary that was most
     *  recently returned by next(), next(int), previous(), first(), last(),
     *  following(int) or preceding(int).
     */
    def current(): Int

    /** Returns the first boundary. */
    def first(): Int

    /** Returns the first boundary following the specified character offset. */
    def following(offset: Int): Int

    /** Get the text being scanned */
    def getText(): CharacterIterator

    /** Returns true if the specified character offset is a text boundary. */
    def isBoundary(offset: Int): Boolean

    /** Returns the last boundary. */
    def last(): Int

    /** Returns the boundary following the current boundary. */
    def next(): Int

    /** Returns the nth boundary from the current boundary. */
    def next(n: Int): Int

    /** Returns the last boundary preceding the specified character offset. */
    def preceding(offset: Int): Int

    /** Returns the boundary preceding the current boundary. */
    def previous(): Int

    /** Set a new text for scanning. */
    def setText(newText: CharacterIterator): Unit

    /** Set a new text string to be scanned. */
    def setText(newText: String): Unit
}

object BreakIterator {
    /** DONE is returned by previous(), next(), next(int), preceding(int)
     *  and following(int) when either the first or last text boundary has been
     *  reached.
     */
    @stub
    val DONE: Int = ???

    /** Returns an array of all locales for which the
     *  get*Instance methods of this class can return
     *  localized instances.
     */
    @stub
    def getAvailableLocales(): Array[Locale] = ???

    /** Returns a new BreakIterator instance
     *  for character breaks
     *  for the default locale.
     */
    @stub
    def getCharacterInstance(): BreakIterator = ???

    /** Returns a new BreakIterator instance
     *  for character breaks
     *  for the given locale.
     */
    @stub
    def getCharacterInstance(locale: Locale): BreakIterator = ???

    /** Returns a new BreakIterator instance
     *  for line breaks
     *  for the default locale.
     */
    @stub
    def getLineInstance(): BreakIterator = ???

    /** Returns a new BreakIterator instance
     *  for line breaks
     *  for the given locale.
     */
    @stub
    def getLineInstance(locale: Locale): BreakIterator = ???

    /** Returns a new BreakIterator instance
     *  for sentence breaks
     *  for the default locale.
     */
    @stub
    def getSentenceInstance(): BreakIterator = ???

    /** Returns a new BreakIterator instance
     *  for sentence breaks
     *  for the given locale.
     */
    @stub
    def getSentenceInstance(locale: Locale): BreakIterator = ???

    /** Returns a new BreakIterator instance
     *  for word breaks
     *  for the default locale.
     */
    @stub
    def getWordInstance(): BreakIterator = ???

    /** Returns a new BreakIterator instance
     *  for word breaks
     *  for the given locale.
     */
    @stub
    def getWordInstance(locale: Locale): BreakIterator = ???
}
