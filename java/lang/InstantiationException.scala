package java.lang

import scala.scalanative.annotation.stub

/** Thrown when an application tries to create an instance of a class
 *  using the newInstance method in class
 *  Class, but the specified class object cannot be
 *  instantiated.  The instantiation can fail for a variety of
 *  reasons including but not limited to:
 * 
 *  
 *   the class object represents an abstract class, an interface,
 *       an array class, a primitive type, or void
 *   the class has no nullary constructor
 * 
 */
class InstantiationException extends ReflectiveOperationException {

    /** Constructs an InstantiationException with no detail message. */
    @stub
    def this() = ???

    /** Constructs an InstantiationException with the
     *  specified detail message.
     */
    @stub
    def this(s: String) = ???
}
