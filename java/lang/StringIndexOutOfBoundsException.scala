package java.lang

/** Thrown by String methods to indicate that an index
 *  is either negative or greater than the size of the string.  For
 *  some methods such as the charAt method, this exception also is
 *  thrown when the index is equal to the size of the string.
 */
class StringIndexOutOfBoundsException extends IndexOutOfBoundsException {

    /** Constructs a StringIndexOutOfBoundsException with no
     *  detail message.
     */
    @stub
    def this() = ???

    /** Constructs a new StringIndexOutOfBoundsException
     *  class with an argument indicating the illegal index.
     */
    @stub
    def this(index: Int) = ???
}
