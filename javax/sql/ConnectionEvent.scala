package javax.sql

import java.lang.Object
import java.sql.SQLException
import java.util.EventObject
import scala.scalanative.annotation.stub

/** An Event object that provides information about the
 *  source of a connection-related event.  ConnectionEvent
 *  objects are generated when an application closes a pooled connection
 *  and when an error occurs.  The ConnectionEvent object
 *  contains two kinds of information:
 *  
 *    The pooled connection closed by the application
 *    In the case of an error event, the SQLException
 *        about to be thrown to the application
 *  
 */
class ConnectionEvent extends EventObject {

    /** Constructs a ConnectionEvent object initialized with
     *  the given PooledConnection object.
     */
    @stub
    def this(con: PooledConnection) = ???

    /** Constructs a ConnectionEvent object initialized with
     *  the given PooledConnection object and
     *  SQLException object.
     */
    @stub
    def this(con: PooledConnection, ex: SQLException) = ???

    /** Retrieves the SQLException for this
     *  ConnectionEvent object.
     */
    @stub
    def getSQLException(): SQLException = ???
}
