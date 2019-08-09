package java.lang.invoke

import java.lang.Object

/** A MutableCallSite is a CallSite whose target variable
 *  behaves like an ordinary field.
 *  An invokedynamic instruction linked to a MutableCallSite delegates
 *  all calls to the site's current target.
 *  The dynamic invoker of a mutable call site
 *  also delegates each call to the site's current target.
 *  
 *  Here is an example of a mutable call site which introduces a
 *  state variable into a method handle chain.
 *  <!--  JavaDocExamplesTest.testMutableCallSite  -->
 *  
 * MutableCallSite name = new MutableCallSite(MethodType.methodType(String.class));
 * MethodHandle MH_name = name.dynamicInvoker();
 * MethodType MT_str1 = MethodType.methodType(String.class);
 * MethodHandle MH_upcase = MethodHandles.lookup()
 *     .findVirtual(String.class, "toUpperCase", MT_str1);
 * MethodHandle worker1 = MethodHandles.filterReturnValue(MH_name, MH_upcase);
 * name.setTarget(MethodHandles.constant(String.class, "Rocky"));
 * assertEquals("ROCKY", (String) worker1.invokeExact());
 * name.setTarget(MethodHandles.constant(String.class, "Fred"));
 * assertEquals("FRED", (String) worker1.invokeExact());
 * // (mutation can be continued indefinitely)
 *  
 *  
 *  The same call site may be used in several places at once.
 *  
 * MethodType MT_str2 = MethodType.methodType(String.class, String.class);
 * MethodHandle MH_cat = lookup().findVirtual(String.class,
 *   "concat", methodType(String.class, String.class));
 * MethodHandle MH_dear = MethodHandles.insertArguments(MH_cat, 1, ", dear?");
 * MethodHandle worker2 = MethodHandles.filterReturnValue(MH_name, MH_dear);
 * assertEquals("Fred, dear?", (String) worker2.invokeExact());
 * name.setTarget(MethodHandles.constant(String.class, "Wilma"));
 * assertEquals("WILMA", (String) worker1.invokeExact());
 * assertEquals("Wilma, dear?", (String) worker2.invokeExact());
 *  
 *  
 *  Non-synchronization of target values:
 *  A write to a mutable call site's target does not force other threads
 *  to become aware of the updated value.  Threads which do not perform
 *  suitable synchronization actions relative to the updated call site
 *  may cache the old target value and delay their use of the new target
 *  value indefinitely.
 *  (This is a normal consequence of the Java Memory Model as applied
 *  to object fields.)
 *  
 *  The syncAll operation provides a way to force threads
 *  to accept a new target value, even if there is no other synchronization.
 *  
 *  For target values which will be frequently updated, consider using
 *  a volatile call site instead.
 */
class MutableCallSite extends CallSite {

    /** Creates a call site object with an initial target method handle. */
    @stub
    def this(target: MethodHandle) = ???

    /** Produces a method handle equivalent to an invokedynamic instruction
     *  which has been linked to this call site.
     */
    @stub
    def dynamicInvoker(): MethodHandle = ???

    /** Returns the target method of the call site, which behaves
     *  like a normal field of the MutableCallSite.
     */
    @stub
    def getTarget(): MethodHandle = ???

    /** Updates the target method of this call site, as a normal variable. */
    @stub
    def setTarget(newTarget: MethodHandle): Unit = ???
}
