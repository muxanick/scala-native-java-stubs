package java.util

import java.lang.{Exception, IllegalArgumentException, Object, RuntimeException, String, Throwable}

/** Unchecked exception thrown when there is a format specifier which does not
 *  have a corresponding argument or if an argument index refers to an argument
 *  that does not exist.
 * 
 *   Unless otherwise specified, passing a null argument to any
 *  method or constructor in this class will cause a NullPointerException to be thrown.
 */
class MissingFormatArgumentException extends IllegalFormatException {

    /** Returns the unmatched format specifier. */
    @stub
    def getFormatSpecifier(): String = ???
}
