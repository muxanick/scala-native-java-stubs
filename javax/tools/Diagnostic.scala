package javax.tools

import java.lang.String
import java.util.Locale

// Interface for diagnostics from tools.  A diagnostic usually reports
// a problem at a specific position in a source file.  However, not
// all diagnostics are associated with a position or a file.
//
// A position is a zero-based character offset from the beginning of
// a file.  Negative values (except NOPOS) are not valid
// positions.
//
// Line and column numbers begin at 1.  Negative values (except
// NOPOS) and 0 are not valid line or column numbers.
trait Diagnostic[S] {

    @stub
    // Gets a diagnostic code indicating the type of diagnostic.
    def getCode(): String = ???

    @stub
    // Gets the column number of the character offset returned by
    // getPosition().
    def getColumnNumber(): Long = ???

    @stub
    // Gets the character offset from the beginning of the file
    // associated with this diagnostic that indicates the end of the
    // problem.
    def getEndPosition(): Long = ???

    @stub
    // Gets the kind of this diagnostic, for example, error or
    // warning.
    def getKind(): Diagnostic.Kind = ???

    @stub
    // Gets the line number of the character offset returned by
    // getPosition().
    def getLineNumber(): Long = ???

    @stub
    // Gets a localized message for the given locale.
    def getMessage(locale: Locale): String = ???

    @stub
    // Gets a character offset from the beginning of the source object
    // associated with this diagnostic that indicates the location of
    // the problem.
    def getPosition(): Long = ???

    @stub
    // Gets the source object associated with this diagnostic.
    def getSource(): S = ???
}
