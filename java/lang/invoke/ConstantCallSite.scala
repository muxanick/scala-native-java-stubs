package java.lang.invoke

import java.lang.Object

/** A ConstantCallSite is a CallSite whose target is permanent, and can never be changed.
 *  An invokedynamic instruction linked to a ConstantCallSite is permanently
 *  bound to the call site's target.
 */
class ConstantCallSite extends CallSite {

    /** Creates a call site with a permanent target. */
    @stub
    def this(target: MethodHandle) = ???

    /** Returns this call site's permanent target. */
    @stub
    def dynamicInvoker(): MethodHandle = ???

    /** Returns the target method of the call site, which behaves
     *  like a final field of the ConstantCallSite.
     */
    @stub
    def getTarget(): MethodHandle = ???
}
