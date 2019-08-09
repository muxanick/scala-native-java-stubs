package java.util.regex

import java.lang.{Exception, IllegalArgumentException, Object, RuntimeException, String, Throwable}

// Unchecked exception thrown to indicate a syntax error in a
// regular-expression pattern.
class PatternSyntaxException extends IllegalArgumentException {

    @stub
    // Retrieves the description of the error.
    def getDescription(): String = ???

    @stub
    // Retrieves the error index.
    def getIndex(): Int = ???

    @stub
    // Returns a multi-line string containing the description of the syntax
    // error and its index, the erroneous regular-expression pattern, and a
    // visual indication of the error index within the pattern.
    def getMessage(): String = ???
}
