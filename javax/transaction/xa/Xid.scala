package javax.transaction.xa

// The Xid interface is a Java mapping of the X/Open transaction identifier
// XID structure. This interface specifies three accessor methods to
// retrieve a global transaction format ID, global transaction ID,
// and branch qualifier. The Xid interface is used by the transaction
// manager and the resource managers. This interface is not visible to
// the application programs.
trait Xid {

    @stub
    // Obtain the transaction branch identifier part of XID as an array
    // of bytes.
    def getBranchQualifier(): Array[Byte] = ???

    @stub
    // Obtain the format identifier part of the XID.
    def getFormatId(): Int = ???
}

object Xid {
    @stub
    // Maximum number of bytes returned by getBqual.
    def MAXBQUALSIZE: Int = ???
}
