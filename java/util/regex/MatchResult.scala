package java.util.regex

import java.lang.String
import scala.scalanative.annotation.stub

/** The result of a match operation.
 * 
 *  This interface contains query methods used to determine the
 *  results of a match against a regular expression. The match boundaries,
 *  groups and group boundaries can be seen but not modified through
 *  a MatchResult.
 */
trait MatchResult {

    /** Returns the offset after the last character matched. */
    @stub
    def end(): Int = ???

    /** Returns the offset after the last character of the subsequence
     *  captured by the given group during this match.
     */
    @stub
    def end(group: Int): Int = ???

    /** Returns the input subsequence matched by the previous match. */
    @stub
    def group(): String = ???

    /** Returns the input subsequence captured by the given group during the
     *  previous match operation.
     */
    @stub
    def group(group: Int): String = ???

    /** Returns the number of capturing groups in this match result's pattern. */
    @stub
    def groupCount(): Int = ???

    /** Returns the start index of the match. */
    @stub
    def start(): Int = ???

    /** Returns the start index of the subsequence captured by the given group
     *  during this match.
     */
    @stub
    def start(group: Int): Int = ???
}
