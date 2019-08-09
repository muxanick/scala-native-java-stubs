package java.lang

import scala.scalanative.annotation.stub

/** Thrown to indicate that an attempt has been made to store the
 *  wrong type of object into an array of objects. For example, the
 *  following code generates an ArrayStoreException:
 *  
 *      Object x[] = new String[3];
 *      x[0] = new Integer(0);
 *  
 */
class ArrayStoreException extends RuntimeException {

    /** Constructs an ArrayStoreException with no detail message. */
    @stub
    def this() = ???

    /** Constructs an ArrayStoreException with the specified
     *  detail message.
     */
    @stub
    def this(s: String) = ???
}
