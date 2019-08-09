package javax.transaction.xa

/** The Xid interface is a Java mapping of the X/Open transaction identifier
 *  XID structure. This interface specifies three accessor methods to
 *  retrieve a global transaction format ID, global transaction ID,
 *  and branch qualifier. The Xid interface is used by the transaction
 *  manager and the resource managers. This interface is not visible to
 *  the application programs.
 */
trait Xid {

    /** Obtain the transaction branch identifier part of XID as an array
     *  of bytes.
     */
    @stub
    def getBranchQualifier(): Array[Byte] = ???

    /** Obtain the format identifier part of the XID. */
    @stub
    def getFormatId(): Int = ???
}

object Xid {
    /** Maximum number of bytes returned by getBqual. */
    @stub
    val MAXBQUALSIZE: Int = ???
}
