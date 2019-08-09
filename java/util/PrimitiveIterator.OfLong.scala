package java.util

import java.lang.Long
import java.util.function.{Consumer, LongConsumer}

// An Iterator specialized for long values.
object trait PrimitiveIterator.OfLong extends PrimitiveIterator[Long, LongConsumer] {

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
    def Long: default = ???
}
