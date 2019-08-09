package javax.transaction.xa

import java.lang.{Exception, Object, Throwable}

// The XAException is thrown by the Resource Manager (RM) to inform the
// Transaction Manager of an error encountered by the involved transaction.
class XAException extends Exception {

    @stub
    // Create an XAException.
    def this() = ???

    @stub
    // Create an XAException with a given error code.
    def this(errcode: Int) = ???

    @stub
    // The error code with which to create the SystemException.
    def errorCode: Int = ???
}

object XAException {
    @stub
    // The transaction branch has been heuristically committed.
    def XA_HEURCOM: Int = ???

    @stub
    // The transaction branch may have been heuristically completed.
    def XA_HEURHAZ: Int = ???

    @stub
    // The transaction branch has been heuristically committed and
    // rolled back.
    def XA_HEURMIX: Int = ???

    @stub
    // The transaction branch has been heuristically rolled back.
    def XA_HEURRB: Int = ???

    @stub
    // Resumption must occur where the suspension occurred.
    def XA_NOMIGRATE: Int = ???

    @stub
    // The inclusive lower bound of the rollback codes.
    def XA_RBBASE: Int = ???

    @stub
    // Indicates that the rollback was caused by a communication failure.
    def XA_RBCOMMFAIL: Int = ???

    @stub
    // A deadlock was detected.
    def XA_RBDEADLOCK: Int = ???

    @stub
    // The inclusive upper bound of the rollback error code.
    def XA_RBEND: Int = ???

    @stub
    // A condition that violates the integrity of the resource was detected.
    def XA_RBINTEGRITY: Int = ???

    @stub
    // The resource manager rolled back the transaction branch for a reason
    // not on this list.
    def XA_RBOTHER: Int = ???

    @stub
    // A protocol error occurred in the resource manager.
    def XA_RBPROTO: Int = ???

    @stub
    // Indicates that the rollback was caused by an unspecified reason.
    def XA_RBROLLBACK: Int = ???

    @stub
    // A transaction branch took too long.
    def XA_RBTIMEOUT: Int = ???

    @stub
    // May retry the transaction branch.
    def XA_RBTRANSIENT: Int = ???

    @stub
    // The transaction branch was read-only and has been committed.
    def XA_RDONLY: Int = ???

    @stub
    // Routine returned with no effect and may be reissued.
    def XA_RETRY: Int = ???

    @stub
    // There is an asynchronous operation already outstanding.
    def XAER_ASYNC: Int = ???

    @stub
    // The XID already exists.
    def XAER_DUPID: Int = ???

    @stub
    // Invalid arguments were given.
    def XAER_INVAL: Int = ???

    @stub
    // The XID is not valid.
    def XAER_NOTA: Int = ???

    @stub
    // The resource manager is doing work outside a global transaction.
    def XAER_OUTSIDE: Int = ???

    @stub
    // Routine was invoked in an inproper context.
    def XAER_PROTO: Int = ???

    @stub
    // A resource manager error has occurred in the transaction branch.
    def XAER_RMERR: Int = ???
}
