package java.lang.reflect

import java.lang.{Class, Object, String}
import java.lang.annotation.Annotation
import scala.scalanative.annotation.stub

/** Constructor provides information about, and access to, a single
 *  constructor for a class.
 * 
 *  Constructor permits widening conversions to occur when matching the
 *  actual parameters to newInstance() with the underlying
 *  constructor's formal parameters, but throws an
 *  IllegalArgumentException if a narrowing conversion would occur.
 */
final class Constructor[T] extends Executable {

    /** Compares this Constructor against the specified object. */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Returns an AnnotatedType object that represents the use of a
     *  type to specify the receiver type of the method/constructor represented
     *  by this Executable object.
     */
    @stub
    def getAnnotatedReceiverType(): AnnotatedType = ???

    /** Returns an AnnotatedType object that represents the use of a type to
     *  specify the return type of the method/constructor represented by this
     *  Executable.
     */
    @stub
    def getAnnotatedReturnType(): AnnotatedType = ???

    /** Returns this element's annotation for the specified type if
     *  such an annotation is present, else null.
     */
    @stub
    def getAnnotation[T <: Annotation](annotationClass: Class[T]): T = ???

    /** Returns annotations that are directly present on this element. */
    @stub
    def getDeclaredAnnotations(): Array[Annotation] = ???

    /** Returns the Class object representing the class or interface
     *  that declares the executable represented by this object.
     */
    @stub
    def getDeclaringClass(): Class[T] = ???

    /** Returns an array of Class objects that represent the
     *  types of exceptions declared to be thrown by the underlying
     *  executable represented by this object.
     */
    @stub
    def getExceptionTypes(): Array[Class[_]] = ???

    /** Returns an array of Type objects that represent the
     *  exceptions declared to be thrown by this executable object.
     */
    @stub
    def getGenericExceptionTypes(): Array[Type] = ???

    /** Returns an array of Type objects that represent the formal
     *  parameter types, in declaration order, of the executable represented by
     *  this object.
     */
    @stub
    def getGenericParameterTypes(): Array[Type] = ???

    /** Returns the Java language modifiers for
     *  the executable represented by this object.
     */
    @stub
    def getModifiers(): Int = ???

    /** Returns the name of this constructor, as a string. */
    @stub
    def getName(): String = ???

    /** Returns an array of arrays of Annotations that
     *  represent the annotations on the formal parameters, in
     *  declaration order, of the Executable represented by
     *  this object.
     */
    @stub
    def getParameterAnnotations(): Array[Array[Annotation]] = ???

    /** Returns the number of formal parameters (whether explicitly
     *  declared or implicitly declared or neither) for the executable
     *  represented by this object.
     */
    @stub
    def getParameterCount(): Int = ???

    /** Returns an array of Class objects that represent the formal
     *  parameter types, in declaration order, of the executable
     *  represented by this object.
     */
    @stub
    def getParameterTypes(): Array[Class[_]] = ???

    /** Returns an array of TypeVariable objects that represent the
     *  type variables declared by the generic declaration represented by this
     *  GenericDeclaration object, in declaration order.
     */
    @stub
    def getTypeParameters(): Array[TypeVariable[Constructor[T]]] = ???

    /** Returns a hashcode for this Constructor. */
    @stub
    def hashCode(): Int = ???

    /** Returns true if this executable is a synthetic
     *  construct; returns false otherwise.
     */
    @stub
    def isSynthetic(): Boolean = ???

    /** Returns true if this executable was declared to take a
     *  variable number of arguments; returns false otherwise.
     */
    @stub
    def isVarArgs(): Boolean = ???

    /** Uses the constructor represented by this Constructor object to
     *  create and initialize a new instance of the constructor's
     *  declaring class, with the specified initialization parameters.
     */
    @stub
    def newInstance(initargs: Object*): T = ???

    /** Returns a string describing this Constructor,
     *  including type parameters.
     */
    @stub
    def toGenericString(): String = ???

    /** Returns a string describing this Constructor. */
    @stub
    def toString(): String = ???
}
