package java.nio.file

import java.lang.String
import scala.scalanative.annotation.stub

/** An event modifier that qualifies how a Watchable is registered
 *  with a WatchService.
 * 
 *   This release does not define any standard modifiers.
 */
trait WatchEvent_Modifier {

    /** Returns the name of the modifier. */
    @stub
    def name(): String = ???
}
