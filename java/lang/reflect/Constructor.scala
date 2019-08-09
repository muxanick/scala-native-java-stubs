package java.lang.reflect

import java.lang.{Class, Object, String}
import java.lang.annotation.Annotation

// Constructor provides information about, and access to, a single
// constructor for a class.
//
// Constructor permits widening conversions to occur when matching the
// actual parameters to newInstance() with the underlying
// constructor's formal parameters, but throws an
// IllegalArgumentException if a narrowing conversion would occur.
final class Constructor[T] extends Executable {

    @stub
    // Compares this Constructor against the specified object.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns an AnnotatedType object that represents the use of a
    // type to specify the receiver type of the method/constructor represented
    // by this Executable object.
    def getAnnotatedReceiverType(): AnnotatedType = ???

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
    def getDeclaringClass(): Class[T] = ???

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
    // Returns the Java language modifiers for
    // the executable represented by this object.
    def getModifiers(): Int = ???

    @stub
    // Returns the name of this constructor, as a string.
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
    // Returns an array of TypeVariable objects that represent the
    // type variables declared by the generic declaration represented by this
    // GenericDeclaration object, in declaration order.
    def getTypeParameters(): Array[TypeVariable[Constructor[T]]] = ???

    @stub
    // Returns a hashcode for this Constructor.
    def hashCode(): Int = ???

    @stub
    // Returns true if this executable is a synthetic
    // construct; returns false otherwise.
    def isSynthetic(): Boolean = ???

    @stub
    // Returns true if this executable was declared to take a
    // variable number of arguments; returns false otherwise.
    def isVarArgs(): Boolean = ???

    @stub
    // Uses the constructor represented by this Constructor object to
    // create and initialize a new instance of the constructor's
    // declaring class, with the specified initialization parameters.
    def newInstance(initargs: Object*): T = ???

    @stub
    // Returns a string describing this Constructor,
    // including type parameters.
    def toGenericString(): String = ???
}
