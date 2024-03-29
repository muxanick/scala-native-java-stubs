package java.lang

import scala.scalanative.annotation.stub

/** An IllegalAccessException is thrown when an application tries
 *  to reflectively create an instance (other than an array),
 *  set or get a field, or invoke a method, but the currently
 *  executing method does not have access to the definition of
 *  the specified class, field, method or constructor.
 */
class IllegalAccessException extends ReflectiveOperationException {

    /** Constructs an IllegalAccessException without a
     *  detail message.
     */
    @stub
    def this() = ???

    /** Constructs an IllegalAccessException with a detail message. */
    @stub
    def this(s: String) = ???
}
