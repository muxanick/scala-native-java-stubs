package javax.transaction.xa

import java.lang.{Exception, Object, Throwable}

/** The XAException is thrown by the Resource Manager (RM) to inform the
 *  Transaction Manager of an error encountered by the involved transaction.
 */
class XAException extends Exception {

    /** Create an XAException. */
    @stub
    def this() = ???

    /** Create an XAException with a given error code. */
    @stub
    def this(errcode: Int) = ???

    /** The error code with which to create the SystemException. */
    @stub
    val errorCode: Int = ???
}

object XAException {
    /** The transaction branch has been heuristically committed. */
    @stub
    val XA_HEURCOM: Int = ???

    /** The transaction branch may have been heuristically completed. */
    @stub
    val XA_HEURHAZ: Int = ???

    /** The transaction branch has been heuristically committed and
     *  rolled back.
     */
    @stub
    val XA_HEURMIX: Int = ???

    /** The transaction branch has been heuristically rolled back. */
    @stub
    val XA_HEURRB: Int = ???

    /** Resumption must occur where the suspension occurred. */
    @stub
    val XA_NOMIGRATE: Int = ???

    /** The inclusive lower bound of the rollback codes. */
    @stub
    val XA_RBBASE: Int = ???

    /** Indicates that the rollback was caused by a communication failure. */
    @stub
    val XA_RBCOMMFAIL: Int = ???

    /** A deadlock was detected. */
    @stub
    val XA_RBDEADLOCK: Int = ???

    /** The inclusive upper bound of the rollback error code. */
    @stub
    val XA_RBEND: Int = ???

    /** A condition that violates the integrity of the resource was detected. */
    @stub
    val XA_RBINTEGRITY: Int = ???

    /** The resource manager rolled back the transaction branch for a reason
     *  not on this list.
     */
    @stub
    val XA_RBOTHER: Int = ???

    /** A protocol error occurred in the resource manager. */
    @stub
    val XA_RBPROTO: Int = ???

    /** Indicates that the rollback was caused by an unspecified reason. */
    @stub
    val XA_RBROLLBACK: Int = ???

    /** A transaction branch took too long. */
    @stub
    val XA_RBTIMEOUT: Int = ???

    /** May retry the transaction branch. */
    @stub
    val XA_RBTRANSIENT: Int = ???

    /** The transaction branch was read-only and has been committed. */
    @stub
    val XA_RDONLY: Int = ???

    /** Routine returned with no effect and may be reissued. */
    @stub
    val XA_RETRY: Int = ???

    /** There is an asynchronous operation already outstanding. */
    @stub
    val XAER_ASYNC: Int = ???

    /** The XID already exists. */
    @stub
    val XAER_DUPID: Int = ???

    /** Invalid arguments were given. */
    @stub
    val XAER_INVAL: Int = ???

    /** The XID is not valid. */
    @stub
    val XAER_NOTA: Int = ???

    /** The resource manager is doing work outside a global transaction. */
    @stub
    val XAER_OUTSIDE: Int = ???

    /** Routine was invoked in an inproper context. */
    @stub
    val XAER_PROTO: Int = ???

    /** A resource manager error has occurred in the transaction branch. */
    @stub
    val XAER_RMERR: Int = ???
}
