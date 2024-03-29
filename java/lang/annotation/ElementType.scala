package java.lang.annotation

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** The constants of this enumerated type provide a simple classification of the
 *  syntactic locations where annotations may appear in a Java program. These
 *  constants are used in java.lang.annotation.Target
 *  meta-annotations to specify where it is legal to write annotations of a
 *  given type.
 * 
 *  The syntactic locations where annotations may appear are split into
 *  declaration contexts , where annotations apply to declarations, and
 *  type contexts , where annotations apply to types used in
 *  declarations and expressions.
 * 
 *  The constants ANNOTATION_TYPE , CONSTRUCTOR , FIELD , LOCAL_VARIABLE , METHOD , PACKAGE ,
 *  PARAMETER , TYPE , and TYPE_PARAMETER correspond
 *  to the declaration contexts in JLS 9.6.4.1.
 * 
 *  For example, an annotation whose type is meta-annotated with
 *  @Target(ElementType.FIELD) may only be written as a modifier for a
 *  field declaration.
 * 
 *  The constant TYPE_USE corresponds to the 15 type contexts in JLS
 *  4.11, as well as to two declaration contexts: type declarations (including
 *  annotation type declarations) and type parameter declarations.
 * 
 *  For example, an annotation whose type is meta-annotated with
 *  @Target(ElementType.TYPE_USE) may be written on the type of a field
 *  (or within the type of the field, if it is a nested, parameterized, or array
 *  type), and may also appear as a modifier for, say, a class declaration.
 * 
 *  The TYPE_USE constant includes type declarations and type
 *  parameter declarations as a convenience for designers of type checkers which
 *  give semantics to annotation types. For example, if the annotation type
 *  NonNull is meta-annotated with
 *  @Target(ElementType.TYPE_USE), then @NonNull
 *  class C {...} could be treated by a type checker as indicating that
 *  all variables of class C are non-null, while still allowing
 *  variables of other classes to be non-null or not non-null based on whether
 *  @NonNull appears at the variable's declaration.
 */
class ElementType private (name: String, ordinal: Int) extends Enum[ElementType](name, ordinal) {
}

object ElementType {
    /** Annotation type declaration */
    final val ANNOTATION_TYPE: ElementType = new ElementType("ANNOTATION_TYPE", 0)

    /** Constructor declaration */
    final val CONSTRUCTOR: ElementType = new ElementType("CONSTRUCTOR", 1)

    /** Field declaration (includes enum constants) */
    final val FIELD: ElementType = new ElementType("FIELD", 2)

    /** Local variable declaration */
    final val LOCAL_VARIABLE: ElementType = new ElementType("LOCAL_VARIABLE", 3)

    /** Method declaration */
    final val METHOD: ElementType = new ElementType("METHOD", 4)

    /** Package declaration */
    final val PACKAGE: ElementType = new ElementType("PACKAGE", 5)

    /** Formal parameter declaration */
    final val PARAMETER: ElementType = new ElementType("PARAMETER", 6)

    /** Class, interface (including annotation type), or enum declaration */
    final val TYPE: ElementType = new ElementType("TYPE", 7)

    /** Type parameter declaration */
    final val TYPE_PARAMETER: ElementType = new ElementType("TYPE_PARAMETER", 8)

    /** Use of a type */
    final val TYPE_USE: ElementType = new ElementType("TYPE_USE", 9)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): ElementType = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[ElementType] = ???
}
