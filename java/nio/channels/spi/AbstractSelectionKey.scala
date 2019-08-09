package java.nio.channels.spi

import java.lang.Object
import java.nio.channels.SelectionKey
import scala.scalanative.annotation.stub

/** Base implementation class for selection keys.
 * 
 *   This class tracks the validity of the key and implements cancellation.
 */
abstract class AbstractSelectionKey extends SelectionKey {

    /** Initializes a new instance of this class. */
    @stub
    protected def this() = ???

    /** Cancels this key. */
    def cancel(): Unit

    /** Tells whether or not this key is valid. */
    def isValid(): Boolean
}
