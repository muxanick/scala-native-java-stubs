package java.lang.invoke

import java.lang.Object

// A VolatileCallSite is a CallSite whose target acts like a volatile variable.
// An invokedynamic instruction linked to a VolatileCallSite sees updates
// to its call site target immediately, even if the update occurs in another thread.
// There may be a performance penalty for such tight coupling between threads.
// 
// Unlike MutableCallSite, there is no
// syncAll operation on volatile
// call sites, since every write to a volatile variable is implicitly
// synchronized with reader threads.
// 
// In other respects, a VolatileCallSite is interchangeable
// with MutableCallSite.
class VolatileCallSite extends CallSite {

    @stub
    // Creates a call site with a volatile binding to its target.
    def this(target: MethodHandle) = ???

    @stub
    // Produces a method handle equivalent to an invokedynamic instruction
    // which has been linked to this call site.
    def dynamicInvoker(): MethodHandle = ???

    @stub
    // Returns the target method of the call site, which behaves
    // like a volatile field of the VolatileCallSite.
    def getTarget(): MethodHandle = ???
}
