package javax.lang.model.type

// A visitor of types, in the style of the
// visitor design pattern.  Classes implementing this
// interface are used to operate on a type when the kind of
// type is unknown at compile time.  When a visitor is passed to a
// type's accept method, the visitXYZ
// method most applicable to that type is invoked.
//
//  Classes implementing this interface may or may not throw a
// NullPointerException if the additional parameter p
// is null; see documentation of the implementing class for
// details.
//
//  WARNING: It is possible that methods will be added to
// this interface to accommodate new, currently unknown, language
// structures added to future versions of the Java™ programming
// language.  Therefore, visitor classes directly implementing this
// interface may be source incompatible with future versions of the
// platform.  To avoid this source incompatibility, visitor
// implementations are encouraged to instead extend the appropriate
// abstract visitor class that implements this interface.  However, an
// API should generally use this visitor interface as the type for
// parameters, return type, etc. rather than one of the abstract
// classes.
//
// Note that methods to accommodate new language constructs could
// be added in a source compatible way if they were added as
// default methods.  However, default methods are only
// available on Java SE 8 and higher releases and the javax.lang.model.* packages bundled in Java SE 8 are required to
// also be runnable on Java SE 7.  Therefore, default methods
// cannot be used when extending javax.lang.model.*
// to cover Java SE 8 language features.  However, default methods may
// be used in subsequent revisions of the javax.lang.model.*
// packages that are only required to run on Java SE 8 and higher
// platform versions.
trait TypeVisitor[R, P] {

    @stub
    // A convenience method equivalent to v.visit(t, null).
    def visit(t: TypeMirror): R = ???

    @stub
    // Visits a type.
    def visit(t: TypeMirror, p: P): R = ???

    @stub
    // Visits an array type.
    def visitArray(t: ArrayType, p: P): R = ???

    @stub
    // Visits a declared type.
    def visitDeclared(t: DeclaredType, p: P): R = ???

    @stub
    // Visits an error type.
    def visitError(t: ErrorType, p: P): R = ???

    @stub
    // Visits an executable type.
    def visitExecutable(t: ExecutableType, p: P): R = ???

    @stub
    // Visits an intersection type.
    def visitIntersection(t: IntersectionType, p: P): R = ???

    @stub
    // Visits a NoType instance.
    def visitNoType(t: NoType, p: P): R = ???

    @stub
    // Visits the null type.
    def visitNull(t: NullType, p: P): R = ???

    @stub
    // Visits a primitive type.
    def visitPrimitive(t: PrimitiveType, p: P): R = ???

    @stub
    // Visits a type variable.
    def visitTypeVariable(t: TypeVariable, p: P): R = ???

    @stub
    // Visits a union type.
    def visitUnion(t: UnionType, p: P): R = ???

    @stub
    // Visits an unknown kind of type.
    def visitUnknown(t: TypeMirror, p: P): R = ???
}
