package java.lang.reflect

import java.lang.{Class, Object, String}
import java.lang.annotation.Annotation
import scala.scalanative.annotation.stub

/** A Method provides information about, and access to, a single method
 *  on a class or interface.  The reflected method may be a class method
 *  or an instance method (including an abstract method).
 * 
 *  A Method permits widening conversions to occur when matching the
 *  actual parameters to invoke with the underlying method's formal
 *  parameters, but it throws an IllegalArgumentException if a
 *  narrowing conversion would occur.
 */
final class Method extends Executable {

    /** Compares this Method against the specified object. */
    @stub
    def equals(obj: Object): Boolean = ???

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
    def getDeclaringClass(): Class[_] = ???

    /** Returns the default value for the annotation member represented by
     *  this Method instance.
     */
    @stub
    def getDefaultValue(): Object = ???

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

    /** Returns a Type object that represents the formal return
     *  type of the method represented by this Method object.
     */
    @stub
    def getGenericReturnType(): Type = ???

    /** Returns the Java language modifiers for
     *  the executable represented by this object.
     */
    @stub
    def getModifiers(): Int = ???

    /** Returns the name of the method represented by this Method
     *  object, as a String.
     */
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

    /** Returns a Class object that represents the formal return type
     *  of the method represented by this Method object.
     */
    @stub
    def getReturnType(): Class[_] = ???

    /** Returns an array of TypeVariable objects that represent the
     *  type variables declared by the generic declaration represented by this
     *  GenericDeclaration object, in declaration order.
     */
    @stub
    def getTypeParameters(): Array[TypeVariable[Method]] = ???

    /** Returns a hashcode for this Method. */
    @stub
    def hashCode(): Int = ???

    /** Invokes the underlying method represented by this Method
     *  object, on the specified object with the specified parameters.
     */
    @stub
    def invoke(obj: Object, args: Object*): Object = ???

    /** Returns true if this method is a bridge
     *  method; returns false otherwise.
     */
    @stub
    def isBridge(): Boolean = ???

    /** Returns true if this method is a default
     *  method; returns false otherwise.
     */
    @stub
    def isDefault(): Boolean = ???

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

    /** Returns a string describing this Method, including
     *  type parameters.
     */
    @stub
    def toGenericString(): String = ???

    /** Returns a string describing this Method. */
    @stub
    def toString(): String = ???
}
