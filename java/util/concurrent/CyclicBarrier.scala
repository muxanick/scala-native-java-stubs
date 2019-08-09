package java.util.concurrent

import java.lang.Object

// A synchronization aid that allows a set of threads to all wait for
// each other to reach a common barrier point.  CyclicBarriers are
// useful in programs involving a fixed sized party of threads that
// must occasionally wait for each other. The barrier is called
// cyclic because it can be re-used after the waiting threads
// are released.
//
// A CyclicBarrier supports an optional Runnable command
// that is run once per barrier point, after the last thread in the party
// arrives, but before any threads are released.
// This barrier action is useful
// for updating shared-state before any of the parties continue.
//
// Sample usage: Here is an example of using a barrier in a
// parallel decomposition design:
//
//   
// class Solver {
//   final int N;
//   final float[][] data;
//   final CyclicBarrier barrier;
//
//   class Worker implements Runnable {
//     int myRow;
//     Worker(int row) { myRow = row; }
//     public void run() {
//       while (!done()) {
//         processRow(myRow);
//
//         try {
//           barrier.await();
//         } catch (InterruptedException ex) {
//           return;
//         } catch (BrokenBarrierException ex) {
//           return;
//         }
//       }
//     }
//   }
//
//   public Solver(float[][] matrix) {
//     data = matrix;
//     N = matrix.length;
//     Runnable barrierAction =
//       new Runnable() { public void run() { mergeRows(...); }};
//     barrier = new CyclicBarrier(N, barrierAction);
//
//     List<Thread> threads = new ArrayList<Thread>(N);
//     for (int i = 0; i < N; i++) {
//       Thread thread = new Thread(new Worker(i));
//       threads.add(thread);
//       thread.start();
//     }
//
//     // wait until done
//     for (Thread thread : threads)
//       thread.join();
//   }
// }
//
// Here, each worker thread processes a row of the matrix then waits at the
// barrier until all rows have been processed. When all rows are processed
// the supplied Runnable barrier action is executed and merges the
// rows. If the merger
// determines that a solution has been found then done() will return
// true and each worker will terminate.
//
// If the barrier action does not rely on the parties being suspended when
// it is executed, then any of the threads in the party could execute that
// action when it is released. To facilitate this, each invocation of
// await() returns the arrival index of that thread at the barrier.
// You can then choose which thread should execute the barrier action, for
// example:
//   
// if (barrier.await() == 0) {
//   // log the completion of this iteration
// }
//
// The CyclicBarrier uses an all-or-none breakage model
// for failed synchronization attempts: If a thread leaves a barrier
// point prematurely because of interruption, failure, or timeout, all
// other threads waiting at that barrier point will also leave
// abnormally via BrokenBarrierException (or
// InterruptedException if they too were interrupted at about
// the same time).
//
// Memory consistency effects: Actions in a thread prior to calling
// await()
// happen-before
// actions that are part of the barrier action, which in turn
// happen-before actions following a successful return from the
// corresponding await() in other threads.
class CyclicBarrier extends Object {

    @stub
    // Creates a new CyclicBarrier that will trip when the
    // given number of parties (threads) are waiting upon it, and
    // does not perform a predefined action when the barrier is tripped.
    def this(parties: Int) = ???

    @stub
    // Waits until all parties have invoked
    // await on this barrier.
    def await(): Int = ???

    @stub
    // Waits until all parties have invoked
    // await on this barrier, or the specified waiting time elapses.
    def await(timeout: Long, unit: TimeUnit): Int = ???

    @stub
    // Returns the number of parties currently waiting at the barrier.
    def getNumberWaiting(): Int = ???

    @stub
    // Returns the number of parties required to trip this barrier.
    def getParties(): Int = ???

    @stub
    // Queries if this barrier is in a broken state.
    def isBroken(): Boolean = ???
}
