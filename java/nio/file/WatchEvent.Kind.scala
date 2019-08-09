package java.nio.file

import java.lang.String

// An event kind, for the purposes of identification.
object trait WatchEvent.Kind[T] {

    @stub
    // Returns the name of the event kind.
    def name(): String = ???
}
