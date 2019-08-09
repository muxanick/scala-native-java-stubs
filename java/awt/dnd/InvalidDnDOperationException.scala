package java.awt.dnd

import java.lang.{Exception, IllegalStateException, Object, RuntimeException, Throwable}

// This exception is thrown by various methods in the java.awt.dnd package.
// It is usually thrown to indicate that the target in question is unable
// to undertake the requested operation that the present time, since the
// underlying DnD system is not in the appropriate state.
class InvalidDnDOperationException extends IllegalStateException {

    @stub
    // Create a default Exception
    def this() = ???
}
