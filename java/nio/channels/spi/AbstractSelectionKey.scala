package java.nio.channels.spi

import java.lang.Object
import java.nio.channels.SelectionKey

/** Base implementation class for selection keys.
 * 
 *   This class tracks the validity of the key and implements cancellation.
 */
abstract class AbstractSelectionKey extends SelectionKey {

    /** Cancels this key. */
    def cancel(): Unit
}
