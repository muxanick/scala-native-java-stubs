package java.time.format

import java.lang.{Enum, Object, String}

// Enumeration of ways to handle the positive/negative sign.
// 
// The formatting engine allows the positive and negative signs of numbers
// to be controlled using this enum.
// See DateTimeFormatterBuilder for usage.
class SignStyle private (name: String, ordinal: Int) extends Enum[SignStyle](name, ordinal) {
}

object SignStyle {
    // Style to always output the sign, where zero will output '+'.
    final val ALWAYS = new SignStyle(ALWAYS, 0)

    // Style to always output the sign if the value exceeds the pad width.
    final val EXCEEDS_PAD = new SignStyle(EXCEEDS_PAD, 1)

    // Style to never output sign, only outputting the absolute value.
    final val NEVER = new SignStyle(NEVER, 2)

    // Style to output the sign only if the value is negative.
    final val NORMAL = new SignStyle(NORMAL, 3)

    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): SignStyle = ???
}
