package javax.print.event

import java.lang.Object
import java.util.EventObject
import javax.print.attribute.PrintServiceAttributeSet

/** Class PrintServiceAttributeEvent encapsulates an event a
 *  Print Service instance reports to let the client know of
 *  changes in the print service state.
 */
class PrintServiceAttributeEvent extends PrintEvent {

    /** Determine the printing service attributes that changed and their new
     *  values.
     */
    @stub
    def getAttributes(): PrintServiceAttributeSet = ???
}
