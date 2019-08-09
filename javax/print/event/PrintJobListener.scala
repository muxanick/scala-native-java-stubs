package javax.print.event

import scala.scalanative.annotation.stub

/** Implementations of this listener interface should be attached to a
 *  DocPrintJob to monitor the status of
 *  the printer job.
 *  These callback methods may be invoked on the thread processing the
 *  print job, or a service created notification thread. In either case
 *  the client should not perform lengthy processing in these callbacks.
 */
trait PrintJobListener {

    /** Called to notify the client that data has been successfully
     *  transferred to the print service, and the client may free
     *  local resources allocated for that data.
     */
    @stub
    def printDataTransferCompleted(pje: PrintJobEvent): Unit = ???

    /** Called to notify the client that the job was canceled
     *  by a user or a program.
     */
    @stub
    def printJobCanceled(pje: PrintJobEvent): Unit = ???

    /** Called to notify the client that the job completed successfully. */
    @stub
    def printJobCompleted(pje: PrintJobEvent): Unit = ???

    /** Called to notify the client that the job failed to complete
     *  successfully and will have to be resubmitted.
     */
    @stub
    def printJobFailed(pje: PrintJobEvent): Unit = ???

    /** Called to notify the client that no more events will be delivered. */
    @stub
    def printJobNoMoreEvents(pje: PrintJobEvent): Unit = ???

    /** Called to notify the client that an error has occurred that the
     *  user might be able to fix.
     */
    @stub
    def printJobRequiresAttention(pje: PrintJobEvent): Unit = ???
}
