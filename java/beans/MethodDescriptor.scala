package java.beans

import java.lang.Object
import java.lang.reflect.Method
import scala.scalanative.annotation.stub

/** A MethodDescriptor describes a particular method that a Java Bean
 *  supports for external access from other components.
 */
class MethodDescriptor extends FeatureDescriptor {

    /** Constructs a MethodDescriptor from a
     *  Method.
     */
    @stub
    def this(method: Method) = ???

    /** Constructs a MethodDescriptor from a
     *  Method providing descriptive information for each
     *  of the method's parameters.
     */
    @stub
    def this(method: Method, parameterDescriptors: Array[ParameterDescriptor]) = ???

    /** Gets the method that this MethodDescriptor encapsulates. */
    @stub
    def getMethod(): Method = ???

    /** Gets the ParameterDescriptor for each of this MethodDescriptor's
     *  method's parameters.
     */
    @stub
    def getParameterDescriptors(): Array[ParameterDescriptor] = ???
}
