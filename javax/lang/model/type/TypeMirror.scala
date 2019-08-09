package javax.lang.model.type

import java.lang.{Object, String}
import javax.lang.model.AnnotatedConstruct
import scala.scalanative.annotation.stub

/** Represents a type in the Java programming language.
 *  Types include primitive types, declared types (class and interface types),
 *  array types, type variables, and the null type.
 *  Also represented are wildcard type arguments,
 *  the signature and return types of executables,
 *  and pseudo-types corresponding to packages and to the keyword void.
 * 
 *   Types should be compared using the utility methods in Types.  There is no guarantee that any particular type will always
 *  be represented by the same object.
 * 
 *   To implement operations based on the class of an TypeMirror object, either use a visitor
 *  or use the result of the getKind() method.  Using instanceof is not necessarily a reliable idiom for
 *  determining the effective class of an object in this modeling
 *  hierarchy since an implementation may choose to have a single
 *  object implement multiple TypeMirror subinterfaces.
 */
trait TypeMirror extends AnnotatedConstruct {

    /** Applies a visitor to this type. */
    @stub
    def accept[R, P](v: TypeVisitor[R, P], p: P): R = ???

    /** Obeys the general contract of Object.equals. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns the kind of this type. */
    @stub
    def getKind(): TypeKind = ???

    /** Obeys the general contract of Object.hashCode. */
    @stub
    def hashCode(): Int = ???

    /** Returns an informative string representation of this type. */
    @stub
    def toString(): String = ???
}
