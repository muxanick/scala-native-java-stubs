package java.lang.invoke

import java.lang.Object

// A ConstantCallSite is a CallSite whose target is permanent, and can never be changed.
// An invokedynamic instruction linked to a ConstantCallSite is permanently
// bound to the call site's target.
class ConstantCallSite extends CallSite {

    @stub
    // Creates a call site with a permanent target.
    def this(target: MethodHandle) = ???

    @stub
    // Returns this call site's permanent target.
    def dynamicInvoker(): MethodHandle = ???

    @stub
    // Returns the target method of the call site, which behaves
    // like a final field of the ConstantCallSite.
    def getTarget(): MethodHandle = ???
}
