package javax.print.event

import java.lang.Object
import java.util.EventObject

// Class PrintJobEvent encapsulates common events a print job
// reports to let a listener know of progress in the processing of the
// DocPrintJob.
class PrintJobEvent extends PrintEvent {

    @stub
    // Gets the reason for this event.
    def getPrintEventType(): Int = ???
}

object PrintJobEvent {
    @stub
    // The job is not necessarily printed yet, but the data has been transferred
    // successfully from the client to the print service.
    def DATA_TRANSFER_COMPLETE: Int = ???

    @stub
    // The job was canceled by the PrintService.
    def JOB_CANCELED: Int = ???

    @stub
    // The document cis completely printed.
    def JOB_COMPLETE: Int = ???

    @stub
    // The print service reports that the job cannot be completed.
    def JOB_FAILED: Int = ???

    @stub
    // Not all print services may be capable of delivering interesting
    // events, or even telling when a job is complete.
    def NO_MORE_EVENTS: Int = ???
}
