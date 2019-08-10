package javax.tools

import java.lang.{Enum, Object, String}
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
    /** Kinds of diagnostics, for example, error or warning.
     * 
     *  The kind of a diagnostic can be used to determine how the
     *  diagnostic should be presented to the user. For example,
     *  errors might be colored red or prefixed with the word "Error",
     *  while warnings might be colored yellow or prefixed with the
     *  word "Warning". There is no requirement that the Kind
     *  should imply any inherent semantic meaning to the message
     *  of the diagnostic: for example, a tool might provide an
     *  option to report all warnings as errors.
     */
    class Kind private (name: String, ordinal: Int) extends Enum[Kind](name, ordinal) {
    }

    object Kind {
        /** Problem which prevents the tool's normal completion. */
        final val ERROR: Kind = new Kind("ERROR", 0)

        /** Problem similar to a warning, but is mandated by the tool's
         *  specification.
         */
        final val MANDATORY_WARNING: Kind = new Kind("MANDATORY_WARNING", 1)

        /** Informative message from the tool. */
        final val NOTE: Kind = new Kind("NOTE", 2)

        /** Diagnostic which does not fit within the other kinds. */
        final val OTHER: Kind = new Kind("OTHER", 3)

        /** Problem which does not usually prevent the tool from
         *  completing normally.
         */
        final val WARNING: Kind = new Kind("WARNING", 4)

        /** Returns the enum constant of this type with the specified name. */
        @stub
        def valueOf(name: String): Kind = ???

        /** Returns an array containing the constants of this enum type, in
         * the order they are declared.
         */
        @stub
        def values(): Array[Kind] = ???
    }


    /** Used to signal that no position is available. */
    @stub
    val NOPOS: Long = ???
}
