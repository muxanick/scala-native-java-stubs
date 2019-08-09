package java.beans

import java.lang.Object
import java.lang.reflect.Method

/** A MethodDescriptor describes a particular method that a Java Bean
 *  supports for external access from other components.
 */
class MethodDescriptor extends FeatureDescriptor {

    /** Constructs a MethodDescriptor from a
     *  Method.
     */
    @stub
    def this(method: Method) = ???

    /** Gets the method that this MethodDescriptor encapsulates. */
    @stub
    def getMethod(): Method = ???
}
