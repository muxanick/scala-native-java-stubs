package java.lang.invoke

import java.lang.{Class, Object}

/** This class consists exclusively of static methods that help adapt
 *  method handles to other JVM types, such as interfaces.
 */
class MethodHandleProxies extends Object {
}

object MethodHandleProxies {
    /** Produces an instance of the given single-method interface which redirects
     *  its calls to the given method handle.
     */
    @stub
    def asInterfaceInstance[T](intfc: Class[T], target: MethodHandle): T = ???

    /** Determines if the given object was produced by a call to asInterfaceInstance. */
    @stub
    def isWrapperInstance(x: Object): Boolean = ???

    /** Produces or recovers a target method handle which is behaviorally
     *  equivalent to the unique method of this wrapper instance.
     */
    @stub
    def wrapperInstanceTarget(x: Object): MethodHandle = ???
}
