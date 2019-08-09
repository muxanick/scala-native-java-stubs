package javax.tools

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

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
class Diagnostic.Kind private (name: String, ordinal: Int) extends Enum[Diagnostic.Kind](name, ordinal) {
}

object Diagnostic.Kind {
    /** Problem which prevents the tool's normal completion. */
    final val ERROR = new Diagnostic.Kind(ERROR, 0)

    /** Problem similar to a warning, but is mandated by the tool's
     *  specification.
     */
    final val MANDATORY_WARNING = new Diagnostic.Kind(MANDATORY_WARNING, 1)

    /** Informative message from the tool. */
    final val NOTE = new Diagnostic.Kind(NOTE, 2)

    /** Diagnostic which does not fit within the other kinds. */
    final val OTHER = new Diagnostic.Kind(OTHER, 3)

    /** Problem which does not usually prevent the tool from
     *  completing normally.
     */
    final val WARNING = new Diagnostic.Kind(WARNING, 4)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): Diagnostic.Kind = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[Diagnostic.Kind] = ???
}
