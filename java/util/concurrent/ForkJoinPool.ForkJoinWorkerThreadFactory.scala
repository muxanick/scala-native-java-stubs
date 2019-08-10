package java.util.concurrent

import scala.scalanative.annotation.stub

/** Factory for creating new ForkJoinWorkerThreads.
 *  A ForkJoinWorkerThreadFactory must be defined and used
 *  for ForkJoinWorkerThread subclasses that extend base
 *  functionality or initialize threads with different contexts.
 */
trait ForkJoinPool_ForkJoinWorkerThreadFactory {

    /** Returns a new worker thread operating in the given pool. */
    @stub
    def newThread(pool: ForkJoinPool): ForkJoinWorkerThread = ???
}
