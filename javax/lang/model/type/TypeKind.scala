package javax.lang.model.type

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** The kind of a type mirror.
 * 
 *  Note that it is possible additional type kinds will be added to
 *  accommodate new, currently unknown, language structures added to
 *  future versions of the Java™ programming language.
 */
class TypeKind private (name: String, ordinal: Int) extends Enum[TypeKind](name, ordinal) {
}

object TypeKind {
    /** An array type. */
    final val ARRAY = new TypeKind(ARRAY, 0)

    /** The primitive type boolean. */
    final val BOOLEAN = new TypeKind(BOOLEAN, 1)

    /** The primitive type byte. */
    final val BYTE = new TypeKind(BYTE, 2)

    /** The primitive type char. */
    final val CHAR = new TypeKind(CHAR, 3)

    /** A class or interface type. */
    final val DECLARED = new TypeKind(DECLARED, 4)

    /** The primitive type double. */
    final val DOUBLE = new TypeKind(DOUBLE, 5)

    /** A class or interface type that could not be resolved. */
    final val ERROR = new TypeKind(ERROR, 6)

    /** A method, constructor, or initializer. */
    final val EXECUTABLE = new TypeKind(EXECUTABLE, 7)

    /** The primitive type float. */
    final val FLOAT = new TypeKind(FLOAT, 8)

    /** The primitive type int. */
    final val INT = new TypeKind(INT, 9)

    /** An intersection type. */
    final val INTERSECTION = new TypeKind(INTERSECTION, 10)

    /** The primitive type long. */
    final val LONG = new TypeKind(LONG, 11)

    /** A pseudo-type used where no actual type is appropriate. */
    final val NONE = new TypeKind(NONE, 12)

    /** The null type. */
    final val NULL = new TypeKind(NULL, 13)

    /** An implementation-reserved type. */
    final val OTHER = new TypeKind(OTHER, 14)

    /** A pseudo-type corresponding to a package element. */
    final val PACKAGE = new TypeKind(PACKAGE, 15)

    /** The primitive type short. */
    final val SHORT = new TypeKind(SHORT, 16)

    /** A type variable. */
    final val TYPEVAR = new TypeKind(TYPEVAR, 17)

    /** A union type. */
    final val UNION = new TypeKind(UNION, 18)

    /** The pseudo-type corresponding to the keyword void. */
    final val VOID = new TypeKind(VOID, 19)

    /** A wildcard type argument. */
    final val WILDCARD = new TypeKind(WILDCARD, 20)

    /** Returns true if this kind corresponds to a primitive
     *  type and false otherwise.
     */
    @stub
    def isPrimitive(): Boolean = ???

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): TypeKind = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[TypeKind] = ???
}
