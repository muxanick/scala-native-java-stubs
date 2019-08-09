package java.util.concurrent.atomic

import java.io.Serializable
import java.lang.{Object, String}

// A boolean value that may be updated atomically. See the
// java.util.concurrent.atomic package specification for
// description of the properties of atomic variables. An
// AtomicBoolean is used in applications such as atomically
// updated flags, and cannot be used as a replacement for a
// Boolean.
class AtomicBoolean extends Object with Serializable {

    @stub
    // Creates a new AtomicBoolean with initial value false.
    def this() = ???

    @stub
    // Atomically sets the value to the given updated value
    // if the current value == the expected value.
    def compareAndSet(expect: Boolean, update: Boolean): Boolean = ???

    @stub
    // Returns the current value.
    def get(): Boolean = ???

    @stub
    // Atomically sets to the given value and returns the previous value.
    def getAndSet(newValue: Boolean): Boolean = ???

    @stub
    // Eventually sets to the given value.
    def lazySet(newValue: Boolean): Unit = ???

    @stub
    // Unconditionally sets to the given value.
    def set(newValue: Boolean): Unit = ???

    @stub
    // Returns the String representation of the current value.
    def toString(): String = ???
}
