package java.nio.file

import java.util.List

/** A token representing the registration of a watchable object
 *  with a WatchService.
 * 
 *   A watch key is created when a watchable object is registered with a watch
 *  service. The key remains valid until:
 *  
 *     It is cancelled, explicitly, by invoking its cancel
 *      method, or
 *     Cancelled implicitly, because the object is no longer accessible,
 *      or 
 *     By closing the watch service. 
 *  
 * 
 *   A watch key has a state. When initially created the key is said to be
 *  ready. When an event is detected then the key is signalled
 *  and queued so that it can be retrieved by invoking the watch service's poll or take methods. Once
 *  signalled, a key remains in this state until its reset method
 *  is invoked to return the key to the ready state. Events detected while the
 *  key is in the signalled state are queued but do not cause the key to be
 *  re-queued for retrieval from the watch service. Events are retrieved by
 *  invoking the key's pollEvents method. This method
 *  retrieves and removes all events accumulated for the object. When initially
 *  created, a watch key has no pending events. Typically events are retrieved
 *  when the key is in the signalled state leading to the following idiom:
 * 
 *  
 *      for (;;) {
 *          // retrieve key
 *          WatchKey key = watcher.take();
 * 
 *          // process events
 *          for (WatchEvent<?> event: key.pollEvents()) {
 *              :
 *          }
 * 
 *          // reset the key
 *          boolean valid = key.reset();
 *          if (!valid) {
 *              // object no longer registered
 *          }
 *      }
 *  
 * 
 *   Watch keys are safe for use by multiple concurrent threads. Where there
 *  are several threads retrieving signalled keys from a watch service then care
 *  should be taken to ensure that the reset method is only invoked after
 *  the events for the object have been processed. This ensures that one thread
 *  is processing the events for an object at any time.
 */
trait WatchKey {

    /** Cancels the registration with the watch service. */
    @stub
    def cancel(): Unit = ???

    /** Tells whether or not this watch key is valid. */
    @stub
    def isValid(): Boolean = ???

    /** Retrieves and removes all pending events for this watch key, returning
     *  a List of the events that were retrieved.
     */
    @stub
    def pollEvents(): List[WatchEvent[_]] = ???

    /** Resets this watch key. */
    @stub
    def reset(): Boolean = ???
}
