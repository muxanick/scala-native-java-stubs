package java.lang.invoke

import java.io.Serializable
import java.lang.{Class, Object, String}
import scala.scalanative.annotation.stub

/** Serialized form of a lambda expression.  The properties of this class
 *  represent the information that is present at the lambda factory site, including
 *  static metafactory arguments such as the identity of the primary functional
 *  interface method and the identity of the implementation method, as well as
 *  dynamic metafactory arguments such as values captured from the lexical scope
 *  at the time of lambda capture.
 * 
 *  Implementors of serializable lambdas, such as compilers or language
 *  runtime libraries, are expected to ensure that instances deserialize properly.
 *  One means to do so is to ensure that the writeReplace method returns
 *  an instance of SerializedLambda, rather than allowing default
 *  serialization to proceed.
 * 
 *  SerializedLambda has a readResolve method that looks for
 *  a (possibly private) static method called
 *  $deserializeLambda$(SerializedLambda) in the capturing class, invokes
 *  that with itself as the first argument, and returns the result.  Lambda classes
 *  implementing $deserializeLambda$ are responsible for validating
 *  that the properties of the SerializedLambda are consistent with a
 *  lambda actually captured by that class.
 */
final class SerializedLambda extends Object with Serializable {

    /** Create a SerializedLambda from the low-level information present
     *  at the lambda factory site.
     */
    @stub
    def this(capturingClass: Class[_], functionalInterfaceClass: String, functionalInterfaceMethodName: String, functionalInterfaceMethodSignature: String, implMethodKind: Int, implClass: String, implMethodName: String, implMethodSignature: String, instantiatedMethodType: String, capturedArgs: Array[Object]) = ???

    /** Get a dynamic argument to the lambda capture site. */
    @stub
    def getCapturedArg(i: Int): Any = ???

    /** Get the count of dynamic arguments to the lambda capture site. */
    @stub
    def getCapturedArgCount(): Int = ???

    /** Get the name of the class that captured this lambda. */
    @stub
    def getCapturingClass(): String = ???

    /** Get the name of the invoked type to which this
     *  lambda has been converted
     */
    @stub
    def getFunctionalInterfaceClass(): String = ???

    /** Get the name of the primary method for the functional interface
     *  to which this lambda has been converted.
     */
    @stub
    def getFunctionalInterfaceMethodName(): String = ???

    /** Get the signature of the primary method for the functional
     *  interface to which this lambda has been converted.
     */
    @stub
    def getFunctionalInterfaceMethodSignature(): String = ???

    /** Get the name of the class containing the implementation
     *  method.
     */
    @stub
    def getImplClass(): String = ???

    /** Get the method handle kind (see MethodHandleInfo) of
     *  the implementation method.
     */
    @stub
    def getImplMethodKind(): Int = ???

    /** Get the name of the implementation method. */
    @stub
    def getImplMethodName(): String = ???

    /** Get the signature of the implementation method. */
    @stub
    def getImplMethodSignature(): String = ???

    /** Get the signature of the primary functional interface method
     *  after type variables are substituted with their instantiation
     *  from the capture site.
     */
    @stub
    def getInstantiatedMethodType(): String = ???

    /** Returns a string representation of the object. */
    @stub
    def toString(): String = ???
}
