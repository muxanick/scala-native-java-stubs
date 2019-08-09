package javax.sql.rowset.spi

import javax.sql.RowSetWriter

/** A specialized interface that facilitates an extension of the standard
 *  SyncProvider abstract class so that it has finer grained
 *  transaction control.
 *  
 *  If one or more disconnected RowSet objects are participating
 *  in a global transaction, they may wish to coordinate their synchronization
 *  commits to preserve data integrity and reduce the number of
 *  synchronization exceptions. If this is the case, an application should set
 *  the CachedRowSet constant COMMIT_ON_ACCEPT_CHANGES
 *  to false and use the commit and rollback
 *  methods defined in this interface to manage transaction boundaries.
 */
trait TransactionalWriter extends RowSetWriter {

    /** Makes permanent all changes that have been performed by the
     *  acceptChanges method since the last call to either the
     *  commit or rollback methods.
     */
    @stub
    def commit(): Unit = ???

    /** Undoes all changes made in the current transaction. */
    @stub
    def rollback(): Unit = ???
}
