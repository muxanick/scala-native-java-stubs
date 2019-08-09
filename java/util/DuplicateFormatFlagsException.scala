package java.util

import java.lang.{Exception, IllegalArgumentException, Object, RuntimeException, String, Throwable}

/** Unchecked exception thrown when duplicate flags are provided in the format
 *  specifier.
 * 
 *   Unless otherwise specified, passing a null argument to any
 *  method or constructor in this class will cause a NullPointerException to be thrown.
 */
class DuplicateFormatFlagsException extends IllegalFormatException {

    /** Returns the set of flags which contains a duplicate flag. */
    @stub
    def getFlags(): String = ???
}
