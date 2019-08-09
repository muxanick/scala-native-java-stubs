package javax.management.openmbean

import java.lang.{Exception, IllegalArgumentException, Object, RuntimeException, Throwable}

/** This runtime exception is thrown to indicate that the open type of an open data value
 *  is not the one expected.
 */
class InvalidOpenTypeException extends IllegalArgumentException {

    /** An InvalidOpenTypeException with no detail message. */
    @stub
    def this() = ???
}
