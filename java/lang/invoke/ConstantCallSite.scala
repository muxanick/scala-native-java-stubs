package java.lang.invoke

import java.lang.Object
import scala.scalanative.annotation.stub

/** A ConstantCallSite is a CallSite whose target is permanent, and can never be changed.
 *  An invokedynamic instruction linked to a ConstantCallSite is permanently
 *  bound to the call site's target.
 */
class ConstantCallSite extends CallSite {

    /** Creates a call site with a permanent target. */
    @stub
    def this(target: MethodHandle) = ???

    /** Creates a call site with a permanent target, possibly bound to the call site itself. */
    @stub
    protected def this(targetType: MethodType, createTargetHook: MethodHandle) = ???

    /** Returns this call site's permanent target. */
    @stub
    def dynamicInvoker(): MethodHandle = ???

    /** Returns the target method of the call site, which behaves
     *  like a final field of the ConstantCallSite.
     */
    @stub
    def getTarget(): MethodHandle = ???

    /** Always throws an UnsupportedOperationException. */
    @stub
    def setTarget(ignore: MethodHandle): Unit = ???
}
