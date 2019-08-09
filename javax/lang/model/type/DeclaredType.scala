package javax.lang.model.type

import javax.lang.model.element.Element

// Represents a declared type, either a class type or an interface type.
// This includes parameterized types such as java.util.Set<String>
// as well as raw types.
//
//  While a TypeElement represents a class or interface
// element, a DeclaredType represents a class
// or interface type, the latter being a use
// (or invocation) of the former.
// See TypeElement for more on this distinction.
//
//  The supertypes (both class and interface types) of a declared
// type may be found using the Types.directSupertypes(TypeMirror) method.  This returns the
// supertypes with any type arguments substituted in.
trait DeclaredType extends ReferenceType {

    @stub
    // Returns the element corresponding to this type.
    def asElement(): Element = ???

    @stub
    // Returns the type of the innermost enclosing instance or a
    // NoType of kind NONE if there is no enclosing
    // instance.
    def getEnclosingType(): TypeMirror = ???
}
