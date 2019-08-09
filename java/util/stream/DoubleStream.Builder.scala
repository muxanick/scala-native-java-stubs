package java.util.stream

import java.util.function.DoubleConsumer

// A mutable builder for a DoubleStream.
//
// A stream builder has a lifecycle, which starts in a building
// phase, during which elements can be added, and then transitions to a built
// phase, after which elements may not be added.  The built phase
// begins when the build() method is called, which creates an
// ordered stream whose elements are the elements that were added to the
// stream builder, in the order they were added.
object trait DoubleStream.Builder extends DoubleConsumer {

    @stub
    // Adds an element to the stream being built.
    def accept(t: double): Unit = ???

    @stub
    // Adds an element to the stream being built.
    def this: default = ???
}
