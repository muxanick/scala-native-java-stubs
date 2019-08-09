package java.beans

import java.lang.Object
import java.lang.reflect.Method

// A MethodDescriptor describes a particular method that a Java Bean
// supports for external access from other components.
class MethodDescriptor extends FeatureDescriptor {

    @stub
    // Constructs a MethodDescriptor from a
    // Method.
    def this(method: Method) = ???

    @stub
    // Gets the method that this MethodDescriptor encapsulates.
    def getMethod(): Method = ???
}
