package java.util.concurrent

/** Factory for creating new ForkJoinWorkerThreads.
 *  A ForkJoinWorkerThreadFactory must be defined and used
 *  for ForkJoinWorkerThread subclasses that extend base
 *  functionality or initialize threads with different contexts.
 */
object trait ForkJoinPool.ForkJoinWorkerThreadFactory {
