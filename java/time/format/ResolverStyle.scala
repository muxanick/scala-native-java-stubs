package java.time.format

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** Enumeration of different ways to resolve dates and times.
 *  
 *  Parsing a text string occurs in two phases.
 *  Phase 1 is a basic text parse according to the fields added to the builder.
 *  Phase 2 resolves the parsed field-value pairs into date and/or time objects.
 *  This style is used to control how phase 2, resolving, happens.
 */
class ResolverStyle private (name: String, ordinal: Int) extends Enum[ResolverStyle](name, ordinal) {
}

object ResolverStyle {
    /** Style to resolve dates and times leniently. */
    final val LENIENT = new ResolverStyle(LENIENT, 0)

    /** Style to resolve dates and times in a smart, or intelligent, manner. */
    final val SMART = new ResolverStyle(SMART, 1)

    /** Style to resolve dates and times strictly. */
    final val STRICT = new ResolverStyle(STRICT, 2)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): ResolverStyle = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[ResolverStyle] = ???
}
