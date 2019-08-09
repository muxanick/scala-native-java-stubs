package java.io

import java.lang.{Exception, Object, String, Throwable}

/** Signals that an I/O exception of some sort has occurred. This
 *  class is the general class of exceptions produced by failed or
 *  interrupted I/O operations.
 */
class IOException extends Exception {

    /** Constructs an IOException with null
     *  as its error detail message.
     */
    @stub
    def this() = ???

    /** Constructs an IOException with the specified detail message. */
    @stub
    def this(message: String) = ???

    /** Constructs an IOException with the specified detail message
     *  and cause.
     */
    @stub
    def this(message: String, cause: Throwable) = ???
}
