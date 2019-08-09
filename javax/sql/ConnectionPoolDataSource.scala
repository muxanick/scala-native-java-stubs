package javax.sql

// A factory for PooledConnection
// objects.  An object that implements this interface will typically be
// registered with a naming service that is based on the
// Java™ Naming and Directory Interface
// (JNDI).
trait ConnectionPoolDataSource extends CommonDataSource {

    @stub
    // Attempts to establish a physical database connection that can
    // be used as a pooled connection.
    def getPooledConnection(): PooledConnection = ???
}
