package javax.transaction.xa

/** The XAResource interface is a Java mapping of the industry standard
 *  XA interface based on the X/Open CAE Specification (Distributed
 *  Transaction Processing: The XA Specification).
 * 
 *  The XA interface defines the contract between a Resource Manager
 *  and a Transaction Manager in a distributed transaction processing
 *  (DTP) environment. A JDBC driver or a JMS provider implements
 *  this interface to support the association between a global transaction
 *  and a database or message service connection.
 * 
 *  The XAResource interface can be supported by any transactional
 *  resource that is intended to be used by application programs in an
 *  environment where transactions are controlled by an external
 *  transaction manager. An example of such a resource is a database
 *  management system. An application may access data through multiple
 *  database connections. Each database connection is enlisted with
 *  the transaction manager as a transactional resource. The transaction
 *  manager obtains an XAResource for each connection participating
 *  in a global transaction. The transaction manager uses the
 *  start method
 *  to associate the global transaction with the resource, and it uses the
 *  end method to disassociate the transaction from
 *  the resource. The resource
 *  manager is responsible for associating the global transaction to all
 *  work performed on its data between the start and end method invocations.
 * 
 *  At transaction commit time, the resource managers are informed by
 *  the transaction manager to prepare, commit, or rollback a transaction
 *  according to the two-phase commit protocol.
 */
trait XAResource {

    /** Commits the global transaction specified by xid. */
    @stub
    def commit(xid: Xid, onePhase: Boolean): Unit = ???

    /** Ends the work performed on behalf of a transaction branch. */
    @stub
    def end(xid: Xid, flags: Int): Unit = ???

    /** Tells the resource manager to forget about a heuristically
     *  completed transaction branch.
     */
    @stub
    def forget(xid: Xid): Unit = ???

    /** Obtains the current transaction timeout value set for this
     *  XAResource instance.
     */
    @stub
    def getTransactionTimeout(): Int = ???

    /** This method is called to determine if the resource manager
     *  instance represented by the target object is the same as the
     *  resouce manager instance represented by the parameter xares.
     */
    @stub
    def isSameRM(xares: XAResource): Boolean = ???

    /** Ask the resource manager to prepare for a transaction commit
     *  of the transaction specified in xid.
     */
    @stub
    def prepare(xid: Xid): Int = ???

    /** Obtains a list of prepared transaction branches from a resource
     *  manager.
     */
    @stub
    def recover(flag: Int): Array[Xid] = ???

    /** Informs the resource manager to roll back work done on behalf
     *  of a transaction branch.
     */
    @stub
    def rollback(xid: Xid): Unit = ???

    /** Sets the current transaction timeout value for this XAResource
     *  instance.
     */
    @stub
    def setTransactionTimeout(seconds: Int): Boolean = ???
}

object XAResource {
    /** Ends a recovery scan. */
    @stub
    val TMENDRSCAN: Int = ???

    /** Disassociates the caller and marks the transaction branch
     *  rollback-only.
     */
    @stub
    val TMFAIL: Int = ???

    /** Caller is joining existing transaction branch. */
    @stub
    val TMJOIN: Int = ???

    /** Use TMNOFLAGS to indicate no flags value is selected. */
    @stub
    val TMNOFLAGS: Int = ???

    /** Caller is using one-phase optimization. */
    @stub
    val TMONEPHASE: Int = ???

    /** Caller is resuming association with a suspended
     *  transaction branch.
     */
    @stub
    val TMRESUME: Int = ???

    /** Starts a recovery scan. */
    @stub
    val TMSTARTRSCAN: Int = ???

    /** Disassociates caller from a transaction branch. */
    @stub
    val TMSUCCESS: Int = ???

    /** Caller is suspending (not ending) its association with
     *  a transaction branch.
     */
    @stub
    val TMSUSPEND: Int = ???

    /** The transaction work has been prepared normally. */
    @stub
    val XA_OK: Int = ???
}
