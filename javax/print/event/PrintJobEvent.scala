package javax.print.event

import java.lang.Object
import java.util.EventObject

/** Class PrintJobEvent encapsulates common events a print job
 *  reports to let a listener know of progress in the processing of the
 *  DocPrintJob.
 */
class PrintJobEvent extends PrintEvent {

    /** Gets the reason for this event. */
    @stub
    def getPrintEventType(): Int = ???
}

object PrintJobEvent {
    /** The job is not necessarily printed yet, but the data has been transferred
     *  successfully from the client to the print service.
     */
    @stub
    val DATA_TRANSFER_COMPLETE: Int = ???

    /** The job was canceled by the PrintService. */
    @stub
    val JOB_CANCELED: Int = ???

    /** The document cis completely printed. */
    @stub
    val JOB_COMPLETE: Int = ???

    /** The print service reports that the job cannot be completed. */
    @stub
    val JOB_FAILED: Int = ???

    /** Not all print services may be capable of delivering interesting
     *  events, or even telling when a job is complete.
     */
    @stub
    val NO_MORE_EVENTS: Int = ???
}
