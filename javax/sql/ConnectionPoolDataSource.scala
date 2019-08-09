package javax.sql

import java.lang.String
import scala.scalanative.annotation.stub

/** A factory for PooledConnection
 *  objects.  An object that implements this interface will typically be
 *  registered with a naming service that is based on the
 *  Java™ Naming and Directory Interface
 *  (JNDI).
 */
trait ConnectionPoolDataSource extends CommonDataSource {

    /** Attempts to establish a physical database connection that can
     *  be used as a pooled connection.
     */
    @stub
    def getPooledConnection(): PooledConnection = ???

    /** Attempts to establish a physical database connection that can
     *  be used as a pooled connection.
     */
    @stub
    def getPooledConnection(user: String, password: String): PooledConnection = ???
}
