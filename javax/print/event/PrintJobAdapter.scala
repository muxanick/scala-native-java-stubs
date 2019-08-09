package javax.print.event

import java.lang.Object

/** An abstract adapter class for receiving print job events.
 *  The methods in this class are empty.
 *  This class exists as a convenience for creating listener objects.
 *  Extend this class to create a PrintJobEvent listener and override
 *  the methods for the events of interest.  Unlike the
 *  ComponentListener
 *  interface, this abstract interface provides null methods so that you
 *  only need to define the methods you need, rather than all of the methods.
 */
abstract class PrintJobAdapter extends Object with PrintJobListener {

    /** Called to notify the client that data has been successfully
     *  transferred to the print service, and the client may free
     *  local resources allocated for that data.
     */
    def printDataTransferCompleted(pje: PrintJobEvent): Unit

    /** Called to notify the client that the job was canceled
     *  by user or program.
     */
    def printJobCanceled(pje: PrintJobEvent): Unit

    /** Called to notify the client that the job completed successfully. */
    def printJobCompleted(pje: PrintJobEvent): Unit

    /** Called to notify the client that the job failed to complete
     *  successfully and will have to be resubmitted.
     */
    def printJobFailed(pje: PrintJobEvent): Unit

    /** Called to notify the client that no more events will be delivered. */
    def printJobNoMoreEvents(pje: PrintJobEvent): Unit
}
