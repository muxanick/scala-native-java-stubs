package java.lang.reflect

import java.lang.{Class, Object, String}
import java.lang.annotation.Annotation

/** Information about method parameters.
 * 
 *  A Parameter provides information about method parameters,
 *  including its name and modifiers.  It also provides an alternate
 *  means of obtaining attributes for the parameter.
 */
final class Parameter extends Object with AnnotatedElement {

    /** Compares based on the executable and the index. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns an AnnotatedType object that represents the use of a type to
     *  specify the type of the formal parameter represented by this Parameter.
     */
    @stub
    def getAnnotatedType(): AnnotatedType = ???

    /** Returns this element's annotation for the specified type if
     *  such an annotation is present, else null.
     */
    @stub
    def getAnnotation[T <: Annotation](annotationClass: Class[T]): T = ???

    /** Returns annotations that are present on this element. */
    @stub
    def getAnnotations(): Array[Annotation] = ???

    /** Returns annotations that are associated with this element. */
    @stub
    def getAnnotationsByType[T <: Annotation](annotationClass: Class[T]): Array[T] = ???

    /** Returns this element's annotation for the specified type if
     *  such an annotation is directly present, else null.
     */
    @stub
    def getDeclaredAnnotation[T <: Annotation](annotationClass: Class[T]): T = ???

    /** Returns annotations that are directly present on this element. */
    @stub
    def getDeclaredAnnotations(): Array[Annotation] = ???

    /** Returns this element's annotation(s) for the specified type if
     *  such annotations are either directly present or
     *  indirectly present.
     */
    @stub
    def getDeclaredAnnotationsByType[T <: Annotation](annotationClass: Class[T]): Array[T] = ???

    /** Return the Executable which declares this parameter. */
    @stub
    def getDeclaringExecutable(): Executable = ???

    /** Get the modifier flags for this the parameter represented by
     *  this Parameter object.
     */
    @stub
    def getModifiers(): Int = ???

    /** Returns the name of the parameter. */
    @stub
    def getName(): String = ???

    /** Returns a Type object that identifies the parameterized
     *  type for the parameter represented by this Parameter
     *  object.
     */
    @stub
    def getParameterizedType(): Type = ???

    /** Returns a Class object that identifies the
     *  declared type for the parameter represented by this
     *  Parameter object.
     */
    @stub
    def getType(): Class[_] = ???

    /** Returns a hash code based on the executable's hash code and the
     *  index.
     */
    @stub
    def hashCode(): Int = ???

    /** Returns true if this parameter is implicitly declared
     *  in source code; returns false otherwise.
     */
    @stub
    def isImplicit(): Boolean = ???

    /** Returns true if the parameter has a name according to the class
     *  file; returns false otherwise.
     */
    @stub
    def isNamePresent(): Boolean = ???

    /** Returns true if this parameter is neither implicitly
     *  nor explicitly declared in source code; returns false
     *  otherwise.
     */
    @stub
    def isSynthetic(): Boolean = ???

    /** Returns true if this parameter represents a variable
     *  argument list; returns false otherwise.
     */
    @stub
    def isVarArgs(): Boolean = ???
}
