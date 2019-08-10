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

    /** Returns true if this kind corresponds to a primitive
     *  type and false otherwise.
     */
    @stub
    def isPrimitive(): Boolean = ???
}

object TypeKind {
    /** An array type. */
    final val ARRAY: TypeKind = new TypeKind("ARRAY", 0)

    /** The primitive type boolean. */
    final val BOOLEAN: TypeKind = new TypeKind("BOOLEAN", 1)

    /** The primitive type byte. */
    final val BYTE: TypeKind = new TypeKind("BYTE", 2)

    /** The primitive type char. */
    final val CHAR: TypeKind = new TypeKind("CHAR", 3)

    /** A class or interface type. */
    final val DECLARED: TypeKind = new TypeKind("DECLARED", 4)

    /** The primitive type double. */
    final val DOUBLE: TypeKind = new TypeKind("DOUBLE", 5)

    /** A class or interface type that could not be resolved. */
    final val ERROR: TypeKind = new TypeKind("ERROR", 6)

    /** A method, constructor, or initializer. */
    final val EXECUTABLE: TypeKind = new TypeKind("EXECUTABLE", 7)

    /** The primitive type float. */
    final val FLOAT: TypeKind = new TypeKind("FLOAT", 8)

    /** The primitive type int. */
    final val INT: TypeKind = new TypeKind("INT", 9)

    /** An intersection type. */
    final val INTERSECTION: TypeKind = new TypeKind("INTERSECTION", 10)

    /** The primitive type long. */
    final val LONG: TypeKind = new TypeKind("LONG", 11)

    /** A pseudo-type used where no actual type is appropriate. */
    final val NONE: TypeKind = new TypeKind("NONE", 12)

    /** The null type. */
    final val NULL: TypeKind = new TypeKind("NULL", 13)

    /** An implementation-reserved type. */
    final val OTHER: TypeKind = new TypeKind("OTHER", 14)

    /** A pseudo-type corresponding to a package element. */
    final val PACKAGE: TypeKind = new TypeKind("PACKAGE", 15)

    /** The primitive type short. */
    final val SHORT: TypeKind = new TypeKind("SHORT", 16)

    /** A type variable. */
    final val TYPEVAR: TypeKind = new TypeKind("TYPEVAR", 17)

    /** A union type. */
    final val UNION: TypeKind = new TypeKind("UNION", 18)

    /** The pseudo-type corresponding to the keyword void. */
    final val VOID: TypeKind = new TypeKind("VOID", 19)

    /** A wildcard type argument. */
    final val WILDCARD: TypeKind = new TypeKind("WILDCARD", 20)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): TypeKind = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[TypeKind] = ???
}
