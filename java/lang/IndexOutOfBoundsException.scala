package java.lang

import scala.scalanative.annotation.stub

/** Thrown to indicate that an index of some sort (such as to an array, to a
 *  string, or to a vector) is out of range.
 *  
 *  Applications can subclass this class to indicate similar exceptions.
 */
class IndexOutOfBoundsException extends RuntimeException {

    /** Constructs an IndexOutOfBoundsException with no
     *  detail message.
     */
    @stub
    def this() = ???

    /** Constructs an IndexOutOfBoundsException with the
     *  specified detail message.
     */
    @stub
    def this(s: String) = ???
}
