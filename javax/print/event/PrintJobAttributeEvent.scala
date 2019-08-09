package javax.print.event

import java.lang.Object
import java.util.EventObject
import javax.print.DocPrintJob
import javax.print.attribute.PrintJobAttributeSet
import scala.scalanative.annotation.stub

/** Class PrintJobAttributeEvent encapsulates an event a PrintService
 *  reports to let the client know that one or more printing attributes for a
 *  PrintJob have changed.
 */
class PrintJobAttributeEvent extends PrintEvent {

    /** Constructs a PrintJobAttributeEvent object. */
    @stub
    def this(source: DocPrintJob, attributes: PrintJobAttributeSet) = ???

    /** Determine the printing attributes that changed and their new values. */
    @stub
    def getAttributes(): PrintJobAttributeSet = ???

    /** Determine the Print Job to which this print job event pertains. */
    @stub
    def getPrintJob(): DocPrintJob = ???
}
