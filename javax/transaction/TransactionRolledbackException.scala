package javax.transaction

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}
import java.rmi.RemoteException
import scala.scalanative.annotation.stub

/** This exception indicates that the transaction associated with processing
 *  of the request has been rolled back, or marked to roll back. Thus the
 *  requested operation either could not be performed or was not performed
 *  because further computation on behalf of the transaction would be
 *  fruitless
 */
class TransactionRolledbackException extends RemoteException {

    /**  */
    @stub
    def this() = ???

    /**  */
    @stub
    def this(msg: String) = ???
}
