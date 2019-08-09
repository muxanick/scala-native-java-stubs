package javax.print

import scala.scalanative.annotation.stub

/** This interface is used by a printing application to cancel a
 *  print job.  This interface extends DocPrintJob.  A
 *  DocPrintJob implementation returned from a print
 *  service implements this interface if the print job can be
 *  cancelled.  Before trying to cancel
 *  a print job, the client needs to test if the
 *  DocPrintJob object returned from the print service
 *  actually implements this interface.  Clients should never assume
 *  that a DocPrintJob implements this interface.  A
 *  print service might support cancellation only for certain types
 *  of print data and representation class names.  This means that
 *  only some of the DocPrintJob objects returned from
 *  a service will implement this interface.
 *  
 *  Service implementors are encouraged to implement this optional interface
 *  and to deliver a javax.print.event.PrintJobEvent.JOB_CANCELLED event
 *  to any listeners if a job is successfully cancelled with an
 *  implementation of this interface. Services should also note that an
 *  implementation of this method may be made from a separate client thread
 *  than that which made the print request.  Thus the implementation of
 *  this interface must be made thread safe.
 */
trait CancelablePrintJob extends DocPrintJob {

    /** Stops further processing of a print job. */
    @stub
    def cancel(): Unit = ???
}
