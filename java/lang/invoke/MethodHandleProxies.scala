package java.lang.invoke

import java.lang.{Class, Object}

// This class consists exclusively of static methods that help adapt
// method handles to other JVM types, such as interfaces.
class MethodHandleProxies extends Object {
}

object MethodHandleProxies {
    @stub
    // Produces an instance of the given single-method interface which redirects
    // its calls to the given method handle.
    def T: [T] = ???

    @stub
    // Determines if the given object was produced by a call to asInterfaceInstance.
    def isWrapperInstance(x: Object): Boolean = ???

    @stub
    // Produces or recovers a target method handle which is behaviorally
    // equivalent to the unique method of this wrapper instance.
    def wrapperInstanceTarget(x: Object): MethodHandle = ???
}
