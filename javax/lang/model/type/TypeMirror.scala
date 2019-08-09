package javax.lang.model.type

import java.lang.Object
import javax.lang.model.AnnotatedConstruct

// Represents a type in the Java programming language.
// Types include primitive types, declared types (class and interface types),
// array types, type variables, and the null type.
// Also represented are wildcard type arguments,
// the signature and return types of executables,
// and pseudo-types corresponding to packages and to the keyword void.
//
//  Types should be compared using the utility methods in Types.  There is no guarantee that any particular type will always
// be represented by the same object.
//
//  To implement operations based on the class of an TypeMirror object, either use a visitor
// or use the result of the getKind() method.  Using instanceof is not necessarily a reliable idiom for
// determining the effective class of an object in this modeling
// hierarchy since an implementation may choose to have a single
// object implement multiple TypeMirror subinterfaces.
trait TypeMirror extends AnnotatedConstruct {

    @stub
    // Applies a visitor to this type.
    def R: [R, P] = ???

    @stub
    // Obeys the general contract of Object.equals.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the kind of this type.
    def getKind(): TypeKind = ???

    @stub
    // Obeys the general contract of Object.hashCode.
    def hashCode(): Int = ???
}
