package java.nio.file

import java.lang.Object
import scala.scalanative.annotation.stub

/** Defines the standard event kinds. */
final class StandardWatchEventKinds extends Object {
}

object StandardWatchEventKinds {
    /** Directory entry created. */
    @stub
    val ENTRY_CREATE: WatchEvent.Kind[Path] = ???

    /** Directory entry deleted. */
    @stub
    val ENTRY_DELETE: WatchEvent.Kind[Path] = ???

    /** Directory entry modified. */
    @stub
    val ENTRY_MODIFY: WatchEvent.Kind[Path] = ???

    /** A special event to indicate that events may have been lost or
     *  discarded.
     */
    @stub
    val OVERFLOW: WatchEvent.Kind[Object] = ???
}
