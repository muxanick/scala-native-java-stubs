package java.nio.channels.spi

import java.lang.Object
import java.nio.channels.{SelectionKey, Selector}
import java.util.Set

/** Base implementation class for selectors.
 * 
 *   This class encapsulates the low-level machinery required to implement
 *  the interruption of selection operations.  A concrete selector class must
 *  invoke the begin and end methods before and
 *  after, respectively, invoking an I/O operation that might block
 *  indefinitely.  In order to ensure that the end method is always
 *  invoked, these methods should be used within a
 *  try ... finally block:
 * 
 *  
 *  try {
 *      begin();
 *      // Perform blocking I/O operation here
 *      ...
 *  } finally {
 *      end();
 *  }
 * 
 *   This class also defines methods for maintaining a selector's
 *  cancelled-key set and for removing a key from its channel's key set, and
 *  declares the abstract register method that is invoked by a
 *  selectable channel's register
 *  method in order to perform the actual work of registering a channel.  
 */
abstract class AbstractSelector extends Selector {

    /** Marks the beginning of an I/O operation that might block indefinitely. */
    protected def begin(): Unit

    /** Retrieves this selector's cancelled-key set. */
    protected def cancelledKeys(): Set[SelectionKey]

    /** Closes this selector. */
    def close(): Unit

    /** Removes the given key from its channel's key set. */
    protected def deregister(key: AbstractSelectionKey): Unit

    /** Marks the end of an I/O operation that might block indefinitely. */
    protected def end(): Unit

    /** Closes this selector. */
    protected def implCloseSelector(): Unit

    /** Tells whether or not this selector is open. */
    def isOpen(): Boolean

    /** Returns the provider that created this channel. */
    def provider(): SelectorProvider
}
