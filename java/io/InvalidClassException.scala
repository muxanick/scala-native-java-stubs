package java.io

import java.lang.{Exception, Object, String, Throwable}

/** Thrown when the Serialization runtime detects one of the following
 *  problems with a Class.
 *  
 *   The serial version of the class does not match that of the class
 *       descriptor read from the stream
 *   The class contains unknown datatypes
 *   The class does not have an accessible no-arg constructor
 *  
 */
class InvalidClassException extends ObjectStreamException {

    /** Report an InvalidClassException for the reason specified. */
    @stub
    def this(reason: String) = ???
}
