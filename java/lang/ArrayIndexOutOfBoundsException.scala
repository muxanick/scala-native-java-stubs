package java.lang

/** Thrown to indicate that an array has been accessed with an
 *  illegal index. The index is either negative or greater than or
 *  equal to the size of the array.
 */
class ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException {

    /** Constructs an ArrayIndexOutOfBoundsException with no
     *  detail message.
     */
    @stub
    def this() = ???

    /** Constructs a new ArrayIndexOutOfBoundsException
     *  class with an argument indicating the illegal index.
     */
    @stub
    def this(index: Int) = ???
}
