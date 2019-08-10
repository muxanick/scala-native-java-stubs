package java.util.stream

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** Characteristics indicating properties of a Collector, which can
 *  be used to optimize reduction implementations.
 */
class Collector_Characteristics private (name: String, ordinal: Int) extends Enum[Collector.Characteristics](name, ordinal) {
}

object Collector_Characteristics {
    /** Indicates that this collector is concurrent, meaning that
     *  the result container can support the accumulator function being
     *  called concurrently with the same result container from multiple
     *  threads.
     */
    final val CONCURRENT = new Collector.Characteristics(CONCURRENT, 0)

    /** Indicates that the finisher function is the identity function and
     *  can be elided.
     */
    final val IDENTITY_FINISH = new Collector.Characteristics(IDENTITY_FINISH, 1)

    /** Indicates that the collection operation does not commit to preserving
     *  the encounter order of input elements.
     */
    final val UNORDERED = new Collector.Characteristics(UNORDERED, 2)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): Collector.Characteristics = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[Collector.Characteristics] = ???
}
