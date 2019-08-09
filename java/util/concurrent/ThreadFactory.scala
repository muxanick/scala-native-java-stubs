package java.util.concurrent

/** An object that creates new threads on demand.  Using thread factories
 *  removes hardwiring of calls to new Thread,
 *  enabling applications to use special thread subclasses, priorities, etc.
 * 
 *  
 *  The simplest implementation of this interface is just:
 *    
 *  class SimpleThreadFactory implements ThreadFactory {
 *    public Thread newThread(Runnable r) {
 *      return new Thread(r);
 *    }
 *  }
 * 
 *  The Executors.defaultThreadFactory() method provides a more
 *  useful simple implementation, that sets the created thread context
 *  to known values before returning it.
 */
trait ThreadFactory {
}
