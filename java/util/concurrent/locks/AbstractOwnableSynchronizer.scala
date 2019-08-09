package java.util.concurrent.locks

import java.io.Serializable
import java.lang.{Object, Thread}
import scala.scalanative.annotation.stub

/** A synchronizer that may be exclusively owned by a thread.  This
 *  class provides a basis for creating locks and related synchronizers
 *  that may entail a notion of ownership.  The
 *  AbstractOwnableSynchronizer class itself does not manage or
 *  use this information. However, subclasses and tools may use
 *  appropriately maintained values to help control and monitor access
 *  and provide diagnostics.
 */
abstract class AbstractOwnableSynchronizer extends Object with Serializable {

    /** Empty constructor for use by subclasses. */
    @stub
    protected def this() = ???

    /** Returns the thread last set by setExclusiveOwnerThread,
     *  or null if never set.
     */
    protected def getExclusiveOwnerThread(): Thread

    /** Sets the thread that currently owns exclusive access. */
    protected def setExclusiveOwnerThread(thread: Thread): Unit
}
