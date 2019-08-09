package java.awt

import java.lang.{Object, Runnable}

// EventQueue is a platform-independent class
// that queues events, both from the underlying peer classes
// and from trusted application classes.
// 
// It encapsulates asynchronous event dispatch machinery which
// extracts events from the queue and dispatches them by calling
// dispatchEvent(AWTEvent) method
// on this EventQueue with the event to be dispatched
// as an argument.  The particular behavior of this machinery is
// implementation-dependent.  The only requirements are that events
// which were actually enqueued to this queue (note that events
// being posted to the EventQueue can be coalesced)
// are dispatched:
// 
//    Sequentially.
//    That is, it is not permitted that several events from
//        this queue are dispatched simultaneously.
//    In the same order as they are enqueued.
//    That is, if AWTEvent A is enqueued
//        to the EventQueue before
//        AWTEvent B then event B will not be
//        dispatched before event A.
// 
// 
// Some browsers partition applets in different code bases into
// separate contexts, and establish walls between these contexts.
// In such a scenario, there will be one EventQueue
// per context. Other browsers place all applets into the same
// context, implying that there will be only a single, global
// EventQueue for all applets. This behavior is
// implementation-dependent.  Consult your browser's documentation
// for more information.
// 
// For information on the threading issues of the event dispatch
// machinery, see AWT Threading Issues.
class EventQueue extends Object {

    @stub
    // Creates a new secondary loop associated with this
    // event queue.
    def createSecondaryLoop(): SecondaryLoop = ???

    @stub
    // Dispatches an event.
    protected def dispatchEvent(event: AWTEvent): Unit = ???

    @stub
    // Removes an event from the EventQueue and
    // returns it.
    def getNextEvent(): AWTEvent = ???

    @stub
    // Returns the first event on the EventQueue
    // without removing it.
    def peekEvent(): AWTEvent = ???

    @stub
    // Returns the first event with the specified id, if any.
    def peekEvent(id: Int): AWTEvent = ???

    @stub
    // Stops dispatching events using this EventQueue.
    protected def pop(): Unit = ???

    @stub
    // Posts a 1.1-style event to the EventQueue.
    def postEvent(theEvent: AWTEvent): Unit = ???
}

object EventQueue {
    @stub
    // Returns the the event currently being dispatched by the
    // EventQueue associated with the calling thread.
    def getCurrentEvent(): AWTEvent = ???

    @stub
    // Returns the timestamp of the most recent event that had a timestamp, and
    // that was dispatched from the EventQueue associated with the
    // calling thread.
    def getMostRecentEventTime(): Long = ???

    @stub
    // Causes runnable to have its run
    // method called in the dispatch thread of
    // the system EventQueue.
    def invokeAndWait(runnable: Runnable): Unit = ???

    @stub
    // Causes runnable to have its run
    // method called in the dispatch thread of
    // the system EventQueue.
    def invokeLater(runnable: Runnable): Unit = ???

    @stub
    // Returns true if the calling thread is
    // the current AWT EventQueue's
    // dispatch thread.
    def isDispatchThread(): Boolean = ???
}
