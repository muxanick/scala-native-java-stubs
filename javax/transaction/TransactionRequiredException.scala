package javax.transaction

import java.io.IOException
import java.lang.{Exception, Object, Throwable}
import java.rmi.RemoteException

/** This exception indicates that a request carried a null transaction context,
 *  but the target object requires an activate transaction.
 */
class TransactionRequiredException extends RemoteException {

    /**  */
    @stub
    def this() = ???
}
