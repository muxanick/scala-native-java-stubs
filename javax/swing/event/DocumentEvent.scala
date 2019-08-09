package javax.swing.event

import javax.swing.text.{Document, Element}

// Interface for document change notifications.  This provides
// detailed information to Document observers about how the
// Document changed.  It provides high level information such
// as type of change and where it occurred, as well as the more
// detailed structural changes (What Elements were inserted and
// removed).
trait DocumentEvent {

    @stub
    // Gets the change information for the given element.
    def getChange(elem: Element): DocumentEvent.ElementChange = ???

    @stub
    // Gets the document that sourced the change event.
    def getDocument(): Document = ???

    @stub
    // Returns the length of the change.
    def getLength(): Int = ???

    @stub
    // Returns the offset within the document of the start
    // of the change.
    def getOffset(): Int = ???
}

object DocumentEvent {
    @stub
    // Describes changes made to a specific element.
    def DocumentEvent.ElementChange: trait = ???
}
