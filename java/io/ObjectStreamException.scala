package java.io

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Superclass of all exceptions specific to Object Stream classes. */
abstract class ObjectStreamException extends IOException {

    /** Create an ObjectStreamException. */
    @stub
    protected def this() = ???

    /** Create an ObjectStreamException with the specified argument. */
    @stub
    protected def this(classname: String) = ???
}
