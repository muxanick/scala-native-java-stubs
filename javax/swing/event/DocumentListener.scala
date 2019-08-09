package javax.swing.event

import java.util.EventListener

/** Interface for an observer to register to receive notifications
 *  of changes to a text document.
 *  
 *  The default implementation of
 *  the Document interface (AbstractDocument) supports asynchronous
 *  mutations.  If this feature is used (i.e. mutations are made
 *  from a thread other than the Swing event thread), the listeners
 *  will be notified via the mutating thread.  This means that
 *  if asynchronous updates are made, the implementation of this
 *  interface must be threadsafe!
 *  
 *  The DocumentEvent notification is based upon the JavaBeans
 *  event model.  There is no guarantee about the order of delivery
 *  to listeners, and all listeners must be notified prior to making
 *  further mutations to the Document.  This means implementations
 *  of the DocumentListener may not mutate the source of the event
 *  (i.e. the associated Document).
 */
trait DocumentListener extends EventListener {

    /** Gives notification that an attribute or set of attributes changed. */
    @stub
    def changedUpdate(e: DocumentEvent): Unit = ???

    /** Gives notification that there was an insert into the document. */
    @stub
    def insertUpdate(e: DocumentEvent): Unit = ???
}
