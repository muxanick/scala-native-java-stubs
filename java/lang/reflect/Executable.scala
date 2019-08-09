package java.lang.reflect

import java.lang.{Class, Object, String}
import java.lang.annotation.Annotation

// A shared superclass for the common functionality of Method
// and Constructor.
abstract class Executable extends AccessibleObject with Member, with GenericDeclaration {

    // Returns an array of AnnotatedType objects that represent the use
    // of types to specify the declared exceptions of the method/constructor
    // represented by this Executable.
    def getAnnotatedExceptionTypes(): Array[AnnotatedType]

    // Returns an array of AnnotatedType objects that represent the use
    // of types to specify formal parameter types of the method/constructor
    // represented by this Executable.
    def getAnnotatedParameterTypes(): Array[AnnotatedType]

    // Returns an AnnotatedType object that represents the use of a
    // type to specify the receiver type of the method/constructor represented
    // by this Executable object.
    def getAnnotatedReceiverType(): AnnotatedType

    // Returns an AnnotatedType object that represents the use of a type to
    // specify the return type of the method/constructor represented by this
    // Executable.
    def getAnnotatedReturnType(): AnnotatedType

    // Returns this element's annotation for the specified type if
    // such an annotation is present, else null.
    def T: [T <: Annotation]

    // Returns annotations that are associated with this element.
    def Array[T]: [T <: Annotation]

    // Returns annotations that are directly present on this element.
    def getDeclaredAnnotations(): Array[Annotation]

    // Returns the Class object representing the class or interface
    // that declares the executable represented by this object.
    def getDeclaringClass(): Class[_]

    // Returns an array of Class objects that represent the
    // types of exceptions declared to be thrown by the underlying
    // executable represented by this object.
    def getExceptionTypes(): Array[Class[_]]

    // Returns an array of Type objects that represent the
    // exceptions declared to be thrown by this executable object.
    def getGenericExceptionTypes(): Array[Type]

    // Returns an array of Type objects that represent the formal
    // parameter types, in declaration order, of the executable represented by
    // this object.
    def getGenericParameterTypes(): Array[Type]

    // Returns the Java language modifiers for
    // the executable represented by this object.
    def getModifiers(): Int

    // Returns the name of the executable represented by this object.
    def getName(): String

    // Returns an array of arrays of Annotations that
    // represent the annotations on the formal parameters, in
    // declaration order, of the Executable represented by
    // this object.
    def getParameterAnnotations(): Array[Array[Annotation]]

    // Returns the number of formal parameters (whether explicitly
    // declared or implicitly declared or neither) for the executable
    // represented by this object.
    def getParameterCount(): Int

    // Returns an array of Parameter objects that represent
    // all the parameters to the underlying executable represented by
    // this object.
    def getParameters(): Array[Parameter]

    // Returns an array of Class objects that represent the formal
    // parameter types, in declaration order, of the executable
    // represented by this object.
    def getParameterTypes(): Array[Class[_]]

    // Returns an array of TypeVariable objects that represent the
    // type variables declared by the generic declaration represented by this
    // GenericDeclaration object, in declaration order.
    def getTypeParameters(): Array[TypeVariable[_]]

    // Returns true if this executable is a synthetic
    // construct; returns false otherwise.
    def isSynthetic(): Boolean

    // Returns true if this executable was declared to take a
    // variable number of arguments; returns false otherwise.
    def isVarArgs(): Boolean
}
