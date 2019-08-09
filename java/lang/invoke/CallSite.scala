package java.lang.invoke

import java.lang.Object
import scala.scalanative.annotation.stub

/** A CallSite is a holder for a variable MethodHandle,
 *  which is called its target.
 *  An invokedynamic instruction linked to a CallSite delegates
 *  all calls to the site's current target.
 *  A CallSite may be associated with several invokedynamic
 *  instructions, or it may be "free floating", associated with none.
 *  In any case, it may be invoked through an associated method handle
 *  called its dynamic invoker.
 *  
 *  CallSite is an abstract class which does not allow
 *  direct subclassing by users.  It has three immediate,
 *  concrete subclasses that may be either instantiated or subclassed.
 *  
 *  If a mutable target is not required, an invokedynamic instruction
 *  may be permanently bound by means of a constant call site.
 *  If a mutable target is required which has volatile variable semantics,
 *  because updates to the target must be immediately and reliably witnessed by other threads,
 *  a volatile call site may be used.
 *  Otherwise, if a mutable target is required,
 *  a mutable call site may be used.
 *  
 *  
 *  A non-constant call site may be relinked by changing its target.
 *  The new target must have the same type
 *  as the previous target.
 *  Thus, though a call site can be relinked to a series of
 *  successive targets, it cannot change its type.
 *  
 *  Here is a sample use of call sites and bootstrap methods which links every
 *  dynamic call site to print its arguments:
 * 
 * static void test() throws Throwable {
 *     // THE FOLLOWING LINE IS PSEUDOCODE FOR A JVM INSTRUCTION
 *     InvokeDynamic[#bootstrapDynamic].baz("baz arg", 2, 3.14);
 * }
 * private static void printArgs(Object... args) {
 *   System.out.println(java.util.Arrays.deepToString(args));
 * }
 * private static final MethodHandle printArgs;
 * static {
 *   MethodHandles.Lookup lookup = MethodHandles.lookup();
 *   Class thisClass = lookup.lookupClass();  // (who am I?)
 *   printArgs = lookup.findStatic(thisClass,
 *       "printArgs", MethodType.methodType(void.class, Object[].class));
 * }
 * private static CallSite bootstrapDynamic(MethodHandles.Lookup caller, String name, MethodType type) {
 *   // ignore caller and name, but match the type:
 *   return new ConstantCallSite(printArgs.asType(type));
 * }
 * 
 */
abstract class CallSite extends Object {

    /** Produces a method handle equivalent to an invokedynamic instruction
     *  which has been linked to this call site.
     */
    def dynamicInvoker(): MethodHandle

    /** Returns the target method of the call site, according to the
     *  behavior defined by this call site's specific class.
     */
    def getTarget(): MethodHandle

    /** Updates the target method of this call site, according to the
     *  behavior defined by this call site's specific class.
     */
    def setTarget(newTarget: MethodHandle): Unit

    /** Returns the type of this call site's target. */
    def type(): MethodType
}
