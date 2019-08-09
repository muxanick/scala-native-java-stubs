package java.lang.invoke

import java.lang.{Class, String}
import java.lang.reflect.Member
import scala.scalanative.annotation.stub

/** A symbolic reference obtained by cracking a direct method handle
 *  into its consitutent symbolic parts.
 *  To crack a direct method handle, call Lookup.revealDirect.
 *  Direct Method Handles
 *  A direct method handle represents a method, constructor, or field without
 *  any intervening argument bindings or other transformations.
 *  The method, constructor, or field referred to by a direct method handle is called
 *  its underlying member.
 *  Direct method handles may be obtained in any of these ways:
 *  
 *  By executing an ldc instruction on a CONSTANT_MethodHandle constant.
 *      (See the Java Virtual Machine Specification, sections 4.4.8 and 5.4.3.)
 *  By calling one of the Lookup Factory Methods,
 *      such as Lookup.findVirtual,
 *      to resolve a symbolic reference into a method handle.
 *      A symbolic reference consists of a class, name string, and type.
 *  By calling the factory method Lookup.unreflect
 *      or Lookup.unreflectSpecial
 *      to convert a Method into a method handle.
 *  By calling the factory method Lookup.unreflectConstructor
 *      to convert a Constructor into a method handle.
 *  By calling the factory method Lookup.unreflectGetter
 *      or Lookup.unreflectSetter
 *      to convert a Field into a method handle.
 *  
 * 
 *  Restrictions on Cracking
 *  Given a suitable Lookup object, it is possible to crack any direct method handle
 *  to recover a symbolic reference for the underlying method, constructor, or field.
 *  Cracking must be done via a Lookup object equivalent to that which created
 *  the target method handle, or which has enough access permissions to recreate
 *  an equivalent method handle.
 *  
 *  If the underlying method is caller sensitive,
 *  the direct method handle will have been "bound" to a particular caller class, the
 *  lookup class
 *  of the lookup object used to create it.
 *  Cracking this method handle with a different lookup class will fail
 *  even if the underlying method is public (like Class.forName).
 *  
 *  The requirement of lookup object matching provides a "fast fail" behavior
 *  for programs which may otherwise trust erroneous revelation of a method
 *  handle with symbolic information (or caller binding) from an unexpected scope.
 *  Use MethodHandles.reflectAs(java.lang.Class<T>, java.lang.invoke.MethodHandle) to override this limitation.
 * 
 *  Reference kinds
 *  The Lookup Factory Methods
 *  correspond to all major use cases for methods, constructors, and fields.
 *  These use cases may be distinguished using small integers as follows:
 *  
 *  reference kinddescriptive namescopememberbehavior
 *  
 *      1REF_getFieldclass
 *      FT f;(T) this.f;
 *  
 *  
 *      2REF_getStaticclass or interface
 *      staticFT f;(T) C.f;
 *  
 *  
 *      3REF_putFieldclass
 *      FT f;this.f = x;
 *  
 *  
 *      4REF_putStaticclass
 *      staticFT f;C.f = arg;
 *  
 *  
 *      5REF_invokeVirtualclass
 *      T m(A*);(T) this.m(arg*);
 *  
 *  
 *      6REF_invokeStaticclass or interface
 *      staticT m(A*);(T) C.m(arg*);
 *  
 *  
 *      7REF_invokeSpecialclass or interface
 *      T m(A*);(T) super.m(arg*);
 *  
 *  
 *      8REF_newInvokeSpecialclass
 *      C(A*);new C(arg*);
 *  
 *  
 *      9REF_invokeInterfaceinterface
 *      T m(A*);(T) this.m(arg*);
 *  
 *  
 */
trait MethodHandleInfo {

    /** Returns the class in which the cracked method handle's underlying member was defined. */
    @stub
    def getDeclaringClass(): Class[_] = ???

    /** Returns the nominal type of the cracked symbolic reference, expressed as a method type. */
    @stub
    def getMethodType(): MethodType = ???

    /** Returns the access modifiers of the underlying member. */
    @stub
    def getModifiers(): Int = ???

    /** Returns the name of the cracked method handle's underlying member. */
    @stub
    def getName(): String = ???

    /** Returns the reference kind of the cracked method handle, which in turn
     *  determines whether the method handle's underlying member was a constructor, method, or field.
     */
    @stub
    def getReferenceKind(): Int = ???

    /** Determines if the underlying member was a variable arity method or constructor. */
    @stub
    def isVarArgs(): Boolean = ???

    /** Reflects the underlying member as a method, constructor, or field object. */
    @stub
    def reflectAs[T <: Member](expected: Class[T], lookup: MethodHandles.Lookup): T = ???
}

object MethodHandleInfo {
    /** A direct method handle reference kind,
     *  as defined in the table above.
     */
    @stub
    val REF_getField: Int = ???

    /** A direct method handle reference kind,
     *  as defined in the table above.
     */
    @stub
    val REF_getStatic: Int = ???

    /** A direct method handle reference kind,
     *  as defined in the table above.
     */
    @stub
    val REF_invokeInterface: Int = ???

    /** A direct method handle reference kind,
     *  as defined in the table above.
     */
    @stub
    val REF_invokeSpecial: Int = ???

    /** A direct method handle reference kind,
     *  as defined in the table above.
     */
    @stub
    val REF_invokeStatic: Int = ???

    /** A direct method handle reference kind,
     *  as defined in the table above.
     */
    @stub
    val REF_invokeVirtual: Int = ???

    /** A direct method handle reference kind,
     *  as defined in the table above.
     */
    @stub
    val REF_newInvokeSpecial: Int = ???

    /** A direct method handle reference kind,
     *  as defined in the table above.
     */
    @stub
    val REF_putField: Int = ???

    /** A direct method handle reference kind,
     *  as defined in the table above.
     */
    @stub
    val REF_putStatic: Int = ???

    /** Returns the descriptive name of the given reference kind,
     *  as defined in the table above.
     */
    @stub
    def referenceKindToString(referenceKind: Int): String = ???

    /** Returns a string representation for a MethodHandleInfo,
     *  given the four parts of its symbolic reference.
     */
    @stub
    def toString(kind: Int, defc: Class[_], name: String, type: MethodType): String = ???
}
