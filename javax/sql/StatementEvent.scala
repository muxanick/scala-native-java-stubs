package javax.sql

import java.lang.Object
import java.sql.{PreparedStatement, SQLException}
import java.util.EventObject

// A StatementEvent is sent to all StatementEventListeners which were
// registered with a PooledConnection. This occurs when the driver determines that a
// PreparedStatement that is associated with the PooledConnection has been closed or the driver determines
// is invalid.
// 
class StatementEvent extends EventObject {

    @stub
    // Constructs a StatementEvent with the specified PooledConnection and
    // PreparedStatement.
    def this(con: PooledConnection, statement: PreparedStatement) = ???

    @stub
    // Returns the SQLException the driver is about to throw
    def getSQLException(): SQLException = ???
}
