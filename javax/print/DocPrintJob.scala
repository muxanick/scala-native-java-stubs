package javax.print

import javax.print.attribute.{PrintJobAttributeSet, PrintRequestAttributeSet}
import javax.print.event.{PrintJobAttributeListener, PrintJobListener}
import scala.scalanative.annotation.stub

/** This interface represents a print job that can print a specified
 *  document with a set of job attributes.  An object implementing
 *  this interface is obtained from a print service.
 */
trait DocPrintJob {

    /** Registers a listener for changes in the specified attributes. */
    @stub
    def addPrintJobAttributeListener(listener: PrintJobAttributeListener, attributes: PrintJobAttributeSet): Unit = ???

    /** Registers a listener for event occurring during this print job. */
    @stub
    def addPrintJobListener(listener: PrintJobListener): Unit = ???

    /** Obtains this Print Job's set of printing attributes. */
    @stub
    def getAttributes(): PrintJobAttributeSet = ???

    /** Determines the PrintService object to which this print job
     *  object is bound.
     */
    @stub
    def getPrintService(): PrintService = ???

    /** Prints a document with the specified job attributes. */
    @stub
    def print(doc: Doc, attributes: PrintRequestAttributeSet): Unit = ???

    /** Removes an attribute listener from this print job. */
    @stub
    def removePrintJobAttributeListener(listener: PrintJobAttributeListener): Unit = ???

    /** Removes a listener from this print job. */
    @stub
    def removePrintJobListener(listener: PrintJobListener): Unit = ???
}
