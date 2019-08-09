package java.util

import java.lang.Double
import java.util.function.{Consumer, DoubleConsumer}

// An Iterator specialized for double values.
object trait PrimitiveIterator.OfDouble extends PrimitiveIterator[Double, DoubleConsumer] {

    @stub
    // Performs the given action for each remaining element until all elements
    // have been processed or the action throws an exception.
    def Unit: default = ???

    @stub
    // Performs the given action for each remaining element until all elements
    // have been processed or the action throws an exception.
    def Unit: default = ???

    @stub
    // Returns the next element in the iteration.
    def Double: default = ???
}
