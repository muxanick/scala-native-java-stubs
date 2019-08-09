package java.lang.reflect

import java.lang.{Class, Object, String}
import java.lang.annotation.Annotation

// Information about method parameters.
//
// A Parameter provides information about method parameters,
// including its name and modifiers.  It also provides an alternate
// means of obtaining attributes for the parameter.
final class Parameter extends Object with AnnotatedElement {

    @stub
    // Compares based on the executable and the index.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns an AnnotatedType object that represents the use of a type to
    // specify the type of the formal parameter represented by this Parameter.
    def getAnnotatedType(): AnnotatedType = ???

    @stub
    // Returns this element's annotation for the specified type if
    // such an annotation is present, else null.
    def T: [T <: Annotation] = ???

    @stub
    // Returns annotations that are present on this element.
    def getAnnotations(): Array[Annotation] = ???

    @stub
    // Returns annotations that are associated with this element.
    def Array[T]: [T <: Annotation] = ???

    @stub
    // Returns this element's annotation for the specified type if
    // such an annotation is directly present, else null.
    def T: [T <: Annotation] = ???

    @stub
    // Returns annotations that are directly present on this element.
    def getDeclaredAnnotations(): Array[Annotation] = ???

    @stub
    // Returns this element's annotation(s) for the specified type if
    // such annotations are either directly present or
    // indirectly present.
    def Array[T]: [T <: Annotation] = ???

    @stub
    // Return the Executable which declares this parameter.
    def getDeclaringExecutable(): Executable = ???

    @stub
    // Get the modifier flags for this the parameter represented by
    // this Parameter object.
    def getModifiers(): Int = ???

    @stub
    // Returns the name of the parameter.
    def getName(): String = ???

    @stub
    // Returns a Type object that identifies the parameterized
    // type for the parameter represented by this Parameter
    // object.
    def getParameterizedType(): Type = ???

    @stub
    // Returns a Class object that identifies the
    // declared type for the parameter represented by this
    // Parameter object.
    def getType(): Class[_] = ???

    @stub
    // Returns a hash code based on the executable's hash code and the
    // index.
    def hashCode(): Int = ???

    @stub
    // Returns true if this parameter is implicitly declared
    // in source code; returns false otherwise.
    def isImplicit(): Boolean = ???

    @stub
    // Returns true if the parameter has a name according to the class
    // file; returns false otherwise.
    def isNamePresent(): Boolean = ???

    @stub
    // Returns true if this parameter is neither implicitly
    // nor explicitly declared in source code; returns false
    // otherwise.
    def isSynthetic(): Boolean = ???

    @stub
    // Returns true if this parameter represents a variable
    // argument list; returns false otherwise.
    def isVarArgs(): Boolean = ???
}
