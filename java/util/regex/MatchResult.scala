package java.util.regex

import java.lang.String

// The result of a match operation.
//
// This interface contains query methods used to determine the
// results of a match against a regular expression. The match boundaries,
// groups and group boundaries can be seen but not modified through
// a MatchResult.
trait MatchResult {

    @stub
    // Returns the offset after the last character matched.
    def end(): Int = ???

    @stub
    // Returns the offset after the last character of the subsequence
    // captured by the given group during this match.
    def end(group: Int): Int = ???

    @stub
    // Returns the input subsequence matched by the previous match.
    def group(): String = ???

    @stub
    // Returns the input subsequence captured by the given group during the
    // previous match operation.
    def group(group: Int): String = ???

    @stub
    // Returns the number of capturing groups in this match result's pattern.
    def groupCount(): Int = ???

    @stub
    // Returns the start index of the match.
    def start(): Int = ???
}
