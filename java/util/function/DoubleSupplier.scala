package java.util.function

import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** Represents a supplier of double-valued results.  This is the
 *  double-producing primitive specialization of Supplier.
 * 
 *  There is no requirement that a distinct result be returned each
 *  time the supplier is invoked.
 * 
 *  This is a functional interface
 *  whose functional method is getAsDouble().
 */
@FunctionalInterface
trait DoubleSupplier {

    /** Gets a result. */
    @stub
    def getAsDouble(): Double = ???
}
