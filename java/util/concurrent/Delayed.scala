package java.util.concurrent

import java.lang.Comparable
import scala.scalanative.annotation.stub

/** A mix-in style interface for marking objects that should be
 *  acted upon after a given delay.
 * 
 *  An implementation of this interface must define a
 *  compareTo method that provides an ordering consistent with
 *  its getDelay method.
 */
trait Delayed extends Comparable[Delayed] {

    /** Returns the remaining delay associated with this object, in the
     *  given time unit.
     */
    @stub
    def getDelay(unit: TimeUnit): Long = ???
}
