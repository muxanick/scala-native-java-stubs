package java.rmi

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** A StubNotFoundException is thrown if a valid stub class
 *  could not be found for a remote object when it is exported.
 *  A StubNotFoundException may also be
 *  thrown when an activatable object is registered via the
 *  java.rmi.activation.Activatable.register method.
 */
class StubNotFoundException extends RemoteException {

    /** Constructs a StubNotFoundException with the specified
     *  detail message.
     */
    @stub
    def this(s: String) = ???

    /** Constructs a StubNotFoundException with the specified
     *  detail message and nested exception.
     */
    @stub
    def this(s: String, ex: Exception) = ???
}
