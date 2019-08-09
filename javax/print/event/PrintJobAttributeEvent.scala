package javax.print.event

import java.lang.Object
import java.util.EventObject
import javax.print.attribute.PrintJobAttributeSet

// Class PrintJobAttributeEvent encapsulates an event a PrintService
// reports to let the client know that one or more printing attributes for a
// PrintJob have changed.
class PrintJobAttributeEvent extends PrintEvent {

    @stub
    // Determine the printing attributes that changed and their new values.
    def getAttributes(): PrintJobAttributeSet = ???
}
