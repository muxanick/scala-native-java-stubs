package javax.naming.event

/** Specifies the methods that a listener interested in namespace changes
 *  must implement.
 *  Specifically, the listener is interested in NamingEvents
 *  with event types of OBJECT_ADDED, OBJECT_RENAMED, or
 *  OBJECT_REMOVED.
 * 
 *  Such a listener must:
 * 
 * Implement this interface and its methods.
 * Implement NamingListener.namingExceptionThrown() so that
 *  it will be notified of exceptions thrown while attempting to
 *  collect information about the events.
 * Register with the source using the source's addNamingListener()
 *     method.
 * 
 *  A listener that wants to be notified of OBJECT_CHANGED event types
 *  should also implement the ObjectChangeListener
 *  interface.
 */
trait NamespaceChangeListener extends NamingListener {

    /** Called when an object has been added. */
    @stub
    def objectAdded(evt: NamingEvent): Unit = ???

    /** Called when an object has been removed. */
    @stub
    def objectRemoved(evt: NamingEvent): Unit = ???
}
