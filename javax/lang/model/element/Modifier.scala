package javax.lang.model.element

import java.lang.{Enum, Object, String}

/** Represents a modifier on a program element such
 *  as a class, method, or field.
 * 
 *  Not all modifiers are applicable to all kinds of elements.
 *  When two or more modifiers appear in the source code of an element
 *  then it is customary, though not required, that they appear in the same
 *  order as the constants listed in the detail section below.
 * 
 *  Note that it is possible additional modifiers will be added in
 *  future versions of the platform.
 */
class Modifier private (name: String, ordinal: Int) extends Enum[Modifier](name, ordinal) {
}

object Modifier {
    /** The modifier abstract */
    final val ABSTRACT = new Modifier(ABSTRACT, 0)

    /** The modifier default */
    final val DEFAULT = new Modifier(DEFAULT, 1)

    /** The modifier final */
    final val FINAL = new Modifier(FINAL, 2)

    /** The modifier native */
    final val NATIVE = new Modifier(NATIVE, 3)

    /** The modifier private */
    final val PRIVATE = new Modifier(PRIVATE, 4)

    /** The modifier protected */
    final val PROTECTED = new Modifier(PROTECTED, 5)

    /** The modifier public */
    final val PUBLIC = new Modifier(PUBLIC, 6)

    /** The modifier static */
    final val STATIC = new Modifier(STATIC, 7)

    /** The modifier strictfp */
    final val STRICTFP = new Modifier(STRICTFP, 8)

    /** The modifier synchronized */
    final val SYNCHRONIZED = new Modifier(SYNCHRONIZED, 9)

    /** The modifier transient */
    final val TRANSIENT = new Modifier(TRANSIENT, 10)

    /** Returns this modifier's name in lowercase. */
    @stub
    def toString(): String = ???

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): Modifier = ???
}
