package javax.sql.rowset.spi

import java.lang.{Exception, Object, Throwable}
import java.sql.SQLException

/** Indicates an error with SyncFactory mechanism. A disconnected
 *  RowSet implementation cannot be used  without a SyncProvider
 *  being successfully instantiated
 */
class SyncFactoryException extends SQLException {

    /** Creates new SyncFactoryException without detail message. */
    @stub
    def this() = ???
}
