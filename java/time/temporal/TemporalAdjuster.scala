package java.time.temporal

import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** Strategy for adjusting a temporal object.
 *  
 *  Adjusters are a key tool for modifying temporal objects.
 *  They exist to externalize the process of adjustment, permitting different
 *  approaches, as per the strategy design pattern.
 *  Examples might be an adjuster that sets the date avoiding weekends, or one that
 *  sets the date to the last day of the month.
 *  
 *  There are two equivalent ways of using a TemporalAdjuster.
 *  The first is to invoke the method on this interface directly.
 *  The second is to use Temporal.with(TemporalAdjuster):
 *  
 *    // these two lines are equivalent, but the second approach is recommended
 *    temporal = thisAdjuster.adjustInto(temporal);
 *    temporal = temporal.with(thisAdjuster);
 *  
 *  It is recommended to use the second approach, with(TemporalAdjuster),
 *  as it is a lot clearer to read in code.
 *  
 *  The TemporalAdjusters class contains a standard set of adjusters,
 *  available as static methods.
 *  These include:
 *  
 *  finding the first or last day of the month
 *  finding the first day of next month
 *  finding the first or last day of the year
 *  finding the first day of next year
 *  finding the first or last day-of-week within a month, such as "first Wednesday in June"
 *  finding the next or previous day-of-week, such as "next Thursday"
 *  
 */
@FunctionalInterface trait TemporalAdjuster {

    /** Adjusts the specified temporal object. */
    @stub
    def adjustInto(temporal: Temporal): Temporal = ???
}
