package java.awt

import java.lang.{Object, Runnable}
import scala.scalanative.annotation.stub

/** EventQueue is a platform-independent class
 *  that queues events, both from the underlying peer classes
 *  and from trusted application classes.
 *  
 *  It encapsulates asynchronous event dispatch machinery which
 *  extracts events from the queue and dispatches them by calling
 *  dispatchEvent(AWTEvent) method
 *  on this EventQueue with the event to be dispatched
 *  as an argument.  The particular behavior of this machinery is
 *  implementation-dependent.  The only requirements are that events
 *  which were actually enqueued to this queue (note that events
 *  being posted to the EventQueue can be coalesced)
 *  are dispatched:
 *  
 *     Sequentially.
 *     That is, it is not permitted that several events from
 *         this queue are dispatched simultaneously.
 *     In the same order as they are enqueued.
 *     That is, if AWTEvent A is enqueued
 *         to the EventQueue before
 *         AWTEvent B then event B will not be
 *         dispatched before event A.
 *  
 *  
 *  Some browsers partition applets in different code bases into
 *  separate contexts, and establish walls between these contexts.
 *  In such a scenario, there will be one EventQueue
 *  per context. Other browsers place all applets into the same
 *  context, implying that there will be only a single, global
 *  EventQueue for all applets. This behavior is
 *  implementation-dependent.  Consult your browser's documentation
 *  for more information.
 *  
 *  For information on the threading issues of the event dispatch
 *  machinery, see AWT Threading Issues.
 */
class EventQueue extends Object {

    /**  */
    @stub
    def this() = ???

    /** Creates a new secondary loop associated with this
     *  event queue.
     */
    @stub
    def createSecondaryLoop(): SecondaryLoop = ???

    /** Dispatches an event. */
    @stub
    protected def dispatchEvent(event: AWTEvent): Unit = ???

    /** Removes an event from the EventQueue and
     *  returns it.
     */
    @stub
    def getNextEvent(): AWTEvent = ???

    /** Returns the first event on the EventQueue
     *  without removing it.
     */
    @stub
    def peekEvent(): AWTEvent = ???

    /** Returns the first event with the specified id, if any. */
    @stub
    def peekEvent(id: Int): AWTEvent = ???

    /** Stops dispatching events using this EventQueue. */
    @stub
    protected def pop(): Unit = ???

    /** Posts a 1.1-style event to the EventQueue. */
    @stub
    def postEvent(theEvent: AWTEvent): Unit = ???

    /** Replaces the existing EventQueue with the specified one. */
    @stub
    def push(newEventQueue: EventQueue): Unit = ???
}

object EventQueue {
    /** Returns the the event currently being dispatched by the
     *  EventQueue associated with the calling thread.
     */
    @stub
    def getCurrentEvent(): AWTEvent = ???

    /** Returns the timestamp of the most recent event that had a timestamp, and
     *  that was dispatched from the EventQueue associated with the
     *  calling thread.
     */
    @stub
    def getMostRecentEventTime(): Long = ???

    /** Causes runnable to have its run
     *  method called in the dispatch thread of
     *  the system EventQueue.
     */
    @stub
    def invokeAndWait(runnable: Runnable): Unit = ???

    /** Causes runnable to have its run
     *  method called in the dispatch thread of
     *  the system EventQueue.
     */
    @stub
    def invokeLater(runnable: Runnable): Unit = ???

    /** Returns true if the calling thread is
     *  the current AWT EventQueue's
     *  dispatch thread.
     */
    @stub
    def isDispatchThread(): Boolean = ???
}
