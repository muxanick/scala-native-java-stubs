package java.util.concurrent.locks

import java.io.Serializable
import java.lang.{Object, Thread}

/** A synchronizer that may be exclusively owned by a thread.  This
 *  class provides a basis for creating locks and related synchronizers
 *  that may entail a notion of ownership.  The
 *  AbstractOwnableSynchronizer class itself does not manage or
 *  use this information. However, subclasses and tools may use
 *  appropriately maintained values to help control and monitor access
 *  and provide diagnostics.
 */
abstract class AbstractOwnableSynchronizer extends Object with Serializable {

    /** Returns the thread last set by setExclusiveOwnerThread,
     *  or null if never set.
     */
    protected def getExclusiveOwnerThread(): Thread
}
