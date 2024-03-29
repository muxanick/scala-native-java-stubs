package java.time

import java.lang.Object
import scala.scalanative.annotation.stub

/** A clock providing access to the current instant, date and time using a time-zone.
 *  
 *  Instances of this class are used to find the current instant, which can be
 *  interpreted using the stored time-zone to find the current date and time.
 *  As such, a clock can be used instead of System.currentTimeMillis()
 *  and TimeZone.getDefault().
 *  
 *  Use of a Clock is optional. All key date-time classes also have a
 *  now() factory method that uses the system clock in the default time zone.
 *  The primary purpose of this abstraction is to allow alternate clocks to be
 *  plugged in as and when required. Applications use an object to obtain the
 *  current time rather than a static method. This can simplify testing.
 *  
 *  Best practice for applications is to pass a Clock into any method
 *  that requires the current instant. A dependency injection framework is one
 *  way to achieve this:
 *  
 *   public class MyBean {
 *     private Clock clock;  // dependency inject
 *     ...
 *     public void process(LocalDate eventDate) {
 *       if (eventDate.isBefore(LocalDate.now(clock)) {
 *         ...
 *       }
 *     }
 *   }
 *  
 *  This approach allows an alternate clock, such as fixed
 *  or offset to be used during testing.
 *  
 *  The system factory methods provide clocks based on the best available
 *  system clock This may use System.currentTimeMillis(), or a higher
 *  resolution clock if one is available.
 */
abstract class Clock extends Object {

    /** Constructor accessible by subclasses. */
    @stub
    protected def this() = ???

    /** Checks if this clock is equal to another clock. */
    def equals(obj: Any): Boolean

    /** Gets the time-zone being used to create dates and times. */
    def getZone(): ZoneId

    /** A hash code for this clock. */
    def hashCode(): Int

    /** Gets the current instant of the clock. */
    def instant(): Instant

    /** Gets the current millisecond instant of the clock. */
    def millis(): Long

    /** Returns a copy of this clock with a different time-zone. */
    def withZone(zone: ZoneId): Clock
}

object Clock {
    /** Obtains a clock that always returns the same instant. */
    @stub
    def fixed(fixedInstant: Instant, zone: ZoneId): Clock = ???

    /** Obtains a clock that returns instants from the specified clock with the
     *  specified duration added
     */
    @stub
    def offset(baseClock: Clock, offsetDuration: Duration): Clock = ???

    /** Obtains a clock that returns the current instant using best available
     *  system clock.
     */
    @stub
    def system(zone: ZoneId): Clock = ???

    /** Obtains a clock that returns the current instant using the best available
     *  system clock, converting to date and time using the default time-zone.
     */
    @stub
    def systemDefaultZone(): Clock = ???

    /** Obtains a clock that returns the current instant using the best available
     *  system clock, converting to date and time using the UTC time-zone.
     */
    @stub
    def systemUTC(): Clock = ???

    /** Obtains a clock that returns instants from the specified clock truncated
     *  to the nearest occurrence of the specified duration.
     */
    @stub
    def tick(baseClock: Clock, tickDuration: Duration): Clock = ???

    /** Obtains a clock that returns the current instant ticking in whole minutes
     *  using best available system clock.
     */
    @stub
    def tickMinutes(zone: ZoneId): Clock = ???

    /** Obtains a clock that returns the current instant ticking in whole seconds
     *  using best available system clock.
     */
    @stub
    def tickSeconds(zone: ZoneId): Clock = ???
}
