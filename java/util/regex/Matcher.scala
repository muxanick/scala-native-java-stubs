package java.util.regex

import java.lang.{CharSequence, Object, String, StringBuffer}
import scala.scalanative.annotation.stub

/** An engine that performs match operations on a character sequence by interpreting a Pattern.
 * 
 *   A matcher is created from a pattern by invoking the pattern's matcher method.  Once created, a matcher can be used to
 *  perform three different kinds of match operations:
 * 
 *  
 * 
 *     The matches method attempts to match the entire
 *    input sequence against the pattern.  
 * 
 *     The lookingAt method attempts to match the
 *    input sequence, starting at the beginning, against the pattern.  
 * 
 *     The find method scans the input sequence looking for
 *    the next subsequence that matches the pattern.  
 * 
 *  
 * 
 *   Each of these methods returns a boolean indicating success or failure.
 *  More information about a successful match can be obtained by querying the
 *  state of the matcher.
 * 
 *   A matcher finds matches in a subset of its input called the
 *  region. By default, the region contains all of the matcher's input.
 *  The region can be modified via theregion method and queried
 *  via the regionStart and regionEnd
 *  methods. The way that the region boundaries interact with some pattern
 *  constructs can be changed. See useAnchoringBounds and useTransparentBounds
 *  for more details.
 * 
 *   This class also defines methods for replacing matched subsequences with
 *  new strings whose contents can, if desired, be computed from the match
 *  result.  The appendReplacement and appendTail methods can be used in tandem in order to collect
 *  the result into an existing string buffer, or the more convenient replaceAll method can be used to create a string in which every
 *  matching subsequence in the input sequence is replaced.
 * 
 *   The explicit state of a matcher includes the start and end indices of
 *  the most recent successful match.  It also includes the start and end
 *  indices of the input subsequence captured by each capturing group in the pattern as well as a total
 *  count of such subsequences.  As a convenience, methods are also provided for
 *  returning these captured subsequences in string form.
 * 
 *   The explicit state of a matcher is initially undefined; attempting to
 *  query any part of it before a successful match will cause an IllegalStateException to be thrown.  The explicit state of a matcher is
 *  recomputed by every match operation.
 * 
 *   The implicit state of a matcher includes the input character sequence as
 *  well as the append position, which is initially zero and is updated
 *  by the appendReplacement method.
 * 
 *   A matcher may be reset explicitly by invoking its reset()
 *  method or, if a new input sequence is desired, its reset(CharSequence) method.  Resetting a
 *  matcher discards its explicit state information and sets the append position
 *  to zero.
 * 
 *   Instances of this class are not safe for use by multiple concurrent
 *  threads. 
 */
final class Matcher extends Object with MatchResult {

    /** Implements a non-terminal append-and-replace step. */
    @stub
    def appendReplacement(sb: StringBuffer, replacement: String): Matcher = ???

    /** Implements a terminal append-and-replace step. */
    @stub
    def appendTail(sb: StringBuffer): StringBuffer = ???

    /** Returns the offset after the last character matched. */
    @stub
    def end(): Int = ???

    /** Returns the offset after the last character of the subsequence
     *  captured by the given group during the previous match operation.
     */
    @stub
    def end(group: Int): Int = ???

    /** Returns the offset after the last character of the subsequence
     *  captured by the given named-capturing
     *  group during the previous match operation.
     */
    @stub
    def end(name: String): Int = ???

    /** Attempts to find the next subsequence of the input sequence that matches
     *  the pattern.
     */
    @stub
    def find(): Boolean = ???

    /** Resets this matcher and then attempts to find the next subsequence of
     *  the input sequence that matches the pattern, starting at the specified
     *  index.
     */
    @stub
    def find(start: Int): Boolean = ???

    /** Returns the input subsequence matched by the previous match. */
    @stub
    def group(): String = ???

    /** Returns the input subsequence captured by the given group during the
     *  previous match operation.
     */
    @stub
    def group(group: Int): String = ???

    /** Returns the input subsequence captured by the given
     *  named-capturing group during the previous
     *  match operation.
     */
    @stub
    def group(name: String): String = ???

    /** Returns the number of capturing groups in this matcher's pattern. */
    @stub
    def groupCount(): Int = ???

    /** Queries the anchoring of region bounds for this matcher. */
    @stub
    def hasAnchoringBounds(): Boolean = ???

    /** Queries the transparency of region bounds for this matcher. */
    @stub
    def hasTransparentBounds(): Boolean = ???

    /** Returns true if the end of input was hit by the search engine in
     *  the last match operation performed by this matcher.
     */
    @stub
    def hitEnd(): Boolean = ???

    /** Attempts to match the input sequence, starting at the beginning of the
     *  region, against the pattern.
     */
    @stub
    def lookingAt(): Boolean = ???

    /** Attempts to match the entire region against the pattern. */
    @stub
    def matches(): Boolean = ???

    /** Returns the pattern that is interpreted by this matcher. */
    @stub
    def pattern(): Pattern = ???

    /** Sets the limits of this matcher's region. */
    @stub
    def region(start: Int, end: Int): Matcher = ???

    /** Reports the end index (exclusive) of this matcher's region. */
    @stub
    def regionEnd(): Int = ???

    /** Reports the start index of this matcher's region. */
    @stub
    def regionStart(): Int = ???

    /** Replaces every subsequence of the input sequence that matches the
     *  pattern with the given replacement string.
     */
    @stub
    def replaceAll(replacement: String): String = ???

    /** Replaces the first subsequence of the input sequence that matches the
     *  pattern with the given replacement string.
     */
    @stub
    def replaceFirst(replacement: String): String = ???

    /** Returns true if more input could change a positive match into a
     *  negative one.
     */
    @stub
    def requireEnd(): Boolean = ???

    /** Resets this matcher. */
    @stub
    def reset(): Matcher = ???

    /** Resets this matcher with a new input sequence. */
    @stub
    def reset(input: CharSequence): Matcher = ???

    /** Returns the start index of the previous match. */
    @stub
    def start(): Int = ???

    /** Returns the start index of the subsequence captured by the given group
     *  during the previous match operation.
     */
    @stub
    def start(group: Int): Int = ???

    /** Returns the start index of the subsequence captured by the given
     *  named-capturing group during the
     *  previous match operation.
     */
    @stub
    def start(name: String): Int = ???

    /** Returns the match state of this matcher as a MatchResult. */
    @stub
    def toMatchResult(): MatchResult = ???

    /** Returns the string representation of this matcher. */
    @stub
    def toString(): String = ???

    /** Sets the anchoring of region bounds for this matcher. */
    @stub
    def useAnchoringBounds(b: Boolean): Matcher = ???

    /** Changes the Pattern that this Matcher uses to
     *  find matches with.
     */
    @stub
    def usePattern(newPattern: Pattern): Matcher = ???

    /** Sets the transparency of region bounds for this matcher. */
    @stub
    def useTransparentBounds(b: Boolean): Matcher = ???
}

object Matcher {
    /** Returns a literal replacement String for the specified
     *  String.
     */
    @stub
    def quoteReplacement(s: String): String = ???
}
