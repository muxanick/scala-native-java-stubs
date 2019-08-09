package javax.lang.model.util

import java.util.List
import javax.lang.model.element.{Element, TypeElement}
import javax.lang.model.type.{ArrayType, DeclaredType, ExecutableType, NoType, NullType, PrimitiveType, TypeKind, TypeMirror, WildcardType}
import scala.scalanative.annotation.stub

/** Utility methods for operating on types.
 * 
 *  Compatibility Note: Methods may be added to this interface
 *  in future releases of the platform.
 */
trait Types {

    /** Returns the element corresponding to a type. */
    @stub
    def asElement(t: TypeMirror): Element = ???

    /** Returns the type of an element when that element is viewed as
     *  a member of, or otherwise directly contained by, a given type.
     */
    @stub
    def asMemberOf(containing: DeclaredType, element: Element): TypeMirror = ???

    /** Returns the class of a boxed value of a given primitive type. */
    @stub
    def boxedClass(p: PrimitiveType): TypeElement = ???

    /** Applies capture conversion to a type. */
    @stub
    def capture(t: TypeMirror): TypeMirror = ???

    /** Tests whether one type argument contains another. */
    @stub
    def contains(t1: TypeMirror, t2: TypeMirror): Boolean = ???

    /** Returns the direct supertypes of a type. */
    @stub
    def directSupertypes(t: TypeMirror): List[_ <: TypeMirror] = ???

    /** Returns the erasure of a type. */
    @stub
    def erasure(t: TypeMirror): TypeMirror = ???

    /** Returns an array type with the specified component type. */
    @stub
    def getArrayType(componentType: TypeMirror): ArrayType = ???

    /** Returns the type corresponding to a type element
     *  and actual type arguments, given a
     *  containing type
     *  of which it is a member.
     */
    @stub
    def getDeclaredType(containing: DeclaredType, typeElem: TypeElement, typeArgs: TypeMirror*): DeclaredType = ???

    /** Returns the type corresponding to a type element and
     *  actual type arguments.
     */
    @stub
    def getDeclaredType(typeElem: TypeElement, typeArgs: TypeMirror*): DeclaredType = ???

    /** Returns a pseudo-type used where no actual type is appropriate. */
    @stub
    def getNoType(kind: TypeKind): NoType = ???

    /** Returns the null type. */
    @stub
    def getNullType(): NullType = ???

    /** Returns a primitive type. */
    @stub
    def getPrimitiveType(kind: TypeKind): PrimitiveType = ???

    /** Returns a new wildcard type argument. */
    @stub
    def getWildcardType(extendsBound: TypeMirror, superBound: TypeMirror): WildcardType = ???

    /** Tests whether one type is assignable to another. */
    @stub
    def isAssignable(t1: TypeMirror, t2: TypeMirror): Boolean = ???

    /** Tests whether two TypeMirror objects represent the same type. */
    @stub
    def isSameType(t1: TypeMirror, t2: TypeMirror): Boolean = ???

    /** Tests whether the signature of one method is a subsignature
     *  of another.
     */
    @stub
    def isSubsignature(m1: ExecutableType, m2: ExecutableType): Boolean = ???

    /** Tests whether one type is a subtype of another. */
    @stub
    def isSubtype(t1: TypeMirror, t2: TypeMirror): Boolean = ???

    /** Returns the type (a primitive type) of unboxed values of a given type. */
    @stub
    def unboxedType(t: TypeMirror): PrimitiveType = ???
}
