package java.io

import java.lang.{Exception, Object, Throwable}

// Superclass of all exceptions specific to Object Stream classes.
abstract class ObjectStreamException extends IOException {

    @stub
    // Create an ObjectStreamException.
    protected def this() = ???
}
