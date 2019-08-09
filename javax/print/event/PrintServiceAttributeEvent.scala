package javax.print.event

import java.lang.Object
import java.util.EventObject
import javax.print.PrintService
import javax.print.attribute.PrintServiceAttributeSet
import scala.scalanative.annotation.stub

/** Class PrintServiceAttributeEvent encapsulates an event a
 *  Print Service instance reports to let the client know of
 *  changes in the print service state.
 */
class PrintServiceAttributeEvent extends PrintEvent {

    /** Constructs a PrintServiceAttributeEvent object. */
    @stub
    def this(source: PrintService, attributes: PrintServiceAttributeSet) = ???

    /** Determine the printing service attributes that changed and their new
     *  values.
     */
    @stub
    def getAttributes(): PrintServiceAttributeSet = ???

    /** Returns the print service. */
    @stub
    def getPrintService(): PrintService = ???
}
