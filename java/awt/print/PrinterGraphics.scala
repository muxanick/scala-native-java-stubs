package java.awt.print

import scala.scalanative.annotation.stub

/** The PrinterGraphics interface is implemented by
 *  Graphics objects that are passed to
 *  Printable objects to render a page. It allows an
 *  application to find the PrinterJob object that is
 *  controlling the printing.
 */
trait PrinterGraphics {

    /** Returns the PrinterJob that is controlling the
     *  current rendering request.
     */
    @stub
    def getPrinterJob(): PrinterJob = ???
}
