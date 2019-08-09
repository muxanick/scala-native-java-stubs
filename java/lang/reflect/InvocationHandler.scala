package java.lang.reflect

/** InvocationHandler is the interface implemented by
 *  the invocation handler of a proxy instance.
 * 
 *  Each proxy instance has an associated invocation handler.
 *  When a method is invoked on a proxy instance, the method
 *  invocation is encoded and dispatched to the invoke
 *  method of its invocation handler.
 */
trait InvocationHandler {
}
