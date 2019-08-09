package javax.naming

import java.lang.{Exception, Object, Throwable}

// This exception is thrown when the naming operation
// being invoked has been interrupted. For example, an application
// might interrupt a thread that is performing a search. If the
// search supports being interrupted, it will throw
// InterruptedNamingException. Whether an operation is interruptible
// and when depends on its implementation (as provided by the
// service providers). Different implementations have different ways
// of protecting their resources and objects from being damaged
// due to unexpected interrupts.
// 
// Synchronization and serialization issues that apply to NamingException
// apply directly here.
class InterruptedNamingException extends NamingException {

    @stub
    // Constructs an instance of InterruptedNamingException with
    // all name resolution fields and explanation initialized to null.
    def this() = ???
}
