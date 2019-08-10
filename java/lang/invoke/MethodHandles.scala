package java.lang.invoke

import java.lang.{Class, Object, String, Throwable}
import java.lang.reflect.{Constructor, Field, Member, Method}
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
     *  Method handles do not perform
     *  access checks when they are called, but rather when they are created.
     *  Therefore, method handle access
     *  restrictions must be enforced when a method handle is created.
     *  The caller class against which those restrictions are enforced
     *  is known as the lookup class.
     *  
     *  A lookup class which needs to create method handles will call
     *  MethodHandles.lookup to create a factory for itself.
     *  When the Lookup factory object is created, the identity of the lookup class is
     *  determined, and securely stored in the Lookup object.
     *  The lookup class (or its delegates) may then use factory methods
     *  on the Lookup object to create method handles for access-checked members.
     *  This includes all methods, constructors, and fields which are allowed to the lookup class,
     *  even private ones.
     * 
     *  Lookup Factory Methods
     *  The factory methods on a Lookup object correspond to all major
     *  use cases for methods, constructors, and fields.
     *  Each method handle created by a factory method is the functional
     *  equivalent of a particular bytecode behavior.
     *  (Bytecode behaviors are described in section 5.4.3.5 of the Java Virtual Machine Specification.)
     *  Here is a summary of the correspondence between these factory methods and
     *  the behavior the resulting method handles:
     *  
     *  
     *      lookup expression
     *      member
     *      bytecode behavior
     *  
     *  
     *      lookup.findGetter(C.class,"f",FT.class)
     *      FT f;(T) this.f;
     *  
     *  
     *      lookup.findStaticGetter(C.class,"f",FT.class)
     *      staticFT f;(T) C.f;
     *  
     *  
     *      lookup.findSetter(C.class,"f",FT.class)
     *      FT f;this.f = x;
     *  
     *  
     *      lookup.findStaticSetter(C.class,"f",FT.class)
     *      staticFT f;C.f = arg;
     *  
     *  
     *      lookup.findVirtual(C.class,"m",MT)
     *      T m(A*);(T) this.m(arg*);
     *  
     *  
     *      lookup.findStatic(C.class,"m",MT)
     *      staticT m(A*);(T) C.m(arg*);
     *  
     *  
     *      lookup.findSpecial(C.class,"m",MT,this.class)
     *      T m(A*);(T) super.m(arg*);
     *  
     *  
     *      lookup.findConstructor(C.class,MT)
     *      C(A*);new C(arg*);
     *  
     *  
     *      lookup.unreflectGetter(aField)
     *      (static)?FT f;(FT) aField.get(thisOrNull);
     *  
     *  
     *      lookup.unreflectSetter(aField)
     *      (static)?FT f;aField.set(thisOrNull, arg);
     *  
     *  
     *      lookup.unreflect(aMethod)
     *      (static)?T m(A*);(T) aMethod.invoke(thisOrNull, arg*);
     *  
     *  
     *      lookup.unreflectConstructor(aConstructor)
     *      C(A*);(C) aConstructor.newInstance(arg*);
     *  
     *  
     *      lookup.unreflect(aMethod)
     *      (static)?T m(A*);(T) aMethod.invoke(thisOrNull, arg*);
     *  
     *  
     * 
     *  Here, the type C is the class or interface being searched for a member,
     *  documented as a parameter named refc in the lookup methods.
     *  The method type MT is composed from the return type T
     *  and the sequence of argument types A*.
     *  The constructor also has a sequence of argument types A* and
     *  is deemed to return the newly-created object of type C.
     *  Both MT and the field type FT are documented as a parameter named type.
     *  The formal parameter this stands for the self-reference of type C;
     *  if it is present, it is always the leading argument to the method handle invocation.
     *  (In the case of some protected members, this may be
     *  restricted in type to the lookup class; see below.)
     *  The name arg stands for all the other method handle arguments.
     *  In the code examples for the Core Reflection API, the name thisOrNull
     *  stands for a null reference if the accessed method or field is static,
     *  and this otherwise.
     *  The names aMethod, aField, and aConstructor stand
     *  for reflective objects corresponding to the given members.
     *  
     *  In cases where the given member is of variable arity (i.e., a method or constructor)
     *  the returned method handle will also be of variable arity.
     *  In all other cases, the returned method handle will be of fixed arity.
     *  
     *  Discussion:
     *  The equivalence between looked-up method handles and underlying
     *  class members and bytecode behaviors
     *  can break down in a few ways:
     *  
     *  If C is not symbolically accessible from the lookup class's loader,
     *  the lookup can still succeed, even when there is no equivalent
     *  Java expression or bytecoded constant.
     *  Likewise, if T or MT
     *  is not symbolically accessible from the lookup class's loader,
     *  the lookup can still succeed.
     *  For example, lookups for MethodHandle.invokeExact and
     *  MethodHandle.invoke will always succeed, regardless of requested type.
     *  If there is a security manager installed, it can forbid the lookup
     *  on various grounds (see below).
     *  By contrast, the ldc instruction on a CONSTANT_MethodHandle
     *  constant is not subject to security manager checks.
     *  If the looked-up method has a
     *  very large arity,
     *  the method handle creation may fail, due to the method handle
     *  type having too many parameters.
     *  
     * 
     *  Access checking
     *  Access checks are applied in the factory methods of Lookup,
     *  when a method handle is created.
     *  This is a key difference from the Core Reflection API, since
     *  java.lang.reflect.Method.invoke
     *  performs access checking against every caller, on every call.
     *  
     *  All access checks start from a Lookup object, which
     *  compares its recorded lookup class against all requests to
     *  create method handles.
     *  A single Lookup object can be used to create any number
     *  of access-checked method handles, all checked against a single
     *  lookup class.
     *  
     *  A Lookup object can be shared with other trusted code,
     *  such as a metaobject protocol.
     *  A shared Lookup object delegates the capability
     *  to create method handles on private members of the lookup class.
     *  Even if privileged code uses the Lookup object,
     *  the access checking is confined to the privileges of the
     *  original lookup class.
     *  
     *  A lookup can fail, because
     *  the containing class is not accessible to the lookup class, or
     *  because the desired class member is missing, or because the
     *  desired class member is not accessible to the lookup class, or
     *  because the lookup object is not trusted enough to access the member.
     *  In any of these cases, a ReflectiveOperationException will be
     *  thrown from the attempted lookup.  The exact class will be one of
     *  the following:
     *  
     *  NoSuchMethodException — if a method is requested but does not exist
     *  NoSuchFieldException — if a field is requested but does not exist
     *  IllegalAccessException — if the member exists but an access check fails
     *  
     *  
     *  In general, the conditions under which a method handle may be
     *  looked up for a method M are no more restrictive than the conditions
     *  under which the lookup class could have compiled, verified, and resolved a call to M.
     *  Where the JVM would raise exceptions like NoSuchMethodError,
     *  a method handle lookup will generally raise a corresponding
     *  checked exception, such as NoSuchMethodException.
     *  And the effect of invoking the method handle resulting from the lookup
     *  is exactly equivalent
     *  to executing the compiled, verified, and resolved call to M.
     *  The same point is true of fields and constructors.
     *  
     *  Discussion:
     *  Access checks only apply to named and reflected methods,
     *  constructors, and fields.
     *  Other method handle creation methods, such as
     *  MethodHandle.asType,
     *  do not require any access checks, and are used
     *  independently of any Lookup object.
     *  
     *  If the desired member is protected, the usual JVM rules apply,
     *  including the requirement that the lookup class must be either be in the
     *  same package as the desired member, or must inherit that member.
     *  (See the Java Virtual Machine Specification, sections 4.9.2, 5.4.3.5, and 6.4.)
     *  In addition, if the desired member is a non-static field or method
     *  in a different package, the resulting method handle may only be applied
     *  to objects of the lookup class or one of its subclasses.
     *  This requirement is enforced by narrowing the type of the leading
     *  this parameter from C
     *  (which will necessarily be a superclass of the lookup class)
     *  to the lookup class itself.
     *  
     *  The JVM imposes a similar requirement on invokespecial instruction,
     *  that the receiver argument must match both the resolved method and
     *  the current class.  Again, this requirement is enforced by narrowing the
     *  type of the leading parameter to the resulting method handle.
     *  (See the Java Virtual Machine Specification, section 4.10.1.9.)
     *  
     *  The JVM represents constructors and static initializer blocks as internal methods
     *  with special names ("<init>" and "<clinit>").
     *  The internal syntax of invocation instructions allows them to refer to such internal
     *  methods as if they were normal methods, but the JVM bytecode verifier rejects them.
     *  A lookup of such an internal method will produce a NoSuchMethodException.
     *  
     *  In some cases, access between nested classes is obtained by the Java compiler by creating
     *  an wrapper method to access a private method of another class
     *  in the same top-level declaration.
     *  For example, a nested class C.D
     *  can access private members within other related classes such as
     *  C, C.D.E, or C.B,
     *  but the Java compiler may need to generate wrapper methods in
     *  those related classes.  In such cases, a Lookup object on
     *  C.E would be unable to those private members.
     *  A workaround for this limitation is the Lookup.in method,
     *  which can transform a lookup on C.E into one on any of those other
     *  classes, without special elevation of privilege.
     *  
     *  The accesses permitted to a given lookup object may be limited,
     *  according to its set of lookupModes,
     *  to a subset of members normally accessible to the lookup class.
     *  For example, the publicLookup
     *  method produces a lookup object which is only allowed to access
     *  public members in public classes.
     *  The caller sensitive method lookup
     *  produces a lookup object with full capabilities relative to
     *  its caller class, to emulate all supported bytecode behaviors.
     *  Also, the Lookup.in method may produce a lookup object
     *  with fewer access modes than the original lookup object.
     * 
     *  
     *  
     *  Discussion of private access:
     *  We say that a lookup has private access
     *  if its lookup modes
     *  include the possibility of accessing private members.
     *  As documented in the relevant methods elsewhere,
     *  only lookups with private access possess the following capabilities:
     *  
     *  access private fields, methods, and constructors of the lookup class
     *  create method handles which invoke caller sensitive methods,
     *      such as Class.forName
     *  create method handles which emulate invokespecial instructions
     *  avoid package access checks
     *      for classes accessible to the lookup class
     *  create delegated lookup objects which have private access to other classes
     *      within the same package member
     *  
     *  
     *  Each of these permissions is a consequence of the fact that a lookup object
     *  with private access can be securely traced back to an originating class,
     *  whose bytecode behaviors and Java language access permissions
     *  can be reliably determined and emulated by method handles.
     * 
     *  Security manager interactions
     *  Although bytecode instructions can only refer to classes in
     *  a related class loader, this API can search for methods in any
     *  class, as long as a reference to its Class object is
     *  available.  Such cross-loader references are also possible with the
     *  Core Reflection API, and are impossible to bytecode instructions
     *  such as invokestatic or getfield.
     *  There is a security manager API
     *  to allow applications to check such cross-loader references.
     *  These checks apply to both the MethodHandles.Lookup API
     *  and the Core Reflection API
     *  (as found on Class).
     *  
     *  If a security manager is present, member lookups are subject to
     *  additional checks.
     *  From one to three calls are made to the security manager.
     *  Any of these calls can refuse access by throwing a
     *  SecurityException.
     *  Define smgr as the security manager,
     *  lookc as the lookup class of the current lookup object,
     *  refc as the containing class in which the member
     *  is being sought, and defc as the class in which the
     *  member is actually defined.
     *  The value lookc is defined as not present
     *  if the current lookup object does not have
     *  private access.
     *  The calls are made according to the following rules:
     *  
     *  Step 1:
     *      If lookc is not present, or if its class loader is not
     *      the same as or an ancestor of the class loader of refc,
     *      then smgr.checkPackageAccess(refcPkg) is called,
     *      where refcPkg is the package of refc.
     *  Step 2:
     *      If the retrieved member is not public and
     *      lookc is not present, then
     *      smgr.checkPermission
     *      with RuntimePermission("accessDeclaredMembers") is called.
     *  Step 3:
     *      If the retrieved member is not public,
     *      and if lookc is not present,
     *      and if defc and refc are different,
     *      then smgr.checkPackageAccess(defcPkg) is called,
     *      where defcPkg is the package of defc.
     *  
     *  Security checks are performed after other access checks have passed.
     *  Therefore, the above rules presuppose a member that is public,
     *  or else that is being accessed from a lookup class that has
     *  rights to access the member.
     * 
     *  Caller sensitive methods
     *  A small number of Java methods have a special property called caller sensitivity.
     *  A caller-sensitive method can behave differently depending on the
     *  identity of its immediate caller.
     *  
     *  If a method handle for a caller-sensitive method is requested,
     *  the general rules for bytecode behaviors apply,
     *  but they take account of the lookup class in a special way.
     *  The resulting method handle behaves as if it were called
     *  from an instruction contained in the lookup class,
     *  so that the caller-sensitive method detects the lookup class.
     *  (By contrast, the invoker of the method handle is disregarded.)
     *  Thus, in the case of caller-sensitive methods,
     *  different lookup classes may give rise to
     *  differently behaving method handles.
     *  
     *  In cases where the lookup object is
     *  publicLookup(),
     *  or some other lookup object without
     *  private access,
     *  the lookup class is disregarded.
     *  In such cases, no caller-sensitive method handle can be created,
     *  access is forbidden, and the lookup fails with an
     *  IllegalAccessException.
     *  
     *  Discussion:
     *  For example, the caller-sensitive method
     *  Class.forName(x)
     *  can return varying classes or throw varying exceptions,
     *  depending on the class loader of the class that calls it.
     *  A public lookup of Class.forName will fail, because
     *  there is no reasonable way to determine its bytecode behavior.
     *  
     *  If an application caches method handles for broad sharing,
     *  it should use publicLookup() to create them.
     *  If there is a lookup of Class.forName, it will fail,
     *  and the application must take appropriate action in that case.
     *  It may be that a later lookup, perhaps during the invocation of a
     *  bootstrap method, can incorporate the specific identity
     *  of the caller, making the method accessible.
     *  
     *  The function MethodHandles.lookup is caller sensitive
     *  so that there can be a secure foundation for lookups.
     *  Nearly all other methods in the JSR 292 API rely on lookup
     *  objects to check access requests.
     */
    final object Lookup extends Object {

        /** A single-bit mask representing package access (default access),
         *   which may contribute to the result of lookupModes.
         */
        @stub
        val PACKAGE: Int = ???

        /** A single-bit mask representing private access,
         *   which may contribute to the result of lookupModes.
         */
        @stub
        val PRIVATE: Int = ???

        /** A single-bit mask representing protected access,
         *   which may contribute to the result of lookupModes.
         */
        @stub
        val PROTECTED: Int = ???

        /** A single-bit mask representing public access,
         *   which may contribute to the result of lookupModes.
         */
        @stub
        val PUBLIC: Int = ???

        /** Produces an early-bound method handle for a non-static method. */
        @stub
        def bind(receiver: Any, name: String, type: MethodType): MethodHandle = ???

        /** Produces a method handle which creates an object and initializes it, using
         *  the constructor of the specified type.
         */
        @stub
        def findConstructor(refc: Class[_], type: MethodType): MethodHandle = ???

        /** Produces a method handle giving read access to a non-static field. */
        @stub
        def findGetter(refc: Class[_], name: String, type: Class[_]): MethodHandle = ???

        /** Produces a method handle giving write access to a non-static field. */
        @stub
        def findSetter(refc: Class[_], name: String, type: Class[_]): MethodHandle = ???

        /** Produces an early-bound method handle for a virtual method. */
        @stub
        def findSpecial(refc: Class[_], name: String, type: MethodType, specialCaller: Class[_]): MethodHandle = ???

        /** Produces a method handle for a static method. */
        @stub
        def findStatic(refc: Class[_], name: String, type: MethodType): MethodHandle = ???

        /** Produces a method handle giving read access to a static field. */
        @stub
        def findStaticGetter(refc: Class[_], name: String, type: Class[_]): MethodHandle = ???

        /** Produces a method handle giving write access to a static field. */
        @stub
        def findStaticSetter(refc: Class[_], name: String, type: Class[_]): MethodHandle = ???

        /** Produces a method handle for a virtual method. */
        @stub
        def findVirtual(refc: Class[_], name: String, type: MethodType): MethodHandle = ???

        /** Creates a lookup on the specified new lookup class. */
        @stub
        def in(requestedLookupClass: Class[_]): Lookup = ???

        /** Tells which class is performing the lookup. */
        @stub
        def lookupClass(): Class[_] = ???

        /** Tells which access-protection classes of members this lookup object can produce. */
        @stub
        def lookupModes(): Int = ???

        /** Cracks a direct method handle
         *  created by this lookup object or a similar one.
         */
        @stub
        def revealDirect(target: MethodHandle): MethodHandleInfo = ???

        /** Displays the name of the class from which lookups are to be made. */
        @stub
        def toString(): String = ???

        /** Makes a direct method handle
         *  to m, if the lookup class has permission.
         */
        @stub
        def unreflect(m: Method): MethodHandle = ???

        /** Produces a method handle for a reflected constructor. */
        @stub
        def unreflectConstructor(c: Constructor[_]): MethodHandle = ???

        /** Produces a method handle giving read access to a reflected field. */
        @stub
        def unreflectGetter(f: Field): MethodHandle = ???

        /** Produces a method handle giving write access to a reflected field. */
        @stub
        def unreflectSetter(f: Field): MethodHandle = ???

        /** Produces a method handle for a reflected method. */
        @stub
        def unreflectSpecial(m: Method, specialCaller: Class[_]): MethodHandle = ???
    }


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
