package java.awt.print

import java.lang.{Object, String}
import javax.print.{PrintService, StreamPrintServiceFactory}
import javax.print.attribute.PrintRequestAttributeSet

// The PrinterJob class is the principal class that controls
// printing. An application calls methods in this class to set up a job,
// optionally to invoke a print dialog with the user, and then to print
// the pages of the job.
abstract class PrinterJob extends Object {

    // Cancels a print job that is in progress.
    def cancel(): Unit

    // Creates a new PageFormat instance and
    // sets it to a default size and orientation.
    def defaultPage(): PageFormat

    // Clones the PageFormat argument and alters the
    // clone to describe a default page size and orientation.
    def defaultPage(page: PageFormat): PageFormat

    // Gets the number of copies to be printed.
    def getCopies(): Int

    // Gets the name of the document to be printed.
    def getJobName(): String

    // Calculates a PageFormat with values consistent with those
    // supported by the current PrintService for this job
    // (ie the value returned by getPrintService()) and media,
    // printable area and orientation contained in attributes.
    def getPageFormat(attributes: PrintRequestAttributeSet): PageFormat

    // Returns the service (printer) for this printer job.
    def getPrintService(): PrintService

    // Gets the name of the printing user.
    def getUserName(): String

    // Returns true if a print job is
    // in progress, but is going to be cancelled
    // at the next opportunity; otherwise returns
    // false.
    def isCancelled(): Boolean

    // Displays a dialog that allows modification of a
    // PageFormat instance.
    def pageDialog(page: PageFormat): PageFormat

    // A convenience method which displays a cross-platform page setup dialog.
    def pageDialog(attributes: PrintRequestAttributeSet): PageFormat

    // Prints a set of pages.
    def print(): Unit

    // Prints a set of pages using the settings in the attribute
    // set.
    def print(attributes: PrintRequestAttributeSet): Unit

    // Presents a dialog to the user for changing the properties of
    // the print job.
    def printDialog(): Boolean

    // A convenience method which displays a cross-platform print dialog
    // for all services which are capable of printing 2D graphics using the
    // Pageable interface.
    def printDialog(attributes: PrintRequestAttributeSet): Boolean

    // Sets the number of copies to be printed.
    def setCopies(copies: Int): Unit

    // Sets the name of the document to be printed.
    def setJobName(jobName: String): Unit

    // Queries document for the number of pages and
    // the PageFormat and Printable for each
    // page held in the Pageable instance,
    // document.
    def setPageable(document: Pageable): Unit

    // Calls painter to render the pages.
    def setPrintable(painter: Printable): Unit

    // Calls painter to render the pages in the specified
    // format.
    def setPrintable(painter: Printable, format: PageFormat): Unit

    // Associate this PrinterJob with a new PrintService.
    def setPrintService(service: PrintService): Unit
}

object PrinterJob {
    @stub
    // Creates and returns a PrinterJob which is initially
    // associated with the default printer.
    def getPrinterJob(): PrinterJob = ???

    @stub
    // A convenience method which looks up 2D print services.
    def lookupPrintServices(): Array[PrintService] = ???

    @stub
    // A convenience method which locates factories for stream print
    // services which can image 2D graphics.
    def lookupStreamPrintServices(mimeType: String): Array[StreamPrintServiceFactory] = ???
}
