package java.net

import java.lang.{Exception, Object, String, Throwable}

// Checked exception thrown to indicate that a string could not be parsed as a
// URI reference.
class URISyntaxException extends Exception {

    @stub
    // Constructs an instance from the given input string and reason.
    def this(input: String, reason: String) = ???

    @stub
    // Returns an index into the input string of the position at which the
    // parse error occurred, or -1 if this position is not known.
    def getIndex(): Int = ???

    @stub
    // Returns the input string.
    def getInput(): String = ???

    @stub
    // Returns a string describing the parse error.
    def getMessage(): String = ???
}
