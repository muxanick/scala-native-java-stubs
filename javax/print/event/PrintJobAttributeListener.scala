package javax.print.event

import scala.scalanative.annotation.stub

/** Implementations of this interface are attached to a
 *  DocPrintJob to monitor
 *  the status of attribute changes associated with the print job.
 */
trait PrintJobAttributeListener {

    /** Notifies the listener of a change in some print job attributes. */
    @stub
    def attributeUpdate(pjae: PrintJobAttributeEvent): Unit = ???
}
