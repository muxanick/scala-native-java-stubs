package java.io

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

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

    /** Constructs an InvalidClassException object. */
    @stub
    def this(cname: String, reason: String) = ???

    /** Name of the invalid class. */
    @stub
    val classname: String = ???

    /** Produce the message and include the classname, if present. */
    @stub
    def getMessage(): String = ???
}
