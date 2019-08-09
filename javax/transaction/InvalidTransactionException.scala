package javax.transaction

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}
import java.rmi.RemoteException
import scala.scalanative.annotation.stub

/** This exception indicates that the request carried an invalid transaction
 *  context. For example, this exception could be raised if an error
 *  occured when trying to register a resource.
 */
class InvalidTransactionException extends RemoteException {

    /**  */
    @stub
    def this() = ???

    /**  */
    @stub
    def this(msg: String) = ???
}
