package java.lang.reflect

import java.lang.{Exception, Object, RuntimeException, Throwable}
import scala.scalanative.annotation.stub

/** Thrown when a semantically malformed parameterized type is
 *  encountered by a reflective method that needs to instantiate it.
 *  For example, if the number of type arguments to a parameterized type
 *  is wrong.
 */
class MalformedParameterizedTypeException extends RuntimeException {

    /**  */
    @stub
    def this() = ???
}
