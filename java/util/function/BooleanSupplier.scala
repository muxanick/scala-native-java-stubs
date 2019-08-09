package java.util.function

import java.lang.FunctionalInterface

/** Represents a supplier of boolean-valued results.  This is the
 *  boolean-producing primitive specialization of Supplier.
 * 
 *  There is no requirement that a new or distinct result be returned each
 *  time the supplier is invoked.
 * 
 *  This is a functional interface
 *  whose functional method is getAsBoolean().
 */
@FunctionalInterface trait BooleanSupplier {
}
