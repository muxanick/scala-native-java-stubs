package java.nio.file

// An event or a repeated event for an object that is registered with a WatchService.
//
//  An event is classified by its kind and has a count to indicate the number of times that the event has been
// observed. This allows for efficient representation of repeated events. The
// context method returns any context associated with
// the event. In the case of a repeated event then the context is the same for
// all events.
//
//  Watch events are immutable and safe for use by multiple concurrent
// threads.
trait WatchEvent[T] {

    @stub
    // Returns the context for the event.
    def context(): T = ???

    @stub
    // Returns the event count.
    def count(): Int = ???
}

object WatchEvent {
    @stub
    // An event kind, for the purposes of identification.
    def WatchEvent.Kind[T]: trait = ???
}
