package java.lang.invoke

import java.io.Serializable
import java.lang.{Class, ClassLoader, Object, String}
import java.util.List

// A method type represents the arguments and return type accepted and
// returned by a method handle, or the arguments and return type passed
// and expected  by a method handle caller.  Method types must be properly
// matched between a method handle and all its callers,
// and the JVM's operations enforce this matching at, specifically
// during calls to MethodHandle.invokeExact
// and MethodHandle.invoke, and during execution
// of invokedynamic instructions.
// 
// The structure is a return type accompanied by any number of parameter types.
// The types (primitive, void, and reference) are represented by Class objects.
// (For ease of exposition, we treat void as if it were a type.
// In fact, it denotes the absence of a return type.)
// 
// All instances of MethodType are immutable.
// Two instances are completely interchangeable if they compare equal.
// Equality depends on pairwise correspondence of the return and parameter types and on nothing else.
// 
// This type can be created only by factory methods.
// All factory methods may cache values, though caching is not guaranteed.
// Some factory methods are static, while others are virtual methods which
// modify precursor method types, e.g., by changing a selected parameter.
// 
// Factory methods which operate on groups of parameter types
// are systematically presented in two versions, so that both Java arrays and
// Java lists can be used to work with groups of parameter types.
// The query methods parameterArray and parameterList
// also provide a choice between arrays and lists.
// 
// MethodType objects are sometimes derived from bytecode instructions
// such as invokedynamic, specifically from the type descriptor strings associated
// with the instructions in a class file's constant pool.
// 
// Like classes and strings, method types can also be represented directly
// in a class file's constant pool as constants.
// A method type may be loaded by an ldc instruction which refers
// to a suitable CONSTANT_MethodType constant pool entry.
// The entry refers to a CONSTANT_Utf8 spelling for the descriptor string.
// (For full details on method type constants,
// see sections 4.4.8 and 5.4.3.5 of the Java Virtual Machine Specification.)
// 
// When the JVM materializes a MethodType from a descriptor string,
// all classes named in the descriptor must be accessible, and will be loaded.
// (But the classes need not be initialized, as is the case with a CONSTANT_Class.)
// This loading may occur at any time before the MethodType object is first derived.
final class MethodType extends Object with Serializable {

    @stub
    // Finds or creates a method type with additional parameter types.
    def appendParameterTypes(ptypesToInsert: Class[_]*): MethodType = ???

    @stub
    // Finds or creates a method type with additional parameter types.
    def appendParameterTypes(ptypesToInsert: List[Class[_]]): MethodType = ???

    @stub
    // Finds or creates a method type with a single different parameter type.
    def changeParameterType(num: Int, nptype: Class[_]): MethodType = ???

    @stub
    // Finds or creates a method type with a different return type.
    def changeReturnType(nrtype: Class[_]): MethodType = ???

    @stub
    // Finds or creates a method type with some parameter types omitted.
    def dropParameterTypes(start: Int, end: Int): MethodType = ???

    @stub
    // Compares the specified object with this type for equality.
    def equals(x: Object): Boolean = ???

    @stub
    // Erases all reference types to Object.
    def erase(): MethodType = ???

    @stub
    // Converts all types, both reference and primitive, to Object.
    def generic(): MethodType = ???

    @stub
    // Returns the hash code value for this method type.
    def hashCode(): Int = ???

    @stub
    // Reports if this type contains a primitive argument or return value.
    def hasPrimitives(): Boolean = ???

    @stub
    // Reports if this type contains a wrapper argument or return value.
    def hasWrappers(): Boolean = ???

    @stub
    // Finds or creates a method type with additional parameter types.
    def insertParameterTypes(num: Int, ptypesToInsert: Class[_]*): MethodType = ???

    @stub
    // Finds or creates a method type with additional parameter types.
    def insertParameterTypes(num: Int, ptypesToInsert: List[Class[_]]): MethodType = ???

    @stub
    // Presents the parameter types as an array (a convenience method).
    def parameterArray(): Array[Class[_]] = ???

    @stub
    // Returns the number of parameter types in this method type.
    def parameterCount(): Int = ???

    @stub
    // Presents the parameter types as a list (a convenience method).
    def parameterList(): List[Class[_]] = ???

    @stub
    // Returns the parameter type at the specified index, within this method type.
    def parameterType(num: Int): Class[_] = ???

    @stub
    // Returns the return type of this method type.
    def returnType(): Class[_] = ???

    @stub
    // Produces a bytecode descriptor representation of the method type.
    def toMethodDescriptorString(): String = ???

    @stub
    // Returns a string representation of the method type,
    // of the form "(PT0,PT1...)RT".
    def toString(): String = ???

    @stub
    // Converts all wrapper types to their corresponding primitive types.
    def unwrap(): MethodType = ???
}

object MethodType {
    @stub
    // Finds or creates an instance of a method type, given the spelling of its bytecode descriptor.
    def fromMethodDescriptorString(descriptor: String, loader: ClassLoader): MethodType = ???

    @stub
    // Finds or creates a method type whose components are all Object.
    def genericMethodType(objectArgCount: Int): MethodType = ???

    @stub
    // Finds or creates a method type whose components are Object with an optional trailing Object[] array.
    def genericMethodType(objectArgCount: Int, finalArray: Boolean): MethodType = ???

    @stub
    // Finds or creates a method type with the given components.
    def methodType(rtype: Class[_]): MethodType = ???

    @stub
    // Finds or creates a method type with the given components.
    def methodType(rtype: Class[_], ptype0: Class[_]): MethodType = ???

    @stub
    // Finds or creates an instance of the given method type.
    def methodType(rtype: Class[_], ptypes: Array[Class[_]]): MethodType = ???

    @stub
    // Finds or creates a method type with the given components.
    def methodType(rtype: Class[_], ptype0: Class[_], ptypes: Class[_]*): MethodType = ???

    @stub
    // Finds or creates a method type with the given components.
    def methodType(rtype: Class[_], ptypes: List[Class[_]]): MethodType = ???

    @stub
    // Finds or creates a method type with the given components.
    def methodType(rtype: Class[_], ptypes: MethodType): MethodType = ???
}
