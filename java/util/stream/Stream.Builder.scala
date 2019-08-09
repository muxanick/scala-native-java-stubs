package java.util.stream

import java.util.function.Consumer

// A mutable builder for a Stream.  This allows the creation of a
// Stream by generating elements individually and adding them to the
// Builder (without the copying overhead that comes from using
// an ArrayList as a temporary buffer.)
//
// A stream builder has a lifecycle, which starts in a building
// phase, during which elements can be added, and then transitions to a built
// phase, after which elements may not be added.  The built phase begins
// when the build() method is called, which creates an ordered
// Stream whose elements are the elements that were added to the stream
// builder, in the order they were added.
object trait Stream.Builder[T] extends Consumer[T] {

    @stub
    // Adds an element to the stream being built.
    def accept(t: T): Unit = ???

    @stub
    // Adds an element to the stream being built.
    def Stream.Builder[T]: default = ???
}
