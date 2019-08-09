package java.lang

import scala.scalanative.annotation.stub

/** Thrown when an application tries to access an enum constant by name
 *  and the enum type contains no constant with the specified name.
 *  This exception can be thrown by the API used to read annotations
 *  reflectively.
 */
class EnumConstantNotPresentException extends RuntimeException {

    /** Constructs an EnumConstantNotPresentException for the
     *  specified constant.
     */
    @stub
    def this(enumType: Class[_ <: Enum], constantName: String) = ???

    /** Returns the name of the missing enum constant. */
    @stub
    def constantName(): String = ???

    /** Returns the type of the missing enum constant. */
    @stub
    def enumType(): Class[_ <: Enum] = ???
}
