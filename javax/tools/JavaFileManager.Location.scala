package javax.tools

import java.lang.String
import scala.scalanative.annotation.stub

/** Interface for locations of file objects.  Used by file managers
 *  to determine where to place or search for file objects.
 */
trait JavaFileManager_Location {

    /** Gets the name of this location. */
    @stub
    def getName(): String = ???

    /** Determines if this is an output location. */
    @stub
    def isOutputLocation(): Boolean = ???
}
