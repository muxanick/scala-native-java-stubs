package java.security

import java.lang.{Exception, IllegalArgumentException, Object, RuntimeException, Throwable}

/** This exception, designed for use by the JCA/JCE engine classes,
 *  is thrown when an invalid parameter is passed
 *  to a method.
 */
class InvalidParameterException extends IllegalArgumentException {

    /** Constructs an InvalidParameterException with no detail message. */
    @stub
    def this() = ???
}
