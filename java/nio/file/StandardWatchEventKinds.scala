package java.nio.file

import java.lang.Object

// Defines the standard event kinds.
final class StandardWatchEventKinds extends Object {
}

object StandardWatchEventKinds {
    @stub
    // Directory entry created.
    def ENTRY_CREATE: WatchEvent.Kind[Path] = ???

    @stub
    // Directory entry deleted.
    def ENTRY_DELETE: WatchEvent.Kind[Path] = ???

    @stub
    // Directory entry modified.
    def ENTRY_MODIFY: WatchEvent.Kind[Path] = ???
}
