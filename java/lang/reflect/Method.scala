package java.lang.reflect

import java.lang.{Class, Object, String}
import java.lang.annotation.Annotation

// A Method provides information about, and access to, a single method
// on a class or interface.  The reflected method may be a class method
// or an instance method (including an abstract method).
//
// A Method permits widening conversions to occur when matching the
// actual parameters to invoke with the underlying method's formal
// parameters, but it throws an IllegalArgumentException if a
// narrowing conversion would occur.
final class Method extends Executable {

    @stub
    // Compares this Method against the specified object.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns an AnnotatedType object that represents the use of a type to
    // specify the return type of the method/constructor represented by this
    // Executable.
    def getAnnotatedReturnType(): AnnotatedType = ???

    @stub
    // Returns this element's annotation for the specified type if
    // such an annotation is present, else null.
    def T: [T <: Annotation] = ???

    @stub
    // Returns annotations that are directly present on this element.
    def getDeclaredAnnotations(): Array[Annotation] = ???

    @stub
    // Returns the Class object representing the class or interface
    // that declares the executable represented by this object.
    def getDeclaringClass(): Class[_] = ???

    @stub
    // Returns the default value for the annotation member represented by
    // this Method instance.
    def getDefaultValue(): Object = ???

    @stub
    // Returns an array of Class objects that represent the
    // types of exceptions declared to be thrown by the underlying
    // executable represented by this object.
    def getExceptionTypes(): Array[Class[_]] = ???

    @stub
    // Returns an array of Type objects that represent the
    // exceptions declared to be thrown by this executable object.
    def getGenericExceptionTypes(): Array[Type] = ???

    @stub
    // Returns an array of Type objects that represent the formal
    // parameter types, in declaration order, of the executable represented by
    // this object.
    def getGenericParameterTypes(): Array[Type] = ???

    @stub
    // Returns a Type object that represents the formal return
    // type of the method represented by this Method object.
    def getGenericReturnType(): Type = ???

    @stub
    // Returns the Java language modifiers for
    // the executable represented by this object.
    def getModifiers(): Int = ???

    @stub
    // Returns the name of the method represented by this Method
    // object, as a String.
    def getName(): String = ???

    @stub
    // Returns an array of arrays of Annotations that
    // represent the annotations on the formal parameters, in
    // declaration order, of the Executable represented by
    // this object.
    def getParameterAnnotations(): Array[Array[Annotation]] = ???

    @stub
    // Returns the number of formal parameters (whether explicitly
    // declared or implicitly declared or neither) for the executable
    // represented by this object.
    def getParameterCount(): Int = ???

    @stub
    // Returns an array of Class objects that represent the formal
    // parameter types, in declaration order, of the executable
    // represented by this object.
    def getParameterTypes(): Array[Class[_]] = ???

    @stub
    // Returns a Class object that represents the formal return type
    // of the method represented by this Method object.
    def getReturnType(): Class[_] = ???

    @stub
    // Returns an array of TypeVariable objects that represent the
    // type variables declared by the generic declaration represented by this
    // GenericDeclaration object, in declaration order.
    def getTypeParameters(): Array[TypeVariable[Method]] = ???

    @stub
    // Returns a hashcode for this Method.
    def hashCode(): Int = ???

    @stub
    // Invokes the underlying method represented by this Method
    // object, on the specified object with the specified parameters.
    def invoke(obj: Object, args: Object*): Object = ???

    @stub
    // Returns true if this method is a bridge
    // method; returns false otherwise.
    def isBridge(): Boolean = ???

    @stub
    // Returns true if this method is a default
    // method; returns false otherwise.
    def isDefault(): Boolean = ???

    @stub
    // Returns true if this executable is a synthetic
    // construct; returns false otherwise.
    def isSynthetic(): Boolean = ???

    @stub
    // Returns true if this executable was declared to take a
    // variable number of arguments; returns false otherwise.
    def isVarArgs(): Boolean = ???

    @stub
    // Returns a string describing this Method, including
    // type parameters.
    def toGenericString(): String = ???
}