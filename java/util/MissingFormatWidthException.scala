package java.util

import java.lang.{Exception, IllegalArgumentException, Object, RuntimeException, String, Throwable}

/** Unchecked exception thrown when the format width is required.
 * 
 *   Unless otherwise specified, passing a null argument to any
 *  method or constructor in this class will cause a NullPointerException to be thrown.
 */
class MissingFormatWidthException extends IllegalFormatException {

    /** Returns the format specifier which does not have a width. */
    @stub
    def getFormatSpecifier(): String = ???
}
