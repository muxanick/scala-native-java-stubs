package javax.print.event

import scala.scalanative.annotation.stub

/** Implementations of this listener interface are attached to a
 *  PrintService to monitor
 *  the status of the print service.
 *  
 *  To monitor a particular job see PrintJobListener and
 *  PrintJobAttributeListener.
 */
trait PrintServiceAttributeListener {

    /** Called to notify a listener of an event in the print service. */
    @stub
    def attributeUpdate(psae: PrintServiceAttributeEvent): Unit = ???
}
