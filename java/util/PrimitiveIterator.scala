package java.util

/** A base type for primitive specializations of Iterator.  Specialized
 *  subtypes are provided for int, long, and
 *  double values.
 * 
 *  The specialized subtype default implementations of Iterator.next()
 *  and Iterator.forEachRemaining(java.util.function.Consumer) box
 *  primitive values to instances of their corresponding wrapper class.  Such
 *  boxing may offset any advantages gained when using the primitive
 *  specializations.  To avoid boxing, the corresponding primitive-based methods
 *  should be used.  For example, PrimitiveIterator.OfInt.nextInt() and
 *  PrimitiveIterator.OfInt.forEachRemaining(java.util.function.IntConsumer)
 *  should be used in preference to PrimitiveIterator.OfInt.next() and
 *  PrimitiveIterator.OfInt.forEachRemaining(java.util.function.Consumer).
 * 
 *  Iteration of primitive values using boxing-based methods
 *  next() and
 *  forEachRemaining(),
 *  does not affect the order in which the values, transformed to boxed values,
 *  are encountered.
 */
trait PrimitiveIterator[T, T_CONS] extends Iterator[T] {
}

object PrimitiveIterator {
    /** An Iterator specialized for double values. */
    @stub
    val PrimitiveIterator.OfDouble: trait = ???

    /** An Iterator specialized for int values. */
    @stub
    val PrimitiveIterator.OfInt: trait = ???
}
