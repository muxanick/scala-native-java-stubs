package java.lang.reflect

// TypeVariable is the common superinterface for type variables of kinds.
// A type variable is created the first time it is needed by a reflective
// method, as specified in this package.  If a type variable t is referenced
// by a type (i.e, class, interface or annotation type) T, and T is declared
// by the nth enclosing class of T (see JLS 8.1.2), then the creation of t
// requires the resolution (see JVMS 5) of the ith enclosing class of T,
// for i = 0 to n, inclusive. Creating a type variable must not cause the
// creation of its bounds. Repeated creation of a type variable has no effect.
//
// Multiple objects may be instantiated at run-time to
// represent a given type variable. Even though a type variable is
// created only once, this does not imply any requirement to cache
// instances representing the type variable. However, all instances
// representing a type variable must be equal() to each other.
// As a consequence, users of type variables must not rely on the identity
// of instances of classes implementing this interface.
trait TypeVariable[D <: GenericDeclaration] extends Type , AnnotatedElement {

    @stub
    // Returns an array of AnnotatedType objects that represent the use of
    // types to denote the upper bounds of the type parameter represented by
    // this TypeVariable.
    def getAnnotatedBounds(): Array[AnnotatedType] = ???

    @stub
    // Returns an array of Type objects representing the
    // upper bound(s) of this type variable.
    def getBounds(): Array[Type] = ???

    @stub
    // Returns the GenericDeclaration object representing the
    // generic declaration declared this type variable.
    def getGenericDeclaration(): D = ???
}
