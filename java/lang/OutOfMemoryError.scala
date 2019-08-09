package java.lang

// Thrown when the Java Virtual Machine cannot allocate an object
// because it is out of memory, and no more memory could be made
// available by the garbage collector.
//
// OutOfMemoryError objects may be constructed by the virtual
// machine as if suppression were disabled and/or the stack trace was not
// writable.
class OutOfMemoryError extends VirtualMachineError {

    @stub
    // Constructs an OutOfMemoryError with no detail message.
    def this() = ???
}
