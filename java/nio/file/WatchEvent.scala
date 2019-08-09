package java.nio.file

/** An event or a repeated event for an object that is registered with a WatchService.
 * 
 *   An event is classified by its kind and has a count to indicate the number of times that the event has been
 *  observed. This allows for efficient representation of repeated events. The
 *  context method returns any context associated with
 *  the event. In the case of a repeated event then the context is the same for
 *  all events.
 * 
 *   Watch events are immutable and safe for use by multiple concurrent
 *  threads.
 */
trait WatchEvent[T] {

    /** Returns the context for the event. */
    @stub
    def context(): T = ???

    /** Returns the event count. */
    @stub
    def count(): Int = ???
}

object WatchEvent {
    /** An event kind, for the purposes of identification. */
    @stub
    val WatchEvent.Kind[T]: trait = ???
}
