package javax.print.event

// Implementations of this listener interface should be attached to a
// DocPrintJob to monitor the status of
// the printer job.
// These callback methods may be invoked on the thread processing the
// print job, or a service created notification thread. In either case
// the client should not perform lengthy processing in these callbacks.
trait PrintJobListener {

    @stub
    // Called to notify the client that data has been successfully
    // transferred to the print service, and the client may free
    // local resources allocated for that data.
    def printDataTransferCompleted(pje: PrintJobEvent): Unit = ???

    @stub
    // Called to notify the client that the job was canceled
    // by a user or a program.
    def printJobCanceled(pje: PrintJobEvent): Unit = ???

    @stub
    // Called to notify the client that the job completed successfully.
    def printJobCompleted(pje: PrintJobEvent): Unit = ???

    @stub
    // Called to notify the client that the job failed to complete
    // successfully and will have to be resubmitted.
    def printJobFailed(pje: PrintJobEvent): Unit = ???

    @stub
    // Called to notify the client that no more events will be delivered.
    def printJobNoMoreEvents(pje: PrintJobEvent): Unit = ???
}
