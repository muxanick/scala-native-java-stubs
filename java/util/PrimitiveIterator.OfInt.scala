package java.util

import java.lang.Integer
import java.util.function.{Consumer, IntConsumer}

// An Iterator specialized for int values.
object trait PrimitiveIterator.OfInt extends PrimitiveIterator[Integer, IntConsumer] {

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
    def Integer: default = ???
}
