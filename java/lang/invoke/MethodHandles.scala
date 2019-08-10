package java.lang.invoke

import java.lang.{Class, Object, Throwable}
import java.lang.reflect.Member
import java.util.List
import scala.scalanative.annotation.stub

/** This class consists exclusively of static methods that operate on or return
 *  method handles. They fall into several categories:
 *  
 *  Lookup methods which help create method handles for methods and fields.
 *  Combinator methods, which combine or transform pre-existing method handles into new ones.
 *  Other factory methods to create method handles that emulate other common JVM operations or control flow patterns.
 *  
 *  
 */
class MethodHandles extends Object {
}

object MethodHandles {
    /** A lookup object is a factory for creating method handles,
     *  when the creation requires access checking.
     */
    type Lookup = MethodHandles_Lookup

    /** Produces a method handle giving read access to elements of an array. */
    @stub
    def arrayElementGetter(arrayClass: Class[_]): MethodHandle = ???

    /** Produces a method handle giving write access to elements of an array. */
    @stub
    def arrayElementSetter(arrayClass: Class[_]): MethodHandle = ???

    /** Makes a method handle which adapts a target method handle,
     *  by running it inside an exception handler.
     */
    @stub
    def catchException(target: MethodHandle, exType: Class[_ <: Throwable], handler: MethodHandle): MethodHandle = ???

    /** Adapts a target method handle by pre-processing
     *  a sub-sequence of its arguments with a filter (another method handle).
     */
    @stub
    def collectArguments(target: MethodHandle, pos: Int, filter: MethodHandle): MethodHandle = ???

    /** Produces a method handle of the requested return type which returns the given
     *  constant value every time it is invoked.
     */
    @stub
    def constant(type: Class[_], value: Any): MethodHandle = ???

    /** Produces a method handle which will discard some dummy arguments
     *  before calling some other specified target method handle.
     */
    @stub
    def dropArguments(target: MethodHandle, pos: Int, valueTypes: Class[_]*): MethodHandle = ???

    /** Produces a method handle which will discard some dummy arguments
     *  before calling some other specified target method handle.
     */
    @stub
    def dropArguments(target: MethodHandle, pos: Int, valueTypes: List[Class[_]]): MethodHandle = ???

    /** Produces a special invoker method handle which can be used to
     *  invoke any method handle of the given type, as if by invokeExact.
     */
    @stub
    def exactInvoker(type: MethodType): MethodHandle = ???

    /** Produces a method handle which adapts the type of the
     *  given method handle to a new type by pairwise argument and return type conversion.
     */
    @stub
    def explicitCastArguments(target: MethodHandle, newType: MethodType): MethodHandle = ???

    /** Adapts a target method handle by pre-processing
     *  one or more of its arguments, each with its own unary filter function,
     *  and then calling the target with each pre-processed argument
     *  replaced by the result of its corresponding filter function.
     */
    @stub
    def filterArguments(target: MethodHandle, pos: Int, filters: MethodHandle*): MethodHandle = ???

    /** Adapts a target method handle by post-processing
     *  its return value (if any) with a filter (another method handle).
     */
    @stub
    def filterReturnValue(target: MethodHandle, filter: MethodHandle): MethodHandle = ???

    /** Adapts a target method handle by pre-processing
     *  some of its arguments, and then calling the target with
     *  the result of the pre-processing, inserted into the original
     *  sequence of arguments.
     */
    @stub
    def foldArguments(target: MethodHandle, combiner: MethodHandle): MethodHandle = ???

    /** Makes a method handle which adapts a target method handle,
     *  by guarding it with a test, a boolean-valued method handle.
     */
    @stub
    def guardWithTest(test: MethodHandle, target: MethodHandle, fallback: MethodHandle): MethodHandle = ???

    /** Produces a method handle which returns its sole argument when invoked. */
    @stub
    def identity(type: Class[_]): MethodHandle = ???

    /** Provides a target method handle with one or more bound arguments
     *  in advance of the method handle's invocation.
     */
    @stub
    def insertArguments(target: MethodHandle, pos: Int, values: Object*): MethodHandle = ???

    /** Produces a special invoker method handle which can be used to
     *  invoke any method handle compatible with the given type, as if by invoke.
     */
    @stub
    def invoker(type: MethodType): MethodHandle = ???

    /** Returns a lookup object with
     *  full capabilities to emulate all supported bytecode behaviors of the caller.
     */
    @stub
    def lookup(): MethodHandles.Lookup = ???

    /** Produces a method handle which adapts the calling sequence of the
     *  given method handle to a new type, by reordering the arguments.
     */
    @stub
    def permuteArguments(target: MethodHandle, newType: MethodType, reorder: int*): MethodHandle = ???

    /** Returns a lookup object which is trusted minimally. */
    @stub
    def publicLookup(): MethodHandles.Lookup = ???

    /** Performs an unchecked "crack" of a
     *  direct method handle.
     */
    @stub
    def reflectAs[T <: Member](expected: Class[T], target: MethodHandle): T = ???

    /** Produces a method handle which will invoke any method handle of the
     *  given type, with a given number of trailing arguments replaced by
     *  a single trailing Object[] array.
     */
    @stub
    def spreadInvoker(type: MethodType, leadingArgCount: Int): MethodHandle = ???

    /** Produces a method handle which will throw exceptions of the given exType. */
    @stub
    def throwException(returnType: Class[_], exType: Class[_ <: Throwable]): MethodHandle = ???
}
