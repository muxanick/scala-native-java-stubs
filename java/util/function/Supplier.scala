package java.util.function

import java.lang.FunctionalInterface

// Represents a supplier of results.
//
// There is no requirement that a new or distinct result be returned each
// time the supplier is invoked.
//
// This is a functional interface
// whose functional method is get().
@FunctionalInterface trait Supplier[T] {
}
