package java.lang.invoke

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Methods to facilitate the creation of simple "function objects" that
 *  implement one or more interfaces by delegation to a provided MethodHandle,
 *  possibly after type adaptation and partial evaluation of arguments.  These
 *  methods are typically used as bootstrap methods for invokedynamic
 *  call sites, to support the lambda expression and method
 *  reference expression features of the Java Programming Language.
 * 
 *  Indirect access to the behavior specified by the provided MethodHandle
 *  proceeds in order through three phases:
 *  
 *      Linkage occurs when the methods in this class are invoked.
 *      They take as arguments an interface to be implemented (typically a
 *      functional interface, one with a single abstract method), a
 *      name and signature of a method from that interface to be implemented, a
 *      method handle describing the desired implementation behavior
 *      for that method, and possibly other additional metadata, and produce a
 *      CallSite whose target can be used to create suitable function
 *      objects.  Linkage may involve dynamically loading a new class that
 *      implements the target interface. The CallSite can be considered a
 *      "factory" for function objects and so these linkage methods are referred
 *      to as "metafactories".
 * 
 *      Capture occurs when the CallSite's target is
 *      invoked, typically through an invokedynamic call site,
 *      producing a function object.  This may occur many times for
 *      a single factory CallSite.  Capture may involve allocation of a
 *      new function object, or may return an existing function object.  The
 *      behavior MethodHandle may have additional parameters beyond those
 *      of the specified interface method; these are referred to as captured
 *      parameters, which must be provided as arguments to the
 *      CallSite target, and which may be early-bound to the behavior
 *      MethodHandle.  The number of captured parameters and their types
 *      are determined during linkage.
 * 
 *      Invocation occurs when an implemented interface method
 *      is invoked on a function object.  This may occur many times for a single
 *      function object.  The method referenced by the behavior MethodHandle
 *      is invoked with the captured arguments and any additional arguments
 *      provided on invocation, as if by MethodHandle.invoke(Object...).
 *  
 * 
 *  It is sometimes useful to restrict the set of inputs or results permitted
 *  at invocation.  For example, when the generic interface Predicate<T>
 *  is parameterized as Predicate<String>, the input must be a
 *  String, even though the method to implement allows any Object.
 *  At linkage time, an additional MethodType parameter describes the
 *  "instantiated" method type; on invocation, the arguments and eventual result
 *  are checked against this MethodType.
 * 
 *  This class provides two forms of linkage methods: a standard version
 *  (metafactory(MethodHandles.Lookup, String, MethodType, MethodType, MethodHandle, MethodType))
 *  using an optimized protocol, and an alternate version
 *  altMetafactory(MethodHandles.Lookup, String, MethodType, Object...)).
 *  The alternate version is a generalization of the standard version, providing
 *  additional control over the behavior of the generated function objects via
 *  flags and additional arguments.  The alternate version adds the ability to
 *  manage the following attributes of function objects:
 * 
 *  
 *      Bridging.  It is sometimes useful to implement multiple
 *      variations of the method signature, involving argument or return type
 *      adaptation.  This occurs when multiple distinct VM signatures for a method
 *      are logically considered to be the same method by the language.  The
 *      flag FLAG_BRIDGES indicates that a list of additional
 *      MethodTypes will be provided, each of which will be implemented
 *      by the resulting function object.  These methods will share the same
 *      name and instantiated type.
 * 
 *      Multiple interfaces.  If needed, more than one interface
 *      can be implemented by the function object.  (These additional interfaces
 *      are typically marker interfaces with no methods.)  The flag FLAG_MARKERS
 *      indicates that a list of additional interfaces will be provided, each of
 *      which should be implemented by the resulting function object.
 * 
 *      Serializability.  The generated function objects do not
 *      generally support serialization.  If desired, FLAG_SERIALIZABLE
 *      can be used to indicate that the function objects should be serializable.
 *      Serializable function objects will use, as their serialized form,
 *      instances of the class SerializedLambda, which requires additional
 *      assistance from the capturing class (the class described by the
 *      MethodHandles.Lookup parameter caller); see
 *      SerializedLambda for details.
 *  
 * 
 *  Assume the linkage arguments are as follows:
 *  
 *       invokedType (describing the CallSite signature) has
 *       K parameters of types (D1..Dk) and return type Rd;
 *       samMethodType (describing the implemented method type) has N
 *       parameters, of types (U1..Un) and return type Ru;
 *       implMethod (the MethodHandle providing the
 *       implementation has M parameters, of types (A1..Am) and return type Ra
 *       (if the method describes an instance method, the method type of this
 *       method handle already includes an extra first argument corresponding to
 *       the receiver);
 *       instantiatedMethodType (allowing restrictions on invocation)
 *       has N parameters, of types (T1..Tn) and return type Rt.
 *  
 * 
 *  Then the following linkage invariants must hold:
 *  
 *      Rd is an interface
 *      implMethod is a direct method handle
 *      samMethodType and instantiatedMethodType have the same
 *      arity N, and for i=1..N, Ti and Ui are the same type, or Ti and Ui are
 *      both reference types and Ti is a subtype of Ui
 *      Either Rt and Ru are the same type, or both are reference types and
 *      Rt is a subtype of Ru
 *      K + N = M
 *      For i=1..K, Di = Ai
 *      For i=1..N, Ti is adaptable to Aj, where j=i+k
 *      The return type Rt is void, or the return type Ra is not void and is
 *      adaptable to Rt
 *  
 * 
 *  Further, at capture time, if implMethod corresponds to an instance
 *  method, and there are any capture arguments (K > 0), then the first
 *  capture argument (corresponding to the receiver) must be non-null.
 * 
 *  A type Q is considered adaptable to S as follows:
 *  
 *      QSLink-time checksInvocation-time checks
 *      
 *          PrimitivePrimitive
 *          Q can be converted to S via a primitive widening conversion
 *          None
 *      
 *      
 *          PrimitiveReference
 *          S is a supertype of the Wrapper(Q)
 *          Cast from Wrapper(Q) to S
 *      
 *      
 *          ReferencePrimitive
 *          for parameter types: Q is a primitive wrapper and Primitive(Q)
 *          can be widened to S
 *          for return types: If Q is a primitive wrapper, check that
 *          Primitive(Q) can be widened to S
 *          If Q is not a primitive wrapper, cast Q to the base Wrapper(S);
 *          for example Number for numeric types
 *      
 *      
 *          ReferenceReference
 *          for parameter types: S is a supertype of Q
 *          for return types: none
 *          Cast from Q to S
 *      
 *  
 */
class LambdaMetafactory extends Object {

    /**  */
    @stub
    def this() = ???
}

object LambdaMetafactory {
    /** Flag for alternate metafactories indicating the lambda object requires
     *  additional bridge methods
     */
    @stub
    val FLAG_BRIDGES: Int = ???

    /** Flag for alternate metafactories indicating the lambda object implements
     *  other marker interfaces
     *  besides Serializable
     */
    @stub
    val FLAG_MARKERS: Int = ???

    /** Flag for alternate metafactories indicating the lambda object
     *  must be serializable
     */
    @stub
    val FLAG_SERIALIZABLE: Int = ???

    /** Facilitates the creation of simple "function objects" that implement one
     *  or more interfaces by delegation to a provided MethodHandle,
     *  after appropriate type adaptation and partial evaluation of arguments.
     */
    @stub
    def altMetafactory(caller: MethodHandles.Lookup, invokedName: String, invokedType: MethodType, args: Object*): CallSite = ???

    /** Facilitates the creation of simple "function objects" that implement one
     *  or more interfaces by delegation to a provided MethodHandle,
     *  after appropriate type adaptation and partial evaluation of arguments.
     */
    @stub
    def metafactory(caller: MethodHandles.Lookup, invokedName: String, invokedType: MethodType, samMethodType: MethodType, implMethod: MethodHandle, instantiatedMethodType: MethodType): CallSite = ???
}
