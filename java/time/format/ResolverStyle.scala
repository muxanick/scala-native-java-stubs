package java.time.format

import java.lang.{Enum, Object, String}

// Enumeration of different ways to resolve dates and times.
// 
// Parsing a text string occurs in two phases.
// Phase 1 is a basic text parse according to the fields added to the builder.
// Phase 2 resolves the parsed field-value pairs into date and/or time objects.
// This style is used to control how phase 2, resolving, happens.
class ResolverStyle private (name: String, ordinal: Int) extends Enum[ResolverStyle](name, ordinal) {
}

object ResolverStyle {
    // Style to resolve dates and times leniently.
    final val LENIENT = new ResolverStyle(LENIENT, 0)

    // Style to resolve dates and times in a smart, or intelligent, manner.
    final val SMART = new ResolverStyle(SMART, 1)

    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): ResolverStyle = ???
}
