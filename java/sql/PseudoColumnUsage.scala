package java.sql

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** Enumeration for pseudo/hidden column usage. */
class PseudoColumnUsage private (name: String, ordinal: Int) extends Enum[PseudoColumnUsage](name, ordinal) {
}

object PseudoColumnUsage {
    /** There are no restrictions on the usage of the pseudo/hidden columns. */
    final val NO_USAGE_RESTRICTIONS: PseudoColumnUsage = new PseudoColumnUsage("NO_USAGE_RESTRICTIONS", 0)

    /** The pseudo/hidden column may only be used in a SELECT list. */
    final val SELECT_LIST_ONLY: PseudoColumnUsage = new PseudoColumnUsage("SELECT_LIST_ONLY", 1)

    /** The usage of the pseudo/hidden column cannot be determined. */
    final val USAGE_UNKNOWN: PseudoColumnUsage = new PseudoColumnUsage("USAGE_UNKNOWN", 2)

    /** The pseudo/hidden column may only be used in a WHERE clause. */
    final val WHERE_CLAUSE_ONLY: PseudoColumnUsage = new PseudoColumnUsage("WHERE_CLAUSE_ONLY", 3)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): PseudoColumnUsage = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[PseudoColumnUsage] = ???
}
