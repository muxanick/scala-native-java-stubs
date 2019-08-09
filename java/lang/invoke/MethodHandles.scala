package java.lang.invoke

import java.lang.{Class, Object, Throwable}
import java.lang.reflect.Member
import java.util.List

// This class consists exclusively of static methods that operate on or return
// method handles. They fall into several categories:
// 
// Lookup methods which help create method handles for methods and fields.
// Combinator methods, which combine or transform pre-existing method handles into new ones.
// Other factory methods to create method handles that emulate other common JVM operations or control flow patterns.
// 
// 
class MethodHandles extends Object {
}

object MethodHandles {
    @stub
    // Produces a method handle giving read access to elements of an array.
    def arrayElementGetter(arrayClass: Class[_]): MethodHandle = ???

    @stub
    // Produces a method handle giving write access to elements of an array.
    def arrayElementSetter(arrayClass: Class[_]): MethodHandle = ???

    @stub
    // Makes a method handle which adapts a target method handle,
    // by running it inside an exception handler.
    def catchException(target: MethodHandle, exType: Class[_ <: Throwable], handler: MethodHandle): MethodHandle = ???

    @stub
    // Adapts a target method handle by pre-processing
    // a sub-sequence of its arguments with a filter (another method handle).
    def collectArguments(target: MethodHandle, pos: Int, filter: MethodHandle): MethodHandle = ???

    @stub
    // Produces a method handle of the requested return type which returns the given
    // constant value every time it is invoked.
    def constant(type: Class[_], value: Object): MethodHandle = ???

    @stub
    // Produces a method handle which will discard some dummy arguments
    // before calling some other specified target method handle.
    def dropArguments(target: MethodHandle, pos: Int, valueTypes: Class[_]*): MethodHandle = ???

    @stub
    // Produces a method handle which will discard some dummy arguments
    // before calling some other specified target method handle.
    def dropArguments(target: MethodHandle, pos: Int, valueTypes: List[Class[_]]): MethodHandle = ???

    @stub
    // Produces a special invoker method handle which can be used to
    // invoke any method handle of the given type, as if by invokeExact.
    def exactInvoker(type: MethodType): MethodHandle = ???

    @stub
    // Produces a method handle which adapts the type of the
    // given method handle to a new type by pairwise argument and return type conversion.
    def explicitCastArguments(target: MethodHandle, newType: MethodType): MethodHandle = ???

    @stub
    // Adapts a target method handle by pre-processing
    // one or more of its arguments, each with its own unary filter function,
    // and then calling the target with each pre-processed argument
    // replaced by the result of its corresponding filter function.
    def filterArguments(target: MethodHandle, pos: Int, filters: MethodHandle*): MethodHandle = ???

    @stub
    // Adapts a target method handle by post-processing
    // its return value (if any) with a filter (another method handle).
    def filterReturnValue(target: MethodHandle, filter: MethodHandle): MethodHandle = ???

    @stub
    // Adapts a target method handle by pre-processing
    // some of its arguments, and then calling the target with
    // the result of the pre-processing, inserted into the original
    // sequence of arguments.
    def foldArguments(target: MethodHandle, combiner: MethodHandle): MethodHandle = ???

    @stub
    // Makes a method handle which adapts a target method handle,
    // by guarding it with a test, a boolean-valued method handle.
    def guardWithTest(test: MethodHandle, target: MethodHandle, fallback: MethodHandle): MethodHandle = ???

    @stub
    // Produces a method handle which returns its sole argument when invoked.
    def identity(type: Class[_]): MethodHandle = ???

    @stub
    // Provides a target method handle with one or more bound arguments
    // in advance of the method handle's invocation.
    def insertArguments(target: MethodHandle, pos: Int, values: Object*): MethodHandle = ???

    @stub
    // Produces a special invoker method handle which can be used to
    // invoke any method handle compatible with the given type, as if by invoke.
    def invoker(type: MethodType): MethodHandle = ???

    @stub
    // Returns a lookup object with
    // full capabilities to emulate all supported bytecode behaviors of the caller.
    def lookup(): MethodHandles.Lookup = ???

    @stub
    // Produces a method handle which adapts the calling sequence of the
    // given method handle to a new type, by reordering the arguments.
    def permuteArguments(target: MethodHandle, newType: MethodType, reorder: int...): MethodHandle = ???

    @stub
    // Returns a lookup object which is trusted minimally.
    def publicLookup(): MethodHandles.Lookup = ???

    @stub
    // Performs an unchecked "crack" of a
    // direct method handle.
    def T: [T <: Member] = ???

    @stub
    // Produces a method handle which will invoke any method handle of the
    // given type, with a given number of trailing arguments replaced by
    // a single trailing Object[] array.
    def spreadInvoker(type: MethodType, leadingArgCount: Int): MethodHandle = ???
}
