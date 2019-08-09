package java.util.function

import java.lang.FunctionalInterface

// Represents a supplier of int-valued results.  This is the
// int-producing primitive specialization of Supplier.
//
// There is no requirement that a distinct result be returned each
// time the supplier is invoked.
//
// This is a functional interface
// whose functional method is getAsInt().
@FunctionalInterface trait IntSupplier {
}
