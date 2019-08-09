package javax.print.event

import java.lang.Object
import java.util.EventObject
import javax.print.DocPrintJob
import scala.scalanative.annotation.stub

/** Class PrintJobEvent encapsulates common events a print job
 *  reports to let a listener know of progress in the processing of the
 *  DocPrintJob.
 */
class PrintJobEvent extends PrintEvent {

    /** Constructs a PrintJobEvent object. */
    @stub
    def this(source: DocPrintJob, reason: Int) = ???

    /** Gets the reason for this event. */
    @stub
    def getPrintEventType(): Int = ???

    /** Determines the DocPrintJob to which this print job
     *  event pertains.
     */
    @stub
    def getPrintJob(): DocPrintJob = ???
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

    /** The print service indicates that a - possibly transient - problem
     *  may require external intervention before the print service can
     *  continue.
     */
    @stub
    val REQUIRES_ATTENTION: Int = ???
}
