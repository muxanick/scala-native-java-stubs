package java.util.stream

import java.lang.{Enum, Object, String}

// Characteristics indicating properties of a Collector, which can
// be used to optimize reduction implementations.
class Collector.Characteristics private (name: String, ordinal: Int) extends Enum[Collector.Characteristics](name, ordinal) {
}

object Collector.Characteristics {
    // Indicates that this collector is concurrent, meaning that
    // the result container can support the accumulator function being
    // called concurrently with the same result container from multiple
    // threads.
    final val CONCURRENT = new Collector.Characteristics(CONCURRENT, 0)

    // Indicates that the finisher function is the identity function and
    // can be elided.
    final val IDENTITY_FINISH = new Collector.Characteristics(IDENTITY_FINISH, 1)

    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): Collector.Characteristics = ???
}
