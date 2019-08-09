package javax.swing.event

import javax.swing.text.{Document, Element}

/** Interface for document change notifications.  This provides
 *  detailed information to Document observers about how the
 *  Document changed.  It provides high level information such
 *  as type of change and where it occurred, as well as the more
 *  detailed structural changes (What Elements were inserted and
 *  removed).
 */
trait DocumentEvent {

    /** Gets the change information for the given element. */
    @stub
    def getChange(elem: Element): DocumentEvent.ElementChange = ???

    /** Gets the document that sourced the change event. */
    @stub
    def getDocument(): Document = ???

    /** Returns the length of the change. */
    @stub
    def getLength(): Int = ???

    /** Returns the offset within the document of the start
     *  of the change.
     */
    @stub
    def getOffset(): Int = ???
}

object DocumentEvent {
    /** Describes changes made to a specific element. */
    @stub
    val DocumentEvent.ElementChange: trait = ???
}
