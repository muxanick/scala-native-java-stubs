package java.util.concurrent

import java.lang.{Enum, Object, String, Thread}
import scala.scalanative.annotation.stub

/** A TimeUnit represents time durations at a given unit of
 *  granularity and provides utility methods to convert across units,
 *  and to perform timing and delay operations in these units.  A
 *  TimeUnit does not maintain time information, but only
 *  helps organize and use time representations that may be maintained
 *  separately across various contexts.  A nanosecond is defined as one
 *  thousandth of a microsecond, a microsecond as one thousandth of a
 *  millisecond, a millisecond as one thousandth of a second, a minute
 *  as sixty seconds, an hour as sixty minutes, and a day as twenty four
 *  hours.
 * 
 *  A TimeUnit is mainly used to inform time-based methods
 *  how a given timing parameter should be interpreted. For example,
 *  the following code will timeout in 50 milliseconds if the lock is not available:
 * 
 *    
 *  Lock lock = ...;
 *  if (lock.tryLock(50L, TimeUnit.MILLISECONDS)) ...
 * 
 *  while this code will timeout in 50 seconds:
 *    
 *  Lock lock = ...;
 *  if (lock.tryLock(50L, TimeUnit.SECONDS)) ...
 * 
 *  Note however, that there is no guarantee that a particular timeout
 *  implementation will be able to notice the passage of time at the
 *  same granularity as the given TimeUnit.
 */
class TimeUnit private (name: String, ordinal: Int) extends Enum[TimeUnit](name, ordinal) {

    /** Converts the given time duration in the given unit to this unit. */
    @stub
    def convert(sourceDuration: Long, sourceUnit: TimeUnit): Long = ???

    /** Performs a Thread.sleep using
     *  this time unit.
     */
    @stub
    def sleep(timeout: Long): Unit = ???

    /** Performs a timed Thread.join
     *  using this time unit.
     */
    @stub
    def timedJoin(thread: Thread, timeout: Long): Unit = ???

    /** Performs a timed Object.wait
     *  using this time unit.
     */
    @stub
    def timedWait(obj: Any, timeout: Long): Unit = ???

    /** Equivalent to
     *  DAYS.convert(duration, this).
     */
    @stub
    def toDays(duration: Long): Long = ???

    /** Equivalent to
     *  HOURS.convert(duration, this).
     */
    @stub
    def toHours(duration: Long): Long = ???

    /** Equivalent to
     *  MICROSECONDS.convert(duration, this).
     */
    @stub
    def toMicros(duration: Long): Long = ???

    /** Equivalent to
     *  MILLISECONDS.convert(duration, this).
     */
    @stub
    def toMillis(duration: Long): Long = ???

    /** Equivalent to
     *  MINUTES.convert(duration, this).
     */
    @stub
    def toMinutes(duration: Long): Long = ???

    /** Equivalent to
     *  NANOSECONDS.convert(duration, this).
     */
    @stub
    def toNanos(duration: Long): Long = ???

    /** Equivalent to
     *  SECONDS.convert(duration, this).
     */
    @stub
    def toSeconds(duration: Long): Long = ???
}

object TimeUnit {
    /** Time unit representing twenty four hours */
    final val DAYS: TimeUnit = new TimeUnit("DAYS", 0)

    /** Time unit representing sixty minutes */
    final val HOURS: TimeUnit = new TimeUnit("HOURS", 1)

    /** Time unit representing one thousandth of a millisecond */
    final val MICROSECONDS: TimeUnit = new TimeUnit("MICROSECONDS", 2)

    /** Time unit representing one thousandth of a second */
    final val MILLISECONDS: TimeUnit = new TimeUnit("MILLISECONDS", 3)

    /** Time unit representing sixty seconds */
    final val MINUTES: TimeUnit = new TimeUnit("MINUTES", 4)

    /** Time unit representing one thousandth of a microsecond */
    final val NANOSECONDS: TimeUnit = new TimeUnit("NANOSECONDS", 5)

    /** Time unit representing one second */
    final val SECONDS: TimeUnit = new TimeUnit("SECONDS", 6)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): TimeUnit = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[TimeUnit] = ???
}
