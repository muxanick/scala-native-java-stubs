package javax.lang.model.element

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** The kind of an element.
 * 
 *  Note that it is possible additional element kinds will be added
 *  to accommodate new, currently unknown, language structures added to
 *  future versions of the Java™ programming language.
 */
class ElementKind private (name: String, ordinal: Int) extends Enum[ElementKind](name, ordinal) {
}

object ElementKind {
    /** An annotation type. */
    final val ANNOTATION_TYPE = new ElementKind(ANNOTATION_TYPE, 0)

    /** A class not described by a more specific kind (like ENUM). */
    final val CLASS = new ElementKind(CLASS, 1)

    /** A constructor. */
    final val CONSTRUCTOR = new ElementKind(CONSTRUCTOR, 2)

    /** An enum type. */
    final val ENUM = new ElementKind(ENUM, 3)

    /** An enum constant. */
    final val ENUM_CONSTANT = new ElementKind(ENUM_CONSTANT, 4)

    /** A parameter of an exception handler. */
    final val EXCEPTION_PARAMETER = new ElementKind(EXCEPTION_PARAMETER, 5)

    /** A field not described by a more specific kind (like
     *  ENUM_CONSTANT).
     */
    final val FIELD = new ElementKind(FIELD, 6)

    /** An instance initializer. */
    final val INSTANCE_INIT = new ElementKind(INSTANCE_INIT, 7)

    /** An interface not described by a more specific kind (like
     *  ANNOTATION_TYPE).
     */
    final val INTERFACE = new ElementKind(INTERFACE, 8)

    /** A local variable. */
    final val LOCAL_VARIABLE = new ElementKind(LOCAL_VARIABLE, 9)

    /** A method. */
    final val METHOD = new ElementKind(METHOD, 10)

    /** An implementation-reserved element. */
    final val OTHER = new ElementKind(OTHER, 11)

    /** A package. */
    final val PACKAGE = new ElementKind(PACKAGE, 12)

    /** A parameter of a method or constructor. */
    final val PARAMETER = new ElementKind(PARAMETER, 13)

    /** A resource variable. */
    final val RESOURCE_VARIABLE = new ElementKind(RESOURCE_VARIABLE, 14)

    /** A static initializer. */
    final val STATIC_INIT = new ElementKind(STATIC_INIT, 15)

    /** A type parameter. */
    final val TYPE_PARAMETER = new ElementKind(TYPE_PARAMETER, 16)

    /** Returns true if this is a kind of class:
     *  either CLASS or ENUM.
     */
    @stub
    def isClass(): Boolean = ???

    /** Returns true if this is a kind of field:
     *  either FIELD or ENUM_CONSTANT.
     */
    @stub
    def isField(): Boolean = ???

    /** Returns true if this is a kind of interface:
     *  either INTERFACE or ANNOTATION_TYPE.
     */
    @stub
    def isInterface(): Boolean = ???

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): ElementKind = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[ElementKind] = ???
}
