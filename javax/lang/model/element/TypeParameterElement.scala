package javax.lang.model.element

import java.util.List
import javax.lang.model.type.TypeMirror

// Represents a formal type parameter of a generic class, interface, method,
// or constructor element.
// A type parameter declares a TypeVariable.
trait TypeParameterElement extends Element {

    @stub
    // Returns the bounds of this type parameter.
    def getBounds(): List[_ <: TypeMirror] = ???

    @stub
    // Returns the generic element of this type parameter.
    def getEnclosingElement(): Element = ???
}
