package java.util.concurrent

import java.lang.Runnable
import scala.scalanative.annotation.stub

/** An ExecutorService that can schedule commands to run after a given
 *  delay, or to execute periodically.
 * 
 *  The schedule methods create tasks with various delays
 *  and return a task object that can be used to cancel or check
 *  execution. The scheduleAtFixedRate and
 *  scheduleWithFixedDelay methods create and execute tasks
 *  that run periodically until cancelled.
 * 
 *  Commands submitted using the Executor.execute(Runnable)
 *  and ExecutorService submit methods are scheduled
 *  with a requested delay of zero. Zero and negative delays (but not
 *  periods) are also allowed in schedule methods, and are
 *  treated as requests for immediate execution.
 * 
 *  All schedule methods accept relative delays and
 *  periods as arguments, not absolute times or dates. It is a simple
 *  matter to transform an absolute time represented as a Date to the required form. For example, to schedule at
 *  a certain future date, you can use: schedule(task,
 *  date.getTime() - System.currentTimeMillis(),
 *  TimeUnit.MILLISECONDS). Beware however that expiration of a
 *  relative delay need not coincide with the current Date at
 *  which the task is enabled due to network time synchronization
 *  protocols, clock drift, or other factors.
 * 
 *  The Executors class provides convenient factory methods for
 *  the ScheduledExecutorService implementations provided in this package.
 * 
 *  Usage Example
 * 
 *  Here is a class with a method that sets up a ScheduledExecutorService
 *  to beep every ten seconds for an hour:
 * 
 *    
 *  import static java.util.concurrent.TimeUnit.*;
 *  class BeeperControl {
 *    private final ScheduledExecutorService scheduler =
 *      Executors.newScheduledThreadPool(1);
 * 
 *    public void beepForAnHour() {
 *      final Runnable beeper = new Runnable() {
 *        public void run() { System.out.println("beep"); }
 *      };
 *      final ScheduledFuture<?> beeperHandle =
 *        scheduler.scheduleAtFixedRate(beeper, 10, 10, SECONDS);
 *      scheduler.schedule(new Runnable() {
 *        public void run() { beeperHandle.cancel(true); }
 *      }, 60 * 60, SECONDS);
 *    }
 *  }
 */
trait ScheduledExecutorService extends ExecutorService {

    /** Creates and executes a ScheduledFuture that becomes enabled after the
     *  given delay.
     */
    @stub
    def schedule[V](callable: Callable[V], delay: Long, unit: TimeUnit): ScheduledFuture[V] = ???

    /** Creates and executes a one-shot action that becomes enabled
     *  after the given delay.
     */
    @stub
    def schedule(command: Runnable, delay: Long, unit: TimeUnit): ScheduledFuture[_] = ???

    /** Creates and executes a periodic action that becomes enabled first
     *  after the given initial delay, and subsequently with the given
     *  period; that is executions will commence after
     *  initialDelay then initialDelay+period, then
     *  initialDelay + 2 * period, and so on.
     */
    @stub
    def scheduleAtFixedRate(command: Runnable, initialDelay: Long, period: Long, unit: TimeUnit): ScheduledFuture[_] = ???

    /** Creates and executes a periodic action that becomes enabled first
     *  after the given initial delay, and subsequently with the
     *  given delay between the termination of one execution and the
     *  commencement of the next.
     */
    @stub
    def scheduleWithFixedDelay(command: Runnable, initialDelay: Long, delay: Long, unit: TimeUnit): ScheduledFuture[_] = ???
}
