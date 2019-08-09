package javax.lang.model.util

import java.util.List
import javax.lang.model.element.{Element, TypeElement}
import javax.lang.model.type.{ArrayType, DeclaredType, ExecutableType, NoType, NullType, PrimitiveType, TypeKind, TypeMirror, WildcardType}

// Utility methods for operating on types.
//
// Compatibility Note: Methods may be added to this interface
// in future releases of the platform.
trait Types {

    @stub
    // Returns the element corresponding to a type.
    def asElement(t: TypeMirror): Element = ???

    @stub
    // Returns the type of an element when that element is viewed as
    // a member of, or otherwise directly contained by, a given type.
    def asMemberOf(containing: DeclaredType, element: Element): TypeMirror = ???

    @stub
    // Returns the class of a boxed value of a given primitive type.
    def boxedClass(p: PrimitiveType): TypeElement = ???

    @stub
    // Applies capture conversion to a type.
    def capture(t: TypeMirror): TypeMirror = ???

    @stub
    // Tests whether one type argument contains another.
    def contains(t1: TypeMirror, t2: TypeMirror): Boolean = ???

    @stub
    // Returns the direct supertypes of a type.
    def directSupertypes(t: TypeMirror): List[_ <: TypeMirror] = ???

    @stub
    // Returns the erasure of a type.
    def erasure(t: TypeMirror): TypeMirror = ???

    @stub
    // Returns an array type with the specified component type.
    def getArrayType(componentType: TypeMirror): ArrayType = ???

    @stub
    // Returns the type corresponding to a type element
    // and actual type arguments, given a
    // containing type
    // of which it is a member.
    def getDeclaredType(containing: DeclaredType, typeElem: TypeElement, typeArgs: TypeMirror*): DeclaredType = ???

    @stub
    // Returns the type corresponding to a type element and
    // actual type arguments.
    def getDeclaredType(typeElem: TypeElement, typeArgs: TypeMirror*): DeclaredType = ???

    @stub
    // Returns a pseudo-type used where no actual type is appropriate.
    def getNoType(kind: TypeKind): NoType = ???

    @stub
    // Returns the null type.
    def getNullType(): NullType = ???

    @stub
    // Returns a primitive type.
    def getPrimitiveType(kind: TypeKind): PrimitiveType = ???

    @stub
    // Returns a new wildcard type argument.
    def getWildcardType(extendsBound: TypeMirror, superBound: TypeMirror): WildcardType = ???

    @stub
    // Tests whether one type is assignable to another.
    def isAssignable(t1: TypeMirror, t2: TypeMirror): Boolean = ???

    @stub
    // Tests whether two TypeMirror objects represent the same type.
    def isSameType(t1: TypeMirror, t2: TypeMirror): Boolean = ???

    @stub
    // Tests whether the signature of one method is a subsignature
    // of another.
    def isSubsignature(m1: ExecutableType, m2: ExecutableType): Boolean = ???

    @stub
    // Tests whether one type is a subtype of another.
    def isSubtype(t1: TypeMirror, t2: TypeMirror): Boolean = ???
}
