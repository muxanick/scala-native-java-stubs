package java.lang.reflect

import java.lang.Object
import scala.scalanative.annotation.stub

/** InvocationHandler is the interface implemented by
 *  the invocation handler of a proxy instance.
 * 
 *  Each proxy instance has an associated invocation handler.
 *  When a method is invoked on a proxy instance, the method
 *  invocation is encoded and dispatched to the invoke
 *  method of its invocation handler.
 */
trait InvocationHandler {

    /** Processes a method invocation on a proxy instance and returns
     *  the result.
     */
    @stub
    def invoke(proxy: Object, method: Method, args: Array[Object]): Object = ???
}
