package javax.lang.model.element

import java.util.List
import javax.lang.model.type.TypeMirror

// Represents a method, constructor, or initializer (static or
// instance) of a class or interface, including annotation type
// elements.
trait ExecutableElement extends Element , Parameterizable {

    @stub
    // Returns the default value if this executable is an annotation
    // type element.
    def getDefaultValue(): AnnotationValue = ???

    @stub
    // Returns the formal parameters of this executable.
    def getParameters(): List[_ <: VariableElement] = ???

    @stub
    // Returns the receiver type of this executable,
    // or NoType with
    // kind NONE
    // if the executable has no receiver type.
    def getReceiverType(): TypeMirror = ???

    @stub
    // Returns the return type of this executable.
    def getReturnType(): TypeMirror = ???

    @stub
    // Returns the simple name of a constructor, method, or
    // initializer.
    def getSimpleName(): Name = ???

    @stub
    // Returns the exceptions and other throwables listed in this
    // method or constructor's throws clause in declaration
    // order.
    def getThrownTypes(): List[_ <: TypeMirror] = ???

    @stub
    // Returns the formal type parameters of this executable
    // in declaration order.
    def getTypeParameters(): List[_ <: TypeParameterElement] = ???

    @stub
    // Returns true if this method is a default method and
    // returns false otherwise.
    def isDefault(): Boolean = ???
}
