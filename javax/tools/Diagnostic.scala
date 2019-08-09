package javax.tools

import java.lang.String
import java.util.Locale
import scala.scalanative.annotation.stub

/** Interface for diagnostics from tools.  A diagnostic usually reports
 *  a problem at a specific position in a source file.  However, not
 *  all diagnostics are associated with a position or a file.
 * 
 *  A position is a zero-based character offset from the beginning of
 *  a file.  Negative values (except NOPOS) are not valid
 *  positions.
 * 
 *  Line and column numbers begin at 1.  Negative values (except
 *  NOPOS) and 0 are not valid line or column numbers.
 */
trait Diagnostic[S] {

    /** Gets a diagnostic code indicating the type of diagnostic. */
    @stub
    def getCode(): String = ???

    /** Gets the column number of the character offset returned by
     *  getPosition().
     */
    @stub
    def getColumnNumber(): Long = ???

    /** Gets the character offset from the beginning of the file
     *  associated with this diagnostic that indicates the end of the
     *  problem.
     */
    @stub
    def getEndPosition(): Long = ???

    /** Gets the kind of this diagnostic, for example, error or
     *  warning.
     */
    @stub
    def getKind(): Diagnostic.Kind = ???

    /** Gets the line number of the character offset returned by
     *  getPosition().
     */
    @stub
    def getLineNumber(): Long = ???

    /** Gets a localized message for the given locale. */
    @stub
    def getMessage(locale: Locale): String = ???

    /** Gets a character offset from the beginning of the source object
     *  associated with this diagnostic that indicates the location of
     *  the problem.
     */
    @stub
    def getPosition(): Long = ???

    /** Gets the source object associated with this diagnostic. */
    @stub
    def getSource(): S = ???

    /** Gets the character offset from the beginning of the file
     *  associated with this diagnostic that indicates the start of the
     *  problem.
     */
    @stub
    def getStartPosition(): Long = ???
}

object Diagnostic {
    /** Kinds of diagnostics, for example, error or warning. */
    @stub
    object Kind extends Diagnostic.Kind

    /** Used to signal that no position is available. */
    @stub
    val NOPOS: Long = ???
}
