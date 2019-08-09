package java.util.stream

import java.util.function.DoubleConsumer
import scala.scalanative.annotation.stub

/** A mutable builder for a DoubleStream.
 * 
 *  A stream builder has a lifecycle, which starts in a building
 *  phase, during which elements can be added, and then transitions to a built
 *  phase, after which elements may not be added.  The built phase
 *  begins when the build() method is called, which creates an
 *  ordered stream whose elements are the elements that were added to the
 *  stream builder, in the order they were added.
 */
object trait DoubleStream.Builder extends DoubleConsumer {

    /** Adds an element to the stream being built. */
    @stub
    def accept(t: Double): Unit = ???

    /** Adds an element to the stream being built. */
    @stub
    val this: default = ???

    /** Builds the stream, transitioning this builder to the built state. */
    @stub
    def build(): DoubleStream = ???
}
