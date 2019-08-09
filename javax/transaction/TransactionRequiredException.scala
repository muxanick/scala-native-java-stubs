package javax.transaction

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}
import java.rmi.RemoteException
import scala.scalanative.annotation.stub

/** This exception indicates that a request carried a null transaction context,
 *  but the target object requires an activate transaction.
 */
class TransactionRequiredException extends RemoteException {

    /**  */
    @stub
    def this() = ???

    /**  */
    @stub
    def this(msg: String) = ???
}
