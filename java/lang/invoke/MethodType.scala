package java.lang.invoke

import java.io.Serializable
import java.lang.{Class, ClassLoader, Object, String}
import java.util.List
import scala.scalanative.annotation.stub

/** A method type represents the arguments and return type accepted and
 *  returned by a method handle, or the arguments and return type passed
 *  and expected  by a method handle caller.  Method types must be properly
 *  matched between a method handle and all its callers,
 *  and the JVM's operations enforce this matching at, specifically
 *  during calls to MethodHandle.invokeExact
 *  and MethodHandle.invoke, and during execution
 *  of invokedynamic instructions.
 *  
 *  The structure is a return type accompanied by any number of parameter types.
 *  The types (primitive, void, and reference) are represented by Class objects.
 *  (For ease of exposition, we treat void as if it were a type.
 *  In fact, it denotes the absence of a return type.)
 *  
 *  All instances of MethodType are immutable.
 *  Two instances are completely interchangeable if they compare equal.
 *  Equality depends on pairwise correspondence of the return and parameter types and on nothing else.
 *  
 *  This type can be created only by factory methods.
 *  All factory methods may cache values, though caching is not guaranteed.
 *  Some factory methods are static, while others are virtual methods which
 *  modify precursor method types, e.g., by changing a selected parameter.
 *  
 *  Factory methods which operate on groups of parameter types
 *  are systematically presented in two versions, so that both Java arrays and
 *  Java lists can be used to work with groups of parameter types.
 *  The query methods parameterArray and parameterList
 *  also provide a choice between arrays and lists.
 *  
 *  MethodType objects are sometimes derived from bytecode instructions
 *  such as invokedynamic, specifically from the type descriptor strings associated
 *  with the instructions in a class file's constant pool.
 *  
 *  Like classes and strings, method types can also be represented directly
 *  in a class file's constant pool as constants.
 *  A method type may be loaded by an ldc instruction which refers
 *  to a suitable CONSTANT_MethodType constant pool entry.
 *  The entry refers to a CONSTANT_Utf8 spelling for the descriptor string.
 *  (For full details on method type constants,
 *  see sections 4.4.8 and 5.4.3.5 of the Java Virtual Machine Specification.)
 *  
 *  When the JVM materializes a MethodType from a descriptor string,
 *  all classes named in the descriptor must be accessible, and will be loaded.
 *  (But the classes need not be initialized, as is the case with a CONSTANT_Class.)
 *  This loading may occur at any time before the MethodType object is first derived.
 */
final class MethodType extends Object with Serializable {

    /** Finds or creates a method type with additional parameter types. */
    @stub
    def appendParameterTypes(ptypesToInsert: Class[_]*): MethodType = ???

    /** Finds or creates a method type with additional parameter types. */
    @stub
    def appendParameterTypes(ptypesToInsert: List[Class[_]]): MethodType = ???

    /** Finds or creates a method type with a single different parameter type. */
    @stub
    def changeParameterType(num: Int, nptype: Class[_]): MethodType = ???

    /** Finds or creates a method type with a different return type. */
    @stub
    def changeReturnType(nrtype: Class[_]): MethodType = ???

    /** Finds or creates a method type with some parameter types omitted. */
    @stub
    def dropParameterTypes(start: Int, end: Int): MethodType = ???

    /** Compares the specified object with this type for equality. */
    @stub
    def equals(x: Object): Boolean = ???

    /** Erases all reference types to Object. */
    @stub
    def erase(): MethodType = ???

    /** Converts all types, both reference and primitive, to Object. */
    @stub
    def generic(): MethodType = ???

    /** Returns the hash code value for this method type. */
    @stub
    def hashCode(): Int = ???

    /** Reports if this type contains a primitive argument or return value. */
    @stub
    def hasPrimitives(): Boolean = ???

    /** Reports if this type contains a wrapper argument or return value. */
    @stub
    def hasWrappers(): Boolean = ???

    /** Finds or creates a method type with additional parameter types. */
    @stub
    def insertParameterTypes(num: Int, ptypesToInsert: Class[_]*): MethodType = ???

    /** Finds or creates a method type with additional parameter types. */
    @stub
    def insertParameterTypes(num: Int, ptypesToInsert: List[Class[_]]): MethodType = ???

    /** Presents the parameter types as an array (a convenience method). */
    @stub
    def parameterArray(): Array[Class[_]] = ???

    /** Returns the number of parameter types in this method type. */
    @stub
    def parameterCount(): Int = ???

    /** Presents the parameter types as a list (a convenience method). */
    @stub
    def parameterList(): List[Class[_]] = ???

    /** Returns the parameter type at the specified index, within this method type. */
    @stub
    def parameterType(num: Int): Class[_] = ???

    /** Returns the return type of this method type. */
    @stub
    def returnType(): Class[_] = ???

    /** Produces a bytecode descriptor representation of the method type. */
    @stub
    def toMethodDescriptorString(): String = ???

    /** Returns a string representation of the method type,
     *  of the form "(PT0,PT1...)RT".
     */
    @stub
    def toString(): String = ???

    /** Converts all wrapper types to their corresponding primitive types. */
    @stub
    def unwrap(): MethodType = ???

    /** Converts all primitive types to their corresponding wrapper types. */
    @stub
    def wrap(): MethodType = ???
}

object MethodType {
    /** Finds or creates an instance of a method type, given the spelling of its bytecode descriptor. */
    @stub
    def fromMethodDescriptorString(descriptor: String, loader: ClassLoader): MethodType = ???

    /** Finds or creates a method type whose components are all Object. */
    @stub
    def genericMethodType(objectArgCount: Int): MethodType = ???

    /** Finds or creates a method type whose components are Object with an optional trailing Object[] array. */
    @stub
    def genericMethodType(objectArgCount: Int, finalArray: Boolean): MethodType = ???

    /** Finds or creates a method type with the given components. */
    @stub
    def methodType(rtype: Class[_]): MethodType = ???

    /** Finds or creates a method type with the given components. */
    @stub
    def methodType(rtype: Class[_], ptype0: Class[_]): MethodType = ???

    /** Finds or creates an instance of the given method type. */
    @stub
    def methodType(rtype: Class[_], ptypes: Array[Class[_]]): MethodType = ???

    /** Finds or creates a method type with the given components. */
    @stub
    def methodType(rtype: Class[_], ptype0: Class[_], ptypes: Class[_]*): MethodType = ???

    /** Finds or creates a method type with the given components. */
    @stub
    def methodType(rtype: Class[_], ptypes: List[Class[_]]): MethodType = ???

    /** Finds or creates a method type with the given components. */
    @stub
    def methodType(rtype: Class[_], ptypes: MethodType): MethodType = ???
}
