package javax.sql.rowset.spi

import java.lang.{Exception, Object, String, Throwable}
import java.sql.SQLException
import scala.scalanative.annotation.stub

/** Indicates an error with SyncFactory mechanism. A disconnected
 *  RowSet implementation cannot be used  without a SyncProvider
 *  being successfully instantiated
 */
class SyncFactoryException extends SQLException {

    /** Creates new SyncFactoryException without detail message. */
    @stub
    def this() = ???

    /** Constructs an SyncFactoryException with the specified
     *  detail message.
     */
    @stub
    def this(msg: String) = ???
}
