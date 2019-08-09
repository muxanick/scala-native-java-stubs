package javax.xml.ws

import java.io.Serializable
import java.lang.Object
import scala.scalanative.annotation.stub

/** Holds a value of type T. */
final class Holder[T] extends Object with Serializable {

    /** Creates a new holder with a null value. */
    @stub
    def this() = ???

    /** Create a new holder with the specified value. */
    @stub
    def this(value: T) = ???

    /** The value contained in the holder. */
    @stub
    val value: T = ???
}
