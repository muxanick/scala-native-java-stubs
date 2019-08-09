package javax.tools

import java.lang.String

// Interface for locations of file objects.  Used by file managers
// to determine where to place or search for file objects.
object trait JavaFileManager.Location {

    @stub
    // Gets the name of this location.
    def getName(): String = ???
}
