package java.lang.reflect

import java.lang.{Exception, Object, RuntimeException, Throwable}

/** Thrown when the
 *  java.lang.reflect package attempts to read method parameters from
 *  a class file and determines that one or more parameters are
 *  malformed.
 * 
 *  The following is a list of conditions under which this exception
 *  can be thrown:
 *  
 *   The number of parameters (parameter_count) is wrong for the method
 *   A constant pool index is out of bounds.
 *   A constant pool index does not refer to a UTF-8 entry
 *   A parameter's name is "", or contains an illegal character
 *   The flags field contains an illegal flag (something other than
 *      FINAL, SYNTHETIC, or MANDATED)
 *  
 * 
 *  See Executable.getParameters() for more
 *  information.
 */
class MalformedParametersException extends RuntimeException {

    /** Create a MalformedParametersException with an empty
     *  reason.
     */
    @stub
    def this() = ???
}
