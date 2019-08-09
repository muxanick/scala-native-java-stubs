package javax.transaction.xa

// The XAResource interface is a Java mapping of the industry standard
// XA interface based on the X/Open CAE Specification (Distributed
// Transaction Processing: The XA Specification).
//
// The XA interface defines the contract between a Resource Manager
// and a Transaction Manager in a distributed transaction processing
// (DTP) environment. A JDBC driver or a JMS provider implements
// this interface to support the association between a global transaction
// and a database or message service connection.
//
// The XAResource interface can be supported by any transactional
// resource that is intended to be used by application programs in an
// environment where transactions are controlled by an external
// transaction manager. An example of such a resource is a database
// management system. An application may access data through multiple
// database connections. Each database connection is enlisted with
// the transaction manager as a transactional resource. The transaction
// manager obtains an XAResource for each connection participating
// in a global transaction. The transaction manager uses the
// start method
// to associate the global transaction with the resource, and it uses the
// end method to disassociate the transaction from
// the resource. The resource
// manager is responsible for associating the global transaction to all
// work performed on its data between the start and end method invocations.
//
// At transaction commit time, the resource managers are informed by
// the transaction manager to prepare, commit, or rollback a transaction
// according to the two-phase commit protocol.
trait XAResource {

    @stub
    // Commits the global transaction specified by xid.
    def commit(xid: Xid, onePhase: Boolean): Unit = ???

    @stub
    // Ends the work performed on behalf of a transaction branch.
    def end(xid: Xid, flags: Int): Unit = ???

    @stub
    // Tells the resource manager to forget about a heuristically
    // completed transaction branch.
    def forget(xid: Xid): Unit = ???

    @stub
    // Obtains the current transaction timeout value set for this
    // XAResource instance.
    def getTransactionTimeout(): Int = ???

    @stub
    // This method is called to determine if the resource manager
    // instance represented by the target object is the same as the
    // resouce manager instance represented by the parameter xares.
    def isSameRM(xares: XAResource): Boolean = ???

    @stub
    // Ask the resource manager to prepare for a transaction commit
    // of the transaction specified in xid.
    def prepare(xid: Xid): Int = ???

    @stub
    // Obtains a list of prepared transaction branches from a resource
    // manager.
    def recover(flag: Int): Array[Xid] = ???

    @stub
    // Informs the resource manager to roll back work done on behalf
    // of a transaction branch.
    def rollback(xid: Xid): Unit = ???

    @stub
    // Sets the current transaction timeout value for this XAResource
    // instance.
    def setTransactionTimeout(seconds: Int): Boolean = ???
}

object XAResource {
    @stub
    // Ends a recovery scan.
    def TMENDRSCAN: Int = ???

    @stub
    // Disassociates the caller and marks the transaction branch
    // rollback-only.
    def TMFAIL: Int = ???

    @stub
    // Caller is joining existing transaction branch.
    def TMJOIN: Int = ???

    @stub
    // Use TMNOFLAGS to indicate no flags value is selected.
    def TMNOFLAGS: Int = ???

    @stub
    // Caller is using one-phase optimization.
    def TMONEPHASE: Int = ???

    @stub
    // Caller is resuming association with a suspended
    // transaction branch.
    def TMRESUME: Int = ???

    @stub
    // Starts a recovery scan.
    def TMSTARTRSCAN: Int = ???

    @stub
    // Disassociates caller from a transaction branch.
    def TMSUCCESS: Int = ???

    @stub
    // Caller is suspending (not ending) its association with
    // a transaction branch.
    def TMSUSPEND: Int = ???

    @stub
    // The transaction work has been prepared normally.
    def XA_OK: Int = ???
}
