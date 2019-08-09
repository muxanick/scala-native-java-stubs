package javax.print

import javax.print.attribute.{PrintJobAttributeSet, PrintRequestAttributeSet}
import javax.print.event.{PrintJobAttributeListener, PrintJobListener}

// This interface represents a print job that can print a specified
// document with a set of job attributes.  An object implementing
// this interface is obtained from a print service.
trait DocPrintJob {

    @stub
    // Registers a listener for changes in the specified attributes.
    def addPrintJobAttributeListener(listener: PrintJobAttributeListener, attributes: PrintJobAttributeSet): Unit = ???

    @stub
    // Registers a listener for event occurring during this print job.
    def addPrintJobListener(listener: PrintJobListener): Unit = ???

    @stub
    // Obtains this Print Job's set of printing attributes.
    def getAttributes(): PrintJobAttributeSet = ???

    @stub
    // Determines the PrintService object to which this print job
    // object is bound.
    def getPrintService(): PrintService = ???

    @stub
    // Prints a document with the specified job attributes.
    def print(doc: Doc, attributes: PrintRequestAttributeSet): Unit = ???

    @stub
    // Removes an attribute listener from this print job.
    def removePrintJobAttributeListener(listener: PrintJobAttributeListener): Unit = ???
}
